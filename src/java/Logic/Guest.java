
package Logic;

import java.util.Date;


public class Guest {
    
    private int dni;
    private String firstName;
    private String lastName;
    private Date DOB; // Day of birth
    private String address;
    private String profession;

    public Guest() {
    }

    public Guest(int dni, String firstName, String lastName, Date DOB, String address, String profession) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.address = address;
        this.profession = profession;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    
    
}
