package DefiningClasses;

/**
 *
 * @author jacob.wiseberg
 */
public class Student {
    private String name;
    private int age;
    private double gpa;
    
    public Student(String n, int a, double g) {
        name = n;
        age = a;
        gpa = g;
    }
    public Student (String n) {
        /*
        this makes the program look for a constructor with the arguments given
        in this case one with a string, int, and String, this refers to the first contructor
        */
        this(n, 15, 3.0);
    }
    public Student() {
        this("FNU");
        //this refers to the second constructor
    }
    public Student(Student s) {
        this(s.name,s.age,s.gpa);
        //this also refers to the first constructor
    }
}
