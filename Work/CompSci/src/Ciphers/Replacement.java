package Ciphers;

/**
 *
 * @author jacob.wiseberg
 */
public class Replacement {
    private String word;
    private char[] key;
    private char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    public Replacement(String word, String keyWord) {
        this.word = encrypt(word);
        this.key = genKey(keyWord);
    }
    public String getWord() {
        return word;
    }
    public char[] getKey() {
        return key;
    }
    

    private String encrypt(String word) {
        word = word.toLowerCase();
        char[] letters = word.toCharArray();
        String encrypted = "";
        for(int i=0; i<word.length(); i++) 
            word += String.valueOf(letters[i]).replace(letters[i], this.key[String.valueOf(this.abc).indexOf(letters[i])]);
        return encrypted;
    }
    
    private char[] genKey(String keyWord){
        keyWord = keyWord.toLowerCase();
        char[] key = new char[26];
        char[] kWord = keyWord.toCharArray();
        char letter = abc[0];
        
        //remove repeated letter in the word
        for (int i=0; i<keyWord.length(); i++) {
            char a = kWord[i];
            int counter = 0;
            for (int x=0; x<keyWord.length(); x++) {
                if (a == kWord[x])
                    counter++;
                if(counter > 1) {
                    remove(kWord, x);
                    counter--;
                }
            }
        }
        //inputs key word into the key array
        for(int i=0; i<kWord.length; i++) {
            key[i] = kWord[i];
        }
        //input the rest of the alphabet into the key array
        int counter = 0;
        for(int i=kWord.length-1; i<26; i++) {
            do {
                letter = abc[counter];
                counter++;
            } while( String.valueOf(key).indexOf(String.valueOf(letter)) >=0  );
            key[i] = letter;
        }
        return key;
    }

    //Arrays methods that I use
    private char[] copy(char[] arr, int length) {
        char[] copy = new char[length];
        for (int i=0; i< length; i++) {
            if (i < arr.length)
                copy[i] = arr[i];
            else break;
        }
        return copy;
    }
    private char[] remove(char[] arr, int index) {
        arr[index] = arr[arr.length-1];
        arr = copy(arr, arr.length-1);
        return arr;
    }
}
