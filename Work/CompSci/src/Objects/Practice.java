/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.Scanner;

/**
 *
 * @author jacob.wiseberg
 */
public class Practice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = reader.next();
        jumble(word);
        System.out.println(word);
    }
    
    public static String jumble(String x) {
        int r = (int)(Math.random()*x.length());
        char e = x.charAt(r);
        //String final = e+""+x.substring(0,r)+""+x.substring(r+1);
        //return final;
        return "error";
    }
}
