package main.classes.hoved;

public class Medlem {
    int klasseID;
    int klubbID;
    String fornavn;
    String etternavn;
    int født;
    String stilling;
    String klubb;
    String klasse;

    public Medlem() {
    }

    public Medlem(int klasseID, int klubbID, String fornavn, String etternavn,
                  int født,String stilling, String klubb, String klasse) {
        this.klasseID = klasseID;
        this.klubbID = klubbID;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.født = født;
        this.stilling = stilling;
        this.klubb = klubb;
        this.klasse = klasse;
    }

    public int getKlasseID() {
        return klasseID;
    }

    public void setKlasseID(int klasseID) {
        this.klasseID = klasseID;
    }

    public int getKlubbID() {
        return klubbID;
    }

    public void setKlubbID(int klasseID) {
        this.klubbID = klubbID;
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

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }

    public String getKlubb() {
        return klubb;
    }

    public void setKlubb(String klubb) {
        this.klubb = klubb;
    }

    public String getKlasse() {
        return fornavn;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }
}
