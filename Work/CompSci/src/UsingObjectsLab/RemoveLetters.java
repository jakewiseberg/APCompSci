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
        remove(word);
    }
    
    public static void remove(String word) {
        int amt = word.length()-1;
        char first = word.charAt(0);
        char last = word.charAt(amt);
        System.out.println(first+last);
    }
}
