package pl.krystian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterfaceApi {

	@Autowired
	StudentOperation operation;
	
	@PostMapping("/create")
	public void create() {
		operation.Create();
	}
	
	@PostMapping("/update")
	public void update() {
		operation.Update();
	}
	
	@PostMapping("/get")
	public void get() {
		operation.Get();
	}
	
	@PostMapping("/delete")
	public void delete() {
		operation.Delete();
	}
	
}
