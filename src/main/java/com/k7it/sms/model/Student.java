package com.k7it.sms.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.transaction.annotation.Transactional;

import lombok.Data;
import lombok.Generated;

@Data // Implements to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@Entity //this annotation javax.persistence.Entity, used to mapping java class to database
public class Student {
	
	@Id //Primary Key
//	@GeneratedValue
	private int id;
//	@Id
	@Column(length = 12)
	private String firstName;
	private String lastName;
	private int age;
	
//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_student_id", referencedColumnName = "id")
//	private List<Course> courses;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "student_course_mapping", joinColumns = @JoinColumn(name ="student_id"), 
//	inverseJoinColumns = @JoinColumn(name  = "course_id"))
//	@JoinTable(name = "student_course_mapping",joinColumns = @JoinColumn(name = "Student_firstName" ),
//	inverseJoinColumns = @JoinColumn (name = "course_name"))
	@JoinTable(name = "student_course_mapping") // same results as @JoinColumn annotation.
//	@JoinTable // same results as ColumnName & Table name used to provide the any name instead of auto generated.
	private List<Course> courses;
	
	
	public Student() {
		super();
	}
	public Student(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
