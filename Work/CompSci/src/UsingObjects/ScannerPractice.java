/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingObjects;
import java.util.Scanner;

/**
 *
 * @author jacob.wiseberg
 */
public class ScannerPractice {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Input 3 integers.");
        System.out.print("Integer 1: ");
        double x=reader.nextDouble();
        System.out.print("Integer 2: ");
        double y=reader.nextDouble();
        System.out.print("Integer 3: ");
        double z=reader.nextDouble();
        System.out.println(average3(x,y,z));
    }
    
    public static double average3(double x, double y, double z) {
        return (x+y+z)/3.0;
    }
    
    public static void greeter() {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = reader.next();
        System.out.println("Hello, " + name + ", you are looking great today!!");
    }
}
