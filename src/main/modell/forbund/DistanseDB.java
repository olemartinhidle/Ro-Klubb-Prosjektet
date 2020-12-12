package main.modell.forbund;

import java.sql.Connection;
import java.sql.PreparedStatement;
//Klasse for distanse test objekt DB
public class DistanseDB {
    //Oppretter en tilknyttning til DB
    Connection con ;
//Har en Construct som kobler  seg til MariaDB
    public DistanseDB(Connection con) {
        this.con = con;
    }

    //Så har vi en metode for å registrere en ny distansetest
    public boolean registrerDistanseTest(DistanseTest distansetest){
        //Her oppretter vi en bool som senere kan utnyttes for tilbakemelding
        boolean bool = false;
        try{
            //Her setter vi opp en query som vi kan fylle ut ved hjelp fra en preperedStatement
            String query = "INSERT INTO RoForbundDB.DistanseTester (TestID,MedlemsID,5000M_Watt, 5000M_Tid, 2000M_Watt, 2000M_Tid, 60M_Watt) VALUES(?,?,?,?,?,?,?)";

            //Her bruker vi Pst for å sette inn data fra distansetest modellen
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, distansetest.getTestID());
            pst.setInt(2, distansetest.getMedlemsID());
            pst.setInt(3, distansetest.getFemtusenWatt());
            pst.setString(4, distansetest.getFemtuseniTid());
            pst.setInt(5, distansetest.getTotusenWatt());
            pst.setString(6, distansetest.getTotuseniTid());
            pst.setInt(7, distansetest.getSekstiWatt());
            //Her kjører vi en update kommmando til DB
            pst.executeUpdate();
            //Ved suksess returneres en true bool for tilbakemelding
            bool = true;

        }catch(Exception e){
            e.printStackTrace();
        }
        //Her returneres bool som da enten kan være true eller false, som brukes til tilbakemelding
        return bool;
    }



}
