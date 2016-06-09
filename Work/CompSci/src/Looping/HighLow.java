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
        int n;
        int x;
        boolean running = true;
        int guesses;
        
        while (running) {
            n = (int)(Math.random()*100);   //Random number generated
            x = 0;                          //User number guessed is stored here
            System.out.print("How many chances do you want to have to play? ");
            guesses = reader.nextInt();    //Amount of guesses the user chooses
            for (int i=0; i<guesses; i++) {
                System.out.println("GUESSES LEFT: " + (guesses - i));
                System.out.print("Guess a number from 1 to 100: ");
                x = reader.nextInt();
                if (x == n) break;
                else if (x>n) System.out.println("Too high\n");
                else if (x<n) System.out.println("Too low\n");
            }
            if (x != n) System.out.println("Awww, you lose...");
            else System.out.println("YOU WINNNNNN");
            System.out.println("Do you want to play again? Type y or n");
            if (reader.next().equalsIgnoreCase("n")) running = false;
        }
    }
}
