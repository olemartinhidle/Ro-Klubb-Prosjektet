package main.modell.forbund;
//Klasse for medlemsmodell som kan være input i MedlemsDB
public class Medlem {

    String medlemsID;
    int klasseID;
    int klubbID;
    String fornavn;
    String etternavn;
    int født;
    String stilling;
    String klubb;
    String klasse;
//Tom meldems modell constructor
    public Medlem() {
    }
//Mer utfyllende constructor for medlems modell
    public Medlem(String medlemsID ,int klasseID, int klubbID, String fornavn, String etternavn,
                  int født,String stilling, String klubb, String klasse) {
        this.medlemsID = medlemsID;
        this.klasseID = klasseID;
        this.klubbID = klubbID;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.født = født;
        this.stilling = stilling;
        this.klubb = klubb;
        this.klasse = klasse;
    }
//Under kommer ulike Get ere og Set ere for å hente ut eller sette inn data i modellen


    public String getMedlemsID() { return medlemsID; }

    public void setMedlemsID(String medlemsID) { this.medlemsID = medlemsID; }

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
