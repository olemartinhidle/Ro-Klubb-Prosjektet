package main.modell.forbund;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DistanseDB {
    Connection con ;

    public DistanseDB(Connection con) {
        this.con = con;
    }

    //for register user
    public boolean registrerDistanseTest(DistanseTest distansetest){
        boolean bool = false;
        try{
            //Insert register data to database
            String query = "INSERT INTO RoForbundDB.DistanseTester (TestID,MedlemsID,5000M_Watt, 5000M_Tid, 2000M_Watt, 2000M_Tid, 60M_Watt) VALUES(?,?,?,?,?,?,?)";


            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, distansetest.getTestID());
            pst.setInt(2, distansetest.getMedlemsID());
            pst.setInt(3, distansetest.getFemtusenWatt());
            pst.setString(4, distansetest.getFemtuseniTid());
            pst.setInt(5, distansetest.getTotusenWatt());
            pst.setString(6, distansetest.getTotuseniTid());
            pst.setInt(7, distansetest.getSekstiWatt());

            pst.executeUpdate();
            bool = true;

        }catch(Exception e){
            e.printStackTrace();
        }
        return bool;
    }



}
