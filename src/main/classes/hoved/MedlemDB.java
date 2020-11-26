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
            String query = "INSERT INTO RoForbundDB.Medlemmer(KlasseID,KlubbID,Fornavn,Etternavn,År_Født,Stilling,Klubb,Klasse) VALUES(?,?,?,?)";

            PreparedStatement pst = this.con.prepareStatement(query);



            pst.setString(1, medlem.getFornavn());
            pst.setString(2, medlem.getEtternavn());
            pst.setInt(3, medlem.getFødt());
            pst.setString(4, medlem.getKlubb());

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