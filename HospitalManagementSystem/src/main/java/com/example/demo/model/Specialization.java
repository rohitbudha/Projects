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
@Table(name = "specialization_table")
public class Specialization {
	@Id
	@GeneratedValue
	@Column
	private int code;
	private String name;
	private String note;

}
//(strategy = GenerationType.IDENTITY)