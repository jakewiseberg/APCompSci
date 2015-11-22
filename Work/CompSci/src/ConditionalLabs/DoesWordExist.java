package ConditionalLabs;

/**
 *
 * @author jacob.wiseberg
 */

//STATUS: NOT FINISHED NEED TO FIGURE OUT AGGGHHHH
public class DoesWordExist {
    public static void main(String[] args) {
        System.out.println(existing("understand" , "stand"));
    }
    
    public static boolean existing(String a, String b) {
        int beginIndex = a.indexOf(b.charAt(0));
        int endIndex = beginIndex + b.length();
        
        String sub;
        if (beginIndex<0 ) sub = "";
        else sub = a.substring(beginIndex, endIndex);
        return sub.compareTo(b) == 0;
    }
}
