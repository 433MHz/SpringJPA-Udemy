package pl.krystian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentOperation {

	
	@Autowired
	StudentRepo repo;
	
	@Autowired
	StudentDAO student;
	
	public void Create() {	
		
		student.setFirstName("Krystian");
		student.setLastName("Izdebski");
		student.setPhoneNumber(123123123);
		student.setEmail("krystian@gmail.com");	
		
		repo.save(student);	
	}
	
	public void Get() {
		System.out.println(repo.getOne(student.getId()).toString());
	}
	
	public void Update() {
		student.setFirstName("Tomek");
		
		repo.save(student);
	}
	
	public void Delete() {
		repo.delete(student);
	}
}
