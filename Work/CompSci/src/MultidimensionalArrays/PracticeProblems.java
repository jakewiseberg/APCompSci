package MultidimensionalArrays;

/**
 *
 * @author jacob.wiseberg
 */
public class PracticeProblems {
    public static void main(String[] args) {
        int[][] arr = { {1,2},
                        {3,4},
                        {5,6},
                        {7,8} };
        System.out.println("The array: ");
        printTwoDArr(arr);
        System.out.println("The maxs: ");
        printArr(maxOfRows(arr));
        System.out.println("The final max: " + max(arr));
        
    }
    
    public static void printTwoDArr(int[][] arr) {
        for (int r=0; r<arr.length; r++) {
            for (int c=0; c<arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println("");
        }
    }
    public static void printArr (int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("");
    }
    
    public static int[] maxOfRows(int[][] arr) {
        int[] maxs = new int[arr.length];
        int max;
        for (int r = 0; r<arr.length; r++) {
            max = arr[r][0];
            for (int c = 1; c<arr[r].length; c++) {
                if (arr[r][c] > max)
                    max = arr[r][c];
            }
            maxs[r] = max;
        }
        return maxs;
    }
    
    public static int max(int[][] arr) {
        int max;
        max = arr[0][0];
        for (int r=0; r<arr.length; r++) {
            for (int c=0; c<arr[r].length; c++) {
                if (arr[r][c] > max)
                    max = arr[r][c];
            }
        }
        return max;
    }
    
    public static double avg(int[][] arr) {
        double avg = 0;
        for (int r = 0; r<arr.length; r++)
            for (int c = 1; c<arr[r].length; c++)
                avg += arr[r][c];
        return avg/(arr.length * arr[0].length);
    }
    
    public static double avgOfRow(int[] arr) {
        double avg = 0;
        for (int i = 0; i<arr.length; i++)
            avg += arr[i];
        return avg/arr.length;
    }
    
    public static double[] avgs(int[][] arr) {
        double[] avgs = new double[arr.length];
        for (int i=0; i<arr.length; i++)
            avgs[i] = avgOfRow(arr[i]);
        return avgs;
    }
}
