package com.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cruddemo.entities.Student;

public interface StudentRepositort extends JpaRepository<Student, Long> {

}
