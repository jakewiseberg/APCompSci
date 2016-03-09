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
public class Coach extends Teacher implements Athlete {
    String nickname;
    boolean whistleBlower;
    
    public Coach (String fn, String ln, int a, boolean m, double s, double hw, String sub, int grade, String nick, boolean wb) {
        super(fn, ln, a, m, s, hw, sub, grade);
        nickname = nick;
        whistleBlower = wb;
    }
    
    public void blowWhistle(int numOfTimes) {
        if (whistleBlower) {
            for (int i = 0; i < numOfTimes; i++)
                System.out.println("Whistle noiiiiiiisessssss");
        }
    }
    public void train(Athlete S) { System.out.println("Go go go go go!!!"); }
    @Override
    public void train() { System.out.println("Running laps and lifting weights yea"); }
    @Override
    public void work(double hours) { System.out.println("Teaching " + super.getSubject() + " and sports to " + super.getGradeLevel() + " graders"); }
    
    public String getNickname() { return nickname; }
    public boolean isWhistleBlower() { return whistleBlower; }
}
