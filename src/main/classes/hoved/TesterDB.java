package main.classes.hoved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesterDB {
    Connection con;

    public TesterDB(Connection con) {
        this.con = con;
    }

    public Tester SøkEtterResultater(String medlemsID) {
        Tester tester = null;
        PreparedStatement pt = null;
        ResultSet rs = null;
        try {

        String query = "SELECT D.Dato,\n" +
                "       M.År_Født 'Født',\n" +
                "       M.Fornavn,\n" +
                "       M.Etternavn,\n" +
                "       M.Klubb,\n" +
                "       Dist.5000M_Watt '5000Watt',\n" +
                "       Dist.5000M_Tid '5000Tid',\n" +
                "       Dist.2000M_Watt '2000Watt',\n" +
                "       Dist.2000M_Tid '2000Tid',\n" +
                "       Dist.60M_Watt '60Watt',\n" +
                "       S.Ligg_Ro_Prosent 'LiggroProsent',\n" +
                "       S.Ligg_Ro_KG 'LiggroKG',\n" +
                "       S.Knebøy_Prosent 'KnebøyProsent',\n" +
                "       S.Knebøy_KG 'KnebøyKG',\n" +
                "       S.Antall_Beveg 'AntallBeveg'\n" +
                "FROM RoForbundDB.Dato_Tester D\n" +
                "         JOIN RoForbundDB.Medlemmer M\n" +
                "              ON D.MedlemsID = M.MedlemsID\n" +
                "         JOIN RoForbundDB.DistanseTester Dist\n" +
                "              ON D.TestID = Dist.TestID AND M.MedlemsID = Dist.MedlemsID\n" +
                "         JOIN RoForbundDB.StyrkeTester S\n" +
                "              ON D.TestID = S.TestID AND M.MedlemsID = S.MedlemsID\n" +
                "WHERE M.MedlemsID = (?)\n" +
                "ORDER BY Dato";

            pt = this.con.prepareStatement(query);
            pt.setString(1, medlemsID);
            rs = pt.executeQuery();

            if (rs.next()) {
                tester = new Tester();
                tester.setDato(rs.getString("Dato"));
                tester.setFødt(rs.getInt("Født"));
                tester.setFornavn(rs.getString("Fornavn"));
                tester.setEtternavn(rs.getString("Etternavn"));
                tester.setKlubb(rs.getString("Klubb"));
                tester.setFemtusenWatt(rs.getInt("5000Watt"));
                tester.setFemtusentid(rs.getString("5000Tid"));
                tester.setTotusenWatt(rs.getInt("2000Watt"));
                tester.setTotuseniTid(rs.getString("2000Tid"));
                tester.setSekstiWatt(rs.getInt("60Watt"));
                tester.setLiggiroProsent(rs.getString("LiggroProsent"));
                tester.setLiggiroKG(rs.getInt("LiggroKG"));
                tester.setKnebøyiProsent(rs.getString("KnebøyProsent"));
                tester.setKnebøyiKG(rs.getInt("KnebøyKG"));
                tester.setAntallBeveg(rs.getInt("AntallBeveg"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tester;
    }
}