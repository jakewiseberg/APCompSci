/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author jacob.wiseberg
 */
public class StaticMethodPractice {
    public static void main(String[] args) {
        double grade = grade(87, 329, 80, 90);
        System.out.println(grade);
    }
    
    public static double sum(double a, double b) {
        return a+b;
    }
    
    public static String greeting(String name) {
        return  "Hello " + name;
    }
    
    public static void printError() {
        System.out.println("Error!");
    }
    
    public static double areaCircle(double rad) {
        return rad*rad*3.14159265359;
    }
    
    public static double grade(double possPoints, double currGrade, double nextTestPoints, double gradeWanted) {
        double currPoints = currGrade/100*possPoints;
        double pointsWanted = gradeWanted/100*(possPoints+nextTestPoints);
        double percent = (pointsWanted/nextTestPoints)*100;
        return percent;
    }
    
    public static double round(double n) {
        n = (int)(n*100+0.5)/100;
        return n;
    }
}
