package quizzer;

import java.util.ArrayList;

/**
 *
 * @author jakew
 */
public class Question {
    private String question;
    //first answer in the array must be correct
    private String[] answers;
    private String correct;
    
    public Question(String q, String[] a) {
        question = q;
        answers = a;
        correct = a[0];
        randomizeAnswers();
    }
    
    public String getCorrect() { return correct; }
    public String getQuestion() { return question; }
    public String[] getAnswers() { return answers; }
    public void randomizeAnswers() {
        ArrayList<String> temp1 = new ArrayList<String>();
        String[] temp2 = new String[answers.length];
        for (String a : answers)
            temp1.add(a);
        for (int i = temp1.size()-1; i>=0; i--) {
            temp2[temp2.length-i-1] = temp1.remove((int)(Math.random()*temp1.size()));
        }
        answers = temp2;
    }
}
