package main.classes.hoved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StyrkeDB {
    Connection conn;

    public StyrkeDB(Connection conn) {
        this.conn = conn;
    }

    //for register user
    public boolean registrerStyrkeTest(StyrkeTest stest) {
        boolean booll = false;
        try {
            //Insert register data to database
            String query = " INSERT INTO RoForbundDB.StyrkeTester (TestID,MedlemsID,Ligg_Ro_Prosent, Ligg_Ro_KG, Knebøy_Prosent, Knebøy_KG, Antall_Beveg) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement p = this.conn.prepareStatement(query);
            p.setInt(1, stest.getTestID());
            p.setInt(2, stest.getMedlemsID());
            p.setString(3, stest.getLiggiroProsent());
            p.setInt(4, stest.getLiggiroKG());
            p.setString(5, stest.getKnebøyiProsent());
            p.setInt(6, stest.getKnebøyiKG());
            p.setInt(6, stest.getAntallBeveg());

            p.executeUpdate();
            booll = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booll;
    }
}

