package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="patient_table")
public class Patient {
	@Id
	@GeneratedValue
	@Column
	private String fname;
	private String lname;
	private String gender;
	private long  phone;
	private Date dob;
	private String marriage;
	private String paddress;
	private String caddress;
	private String history;
	private String details;
}
