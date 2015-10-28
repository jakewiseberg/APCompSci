package DefiningClasses;

/**
 *
 * @author jacob.wiseberg
 */
public class Horse {

    //Instance Variables
    private String name;
    private int age;
    private String gender;
    private int rank;

    //Constructors
    public Horse(String n, int a, String g, int r) {
        name = n;
        age = a;
        gender = g;
        rank = r;
    }
    public Horse(String n, int a, int r) {
        name = n;
        age = a;
        rank = r;
        gender = "Female";
    }
    public Horse() {
        name = "Vladimir";
        age = 3;
        rank = 100;
        gender = "Male";
    }
    public Horse(Horse h) {
        name = h.name;
        age = h.age;
        rank = h.rank;
        gender = h.gender;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public int getRank() {
        return rank;
    }
    
    //Setters
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setGender(String g) {
        gender = g;
    }
    public void setRank(int r) {
        rank = r;
    }
    
    //TODO doers
}
