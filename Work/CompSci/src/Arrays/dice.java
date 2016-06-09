package Arrays;

/**
 *
 * @author jacob.wiseberg
 */
public class dice {
    public static void main(String[] args) {
        int[] d1 = roll(1000);
        int[] d2 = roll(1000);
        int[] sums = sumOfDice(d1, d2);
        
        System.out.println("The first dice rolled   : {" + toString(d1) + "}");
        System.out.println("The second dice rolled  : {" + toString(d1) + "}");
        System.out.println("This sums of the dice   : {" + toString(sums) + "}");
    }
    
    public static int[] roll(int amount) {
        int[] rolls = new int[amount];
        for (int i=0; i<amount; i++) {
            rolls[i] = (int)(Math.random()*6+1);
        }
        return rolls;
    }
    public static int[] sumOfDice(int[] a, int[] b) {
        int[] sums = new int[a.length];
        if (a != null) {
            for (int i=0; i<a.length; i++) {
                sums[i] = a[i] + b[i];
            }
        }
        return sums;
    }
    public static int avgOfSums(int[] a) {
        int sum = 0;
        if (a != null) {
            for (int i=0; i<a.length; i++) {
                sum += a[i];
            }
        }
        return sum/a.length;
    }
    public static int sumRolledMostOften(int[] sums) {
        int amt = 0, temp;
        int oftenest = sums[0];
        for (int i=0; i<sums.length; i++) {
            temp = sums[i];
            for (int j=0; j<sums.length; j++) {
                if (temp == sums[j]) amt++;
            }
            //if ()
        }
        return oftenest;
    }
//    public static int sumRolledLeastOften(int[] sums) {
//        
//    }
    public static String toString(int[] a) {
        String toString = "";
        if (a != null) {
            for (int i=0; i<a.length; i++) {
                toString += String.valueOf(a[i]);
            }
        }
        return toString;
    }
}
