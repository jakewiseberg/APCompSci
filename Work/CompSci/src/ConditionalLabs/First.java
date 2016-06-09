/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalLabs;

/**
 *
 * @author jakew
 */

public class First {
    public static void main(String[] args) {
        System.out.println(first("b","c","a"));
    }
    
    public static String first(String a, String b, String c) {
        String returnWord = "";
        
        int aOne = a.compareToIgnoreCase(b);
        int aTwo = a.compareToIgnoreCase(c);
        if (aOne<0 && aTwo<0) returnWord = a;
        
        int bOne = b.compareToIgnoreCase(a);
        int bTwo = b.compareToIgnoreCase(c);
        if (bOne<0 && bTwo<0) returnWord = b;
        
        int cOne = c.compareToIgnoreCase(a);
        int cTwo = c.compareToIgnoreCase(b);
        if (cOne<0 && cTwo<0) returnWord = c;
        
        return returnWord;
    }
}
