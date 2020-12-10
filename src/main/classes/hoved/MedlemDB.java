package main.classes.hoved;

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
            String query = "INSERT INTO RoForbundDB.Medlemmer(MedlemsID, KlasseID,KlubbID,Fornavn,Etternavn,År_Født,Stilling,Klubb,Klasse) VALUES(?,?,?,?,?,?,?,?)";

            PreparedStatement pst = this.con.prepareStatement(query);


            pst.setInt(1, medlem.getKlasseID());
            pst.setInt(2, medlem.getKlubbID());
            pst.setString(3, medlem.getFornavn());
            pst.setString(4, medlem.getEtternavn());
            pst.setInt(5, medlem.getFødt());
            pst.setString(6, medlem.getStilling());
            pst.setString(7, medlem.getKlubb());
            pst.setString(8, medlem.getKlasse());

            pst.executeUpdate();
            bool = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return bool;
    }

    //user login
    public Medlem logMedlem(String epost, String passord){
        Medlem medlem=null;
        try{
            String query ="SELECT * FROM Brukere WHERE Epost=? AND Passord=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, epost);
            pt.setString(2, passord);

            ResultSet rs = pt.executeQuery();

            if(rs.next()){
                medlem = new Medlem();
                medlem.setFornavn(rs.getString("BrukerID"));
                medlem.setEtternavn(rs.getString("Epost"));
                medlem.setFødt(rs.getInt("Passord"));
                medlem.setKlubb(rs.getString("Rettigheter"));

            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return medlem;
    }

}