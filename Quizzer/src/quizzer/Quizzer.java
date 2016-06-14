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
        ArrayList<Student> students = new ArrayList<Student>();
        String next;
        double g;
        String n;
        while (teacherReader.hasNext()) {
            next = teacherReader.nextLine();
            n = findName(next);
            g = findGrade(next);
            students.add(new Student(n, g));
        }
        
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
                while (tool != 3) {
                    switch(tool) {
                        case 1:
                            System.out.println("Class average: " + average(students));
                            break;
                        case 2:
                            sort(students);
                            printRank(students);
                            break;
                        default: break;
                    }
                    System.out.print("Anything else (type task number): ");
                    tool = helper.nextInt();
                }
                System.out.println("Bye!");
            }
        }
        writer.close();
    }
    
    public static double average(ArrayList<Student> s) {
        double sum = 0;
        for (Student e : s) {
            sum += e.getGrade();
        }
        return sum/(s.size());
    }
    
    public static void sort(ArrayList<Student> s) {
        for (int i=0; i<s.size(); i++) {
            for (int j=1; j < (s.size()-i); j++) {
                if (s.get(j-1).getGrade() < s.get(j).getGrade()) {
                    Student temp = s.get(j-1);
                    s.set(j-1, s.get(j));
                    s.set(j, temp);
                }
            }
        }
    }
    
    public static String findName(String str) {
        String name = "";
        int i=0;
        while (!str.substring(i, i+1).equals("|")) {
            name += str.substring(i, i+1);
            i++;
        }
        return name;
    }
    
    public static double findGrade(String str) {
        String grade = "";
        int i=0;
        while (!str.substring(i, i+1).equals("|")) { i++; }
        grade += str.substring(i+1);
        double gradeDouble = Double.parseDouble(grade);
        return gradeDouble;
    }
    
    public static void printRank(ArrayList<Student> arr) {
        for (Student s : arr) {
            System.out.print(s.getName() + " ");
        }
        System.out.println("");
    }
    
}