package Logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date checkIn; //

    @Temporal(TemporalType.DATE)
    private Date checkOut; //
    private boolean aviable;
    private double cost;
    private int numOfPeople;//
    private String typeOfRoom; //Single, double, triple ..

    @OneToOne(cascade= CascadeType.ALL) 
    @JoinColumn(name = "guest_id", referencedColumnName = "id")
    private Guest guest;
//     private String firstName;
//     private String lastName;
//    @Temporal(TemporalType.DATE)
//     private Date dob;
//     private String dni;
//     private String profession;
//     private String address;

    public Reservation() {
    }

    public Reservation(int id, Date checkIn,
            Date checkOut, boolean aviable,
            double cost, int numOfPeople,
            String typeOfRoom,
            Guest guest
    //            String firstName, 
    //            String lastName, 
    //            Date dob, 
    //            String dni, 
    //            String profession, 
    //            String address
    ) {
        this.id = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.aviable = aviable;
        this.cost = cost;
        this.numOfPeople = numOfPeople;
        this.typeOfRoom = typeOfRoom;
        this.guest = guest;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dob = dob;
//        this.dni = dni;
//        this.profession = profession;
//        this.address = address;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
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

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//
//    public String getDni() {
//        return dni;
//    }
//
//    public void setDni(String dni) {
//        this.dni = dni;
//    }
//
//    public String getProfession() {
//        return profession;
//    }
//
//    public void setProfession(String profession) {
//        this.profession = profession;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
}
