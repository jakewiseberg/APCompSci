package ConditionalLabs;

/**
 *
 * @author jacob.wiseberg
 */

//STATUS: NOT FINISHED NEED TO FIGURE OUT AGGGHHHH
public class DoesWordExist {
    public static void main(String[] args) {
        System.out.println(existing("understand" , "stand"));
        System.out.println(existing("moon" , "on"));
    }
    
    public static boolean existing(String a, String b) {
        return (a.toLowerCase().indexOf(b))>=0;
    }
}
