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
public class E514 {
    public static void main(String[] args) {
        System.out.println(getSeason(3, 22));
    }
    
    public static String getSeason(int month, int day) {
        String season = "";
        if (month<=3) season="Winter";
        else if (month<=6) season="Spring";
        else if (month<=9) season="Summer";
        else if (month<=12) season="Winter";
        
        if (month%3==0 && day>=21) {
            if (season.equalsIgnoreCase("Winter")) season="Spring";
            else if (season.equalsIgnoreCase("Spring")) season="Summer";
            else if (season.equalsIgnoreCase("Summer")) season="Fall";
            else season="Winter";
        }
        
        return season;
    }
}
