package TestingStuff;

/**
 *
 * @author jacob.wiseberg
 */
public class PublicVariable {
    static int a = 8;
    public static void main(String[] args) {
        change();
        System.out.println(a);
    }
    public static void change() {
        a = 7;
    }
}
