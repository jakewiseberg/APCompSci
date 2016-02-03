package NumberSystem;
import java.util.*;

/**
 *
 * @author jakew
 */
public class Conversions {
    public static void main(String[] args) {
        int num = 198;
        System.out.println(num);
        System.out.println(fromDecimal(num, 4));
    }
    
    public static int toDecimal(int n, int base) {
        String num = String.valueOf(n);
        String converted = "";
        return n;
    }
    
    public static int fromDecimal(int n, int baseTo) {
        String converted = "";
        while (n / baseTo != 0) {
            converted += String.valueOf(n % baseTo);
            n = n/baseTo;
        }
        return Integer.valueOf(converted);
    }
    
    public static int anyToAny(int n, int base, int baseTo) {
        n = toDecimal(n, base);
        n = fromDecimal(n, baseTo);
        return n;
    }
    
    public static String reversed(String str) {
        String rev = "";
        for (int i=str.length()-1; i>=0; i--)
            rev += String.valueOf(str.charAt(i));
        return rev;
    }
}
