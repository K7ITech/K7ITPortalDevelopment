package com.k7it.sms.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
	
	@Id
	@GeneratedValue
	int cid;
//	@Id
	String name;
	int duration;
	int fee;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "courses")
	private List<Student> students;

}
