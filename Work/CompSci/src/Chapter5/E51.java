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
public class E51 {
    public static void main(String[] args) {
        System.out.println(integer(0));
    }
    
    public static String integer(int x) {
        if (x>0) return "positive";
        else if (x<0) return "negative";
        else return "0";
    }
}
