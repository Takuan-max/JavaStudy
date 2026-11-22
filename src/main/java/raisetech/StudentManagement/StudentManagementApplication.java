package raisetech.StudentManagement;

import org.apache.catalina.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	@Autowired
	private StudentRepository repository;


  public static void main(String[] args) {
    //
    SpringApplication.run(StudentManagementApplication.class, args);
  }

  @GetMapping("/student")
  public String getstudent(@RequestParam String name) {
		Student student = repository.searchByName(name);
		return student.getName() + " " + student.getAge() + "歳";

  }

  @PostMapping("/student")
  public void registerstudent(String name, int age) {
    repository.registerStudent(name, age);
  }

	@PatchMapping("/student")
	public void updatestudentName(String name,int age) {
		repository.updatestudent(name, age);
	}

	@DeleteMapping("/student")
	public void deletestudent(String name) {
		repository.deleteStudent(name);
	}
}


