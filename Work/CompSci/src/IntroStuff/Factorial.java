/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroStuff;
import java.util.Scanner;
/**
 *
 * @author jacob.wiseberg
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = reader.nextInt();
        int product;
        product = n;
        for (int number = n-1; number>=1; number--) {
            product = product*number;
        }
        System.out.println(product);
        
    }
}
