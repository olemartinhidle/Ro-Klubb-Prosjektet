package main.modell.forbund;
//Abstrakt klasse som samler funksjonalitet fra Distansetester og StyrkeTester
public abstract class Test {
    int medlemsID;
    String testID;

    public String getTestID() {     return testID; }

    public void setTestID(String testID) {this.testID = testID;}

    public int getMedlemsID() {return medlemsID;}

    public void setMedlemsID(int medlemsID) {this.medlemsID = medlemsID;}

}

