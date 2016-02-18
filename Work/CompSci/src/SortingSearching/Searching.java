package SortingSearching;

/**
 *
 * @author jacob.wiseberg
 */
public class Searching {
    public static void main(String[] args) {
        int[] test = {0,1,2,3,4,5,6,7,8,9};
        int linear = linear(test, 5);
        int binary = binary(test, 5);
        System.out.println("Linear returns " + linear);
        System.out.println("Binary returns " + binary);
        System.out.println("Did they both produce the same numbers? " + (linear == binary));
    }
    
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
}
