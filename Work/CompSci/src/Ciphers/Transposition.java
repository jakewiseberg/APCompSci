package Ciphers;

/**
 *
 * @author jacob.wiseberg
 */
public class Transposition {
    private String word;
    private int key;
    
    public Transposition(String word, int key) {
        this.key = key;
        this.word = encrypt(word);
    }
    public String getWord() {
        return word;
    }
    public String getDecryptedWord() {
        return decrypt();
    }
    
    
    private String encrypt(String word) {
        String encrypted = "";
        int index = 0;
        String[][] letters = new String[key][key];
        for (int r=0; r<key; r++) {
            for (int c=0; c<key; c++) {
                if (index < word.length())
                    letters[r][c] = String.valueOf(word.charAt(index));
                index++;
            }
        }
        
        for (int c=0; c<key; c++)
            for (int r=0; r<key; r++)
                if (letters[r][c] != null)
                    encrypted += letters[r][c];
        return encrypted;
    }
    
    public String decrypt() {
        String decrypted = "";
        int index = 0;
        String[][] letters = new String[key][key];
        for (int c=0; c<key; c++) {
            for (int r=0; r<key; r++) {
                if (index < word.length())
                    letters[r][c] = String.valueOf(word.charAt(index));
                index++;
            }
        }
        
        for (int r=0; r<key; r++)
            for (int c=0; c<key; c++)
                if (letters[r][c] != null)
                    decrypted += letters[r][c];
        return decrypted;
    }
}

class TestArea3 {
    public static void main(String[] args) {
        Transposition test = new Transposition("hello", 3);
        System.out.println("Encrypted Word: " + test.getWord());
        System.out.println("Decryped Word: " + test.getDecryptedWord());
    }
}
