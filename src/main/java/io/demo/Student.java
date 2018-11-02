package io.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class Student {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;
	@ManyToOne
	@JoinColumn(name="STUDENTS_ID")
	private Training training;
	
	
	public Student() {
		super();
	}


	public Student(Long id, String name, String passportNumber, Training training) {
		super();
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
		this.training = training;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassportNumber() {
		return passportNumber;
	}


	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}


	public Training getTraining() {
		return training;
	}


	public void setTraining(Training training) {
		this.training = training;
	}
	
	


}
