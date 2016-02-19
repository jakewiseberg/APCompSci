package Playground;

/**
 *
 * @author jacob.wiseberg
 */
public class TestArea1{
    public static void main(String[] args) throws InterruptedException {
        char[] message = {'H','e','l','l','o',' ','W','o','r','l','d','!'};
        for(int i=0; i<message.length; i++) {
            System.out.print(message[i]);
            Thread.sleep((int)(Math.random()*200+300));
        }
        System.out.println("");
    }
}
