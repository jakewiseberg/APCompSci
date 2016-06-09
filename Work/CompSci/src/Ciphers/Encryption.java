package Ciphers;
import java.util.Scanner;

/**
 *
 * @author jakew
 */
public class Encryption {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char[] generatedKey = keyGen();
        
        System.out.println("Key: " + String.valueOf(generatedKey));
        System.out.println("     abcdefghijklmnopqrstuvwxyz\n");

        System.out.print("Message: ");
        String message = reader.next();
        String encrypted = encrypt(message, generatedKey);
        String decrypted = decrypt(encrypted, generatedKey);
        
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        
        System.out.println("If this progam worked this will return true:    " + message.equalsIgnoreCase(decrypted));
    }
    
    public static String encrypt(String a, char[] key) {
        a = a.toLowerCase();
        char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] letters = a.toCharArray();
        char[] encryptedWord = new char[a.length()];
        String word = "";
        
        for(int i=0; i<a.length(); i++) 
            word = word+String.valueOf(letters[i]).replace(letters[i], key[String.valueOf(abc).indexOf(letters[i])]);
        return word;
    }
    
    public static String decrypt(String a, char[] key) {
        a = a.toLowerCase();
        char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] letters = a.toCharArray();
        String word = "";
        for(int i=0; i<a.length(); i++) { 
            word = word+String.valueOf(letters[i]).replace(letters[i], abc[String.valueOf(key).indexOf(letters[i])]);
        }
        return word;
    }
    
    public static char[] keyGen() {
        char[] key = new char[26];
        char random;
        for(int i=0; i<26; i++) {
            do {
                random = (char)((int)(Math.random()*26+97));
            } while( String.valueOf(key).indexOf(String.valueOf(random)) >=0  );
            key[i] = random;
        }
        return key;
    }
}
