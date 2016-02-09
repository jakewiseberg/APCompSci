package SortingSearching;

/**
 *
 * @author jacob.wiseberg
 */
public class Sorting {
    public static void main(String[] args) {
        int[] test = {1,5,2,7,9,3,8,25,9,3};
        System.out.println("Unsorted  : " + toString(test));
        test = selection(test);
        System.out.println("Sorted    : " + toString(test));
    }
    
    public static int[] bubble(int[] a) {
        for (int i=a.length-1; i>0; i--)
            for (int j=0; j<i; j++)
                if (a[j] > a[j+1])
                    swap(a, j, j+1);
        return a;
    }
    
    public static int[] selection(int[] a) {
        int smallest, index, temp;
        for (int i=0; i<a.length-1; i++) {
            smallest = a[i];
            index = i;
            for (int j=i; j<a.length; j++) {
                if (a[i] < smallest) {
                    smallest = a[j];
                    index = j;
                }
            }
            temp = smallest;
            a[index] = a[i];
            a[i] = temp;
        }
        return a;
    }
    
    public static void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
    
    public static String toString(int[] a) {
        String str = "";
        for (int i : a)
            str += (i + " ");
        return str;
    }
}
