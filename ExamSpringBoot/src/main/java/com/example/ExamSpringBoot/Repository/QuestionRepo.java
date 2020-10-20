package com.example.ExamSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExamSpringBoot.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
