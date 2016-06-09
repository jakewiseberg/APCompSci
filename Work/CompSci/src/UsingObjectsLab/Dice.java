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
public class Dice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int d1 = dice(1, 6);
        System.out.println("Die 1: " + d1);
        int d2 = dice(1, 6);
        System.out.println("Die 2: " + d2);
        int sum = d1+d2;
        System.out.println("Sum: " + sum);
    }
    
    public static int dice(int min, int max) {
        return (int)(Math.random()*(max-min+1)+min);
    }
}
