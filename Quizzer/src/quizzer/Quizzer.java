package quizzer;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author jakew
 */
public class Quizzer {
    public static void main(String[] args) throws FileNotFoundException,IOException  {
        File testFile = new File("test.in");
        File results = new File("results.out");
        
        Scanner reader = new Scanner(testFile);   // reads testFile file
        FileWriter writer = new FileWriter(results, true);   //outputs results to file for future use
        
        int questions = reader.nextInt();
        int answersPerQ = reader.nextInt();
        reader.nextLine(); //Nessecary to get the reader on the next line after the numbers
        
        String qTemp;
        String[] aTemp = new String[answersPerQ];
        
        Test test = new Test();
        
        //read questions and add them into a test
        for (int i=1; i<= questions; i++) {
            qTemp = reader.nextLine();
            for (int j=0; j<answersPerQ; j++)
                aTemp[j] = reader.nextLine();
            test.addQuestion(new Question(qTemp, aTemp));
        }
        writer.append(test.distribute() + "\n");
        writer.close();
    }
}