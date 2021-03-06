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
public class Mortgage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input principal loan borrowed: ");
        double P = reader.nextDouble();
        System.out.print("Input annual interest rate: ");
        double i = reader.nextDouble()/12;
        System.out.print("Input number of years to pay off the mortgage: ");
        int n = reader.nextInt()*12;
        System.out.println("Your monthly payment is $" + mortgage(P,i,n));
    }
    
    public static double mortgage(double P, double i, int n) {
        return P*((i*Math.pow((1+i), n))/(Math.pow((1+i), n)-1));
    }
}
