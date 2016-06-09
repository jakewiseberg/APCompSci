package DefiningClassesLab;

import java.util.Scanner;
/**
 *
 * @author jacob.wiseberg
 */
public class StudentTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nWelcome to our student database!!!");
        System.out.println("When inputting information, remember that all quizzes are 100 points!\n");
        
        System.out.print("What is your name? ");
        String name = in.next();
        
        System.out.print("What is your current total quiz score? ");
        double totalScore = in.nextDouble();
        
        
        System.out.print("How many quizzes have you taken? ");
        int quizAmt = in.nextInt();
        
        Student s= new Student(name, totalScore, quizAmt);
        
        System.out.println("\nLooks like " + s.getName() + " has a new quiz grade!");
        int n = (int)(Math.random()*30+70);
        s.addQuiz(n);
        System.out.println("You new stats are....\nNew grade: " + n + "\nTotal points: " + s.getScore() + "\nAverage quiz grade: " + s.getAverageScore());
        
    }
}
