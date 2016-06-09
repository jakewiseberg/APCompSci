/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author jakew
 */
public class E55 {
    public static void main(String[] args) {
        System.out.println(order(3,4,5));
    }
    
    public static String order(int a, int b, int c){
        if (a>b && b>c) return "decreasing";
        else if (c>b && b>a) return "increasing";
        else return "neither";
    }
}
