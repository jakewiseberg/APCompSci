package DefiningClasses;

/**
 *
 * @author jacob.wiseberg
 */
public class Barn {
    public static void main(String[] args) {
        //Creating horses using the different constructors we created
        Horse hay = new Horse("Hay", 3, "Male", 5);
        Horse jolly = new Horse("Jolly", 1, 100);
        Horse vladimir = new Horse();
        Horse patty = new Horse(vladimir);
        
        Student jake = new Student("Jake");
    }
}
