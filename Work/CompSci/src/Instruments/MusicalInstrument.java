package Instruments;

/**
 *
 * @author jakew
 */
public abstract class MusicalInstrument implements Tunable {
    private String range;
    private boolean inTune;
    
    public MusicalInstrument(String r) {
        range = r;
    }
    
    public void tune() {
        inTune = true;
    }
    abstract void play();
}
