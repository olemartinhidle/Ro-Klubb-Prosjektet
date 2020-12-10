package main.classes; // hentes i mappe main --> classes


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Athlete { // (tester) denne er grå fordi den ikke brukes lengre
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

    // lager en liste, inni denne listen lager vi en athleter som er et objekt inni lista.
    public ArrayList<Athlete> getUsers() {
        ArrayList<Athlete> athletes = new ArrayList<>();

        // preparedstatement lagrer en sql beskjed, som kan brukes som spørring til senere bruk.
        // Bra å bruke debuggeren når man legger inn en spørring.
        try (
                Connection con = MariaConnector.initializeDatabase();
                PreparedStatement st = con.prepareStatement("SELECT AthleteID, Name, Last_Name, PhoneNumber FROM RoForbundet.Athlete");
                ResultSet rs = st.executeQuery() // betyr å
        )

         //
        {
            while (rs.next()) {           // neste ting innenfor queryen, gjøre det igjen og igjen for hver index
                Athlete athlete;         // for hver enkelt av disse indexene (test),
                athlete = new Athlete();
                athlete.setId(rs.getInt("AthleteID")); // testID
                athlete.setName(rs.getString("Name")); // medlemsID
                athlete.setLastName(rs.getString("Last_Name")); // testnavn
                athlete.setNumber(rs.getString("PhoneNumber")); //  testnavn
                athletes.add(athlete); // siste du gjør. Da adder den alle variablene du har lagt til.
            }

            return athletes; // sender opp alle athletene / testene fra lista
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return athletes;
    }
}