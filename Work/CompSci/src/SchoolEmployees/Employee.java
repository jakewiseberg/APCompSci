package SchoolEmployees;

/**
 *
 * @author jacob.wiseberg
 */
public abstract class Employee extends Person {
    private double salary;
    private double hoursWorked;
    
    public Employee(String fn, String ln, int a, boolean m, double s, double hw) {
        super(fn, ln, a, m);
        salary = s;
        hoursWorked = hw;
    }
    
    public abstract void work(double hours);
    public void giveRaise(double increase) { salary += (increase*salary); }

    public double getSalary() { return salary; }
    public double getHoursWorked() { return hoursWorked; }
}
