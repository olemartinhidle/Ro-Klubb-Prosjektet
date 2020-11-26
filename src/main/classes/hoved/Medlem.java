package main.classes.hoved;

public class Medlem {
    String fornavn;
    String etternavn;
    int født;
    String klubb;

    public Medlem() {
    }

    public Medlem(String fornavn, String etternavn, int født, String klubb) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.født = født;
        this.klubb = klubb;
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

    public int getFødt() {
        return født;
    }

    public void setFødt(int født) {
        this.født = født;
    }

    public String getKlubb() {
        return klubb;
    }

    public void setKlubb(String klubb) {
        this.klubb = klubb;
    }
}
