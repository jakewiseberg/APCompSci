package ConditionalLabs;

/**
 *
 * @author jacob.wiseberg
 */

public class QuadraticFormula {
    
    public static void main(String[] args) {
        System.out.println(quadratic(1,2,3));
    }
    
    public static String quadratic(double a, double b, double c) {
        double i;
        String answer1;
        String answer2;
        
        double first = (-b - Math.sqrt( Math.pow(b, 2) - (4*a*c) ) ) / (2*a);
        double second = (-b + Math.sqrt( Math.pow(b, 2) - (4*a*c) ) ) / (2*a);
        
        answer1 = first + "";
        answer2 = second + "";
        
        if ( (Math.pow(b, 2) - (4*a*c)) < 0) {
            i = (Math.sqrt(Math.abs(Math.pow(b, 2) - (4*a*c))) / (2*a));
            answer1 = -b/(2*a) + " + " + i + "i";
            answer2 = -b/(2*a) + " - " + i + "i";
        }
        
        return "x = {  " + answer1 + "    ,   " + answer2 + "  }";
    }
}
