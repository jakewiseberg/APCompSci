package ConditionalLabs;

/**
 *
 * @author jacob.wiseberg
 */

//STATUS: FINISHED
public class Longest {
    public static void main(String[] args) {
        System.out.println(longest("test", "tests", "testssssssssssssss"));
    }
    
    public static String longest(String a, String b, String c) {
        String max = a;
        if (max.length()<b.length())
            max = b;
        if (max.length()<c.length())
            max = c;
        return max;
    }
}
