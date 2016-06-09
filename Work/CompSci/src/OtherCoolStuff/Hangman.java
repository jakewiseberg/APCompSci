/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtherCoolStuff;
import java.util.Scanner;
/**
 *
 * @author jakew
 */
public class Hangman {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int correct = 0;
        String word = "Lancers";
        char[] usedChar = new char[word.length()];
        System.out.println("Welcome to hangman!!!");
        
        for (int i = 1; i<=word.length()*2; i++) {
            System.out.print("Guess a letter: ");
            char letter = reader.next().charAt(0);
            if (existing(String.valueOf(usedChar), String.valueOf(letter))) {
                System.out.println("You already picked that letter!!");
                System.out.println("You have " + (2*word.length()-i) + " guesses left...");
            }
            else if (existing(word, String.valueOf(letter))) {
                System.out.println("Cool! You have " + (2*word.length()-i) + " guesses left...");
                usedChar[correct] = letter;
                correct+=1;
            }
            if (correct==word.length()) break;
        }
        if (correct==word.length()) System.out.println("You won!!");
        else System.out.println("Sorry bro, you loseeeeee");
    }
    
    public static boolean existing(String a, String b) {
        return a.toLowerCase().indexOf(b) >= 0;
    }
}
