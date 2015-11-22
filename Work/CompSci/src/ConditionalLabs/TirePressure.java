/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalLabs;
import java.util.Scanner;

/**
 *
 * @author jakew
 */
public class TirePressure {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Input right front pressure: ");
        int frontRight = reader.nextInt();
        System.out.print("Input left front pressure: ");
        int frontLeft = reader.nextInt();
        System.out.print("Input right back pressure: ");
        int backRight = reader.nextInt();
        System.out.print("Input left back pressure: ");
        int backLeft = reader.nextInt();
        
        System.out.println("\nTire pressure is " + checkTirePresssure(frontRight, frontLeft, backRight, backLeft));
    }
    
    public static String checkTirePresssure(int frontRight, int frontLeft, int backRight, int backLeft) {
        
        // checks if all of the tires are between 30 and 42 psi
        if (frontRight<=42 && frontRight >= 30 && frontLeft<=42 && frontLeft >= 30
                        && backRight<=42 && backRight >= 30 && backLeft<=42 && backLeft >= 30) {
            
            //Checks tires are within 2 psi of each other
            if (frontRight-frontLeft>=-2 && frontRight-frontLeft<=2  
                    && backRight-backLeft>=-2 && backRight-backLeft<=2) {
                return "GOOD";
            }
            else return "BAD";
        }
        else return "BAD";
    }
}
