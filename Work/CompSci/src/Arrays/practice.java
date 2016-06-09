package Arrays;

/**
 *
 * @author jacob.wiseberg
 */
public class practice {
    public static void main(String[] args) {
        //array of presents then print
        
        //old and boring way
        String[] presents = new String[3];
        presents[0] = "Turbo-Man";
        presents[1] = "Drone";
        //presents[2] = "Puppy";
        
        //new and cool way, only if you already know what all of the elements will be
        String[] gifts = {"Doll", "Toy Truck", "Choo Choo Train"};
        
        //Enhanced for loop, only use to read through array, no changes cause no index
        for (String present : presents) {
            if (present != null)
                System.out.print(present + " ");
        }
        System.out.println("");
    }
}
