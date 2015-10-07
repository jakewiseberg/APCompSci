/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingObjects;
/**
 *
 * @author jacob.wiseberg
 */
public class StringPractice {
    public static void main(String[] args) {
        //String word = new String("The word"); --> can be used but functions the same as below
        String food = "sweet potato pie";
        System.out.println(food.length());
        System.out.println(food.charAt(5));
        System.out.println(food.substring(8));
        System.out.println(food.substring(2,8));
        System.out.println(food.substring(0,5).length());
        System.out.println(food.indexOf("e"));
        System.out.println(food.compareTo("sweaty potato pie"));
    }
}