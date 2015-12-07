package LoopingPractice;

/**
 *
 * @author jacob.wiseberg
 */
public class Practice {
    public static void main(String[] args) {
        tenTo55();
    }
    
    public static void tenTo55() {
        for (int i=10; i<=55; i++)
            System.out.print(i + " ");
        System.out.println("");
        for (int i=55; i>=10; i--)
            System.out.print(i + " ");
        System.out.println("");
    }
}
