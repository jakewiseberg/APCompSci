package SortingSearching;

/**
 *
 * @author jacob.wiseberg
 */
public class SortingSearching {
    public static void main(String[] args) {
        boolean sorting, searching;
        int[] arr = {1,4,2,3,7,5,8,6,9,0};
        int[] brr = {2,3,1,4,6,5,0,7,8,9};
        sorting = ( bubble(arr) == selection(arr) && selection(arr) == insertion(arr) );
        searching = (binary(arr, 5) == linear(arr, 5));
        System.out.println("If all of the sorting methods work this will return true: " + sorting);
        System.out.println("Unsorted    : " + toString(arr));
        System.out.println("Sorted      : " + toString(insertion(arr)));
        System.out.println("\nIf all of the sorting methods work this will return true: " + searching);
        System.out.println("The index of the number 5: " + linear(arr, 5));
        System.out.println("\n---------------------  Merge example  ---------------------");
        System.out.println("Unmerged array 1: " + toString(insertion(arr)));
        System.out.println("Unmerged array 1: " + toString(insertion(brr)));
        System.out.println("Merged          : " + toString(merge(arr, brr)));
    }
    
    // --------------------- Sorting --------------------- //
    public static int[] bubble(int[] a) {
        for (int i=a.length-1; i>0; i--)
            for (int j=0; j<i; j++)
                if (a[j] > a[j+1])
                    swap(a, j, j+1);
        return a;
    }
    public static int[] selection(int[] a) {
        int smallest;
        for (int i=0; i<a.length-1; i++) {
            smallest = i;
            for (int j=i+1; j<a.length; j++) {
                if (a[j] < a[smallest])
                    smallest = j;
            }
            swap(a, smallest, i);
        }
        return a;
    }
    public static int[] insertion(int[] a) {
        int j, key;
        for (int i=1; i<a.length; i++) {
            key = a[i]; j = i-1;
            while (j>=0 && a[j]>key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }
    public static int[] merge(int[] a, int[] b) {
        //sort the arrays to make sure that the merge works
        insertion(a);
        insertion(b);
        int i=0, j=0, k=0;
        int[] merged = new int[a.length + b.length - 1];
        while (i<a.length+1 && j<b.length) {
            if (a[i] <= b[j]) {
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }
        return merged;
    }
    
    // --------------------- Searching --------------------- //
    public static int linear(int[] a, int target) {
        for (int i=0; i<a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }
    
    public static int binary(int[] arr, int target) {
        insertion(arr);
        int min = 0, max = arr.length-1, mid;
        while (min+1 < max) {
            mid = (min+max)/2;
            if (arr[mid] > target)
                max = mid;
            else
                min = mid;
        }
        if (arr[min] == target)
            return min;
        return -1;
    }
    
    //Generic string method for arrays
    public static String toString(int[] a) {
        String str = "[";
        for (int i : a)
            str += (" " + i);
        str += " ]";
        return str;
    }
    //Generic swap method for arrays
    public static void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
}
