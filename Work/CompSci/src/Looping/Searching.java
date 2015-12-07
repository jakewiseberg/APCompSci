package Looping;

/**
 *
 * @author jacob.wiseberg
 */
public class Searching {
    public static void main(String[] args) {
        
    }
    
    public static int search1(String a, String b) {
        int count = 0;
        for (int i=0; i<=a.length()-4; i++) {
            if (a.substring(i, i+4).equalsIgnoreCase(b))
                count++;
        }
        return count;
    }
    
    public static int search2(String a, String b) {
        int count=0;
        int index=a.indexOf(b);
        String t=a;
        while (index != -1) {
            count++;
            t = t.substring(index+4);
            index = t.indexOf(b);
        }
        return count;
    }
}
