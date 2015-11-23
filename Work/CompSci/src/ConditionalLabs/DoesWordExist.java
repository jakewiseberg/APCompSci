package ConditionalLabs;

/**
 *
 * @author jacob.wiseberg
 */

public class DoesWordExist {
    public static void main(String[] args) {
        System.out.println(existing("understand" , "stand"));
        System.out.println(existing("moon" , "on"));
    }
    
    public static boolean existing(String a, String b) {
        return (a.toLowerCase().indexOf(b))>=0;
    }
}
