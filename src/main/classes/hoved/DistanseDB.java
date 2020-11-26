package main.classes.hoved;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DistanseDB {
    Connection con ;

    public DistanseDB(Connection con) {
        this.con = con;
    }

    //for register user
    public boolean registrerDistanseTest(DistanseTest dtest){
        boolean bool = false;
        try{
            //Insert register data to database
            String query = "INSERT INTO RoForbundDB.DistanseTester (TestID,MedlemsID,5000M_Watt, 5000M_Tid, 2000M_Watt, 2000M_Tid, 60M_Watt) VALUES(?,?,?,?,?,?,?)";


            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setInt(1, dtest.getTestID());
            pst.setInt(2, dtest.getMedlemsID());
            pst.setInt(3, dtest.getFemtusenWatt());
            pst.setString(4, dtest.getFemtuseniTid());
            pst.setInt(5, dtest.getTotusenWatt());
            pst.setString(6, dtest.getTotuseniTid());
            pst.setInt(7, dtest.getSekstiWatt());

            pst.executeUpdate();
            bool = true;

        }catch(Exception e){
            e.printStackTrace();
        }
        return bool;
    }



}
