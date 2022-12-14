package com.studentdb;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentdb.entity.Student;
import com.studentdb.repository.StudentRepository;

@SpringBootTest
class StudentdbApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveOneStudent() {
		Student s1 = new Student();
		s1.setName("lon");
		s1.setCourse("Developer");
		s1.setFee(3000);
		studentRepo.save(s1);
		}
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(2L);
	}
	@Test
	void getOneStudent() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student s = findById.get();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
	}
	
	@Test
	void updateOneStudent() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student s = findById.get();
		s.setCourse("Testing");
		s.setFee(20000);
		
		
		studentRepo.save(s);
	}

}
