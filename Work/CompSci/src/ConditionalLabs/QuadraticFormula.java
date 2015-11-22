package ConditionalLabs;

/**
 *
 * @author jacob.wiseberg
 */

//STATUS: I THINK FINISHED BUT NEED TO CHECK WITH MR. WASSERMAN
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
            i = (Math.pow(b, 2) - (4*a*c));
            answer1 = -b + " * " + "sqrt(" + i + ") / " + (2*a);
            answer2 = b + " * " + "sqrt(" + i + ") / " + (2*a);
        }
        
        return "x = {  " + answer1 + "    ,   " + answer2 + "  }";
    }
}
