package DefiningClasses;

/**
 *
 * @author jacob.wiseberg
 */
public class Club {
    public static void main(String[] args) {
        Rapper fett = new Rapper("Fetty Wap", "Charles Hafforford", 5, 29);
        Rapper drake = new Rapper("Drake", "Aubrey Graham");
        System.out.println("Expected Name: Fetty Wap\nReturned Name: " + fett.getStageName());
        
    }
}
