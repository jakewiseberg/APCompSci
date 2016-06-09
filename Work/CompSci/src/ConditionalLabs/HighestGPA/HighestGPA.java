package ConditionalLabs.HighestGPA;

/**
 *
 * @author jacob.wiseberg
 */

//STATUS: FINISHED
public class HighestGPA {
    public static void main(String[] args) {
        Student jones = new Student("Jones", 3.4);
        Student bilter = new Student("Bilter", 3.2);
        Student yake = new Student("Yake", 4.5);
        
        System.out.println(highestGpa(jones, bilter, yake));
    }
    
    public static String highestGpa(Student a, Student b, Student c) {
        Student highestStudent = a;
        if (highestStudent.getGpa()<b.getGpa())
            highestStudent = b;
        if (highestStudent.getGpa()<c.getGpa())
            highestStudent = c;
        return highestStudent.getName();
    }
}
