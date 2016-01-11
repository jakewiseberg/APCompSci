package Arrays;

/**
 *
 * @author jacob.wiseberg
 */
public class problems {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
        
    }
    
    public static int sum(int[] a) {
        int sum = 0;
        if (a != null) {
            for (int i=0; i<a.length; i++) {
                sum += a[i];
            }
        }
        return sum;
    }
    
    public static int occurrancesOfTen(int[] a) {
        int occurrances = 0;
        if (a != null) {
            for (int i=0; i<a.length; i++) {
                if (a[i]%10==0) occurrances++;
            }
        }
        return occurrances;
    }
    
    public static String toString(int[] a) {
        String toString = "";
        if (a != null) {
            for (int i=0; i<a.length; i++) {
                toString += String.valueOf(a[i]);
            }
        }
        return toString;
    }
    
    public static int max(int[] a) {
        int max = 0;
        if (a != null) {
            for (int i=0; i<a.length; i++) {
                if (a[i]>max) max=a[i];
            }
        }
        return max;
    }
    
    public static int indexOfMax(int[] a) {
        if (a != null) {
            int max = max(a);
            String arrStr = toString(a);
            return arrStr.indexOf(max);
        }
        else return -1;
    }
    
    public static char randChar() {
        return (char)((int)(Math.random()*26+97));
    }
}
