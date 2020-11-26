package main.classes.hoved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DistanseDB {
    Connection conn ;

    public DistanseDB(Connection conn) {
        this.conn = conn;
    }

    //for register user
    public boolean registrerDistanseTest(DistanseTest dtest){
        boolean booll = false;
        try{
            //Insert register data to database
            String query = "INSERT INTO RoForbundDB.DistanseTester (TestID,MedlemsID,5000M_Watt, 5000M_Tid, 2000M_Watt, 2000M_Tid, 60M_Watt) VALUES(?,?,?,?,?,?,?)";


            PreparedStatement psttt = this.conn.prepareStatement(query);
            psttt.setInt(1, dtest.getTestID());
            psttt.setInt(2, dtest.getMedlemsID());
            psttt.setInt(3, dtest.getFemtusenWatt());
            psttt.setString(4, dtest.getFemtuseniTid());
            psttt.setInt(5, dtest.getTotusenWatt());
            psttt.setString(6, dtest.getTotuseniTid());
            psttt.setInt(7, dtest.getSekstiWatt());


            psttt.executeUpdate();
            booll = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return booll;
    }



}
