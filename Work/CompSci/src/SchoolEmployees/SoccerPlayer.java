package SchoolEmployees;

/**
 *
 * @author jacob.wiseberg
 */
public class SoccerPlayer implements Athlete {
    private String position;
    private int number;
    private double hoursTrained;
    
    public SoccerPlayer (String p, int n, double ht) {
        position = p;
        number = n;
        hoursTrained = ht;
    }
    
    public void train() { System.out.println("Working hard and training"); }
    public void move() { System.out.println("I am moving, haha"); }
    public void work(double hours) { hoursTrained += hours; }
}
