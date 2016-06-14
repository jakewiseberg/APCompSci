package quizzer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jakew
 */
public class Test {
    private ArrayList<Question> questions;

    public Test() {
        questions = new ArrayList<Question>();
    }

    public void addQuestion(Question q) { questions.add(q); }
    public ArrayList<Question> getQuestions() { return questions; }
    public Question get(int n) {
        return questions.get(n);
    }
    public String distribute() {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = reader.next();
        System.out.println();
        int score = 0;
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            for (int i=1; i<=q.getAnswers().length; i++) {
                System.out.println("\t" + i + ": " + q.getAnswers()[i-1]);
            }
            System.out.print("Your answer: ");
            int a = reader.nextInt();
            if (q.getAnswers()[a-1].equals(q.getCorrect()))
                score++;
        }
        double percent = ((((double)score)/((double)questions.size()))*100);
        System.out.println("Your grade is a " + percent + "%");
        return name + "|" + percent + "";
    }
}
