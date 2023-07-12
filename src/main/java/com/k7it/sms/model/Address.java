package com.k7it.sms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Transactional
public class Address {
	
	@Id
	@GeneratedValue
	private int addId;
	private int doorno;
	private String streetName;
//	@Id
	private String city;
	private int pin;
	
	@JsonIgnore
	@OneToOne(mappedBy = "address")
    private Student student;
	

}
