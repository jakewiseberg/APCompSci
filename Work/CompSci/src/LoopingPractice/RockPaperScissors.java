package LoopingPractice;
import java.util.Scanner;
/**
 *
 * @author jacob.wiseberg
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        running(intro());
    }
    public static int intro() {
        Scanner reader = new Scanner(System.in);
        int outOf;
        System.out.println("Welcome to rock paper scissors!!!");
        System.out.print("How many games do you want this to be the best out of? ");
        outOf = reader.nextInt();
        return outOf;
        
    }
    public static String ai() {
        int random = (int)(Math.random()*3+1);
        switch (random) {
            case 1: return "rock";
            case 2: return "paper";
            case 3: return "scissors";
            default: return "error";
        }
    }
    public static String determineWinner(String user, String ai) {
        String win = "You win!!";
        if (user.length()==ai.length()) win = "It is a tie!!";
        else if ( (user.equalsIgnoreCase("rock") && ai.equalsIgnoreCase("paper"))
                  || (user.equalsIgnoreCase("paper") && ai.equalsIgnoreCase("scissors"))
                    || (user.equalsIgnoreCase("scissors") && ai.equalsIgnoreCase("rock")))
            win = "You lose...";
        return win;
    }
    public static void running(int outOf) {
        Scanner reader = new Scanner(System.in);
        String user, ai;
        int aiWin = 0, userWin = 0;
        
        for (int i=1; i<=outOf; i++) {
            System.out.println("Game " + i);
            System.out.print("Throw: ");
            user = reader.next();
            ai = ai();
            System.out.println("AI: " + ai);
            System.out.println(determineWinner(user, ai) + "\n");
        }
        
    }
}
