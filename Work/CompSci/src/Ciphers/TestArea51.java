package Ciphers;
import java.util.Scanner;

/**
 *
 * @author jakew
 */
public class TestArea51 {
    public static void main(String[] args) {
        Replacement r = new Replacement("test", "thisisareallylongkeyword");
        Caesar c = new Caesar("test", 15);
        Transposition t = new Transposition("test", 4);
        System.out.println("Our test word is 'test'...");
        System.out.println(r.getKey());
    }
}
