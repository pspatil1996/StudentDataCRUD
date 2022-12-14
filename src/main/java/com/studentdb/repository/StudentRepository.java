package com.studentdb.repository;

import org.springframework.data.repository.CrudRepository;

import com.studentdb.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
