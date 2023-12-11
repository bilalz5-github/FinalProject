package Bilal.java.server.data;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Students")

public class data {
	@Id
	private int studentsId; 
	private String firstName;
	private String lastName;
	
	public data() {}
	
	public data(int inputId, String inputFirstname, String inputLastname) {
		studentsId = inputId;
	    firstName = inputFirstname;
		lastName = inputLastname;
		
		 
	}
	 
	
	public int getstudents_id() {
		return studentsId;
	}
	public void setStudents_ID(int students_ID) {
		studentsId = students_ID;
	}
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	
}
