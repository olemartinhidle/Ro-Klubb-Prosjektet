package main.classes.hoved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StyrkeDB {
    Connection con;

    public StyrkeDB(Connection con) {
        this.con = con;
    }

    //for register user
    public boolean registrerStyrkeTest(StyrkeTest styrketest) {
        boolean bool = false;
        try {
            //Insert register data to database
            String query = " INSERT INTO RoForbundDB.StyrkeTester (TestID,MedlemsID,Ligg_Ro_Prosent, Ligg_Ro_KG, Knebøy_Prosent, Knebøy_KG, Antall_Beveg) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement p = this.con.prepareStatement(query);
            p.setString(1, styrketest.getTestID());
            p.setInt(2, styrketest.getMedlemsID());
            p.setString(3, styrketest.getLiggiroProsent());
            p.setInt(4, styrketest.getLiggiroKG());
            p.setString(5, styrketest.getKnebøyiProsent());
            p.setInt(6, styrketest.getKnebøyiKG());
            p.setInt(6, styrketest.getAntallBeveg());

            p.executeUpdate();
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }
}

