package Servlet;

import Logic.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCheckIn", urlPatterns = {"/SvCheckIn"})
public class SvCheckIn extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String checkIn = request.getParameter("checkin");
        String checkOut = request.getParameter("checkout");
        String numOfPeople = request.getParameter("numpeople");
        String typeOfRoom = request.getParameter("roomtype");
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String dob = request.getParameter("dob");
        String dni = request.getParameter("dni");
        String profession = request.getParameter("profession");
        String address = request.getParameter("address");

        DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date checkInFormat;
        Date checkOutFormat;
        Date dobFormat;
        try {
            checkInFormat = date.parse(checkIn.toString());
            checkOutFormat = date.parse(checkOut.toString());
            dobFormat = date.parse(dob.toString());

            //This calculate the number of day the guest will stay in the room
            int days = (int) Math.round((checkInFormat.getTime() - checkOutFormat.getTime()) / (double) 86400000) * -1;
            System.out.println("Days = " + days);
            
            //Cost per night $300 
            int costPerNight = 300 * days;

            //Connect to the logic layer
            Controller controller = new Controller();
            

            controller.createNewReservation(checkInFormat, checkOutFormat, true, costPerNight, Integer.parseInt(numOfPeople), typeOfRoom 
//                    firstName, lastName, dobFormat, dni, profession, address
            );
            controller.createNewGuest(dni, firstName, lastName, dobFormat, address, profession);

        } catch (ParseException ex) {
            Logger.getLogger(SvCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
