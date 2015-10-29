package DefiningClasses;

/**
 *
 * @author jacob.wiseberg
 */
public class Club {
    public static void main(String[] args) {
        Rapper fett = new Rapper("Fetty Wap", "Charles Hafforford", 5, 29);
        System.out.println("Fetty Wap Prison Record: " + fett.getPrisonRecord());
        System.out.println("Ahhh, " + fett.getStageName() + " commited a crime!!");
        fett.commitCrime();
        System.out.println("Fetty Wap Prison Record: " + fett.getPrisonRecord());
    }
}
