package Bilal.java.server.data;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/e2101856_Student_And_Course_Managment/Students")
@RestController
public class dataController {
	private final dataRepository repository;
	
	public dataController(dataRepository da) {
		this.repository = da;
	}
	
	//get all data
	//Url /data to access data
	@GetMapping("/all")
	List<data> getAllData(){
		return (List<data>) repository.findAll();
		
	}
	//add New data/student 
	
	@PostMapping
	data addNewData(@RequestBody data Data) {
		return repository.save(Data);
		
	}
	//Get one student by Id if ID not fount return no student found 404
	@GetMapping("/{studentsID}")
	data getOneData(@PathVariable int students_id) {
		return repository.findById(students_id).orElseThrow(
				() -> new DataNotFoundException(students_id)
				
		); 
	}
	/*@PutMapping("/{students_id}")
    public void updateData(@PathVariable int students_id, @RequestBody data Data) {
        dataService.updateData(students_id, Data);
    }
	*/
	
	//delete student
	@DeleteMapping("/{studentID}")
	void deleteData(@PathVariable int students_id) {
		repository.deleteById(students_id);
	}
	
}
