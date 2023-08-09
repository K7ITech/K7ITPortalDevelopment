package com.becoder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
	public class StudentDtls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	
	private String email;
	
	private String address;
	
	private String qualification;
	
	private String password;
	
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
		}
