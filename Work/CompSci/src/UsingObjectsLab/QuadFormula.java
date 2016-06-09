/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingObjectsLab;

import java.util.Scanner;

/**
 *
 * @author jacob.wiseberg
 */
public class QuadFormula {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("a: ");
        double a = reader.nextDouble();
        System.out.print("b: ");
        double b = reader.nextDouble();
        System.out.print("c: ");
        double c = reader.nextDouble();
        System.out.println("x: " + quad1(a,b,c) + ", " + quad2(a,b,c));
    }
    
    public static double quad1(double a, double b, double c) {
        return ((-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
    }
    
    public static double quad2(double a, double b, double c) {
        return ((-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
    }
}
