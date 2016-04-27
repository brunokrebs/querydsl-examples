package com.brunokrebs.querydsl.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vehicle {
	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	@JoinColumn (name = "id_model")
	private Model model;

	private String plate;

	public Integer getId() {
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
