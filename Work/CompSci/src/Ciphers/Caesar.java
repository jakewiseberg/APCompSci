package Ciphers;

/**
 *
 * @author jacob.wiseberg
 */
public class Caesar {
    private String word;
    private char[] key;
    private int shift;
    private char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    public Caesar(String word, int shift) {
        this.shift = shift;
        this.key = genKey();
        this.word = encrypt(word);
    }
    public String getWord() {
        return this.word;
    }
    public String getKey() {
        String key = "";
        for (int i=0; i<this.key.length; i++)
            key += this.key[i];
        return key;
    }
    
    
    private String encrypt(String word) {
        word = word.toLowerCase();
        char[] letters = word.toCharArray();
        String encrypted = "";
        for(int i=0; i<letters.length; i++) {
            if (!String.valueOf(abc).contains(String.valueOf(letters[i])))
                encrypted += String.valueOf(letters[i]);
            else
                encrypted += String.valueOf(letters[i]).replace(letters[i], this.key[String.valueOf(this.abc).indexOf(letters[i])]);
        }
        return encrypted;
    }
    public String decrypt() {
        word = word.toLowerCase();
        char[] letters = word.toCharArray();
        String decrypted = "";
        for(int i=0; i<word.length(); i++) {
            if (!String.valueOf(abc).contains(String.valueOf(letters[i])))
                decrypted += String.valueOf(letters[i]);
            else
                decrypted += String.valueOf(letters[i]).replace(letters[i], abc[String.valueOf(key).indexOf(letters[i])]);
        }
        return decrypted;
    }
    
    private char[] genKey() {
        char[] key = new char[26];
        
        for (int i=0; i<abc.length; i++) {
            if (i-shift < 0)
                key[key.length - Math.abs(i-shift)] = abc[i];
            else
                key[i-shift] = abc[i];
        }
        return key;
    }
}

class TestArea2 {
    public static void main(String[] args) {
        Caesar test = new Caesar("Hello, World!", 5);
        System.out.println("Encrypted Word: " + test.getWord());
        System.out.println("Key Used: " + test.getKey());
        System.out.println("Decrypted Word: " + test.decrypt());
    }
}
