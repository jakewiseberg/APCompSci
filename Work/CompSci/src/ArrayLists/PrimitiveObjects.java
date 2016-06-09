package ArrayLists;
import java.util.*;

/**
 *
 * @author jacob.wiseberg
 */
public class PrimitiveObjects {
    public static void main(String[] args) {
        ArrayList<Integer> list = generate(20);
        ArrayList<String> list2 = new ArrayList();
        list2.add("Jake");
        list2.add("Thisisareallylongstring");
        list2.add("Another");
        list2.add("One");
        System.out.println(list2);
        removeAs(list2);
        System.out.println(list2);
                
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
    public static int max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i=1; i<list.size(); i++)
            if (list.get(i)>max) max = list.get(i);
        return max;
    }
    
    public static int min(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i=1; i<list.size(); i++)
            if (list.get(i)<min) min = list.get(i);
        return min;
    }
    
    public static ArrayList<Integer> generate(int size) {
        ArrayList<Integer> list = new ArrayList();
        for (int i=0; i<size; i++)
            list.add((int)(Math.random()*20+1));
        return list;
    }
    
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = list;
        for (int i=0; i<reversed.size()/2; i++) {
            int temp = reversed.get(i);
            reversed.set(i, reversed.get(reversed.size()-i-1));
            reversed.set(reversed.size()-i-1, temp);
        }
        return reversed;
    }
    
    public static String removeLongest(ArrayList<String> list) {
        String longest = list.get(list.size()-1);
        int longestIndex = 0;
        for (int i =list.size()-2; i>=0; i--) {
            if (list.get(i).length() > longest.length()) {
                longest = list.get(i);
                longestIndex = i;
            }
        }
        list.remove(longestIndex);
        return longest;
    }
    
    public static void removeAs(ArrayList<String> list) {
        for (int i = list.size()-1; i>=0; i--)
            if (list.get(i).charAt(0) == 'a' || list.get(i).charAt(0) == 'A')
                list.remove(i);
    }
}