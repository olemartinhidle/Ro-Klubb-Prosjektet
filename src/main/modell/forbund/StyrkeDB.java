package main.modell.forbund;

import java.sql.Connection;
import java.sql.PreparedStatement;
//Lager en StrykeTest database modell
public class StyrkeDB {
    //Setter opp en tilknyttning til DB
    Connection con;
//Lager en databasemodell for styrketest sammen med en tilknyttning til MariaDB
    public StyrkeDB(Connection con) {
        this.con = con;
    }

    //Her har vi metoden for å registrere styrketester, man kan se den ønsker styrketest modell som input
    public boolean registrerStyrkeTest(StyrkeTest styrketest) {
        //Til å begynne med er bool false
        boolean bool = false;
        try {
            //Her setter vi opp en spørring inne i en variabel som ønsker sette noe inn i DB
            String query = " INSERT INTO RoForbundDB.StyrkeTester (TestID,MedlemsID,Ligg_Ro_Prosent, Ligg_Ro_KG, Knebøy_Prosent, Knebøy_KG, Antall_Beveg) VALUES(?,?,?,?,?,?,?)";
            //Vi bygger en PreperedStatement med ulike data fra input fra web appen
            PreparedStatement p = this.con.prepareStatement(query);
            p.setString(1, styrketest.getTestID());
            p.setInt(2, styrketest.getMedlemsID());
            p.setString(3, styrketest.getLiggiroProsent());
            p.setInt(4, styrketest.getLiggiroKG());
            p.setString(5, styrketest.getKnebøyiProsent());
            p.setInt(6, styrketest.getKnebøyiKG());
            p.setInt(7, styrketest.getAntallBeveg());
            //Så kjører vi query
            p.executeUpdate();
            //Ved suksess får vi en bool = true
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Så returnerer man bool for å eventuelt vise suksess
        return bool;
    }
}

