package DefiningClassesLab;

/**
 *
 * @author jacob.wiseberg
 */
public class RoachSimulation {
    public static void main(String[] args) {
        RoachPopulation pop = new RoachPopulation(10);
        
        System.out.println("Current Population: " + pop.getRoaches());
        pop.breed();
        pop.spray();
        
        System.out.println("Current Population: " + pop.getRoaches());
        pop.breed();
        pop.spray();
        
        System.out.println("Current Population: " + pop.getRoaches());
        pop.breed();
        pop.spray();
    }
}
