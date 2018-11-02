package io.demo;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Training {

	@Id @GeneratedValue
	private Long id;
	private String name;
	private String description;
	@OneToMany
	@JoinColumn(name="TRAINING_ID")
	private Collection<Student> students;
	
	public Training() {
		super();
	}
	public Training(Long id, String name, String description, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.students = students;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Collection<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	
	
}
