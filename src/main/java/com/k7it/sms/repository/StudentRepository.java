package com.k7it.sms.repository;

import org.springframework.data.repository.CrudRepository;

import com.k7it.sms.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
