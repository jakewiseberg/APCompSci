/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesOperators;
import java.util.Scanner;

/**
 *
 * @author jacob.wiseberg
 */
public class Temperature {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input Farenheit: ");
        double f = reader.nextDouble();
        double c = ((f*5)/9)-32;
        System.out.println("Temperature in celcius: " + c);
    }
}
