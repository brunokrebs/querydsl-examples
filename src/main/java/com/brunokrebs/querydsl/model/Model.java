package com.brunokrebs.querydsl.model;

import javax.persistence.*;

@Entity
public class Model {

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn (name = "id_brand")
	private Brand brand;

	private String name;

	public int getId() {
		return id;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Model)) return false;

		Model model = (Model) o;

		return id == model.id;

	}

	@Override
	public int hashCode() {
		return (int) (id ^ (id >>> 32));
	}
}
