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
public class TriangleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input height: ");
        double h = reader.nextDouble();
        System.out.print("Input base: ");
        double b = reader.nextDouble();
        double area = (h*b)/2;
        System.out.println("Area: " + area + " square units");
    }
}
