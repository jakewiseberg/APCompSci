package DefiningClasses;

/**
 *
 * @author jacob.wiseberg
 */
public class Rapper {

    //Instance Variables
    String stageName;
    String realName;
    int songs;
    int prisonRecord;

    //Constructors
    public Rapper(String n, String r, int s, int pr) {
        stageName = n;
        realName = r;
        songs = s;
        prisonRecord = pr;
    }
    public Rapper(String n) {
        this(n, "John", 1, 10);
    }
    public Rapper(String r, int s) {
        this("Mother****", r, s, 10);
    }
    public Rapper(String n, String r) {
        this(r, n, 0, 0);
    }

    //Getters
    public String getStageName() {
        return stageName;
    }
    public String getRealName() {
        return realName;
    }
    public int getSongs() {
        return songs;
    }
    public int getPrisonRecord() {
        return prisonRecord;
    }

    //Setters
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public void setSongs(int songs) {
        this.songs = songs;
    }
    public void setPrisonRecord(int prisonRecord) {
        this.prisonRecord = prisonRecord;
    }

    //Doers
    public void commitCrime() {
        prisonRecord++;
    }
}
