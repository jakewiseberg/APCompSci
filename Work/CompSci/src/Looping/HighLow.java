package Looping;
import java.util.Scanner;
/**
 *
 * @author jacob.wiseberg
 */
public class HighLow {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to a great game of High Lowwwwww");
        int n = (int)(Math.random()*100);
        int x = 0;
        
        for (int i=0; i<7; i++) {
            System.out.println("GUESSES LEFT: " + (7 - i));
            System.out.print("Guess a number from 1 to 100: ");
            x = reader.nextInt();
            if (x == n) break;
            else if (x>n) System.out.println("Too high");
            else if (x<n) System.out.println("Too low");
        }
        
        if (x != n) System.out.println("Awww, you lose...");
        else System.out.println("YOU WINNNNNN");
    }
}
