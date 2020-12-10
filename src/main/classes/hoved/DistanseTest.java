package main.classes.hoved;

public class DistanseTest extends Test {
        int testID;
        int medlemsID;
        int femtusenWatt;
        String femtuseniTid;
        int totusenWatt;
        String totuseniTid;
        int sekstiWatt;

        public DistanseTest() {
        }

        public DistanseTest(int testID,int medlemsID, int femtusenWatt, String femtuseniTid,
                            int totusenWatt, String totuseniTid, int sekstiWatt) {
                this.testID = testID;
                this.medlemsID = medlemsID;
                this.femtusenWatt = femtusenWatt;
                this.femtuseniTid = femtuseniTid;
                this.totusenWatt = totusenWatt;
                this.totuseniTid = totuseniTid;
                this.sekstiWatt = sekstiWatt;
        }

        public int getTestID() {     return testID; }

        public void setTestID(int testID) {this.testID = testID;}

        public int getMedlemsID() {return medlemsID;}

        public void setMedlemsID(int medlemsID) {this.medlemsID = medlemsID;}

        public int getFemtusenWatt() {
                return femtusenWatt;
        }

        public void setFemtusenWatt(int femtusenWatt) {
                this.femtusenWatt = femtusenWatt;
        }

        public String getFemtuseniTid() {
                return femtuseniTid;
        }

        public void setFemtuseniTid(String femtuseniTid) {
                this.femtuseniTid = femtuseniTid;
        }

        public int getTotusenWatt() {
                return totusenWatt;
        }

        public void setTotusenWatt(int totusenWatt) {
                this.totusenWatt = totusenWatt;
        }

        public String getTotuseniTid() {
                return totuseniTid;
        }

        public void setTotuseniTid(String totuseniTid) {
                this.totuseniTid = totuseniTid;
        }

        public int getSekstiWatt() {
                return sekstiWatt;
        }

        public void setSekstiWatt(int sekstiWatt) {
                this.sekstiWatt = sekstiWatt;
        }

}



