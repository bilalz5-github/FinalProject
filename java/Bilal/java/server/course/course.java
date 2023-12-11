package Bilal.java.server.course;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
@EntityScan

public class course {
	@Id
	private int courseID; 
	private String courseName;
	
	
public course() {}
	
	public course(int inputCourseId, String inputCoursename, String inputCourseTeacher) {
		courseID = inputCourseId;
		courseName = inputCoursename;
		
		 
	}
	
	
	public int getCourse_id() {
		return courseID;
	}
	public void setCourse_id(int course_id) {
		this.courseID = course_id;
	}
	public String getCourse_name() {
		return courseName;
	}
	public void setCourse_name(String course_name) {
		this.courseName = course_name;
	}
		

	
	
	
	

}




	
	
	
