package main.modell.hoved;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, styrketest.getTestID());
            pst.setString(2, styrketest.getMedlemsID());
            pst.setString(3, styrketest.getLiggiroProsent());
            pst.setInt(4, styrketest.getLiggiroKG());
            pst.setString(5, styrketest.getKnebøyiProsent());
            pst.setInt(6, styrketest.getKnebøyiKG());
            pst.setInt(7, styrketest.getAntallBeveg());

            pst.executeUpdate();
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }
}

