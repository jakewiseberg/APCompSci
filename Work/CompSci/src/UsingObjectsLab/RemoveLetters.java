/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingObjectsLab;
import java.util.Scanner;
/**
 *
 * @author jacob.wiseberg
 */
public class RemoveLetters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a word: ");
        String word = reader.next();
        System.out.println(remove(word));
    }
    
    public static String remove(String word) {
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        String newWord = first+""+ last;
        return newWord;
    }
}
