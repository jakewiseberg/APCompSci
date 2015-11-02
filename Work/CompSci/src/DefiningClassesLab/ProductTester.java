package DefiningClassesLab;

/**
 *
 * @author jacob.wiseberg
 */
public class ProductTester {
    public static void main(String[] args) {
        Product vaccuum = new Product("Vaccuum", 10.75);
        Product poptarts = new Product("Pop Tart", 7.00);
        
        System.out.println(vaccuum.toString());
        System.out.println(poptarts.toString());
        
        vaccuum.reducePrice(5);
        poptarts.reducePrice(5);
        
        System.out.println("\n" + vaccuum.toString());
        System.out.println(poptarts.toString());
    }
}
