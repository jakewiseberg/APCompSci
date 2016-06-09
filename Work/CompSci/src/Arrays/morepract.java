package Arrays;

/**
 *
 * @author jacob.wiseberg
 */
public class morepract  {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        print(arr);
        change(arr);
        print(arr);
    }
    
    public static void change(int[] arr) {
        for (int n : arr)
            n = 0;
    }
    
    public static void print(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println("");
    }
}
