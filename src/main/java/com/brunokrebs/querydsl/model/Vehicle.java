package com.brunokrebs.querydsl.model;

import javax.persistence.*;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn (name = "id_model")
	private Model model;

	private String plate;

	public int getId() {
		return id;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Vehicle)) return false;

		Vehicle vehicle = (Vehicle) o;

		return id == vehicle.id;

	}

	@Override
	public int hashCode() {
		return (int) (id ^ (id >>> 32));
	}
}
