package SortingSearching;

/**
 *
 * @author jacob.wiseberg
 */
public class Sorting {
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,0};
        int[] b = {5,6,3,8,1,9,3,7,3,8};
        System.out.println("Unsorted   : " + toString(a));
        insertion(a);
        System.out.println("Sorted     : " + toString(a));
        
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
        int j, key;
        for (int i=1; i<a.length; i++) {
            key = a[i]; j = i-1;
            while (j>=0 && a[j]>key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
    
    public static void merge(int[] a, int[] b) {
        //sort the arrays to make sure that the merge works
        insertion(a);
        insertion(b);
        
        int i=0, j=0, k=0;
        int[] merged = new int[a.length + b.length - 1];
        while (i<a.length && j<b.length) {
            if (a[i] <= b[j]) {
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }
        System.out.println(toString(merged));
    }
    
    public static void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
    
    public static String toString(int[] a) {
        String str = "[";
        for (int i : a)
            str += (" " + i);
        str += " ]";
        return str;
    }
}
