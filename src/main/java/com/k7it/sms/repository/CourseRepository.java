package com.k7it.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.k7it.sms.model.Course;
import com.k7it.sms.model.Student;

public interface CourseRepository extends CrudRepository<Course, Integer> {

//	@Query("")
//	List<Student>getsStudentsAndCourseDetails();
}
