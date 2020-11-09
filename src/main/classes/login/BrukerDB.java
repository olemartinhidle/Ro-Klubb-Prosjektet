package main.classes.login;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BrukerDB {
    Connection con ;

    public BrukerDB(Connection con) {
        this.con = con;
    }

    //for register user
    public boolean registrerBruker(Bruker bruker){
        boolean bool = false;
        try{
            //Insert register data to database
            String query = "INSERT INTO Brukere(Epost,Passord,Rettigheter) VALUES(?,?,?)";

            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, bruker.getEpost());
            pst.setString(2, bruker.getPassord());
            pst.setString(3, bruker.getRettigheter());

            pst.executeUpdate();
            bool = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return bool;
    }
}