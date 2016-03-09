/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolEmployees;

/**
 *
 * @author jakew
 */
public class Teacher extends Employee{
    private String subject;
    private int gradeLevel;
    
    public Teacher (String fn, String ln, int a, boolean m, double s, double hw, String sub, int grade) {
        super(fn, ln, a, m, s, hw);
        subject = sub;
        gradeLevel = grade;
    }
    
    @Override
    public void move() { System.out.println("I am walking, weeeeee"); }
    @Override
    public void work(double hoursWorked) { System.out.println("I am teaching " + subject + " to " + gradeLevel + " graders for the next " + hoursWorked + " hours!"); }

    public String getSubject() { return subject; }
    public int getGradeLevel() { return gradeLevel; }
}
