package main.classes.login;

import main.classes.MariaConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Her lager man en brukerklasse som kan brukes av brukerDB klassen.
// BrukerDB klassen er en databasehandler for brukerklassen
// det vil si at den kombinerer database med klassene
        public class Bruker {
            int id;
            String epost;
            String passord;
            String rettigheter;

        public Bruker() {
        }

        public Bruker(int id, String epost, String passord, String rettigheter) {
            this.id = id;
            this.epost = epost;
            this.passord = passord;
            this.rettigheter = rettigheter;
        }

        public Bruker(String epost, String passord, String rettigheter) {
            this.epost = epost;
            this.passord = passord;
            this.rettigheter = rettigheter;
        }

        public Bruker(String passord, String rettigheter) {
            this.passord = passord;
            this.rettigheter = rettigheter;
        }


        // Get = henter stringen
        // Set = setter stringen
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEpost() {
            return epost;
        }

        public void setEpost(String epost) {
            this.epost = epost;
        }

        public String getPassord() {
            return passord;
        }

        public void setPassord(String passord) {
            this.passord = passord;
        }

        public String getRettigheter() {
            return rettigheter;
        }

        public void setRettigheter(String rettigheter) {
            this.rettigheter = rettigheter;
        }
}