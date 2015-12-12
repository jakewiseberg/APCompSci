/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

/**
 *
 * @author jakew
 */
public class TestStudying {
    public static void main(String[] args) {
        genLevel(100);
    }
    public static int factorial(int n) {
        int prev = 1;
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = i+prev;
            prev = i;
        }
        return fact;
    }
    
    public static String keyGen() {
        char[] key = new char[26];
        char random;
        for(int i=0; i<26; i++) {
            do {
                random = (char)((int)(Math.random()*26+97));
            } while( String.valueOf(key).contains(String.valueOf(random)) );
            key[i] = random;
        }
        return String.valueOf(key);
    }
    
    public static void genLevel(int n) {
        int bump;
        for (int i=0; i<n; i++) {
            bump = random();
            if (bump<=2)
                System.out.print("--");
            else System.out.print("__");
        }
    }
    
    public static int random() {
        return (int)(Math.random()*10+1);
    }
}
