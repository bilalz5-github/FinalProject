package Bilal.java.server.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_ID;

    private String email;
    private String firstName;

    public Users() {}

    public Long getstudent_ID() {
        return student_ID;
    }

    public void setstudent_ID(Long student_ID) {
        this.student_ID = student_ID;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstname(String firstname) {
        this.firstName = firstname;
    }

    // Getters and setters
}
