package ArrayLists;
import java.util.ArrayList;

/**
 *
 * @author jacob.wiseberg
 */
public class PracticeExercises {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        
        list.add("Hello");
        list.add("Banana");
        list.add("Forest");
        list.add("Jake");
        list.add("Test");
        list.add("World");
        
        list.add(3, "Apple");
        System.out.println(list);
        list = removeA(list);
        System.out.println(list);
    }
    
    public static String getFirst(ArrayList<String> arr) {
        String first = arr.get(0);
        for(int i=0; i<arr.size(); i++)
            if (first.compareTo(arr.get(i)) > 0) 
                first = arr.get(i);
        return first;
    }
    
    public static ArrayList<String> removeA(ArrayList<String> arr) {
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).contains("a")) {
                arr.remove(i);
                i -= 2;
            }
        }
        return arr;
    }
    
}