package UsingObjects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacob.wiseberg
 */
public class MathPractice {
    public static void main(String[] args) {
        /*double x = Math.PI;
        double distFromZero = Math.abs(-5.2);
        System.out.println(distFromZero);
        System.out.println(Math.sqrt(Math.abs(-38)));
        System.out.println(Math.pow(10, 2));
        System.out.println((int)(Math.random()*95+5));
        */
        for (int i=0; i<=100; i++) {
            System.out.print(random(1,10) + " ");
        }
        
    }
    /*
    Precondition: max >= min, min> 0
    return: random integer between min and max, inclusive
    */
    public static int random(int min, int max) {
        int x = max-min+1;
        return (int)(Math.random()*x+min);
    }
}