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
                Connection con = main.com.servlets.MariaConnector.initializeDatabase();
                PreparedStatement st = con.prepareStatement("SELECT AthleteID, Name, Last_Name, PhoneNumber FROM RoForbundet.Athlete");
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