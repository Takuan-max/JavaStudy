package raisetech.StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	public static void main(String[] args) {
		//
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@GetMapping("/caliculate")
	public int hello(){
		return 1000-7;
	}
}
