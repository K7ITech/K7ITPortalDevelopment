package com.becoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.becoder.model.StudentDtls;

public interface StudentRepository extends JpaRepository<StudentDtls,Integer>{
	public boolean existsByEmail(String email);

}
