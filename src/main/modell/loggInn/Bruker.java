package main.modell.loggInn;

//Her lager vi en Bruker modell klasse
public class Bruker {
        int id;
        String epost;
        String passord;
        String rettigheter;
//Tom construct
        public Bruker() {
        }
//Construct med ulike parametere som kan fylles inn med data fra web-app
        public Bruker(int id, String epost, String passord, String rettigheter) {
            this.id = id;
            this.epost = epost;
            this.passord = passord;
            this.rettigheter = rettigheter;
        }
//Har flere slik at vi kan hente ut ulike typer data, for fleksibilitet
        public Bruker(String epost, String passord, String rettigheter) {
            this.epost = epost;
            this.passord = passord;
            this.rettigheter = rettigheter;
        }
//Samme som den over
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