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
        
        printError();
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
}
