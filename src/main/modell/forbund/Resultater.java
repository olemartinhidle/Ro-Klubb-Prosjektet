package main.modell.forbund;

public class Resultater {

    String dato;
    int født;
    String fornavn;
    String etternavn;
    String klubb;
    int femtusenWatt;
    String femtusentid;
    int totusenWatt;
    String totusenTid;
    int sekstiWatt;
    String liggroPro;
    int liggroKG;
    String knebøyPro;
    int knebøyKG;
    int antallBeveg;


    public Resultater() {
    }

    public Resultater(String dato, int født, String fornavn, String etternavn,
                  String klubb, int femtusenWatt, String femtusentid,
                  int totusenWatt, String totusenTid, int sekstiWatt,
                  String liggroPro, int liggroKG, String knebøyPro,
                  int knebøyKG, int antallBeveg) {

        this.dato = dato;
        this.født = født;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.klubb = klubb;
        this.femtusenWatt = femtusenWatt;
        this.femtusentid = femtusentid;
        this.totusenWatt = totusenWatt;
        this.totusenTid = totusenTid;
        this.sekstiWatt = sekstiWatt;
        this.liggroPro = liggroPro;
        this.liggroKG = liggroKG;
        this.knebøyPro = knebøyPro;
        this.knebøyKG = knebøyKG;
        this.antallBeveg = antallBeveg;

    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getFødt() {
        return født;
    }

    public void setFødt(int født) {
        this.født = født;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getKlubb() {
        return klubb;
    }

    public void setKlubb(String klubb) {
        this.klubb = klubb;
    }

    public int getFemtusenWatt() {
        return femtusenWatt;
    }

    public void setFemtusenWatt(int femtusenWatt) {
        this.femtusenWatt = femtusenWatt;
    }

    public String getFemtusentid() {return femtusentid;}

    public void setFemtusentid(String femtusentid) { this.femtusentid = femtusentid; }

    public int getTotusenWatt() {
        return totusenWatt;
    }

    public void setTotusenWatt(int totusenWatt) {
        this.totusenWatt = totusenWatt;
    }

    public String getTotuseniTid() {
        return totusenTid;
    }

    public void setTotuseniTid(String totuseniTid) {
        this.totusenTid = totuseniTid;
    }

    public int getSekstiWatt() {
        return sekstiWatt;
    }

    public void setSekstiWatt(int sekstiWatt) {
        this.sekstiWatt = sekstiWatt;
    }

    public String getLiggiroProsent() {
        return liggroPro;
    }

    public void setLiggiroProsent(String liggiroProsent) {
        this.liggroPro = liggiroProsent;
    }

    public int getLiggiroKG() {
        return liggroKG;
    }

    public void setLiggiroKG(int liggiroKG) {
        this.liggroKG = liggiroKG;
    }

    public String getKnebøyiProsent() {
        return knebøyPro;
    }

    public void setKnebøyiProsent(String knebøyiProsent) {
        this.knebøyPro = knebøyiProsent;
    }

    public int getKnebøyiKG() {
        return knebøyKG;
    }

    public void setKnebøyiKG(int knebøyiKG) {
        this.knebøyKG = knebøyiKG;
    }

    public int getAntallBeveg() {
        return antallBeveg;
    }

    public void setAntallBeveg(int antallBeveg) {
        this.antallBeveg = antallBeveg;
    }

}


