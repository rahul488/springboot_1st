package com.example.ExamSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ExamSpringBoot.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	
	@Query("from Student where email=:email")
	Student findByemail(@Param("email") String email);
	
	
}
