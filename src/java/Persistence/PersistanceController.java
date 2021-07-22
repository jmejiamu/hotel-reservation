
package Persistence;

import Logic.Reservation;


public class PersistanceController {
    
    ReservationJpaController reservationJpaController = new ReservationJpaController();
    
    public void createReservation(Reservation reservation){
        
        reservationJpaController.create(reservation);
        
    }
}
