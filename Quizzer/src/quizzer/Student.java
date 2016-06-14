package quizzer;
/**
 *
 * @author jakew
 */
public class Student {
    private String name;
    private double grade;
    
    public Student(String n, double g) {
        name = n;
        grade = g;
    }

    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }
}
