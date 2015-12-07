package Looping;

/**
 *
 * @author jacob.wiseberg
 */
public class PrimeCompositeUnique {
    public static void main(String[] args) {
        allPrimesUpTo(100);
    }
    
    //look through every number that is up to x, then if one of them is divisible by x, then the number is prime
    //unless x is 0 or 1, then it is automatically false
    public static boolean isPrime(int x) {
        if (x==1) return false;
        for(int i=2; i<=Math.sqrt(x); i++) {
            if (x%i==0)
                return false;
        }
        return true;
    }
    
    public static void allPrimesUpTo(int x) {
        for (int i=2; i<=x; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println("");
    }
}
