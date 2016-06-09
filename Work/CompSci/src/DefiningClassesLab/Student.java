package DefiningClassesLab;

/**
 *
 * @author jacob.wiseberg
 */
public class Student {
    private String name;
    private double totalScore;
    private int quizAmt;
    
    public Student(String name, double totalScore, int quizAmt) {
        this.name = name;
        this.totalScore = totalScore;
        this.quizAmt = quizAmt;
    }
    
    public String getName() {
        return name;
    }
    public double getScore() {
        return totalScore;
    }
    public double getAverageScore() {
        return totalScore/quizAmt;
    }
    
    public void addQuiz(int score) {
        this.totalScore = totalScore+score;
        this.quizAmt++;
    }
}
