package main.classes.hoved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MedlemDB {
    Connection conn ;

    public MedlemDB(Connection conn) {
        this.conn = conn;
    }

    //for register user
    public boolean registrerMedlem(Medlem medlem){
        boolean bol = false;
        try{
            //Insert register data to database
            String query = "INSERT INTO RoForbundDB.Medlemmer(Fornavn,Etternavn,År_Født,Klubb) VALUES(?,?,?,?)";

            PreparedStatement pst = this.conn.prepareStatement(query);
            pst.setString(1, medlem.getFornavn());
            pst.setString(2, medlem.getEtternavn());
            pst.setInt(3, medlem.getFødt());
            pst.setString(4, medlem.getKlubb());

            pst.executeUpdate();
            bol = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return bol;
    }

    //user login
    public Medlem logMedlem(String epost, String passord){
        Medlem medlem=null;
        try{
            String query ="SELECT * FROM Brukere WHERE Epost=? AND Passord=?";
            PreparedStatement pt = this.conn.prepareStatement(query);
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