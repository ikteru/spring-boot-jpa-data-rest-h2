package io.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBoot2JPAWithSpringDataRestApplication {


	@Autowired
	StudentDataRestRepository studentRepository;
	
	@Autowired
	TrainingDataRepository trainingRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JPAWithSpringDataRestApplication.class, args);
	}
	

}
