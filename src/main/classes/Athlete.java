package main.classes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Athlete {
    int AthleteID;
    String Name;
    String Last_Name;
    String PhoneNumber;


    public void setId(int AthleteID) {
        this.AthleteID = AthleteID;
    }

    public int getID() {

        return AthleteID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {

        return Name;
    }


    public void setLastName(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getLast_Name() {

        return Last_Name;
    }

    public void setNumber(String PhoneNumber) {

        this.PhoneNumber = PhoneNumber;

    }

    public String getNumber() {

        return PhoneNumber;
    }

    public void add(Athlete athlete) {
    }

    public String toString() {

        return AthleteID + Name + Last_Name + PhoneNumber;

    }

    public ArrayList<Athlete> getUsers() {
        ArrayList<Athlete> athletes = new ArrayList<>();
        try (
                Connection con = Connector.initializeDatabase();
                PreparedStatement st = con.prepareStatement("" +
                        "SELECT D.Dato,\n" +
                        "       M.År_Født 'Født',\n" +
                        "       M.Fornavn,\n" +
                        "       M.Etternavn,\n" +
                        "       M.Klubb,\n" +
                        "       Dist.5000M_Watt '5000M i Watt',\n" +
                        "       Dist.5000M_Tid '5000M i tid',\n" +
                        "       Dist.2000M_Watt '2000M i Watt',\n" +
                        "       Dist.2000M_Tid '2000M i tid',\n" +
                        "       Dist.60M_Watt '60M i Watt',\n" +
                        "       S.Ligg_Ro_Prosent 'Ligg ro i Prosent',\n" +
                        "       S.Ligg_Ro_KG 'Ligg ro i KG',\n" +
                        "       S.Knebøy_Prosent 'Knebøy i prosent',\n" +
                        "       S.Knebøy_KG 'Knebøy i KG',\n" +
                        "       S.Antall_Beveg\n" +
                        "FROM RoForbundDB.Dato_Tester D\n" +
                        "         JOIN RoForbundDB.Medlemmer M\n" +
                        "              ON D.MedlemsID = M.MedlemsID\n" +
                        "         JOIN RoForbundDB.DistanseTester Dist\n" +
                        "              ON D.TestID = Dist.TestID AND M.MedlemsID = Dist.MedlemsID\n" +
                        "         JOIN RoForbundDB.StyrkeTester S\n" +
                        "              ON D.TestID = S.TestID AND M.MedlemsID = S.MedlemsID\n" +
                        "WHERE D.MedlemsID = 1\n" +
                        "ORDER BY Dato;");
                ResultSet rs = st.executeQuery()
        ) {
            while (rs.next()) {
                Athlete athlete;
                athlete = new Athlete();
                athlete.setId(rs.getInt("AthleteID"));
                athlete.setName(rs.getString("Name"));
                athlete.setLastName(rs.getString("Last_Name"));
                athlete.setNumber(rs.getString("PhoneNumber"));
                athletes.add(athlete);
            }

            return athletes;
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return athletes;
    }
}