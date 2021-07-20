
package Persistence;

import java.util.Date;


public class Reservation {
     private int id;
     private Date checkIn;
     private Date checkOut;
     private boolean aviable;
     private double cost;
     private int numOfPeople;
     private String typeOfRoom; //Single, double, triple ..

    public Reservation() {
    }

    public Reservation(int id, Date checkIn, Date checkOut, boolean aviable, double cost, int numOfPeople, String typeOfRoom) {
        this.id = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.aviable = aviable;
        this.cost = cost;
        this.numOfPeople = numOfPeople;
        this.typeOfRoom = typeOfRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isAviable() {
        return aviable;
    }

    public void setAviable(boolean aviable) {
        this.aviable = aviable;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }
     
     
}
