/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestingStuff;

/**
 *
 * @author jakew
 */
public class Shuffle {
    public static void main(String[] args) {
        System.out.println(shuffle("go", "change"));
    }
    
    public static String shuffle(String w1, String w2) {
        String h1 = w1.substring(0,(w1.length()/2))
                + w2.substring(0,w2.length()/2);
        String h2 = w1.substring(w1.length()/2,w1.length())
                + w2.substring(w2.length()/2, w2.length());
        String shuffled = h1+h2;
        return shuffled;
    }
}
