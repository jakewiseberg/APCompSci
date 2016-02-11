package SortingSearching;

/**
 *
 * @author jacob.wiseberg
 */
public class Sorting {
    public static void main(String[] args) {
        int[] test = {1,5,2,7,9,3,8,25,9,3};
        System.out.println("Unsorted  : " + toString(test));
        insertion(test);
        System.out.println("Sorted    : " + toString(test));
    }
    
    public static void bubble(int[] a) {
        for (int i=a.length-1; i>0; i--)
            for (int j=0; j<i; j++)
                if (a[j] > a[j+1])
                    swap(a, j, j+1);
    }
    
    public static void selection(int[] a) {
        int smallest;
        for (int i=0; i<a.length-1; i++) {
            smallest = i;
            for (int j=i+1; j<a.length; j++) {
                if (a[j] < a[smallest])
                    smallest = j;
            }
            swap(a, smallest, i);
        }
    }
    
    public static void insertion(int[] a) {
        int j;
        for (int i=1; i<a.length-1; i++) {
            j = i;
            while (j>0 && a[j]<a[j-1]) {
                swap(a, a[j], a[j-1]);
                j--;
            }
        }
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
