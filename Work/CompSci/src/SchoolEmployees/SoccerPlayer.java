package SchoolEmployees;

/**
 *
 * @author jacob.wiseberg
 */
public class SoccerPlayer extends Employee implements Athlete {
    private String position;
    private int number;
    private double hoursTrained;
    
    public SoccerPlayer (String fn, String ln, int a, boolean m, double s, double hw, String p, int n, double ht) {
        super(fn, ln, a, m, s, hw);
        position = p;
        number = n;
        hoursTrained = ht;
    }
    
    @Override
    public void train() {
        System.out.println("Running laps and kicking balls");
        hoursTrained += 1;
    }
    @Override
    public void move() { System.out.println("I am running, weeeeeee"); }
    @Override
    public void work(double hours) { System.out.println("Working hard and playing soccer for" + hours + " hours!"); }
    
    public String getPosition() { return position; }
    public int getNumber() { return number; }
    public double getHoursTrained() { return hoursTrained; }
}
