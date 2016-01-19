package ArrayLists;
import java.util.*;

/**
 *
 * @author jacob.wiseberg
 */
public class PrimitiveObjects {
    public static void main(String[] args) {
        
                
    }
    
    public static void problemOne() {
        ArrayList<Integer> list = new ArrayList();
        for (int i=0; i<20; i++)
            list.add((int)(Math.random()*10+1));
        System.out.println(list);
        list.add(15, 2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(10));
        for (int i=0; i<list.size(); i++)
            if (list.get(i) == 6)
                list.set(i, 7);
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) == 5) {
                list.add(i, 0);
                i++;
            }
        }
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) == 8) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
    public static void max(ArrayList<Integer> list) {
        
    }
}