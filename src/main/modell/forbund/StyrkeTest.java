package main.modell.forbund;

public class StyrkeTest extends Test {

    String testID;
    int medlemsID;
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

    public String getTestID() {     return testID; }

    public void setTestID(String testID) {this.testID = testID;}

    public int getMedlemsID() {return medlemsID;}

    public void setMedlemsID(int medlemsID) {this.medlemsID = medlemsID;}

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