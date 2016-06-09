package ArrayLists;
import java.util.ArrayList;

/**
 *
 * @author jacob.wiseberg
 */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i=0; i<10; i++)
            x.add(i);
        System.out.println(x);
        System.out.println(x.size());
        for (int i=4; i>1; i--)
            x.remove(i);
        System.out.println(x);
        System.out.println(x.size());
    }
    
    
}
