package Ciphers;

/**
 *
 * @author jacob.wiseberg
 */
public class Ceasar {
    private String word;
    private char[] key;
    private char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    public Caesar(String word, int shift) {
        this.word = encrypt(word);
        this.key = genKey(shift);
    }
    
    public char[] genKey(int shift) {
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
