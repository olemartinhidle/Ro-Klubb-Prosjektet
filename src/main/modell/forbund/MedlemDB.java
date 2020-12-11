package main.modell.forbund;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MedlemDB {
    Connection con ;

    public MedlemDB(Connection con) {
        this.con = con;
    }

    //for register user
    public boolean registrerMedlem(Medlem medlem){
        boolean bool = false;
        try{
            //Insert register data to database
            String query = "INSERT INTO RoForbundDB.Medlemmer(MedlemsID, KlasseID,KlubbID,Fornavn,Etternavn,År_Født,Stilling,Klubb,Klasse) VALUES(?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst = this.con.prepareStatement(query);

            pst.setString(1, medlem.getMedlemsID());
            pst.setInt(2, medlem.getKlasseID());
            pst.setInt(3, medlem.getKlubbID());
            pst.setString(4, medlem.getFornavn());
            pst.setString(5, medlem.getEtternavn());
            pst.setInt(6, medlem.getFødt());
            pst.setString(7, medlem.getStilling());
            pst.setString(8, medlem.getKlubb());
            pst.setString(9, medlem.getKlasse());

            pst.executeUpdate();
            bool = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return bool;
    }


}