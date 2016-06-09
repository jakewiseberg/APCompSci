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
public class Tax {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input price: $");
        double p = reader.nextDouble();
        p = p + (p*.07);
        System.out.println("Price with tax: $" + p);
    }
}
