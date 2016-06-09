package Arrays;

/**
 *
 * @author jacob.wiseberg
 */
public class Algorithms {
    private int[] list;
    public Algorithms(int[] list) {
       this.list = list;
    }
    public int[] getList() {
        return list;
    }
    
    private int[] copy(int length) {
        int[] copy = new int[length];
        for (int i=0; i< length; i++) {
            if (i < list.length)
                copy[i] = list[i];
            else break;
        }
        return copy;
    }
    public void insertAtEnd(int val) {
        int[] arr = copy(list.length+1);
        arr[arr.length-1] = val;
        this.list = arr;
    }
    public void insertAtIndex(int val, int index) {
        int[] arr = new int[list.length+1];
        for (int i=0; i<index; i++) {
            arr[i] = list[i];
        }
        arr[index] = val;
        for (int i=index+1; i<arr.length; i++) {
            arr[i] = list[i-1];
        }
        list = arr;
    }
    public void remove(int index) {
        list[index] = list[list.length-1];
        list = copy(list.length-1);
    }
    public void swap(int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
    @Override
    public String toString() {
        String sArr = "[ ";
        for (int x : list)
            sArr += x + " ";
        sArr += "]";
        return sArr;
    }
}

class Tester {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        Algorithms x = new Algorithms(arr);
        x.insertAtIndex(2, 6);
        System.out.println(x);
    }
}