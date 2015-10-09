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
public class MiddleLetters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input an odd lettered word: ");
        String word = reader.next();
        word = middle(word);
        System.out.println("The three middle letters are: " + word);
    }
    
    public static String middle(String word) {
        int amt = (int)(word.length()/2);
        return word.substring(amt-1, amt+2);
    }
}
