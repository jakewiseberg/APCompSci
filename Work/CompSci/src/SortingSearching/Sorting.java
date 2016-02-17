package SortingSearching;

/**
 *
 * @author jacob.wiseberg
 */
public class Sorting {
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,0};
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
        int j;
        for (int i=1; i<a.length-1; i++) {
            j = i;
            while (j>0 && a[j]<a[j-1]) {
                swap(a, a[j], a[j-1]);
                j--;
                System.out.println(toString(a));
            }
            System.out.println("Finished iteration " + i + " --->   " + toString(a));
        }
    }
    
    //precondition: the arrays are sorted
    public static void merge(int[] a, int[] b) {
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
