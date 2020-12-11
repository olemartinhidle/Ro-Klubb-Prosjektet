package main.modell.loggInn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Denne klassen lager en databasehandler for brukerobjekter.
// Det vil si at den kombinerer databasen med klassene (de som er skrevet i java)

// Den klassen har flere metoder som kommer under

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

    //user loggInn
    public Bruker logBruker(String epost, String passord){
        Bruker bruker=null;
        try{
            String query ="SELECT * FROM Brukere WHERE Epost=? AND Passord=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, epost);
            pt.setString(2, passord);

            ResultSet rs = pt.executeQuery();

            if(rs.next()){
                bruker = new Bruker();
                bruker.setId(rs.getInt("BrukerID"));
                bruker.setEpost(rs.getString("Epost"));
                bruker.setPassord(rs.getString("Passord"));
                bruker.setRettigheter(rs.getString("Rettigheter"));

            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return bruker;
    }

}