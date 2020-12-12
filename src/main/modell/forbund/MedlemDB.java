package main.modell.forbund;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Her har vi en klasse for database for medlems objekter
public class MedlemDB {
    Connection con ;
//Her har vi en constructor som oppretter en kobling til DB
    public MedlemDB(Connection con) {
        this.con = con;
    }

    //Her har vi metoden for å registrere medlem, ønsker medlem modell som input
    public boolean registrerMedlem(Medlem medlem){
        boolean bool = false;
        try{
            //Her bygger vi query en vi ønsker å benytte oss av
            String query = "INSERT INTO RoForbundDB.Medlemmer(MedlemsID, KlasseID,KlubbID,Fornavn,Etternavn,År_Født,Stilling,Klubb,Klasse) VALUES(?,?,?,?,?,?,?,?,?)";
            //Så bygger vi en preperedStatement utifra underliggende parametere lagret i medlemsmodellen
            PreparedStatement pst = this.con.prepareStatement(query);
            //Henter ut data fra medlemsmodellen
            pst.setString(1, medlem.getMedlemsID());
            pst.setInt(2, medlem.getKlasseID());
            pst.setInt(3, medlem.getKlubbID());
            pst.setString(4, medlem.getFornavn());
            pst.setString(5, medlem.getEtternavn());
            pst.setInt(6, medlem.getFødt());
            pst.setString(7, medlem.getStilling());
            pst.setString(8, medlem.getKlubb());
            pst.setString(9, medlem.getKlasse());
            //Kjører query
            pst.executeUpdate();
            //Ved suksess settes true
            bool = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        //Returnerer et tegn på suksess eller at det ikke virket
        return bool;
    }


}