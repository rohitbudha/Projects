package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="doctor_table")

public class Doctor {
	@Id
	@GeneratedValue
	@Column
	private String name;
	private String email;
	private String address;
	private long mobile;
	private String gender;
	private String note;
}
