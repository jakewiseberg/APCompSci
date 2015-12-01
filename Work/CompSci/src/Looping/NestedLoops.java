package Looping;

/**
 *
 * @author jacob.wiseberg
 */
public class NestedLoops {
    public static void main(String[] args) {
        xBox(5);
        System.out.println("");
        xRightTriangle(5);
        System.out.println("");
        xIsoTriangle(5);
        System.out.println("");
        numBox(3);
        System.out.println("");
        numPyramid(5);
        System.out.println("");
        numTriangle(5);
        System.out.println("");
        powBox(3);
    }
    
    public static void xBox(int n) {
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=n; c++)
                System.out.print("x");
            System.out.println("");
        }
    }
    
    public static void xRightTriangle(int n) {
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=r; c++)
                System.out.print("x");
            System.out.println("");
        }
    }
    
    public static void xIsoTriangle(int n) {
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=r; c++)
                System.out.print("x");
            System.out.println("");
        }
        for (int r=n; r>0; r--) {
            for (int c=r; c>0; c--)
                System.out.print("x");
            System.out.println("");
        }
    }
    
    public static void numBox(int n) {
        int toPrint = 1;
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=n; c++) {
                System.out.print(toPrint + " ");
                toPrint++;
            }
            System.out.println("");
        }
    }
    
    public static void numPyramid(int n) {
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=r; c++)
                System.out.print(r);
            System.out.println("");
        }
    }
    
    public static void numTriangle(int n) {
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=r; c++)
                System.out.print(c);
            System.out.println("");
        }
    }
    
    public static void powBox(int n) {
        int toPrint = 1;
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=n; c++) {
                System.out.print((int)(Math.pow(toPrint, 2)) + " ");
                toPrint += 1;
            }
            System.out.println("");
        }
    }
}
