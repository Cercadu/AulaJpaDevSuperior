package com.jparepositorty.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "tb_users")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long Id;
	private String name;
	private String email;
	private Double salary;

	public User() {
		
	}

	public User(Long id, String name, String email, Double salary) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

}
