package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="appointment_table")
public class Appointment {
	@Id
	@GeneratedValue
	@Column
	private Date date;
	private int noOfSlots;
	private String detailString;
	private  int commissionFee;
	
	
}
