package com.example1.LearnJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJavaApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(LearnJavaApplication.class, args);
		System.out.println(" Hello World");

		AddingNumbers a = new AddingNumbers();
		a.findSum();
		Modulus m = new Modulus();
		m.Modulus();
	}


	}
