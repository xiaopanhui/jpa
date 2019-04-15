package com.hui.springdemo.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Person {
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Id
	private Integer id;
	@Column(name="LAST_NAME")
	private String lastName;

	private String email;
	private int age;


}
