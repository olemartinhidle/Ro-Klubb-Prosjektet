package main.classes.login;

import main.com.servlets.MariaConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {
    String Rettigheter;
    String Epost;
    String Passord;


    public void setUsername(String epost) {
        this.Epost = epost;
    }

    public void setPassword(String passord) {
        this.Passord = passord;
    }

    public void setRettigheter(String rettigheter) { Rettigheter = rettigheter;}

    public static String AuthenticateMember(String Epost, String Passord) {
        String msg = "";
        String query;
        query = "SELECT Passord FROM RoForbundet.Brukere WHERE Epost=?";
        try {
            PreparedStatement st = MariaConnector.initializeDatabase().prepareStatement(query);
            st.setString(1, Epost);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                if(rs.getString(1).equals(Passord))   {
                    msg = "Korrekt";
                }
                else    {
                    msg = "Feil, prøv igjen"; }}
                else    {
                    msg = "Feil, prøv igjen";}

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


        return msg;
    }


}
