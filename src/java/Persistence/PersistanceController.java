
package Persistence;

import Logic.Guest;
import Logic.Reservation;


public class PersistanceController {
    
    ReservationJpaController reservationJpaController = new ReservationJpaController();
    GuestJpaController guestJpaController = new GuestJpaController();
    
    public void createReservation(Reservation reservation){
        
        reservationJpaController.create(reservation);    
    }
    
    public void createGuest(Guest guest){
        guestJpaController.create(guest);
    }
}
