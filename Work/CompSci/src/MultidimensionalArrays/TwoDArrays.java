package MultidimensionalArrays;

/**
 *
 * @author jacob.wiseberg
 */
public class TwoDArrays {
    public static void main(String[] args) {
        //Multidimensional arrays are like matricies
        //this one is a 5 by 5
        int[][] x = new int[5][5];
        //this one is 5 by 2;
        int[][] y = new int[5][2];
        //this is a quick way to initialize one
        String[][] z = { {"hi",          "helloe"},
                         {"bye",        "so long"},
                         {"this", "is a 2d array"} };
//        System.out.println(z[0][0]);
//        System.out.print(z[2][0] + " ");
//        System.out.println(z[2][1]);
        
        
        
        
        //Then there are jagges/ragged arrays
        int[][] a = new int[3][];
        a[0] = new int[4];
        
        int[][] arr = { {1,2},
                        {3,4},
                        {5,6},
                        {7,8} };
        
        for (int r=0; r<arr.length; r++) {
            for (int c=0; c<arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println("");
        }
    }
}
