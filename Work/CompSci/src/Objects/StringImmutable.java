/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author jacob.wiseberg
 */
public class StringImmutable {
    public static void main(String[] args) {
        String x = new String("Serena");  //new String object named Serena
        x= "Trey";  //This deletes the old String and creates a new one that stores “Trey” instead of “Serena”
        x= "tre";  //Deletes the old objects and creates a new tre
        String y=x;  //new reference to the String object x
        x= "Jack";   //changes the x reference to the String object
        System.out.println(x.toUpperCase()); //this prints “JACK” but the object is still “Jack”, the uppercase stuff just goes away because it is an unneeded copy
        System.out.println(x);
    }
}
