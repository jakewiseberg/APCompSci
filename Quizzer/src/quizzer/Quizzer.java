package quizzer;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jakew
 */
public class Quizzer {
    public static void main(String[] args) throws FileNotFoundException,IOException  {
        File testFile = new File("test.in");
        File results = new File("results.out");
        
        Scanner reader = new Scanner(testFile);   // reads testFile file
        Scanner teacherReader = new Scanner(results); // reads results file
        Scanner helper = new Scanner(System.in);
        FileWriter writer = new FileWriter(results, true);   //outputs results to file for future use
        
        //Collects students from results file  NOTWORKING IDK WHAT TO DO AGGAGAGAG
        Student[] students = new Student[9];
//        String next;
//        double nextGrade;
//        do {
//            try {
//                next = teacherReader.nextLine();
//                nextGrade = teacherReader.nextDouble();
//                students[3] = (new Student(next, nextGrade));
//            }
//            catch (NoSuchElementException) {
//                break;
//            }
//        } while (!next.equalsIgnoreCase(""));
        
        int questions = reader.nextInt();
        int answersPerQ = reader.nextInt();
        String password = reader.next();
        reader.nextLine();
        
        String qTemp;
        String[] aTemp = new String[answersPerQ];
        
        Test test = new Test();
        System.out.println("Are you a student or a teacher?");
        String sot = helper.next();
        if (sot.equalsIgnoreCase("student")) {
            //read questions and add them into a test
            for (int i=1; i<= questions; i++) {
                qTemp = reader.nextLine();
                for (int j=0; j<answersPerQ; j++)
                    aTemp[j] = reader.nextLine();
                test.addQuestion(new Question(qTemp, aTemp));
            }
            writer.append(test.distribute() + "\n");
        } else {
            String input;
            do {
                System.out.print("Enter passphrase: ");
                input = helper.next();
            } while (!input.equalsIgnoreCase(password));
            if (input.equalsIgnoreCase(password)) { 
                System.out.println("\nWelcome to the teacher utilities!");
                System.out.println("Here are the possible tools you can use:");
                System.out.println("\t1. Class average");
                System.out.println("\t2. Rank");
                System.out.println("\t3. Quit");
                System.out.print("Input tool number: ");
                int tool = helper.nextInt();
                switch(tool) {
                    case 1:
                        System.out.println("Class average: " + average(students));
                        break;
                    case 2:
                        sort(students);
                        break;
                    case 3:
                        System.out.println("Bye!");
                        break;
                    default: break;
                }
            }
        }
        writer.close();
    }
    
    public static double average(Student[] s) {
        double sum = 0;
        for (Student e : s) {
            sum += e.getGrade();
        }
        return sum/(s.length);
    }
    
    public static void sort(Student[] s) {
        for (int i=0; i<s.length; i++) {
            for (int j=1; j < (s.length-i); j++) {
                if (s[j-1].getGrade() < s[j].getGrade()) {
                    Student temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;
                }
            }
        }
    }
    
}