
package Servlet;

import Logic.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
        processRequest(request, response);
        String checkIn =  request.getParameter("checkin");
        String checkOut = request.getParameter("checkout");
        String numOfPeople = request.getParameter("numpeople");
        String typeOfRoom  = request.getParameter("roomtype");
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String dob =  request.getParameter("dob");
        String dni = request.getParameter("dni");
        String profession = request.getParameter("profession");
        String address = request.getParameter("address");
        
        Controller controller = new Controller();
        
        controller.createNewReservation(new Date(checkIn), new Date(checkOut), true, 0, Integer.parseInt (numOfPeople), typeOfRoom, firstName, lastName, new Date(dob), dni, profession, address);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
