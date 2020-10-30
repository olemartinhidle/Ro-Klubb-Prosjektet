package main.classes;

import main.classes.Athlete;

public abstract class textAbstract {

    int AthleteID;
    String Name;
    String Last_Name;
    String PhoneNumber;

    public String toString() {

        return  AthleteID + Name + Last_Name + PhoneNumber;

    }

    public void add(Athlete athlete) {
    }


    public void setId(int AthleteID) {
    }

    public int getID() {

        return AthleteID;
    }

    public void setName(String Name) {
    }

    public String getName() {

        return Name;
    }


    public void setLastName(String Last_Name) {
    }

    public String getLast_Name() {

        return Last_Name;
    }


    public void setNumber(String PhoneNumber) {
    }

    public String getNumber() {

        return PhoneNumber;

}
}