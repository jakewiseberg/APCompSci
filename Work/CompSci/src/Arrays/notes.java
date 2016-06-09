package Arrays;

/**
 *
 * @author jacob.wiseberg
 */
public class notes {
    public static void main(String[] args) {
        int[] numbers = new int[10]; //this creates the array and defines the *length*
        numbers[0] = 5; //set's the 0th item in the array to 5
        /*
        the rest are currently at a default
        DEFAULTS:
          -->  objects = null
          -->  boolean = false
          -->  numbers (any number type: int, float, double, long, etc) = 0
        */
        numbers[1] = 1738;
        System.out.println(numbers[0]);
        System.out.println(numbers.length); //LENGTH IN ARRAYS ARE PUBLIC VARIABLES, THE ARE FINAL SO YOU CANNOT CHANGE
        //the length of an array in immutable
        //IMPORTANT******for array of objects, the array contains a bunch of references to different objects******
        
        /*
        Errors with arrays:
          -->  Null Pointer, for object arrays
          -->  Array Index Out Of Bounds, call on part of array that is out of bounds
        */
    }
}
