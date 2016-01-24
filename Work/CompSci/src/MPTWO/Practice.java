package MPTWO;
import java.util.Scanner;

/**
 *
 * @author jakew
 */
public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.next();
        System.out.println("The letter 'a' occurres " + occurances(name, 'a') + " times!");
    }
    
    public static int occurances(String str, char a) {
        int counter = 0;
        for (int i=0; i<str.length(); i++)
            if (str.charAt(i) == a)
                counter++;
        return counter;
    }
}
