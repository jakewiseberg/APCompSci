package DefiningClassesLab;

/**
 *
 * @author jacob.wiseberg
 */
public class RoachPopulation {
    private int population;
    
    public RoachPopulation(int population) {
        this.population = population;
    }
    
    public int getRoaches() {
        return population;
    }
    
    public void breed() {
        population = population*2;
    }
    public void spray() {
        population = (int)(population-(population*.1));
    }
}
