package main.classes.hoved;

public class StyrkeTest extends Test {

    String liggiroProsent;
    int liggiroKG;
    String knebøyiProsent;
    int knebøyiKG;
    int antallBeveg;

    public StyrkeTest() {
    }
    public StyrkeTest(String testID, int medlemsID, String liggiroProsent,
                      int liggiroKG, String knebøyiProsent, int knebøyiKG,
                      int antallBeveg) {
        this.testID = testID;
        this.medlemsID = medlemsID;
        this.liggiroProsent = liggiroProsent;
        this.liggiroKG = liggiroKG;
        this.knebøyiProsent = knebøyiProsent;
        this.knebøyiKG = knebøyiKG;
        this.antallBeveg = antallBeveg;
    }

    public String getLiggiroProsent() {
        return liggiroProsent;
    }

    public void setLiggiroProsent(String liggiroProsent) {
        this.liggiroProsent = liggiroProsent;
    }

    public int getLiggiroKG() {
        return liggiroKG;
    }

    public void setLiggiroKG(int liggiroKG) {
        this.liggiroKG = liggiroKG;
    }

    public String getKnebøyiProsent() {
        return knebøyiProsent;
    }

    public void setKnebøyiProsent(String knebøyiProsent) {
        this.knebøyiProsent = knebøyiProsent;
    }

    public int getKnebøyiKG() {
        return knebøyiKG;
    }

    public void setKnebøyiKG(int knebøyiKG) {
        this.knebøyiKG = knebøyiKG;
    }

    public int getAntallBeveg() {
        return antallBeveg;
    }

    public void setAntallBeveg(int antallBeveg) {
        this.antallBeveg = antallBeveg;
    }
}
