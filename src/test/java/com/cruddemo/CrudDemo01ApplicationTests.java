package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entities.Student;
import com.cruddemo.repository.StudentRepositort;

@SpringBootTest
class CrudDemo01ApplicationTests {

	@Autowired
	private StudentRepositort studentRepo;
	
	@Test
	void saveOneStudent() {
		Student s = new Student();
		s.setName("mike");
		s.setCourse("sql");
		s.setFee(10000);
		
		studentRepo.save(s);
	
	}
	
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(2L);
		
	}
	
	@Test
	void getOneStudent() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student student = findById.get();
	System.out.println(student.getId());
	System.out.println(student.getName());
	System.out.println(student.getCourse());
	System.out.println(student.getFee());
	
	}
	
	@Test
	void updateOneStudent() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student student = findById.get();
		student.setCourse("sql");
		
		studentRepo.save(student);
	}
	

}
