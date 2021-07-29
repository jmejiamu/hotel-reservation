package Logic;

import Persistence.PersistanceController;
import java.util.Date;

public class Controller {

    PersistanceController persistanceController = new PersistanceController();
    Reservation reservation = new Reservation();
    Guest guest = new Guest();

    public void createNewReservation(Date checkIn, Date checkOut,
            boolean aviable, double cost, int numOfPeople,
            String typeOfRoom
    //            String firstName, 
    //            String lastName,
    //            Date dob, 
    //            String dni, 
    //            String profession, 
    //            String address
    ) {

        reservation.setCheckIn(checkIn);
        reservation.setCheckOut(checkOut);
        reservation.setAviable(aviable);
        reservation.setCost(cost);
        reservation.setNumOfPeople(numOfPeople);
        reservation.setTypeOfRoom(typeOfRoom);
//        reservation.setFirstName(firstName);
//        reservation.setLastName(lastName);
//        reservation.setDob(dob);
//        reservation.setDni(dni);
//        reservation.setProfession(profession);
//        reservation.setAddress(address);
        reservation.setGuest(guest);
//        System.out.println(">>>" + reservation.getGuest());

        persistanceController.createReservation(reservation);
    }

    public void createNewGuest(String dni, String firstName, String lastName, Date DOB, String address, String profession) {
        guest.setDni(dni);
        guest.setFirstName(firstName);
        guest.setLastName(lastName);
        guest.setDOB(DOB);
        guest.setAddress(address);
        guest.setProfession(profession);
        persistanceController.createGuest(guest);
    }

}
