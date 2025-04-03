package com.ok.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor

public class CoronaVaccine  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long regNo;
	@NonNull
	@jakarta.persistence.Column(length = 20)
	private String name;
	@NonNull
	@jakarta.persistence.Column(length = 20)
	private String company;
	@NonNull
	@jakarta.persistence.Column(length = 20)
	private String country;
	@NonNull
	private double price;
	@NonNull
	private Integer requiredDoseCount;
}
