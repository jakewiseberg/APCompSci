package SchoolEmployees;

/**
 *
 * @author jacob.wiseberg
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean male;
    
    public Person (String fn, String ln, int a, boolean m) {
        firstName = fn;
        lastName = ln;
        age = a;
        male = m;
    }
    
    public void growOlder() { age++; }
    public abstract void move();

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public boolean isMale() { return male; }
}
