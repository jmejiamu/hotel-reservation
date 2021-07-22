package Logic;

import Persistence.PersistanceController;
import java.util.Date;

public class Controller {

    PersistanceController persistanceController = new PersistanceController();
    
    public void createNewReservation(Date checkIn, Date checkOut,
            boolean aviable, double cost, int numOfPeople,
            String typeOfRoom, String firstName, String lastName,
            Date dob, String dni, String profession, String address) {
        
        Reservation reservation = new Reservation();
        reservation.setCheckIn(checkIn);
        reservation.setCheckOut(checkOut);
        reservation.setAviable(aviable);
        reservation.setCost(cost);
        reservation.setNumOfPeople(numOfPeople);
        reservation.setTypeOfRoom(typeOfRoom);
        reservation.setFirstName(firstName);
        reservation.setLastName(lastName);
        reservation.setDob(dob);
        reservation.setDni(dni);
        reservation.setProfession(profession);
        reservation.setAddress(address);
        
        persistanceController.createReservation(reservation);
    }

//    public void createNewReservation(String checkIn, String checkOut, boolean b, int i, int i0, String typeOfRoom, String firstName, String lastName, String dob, String dni, String profession, String address) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
