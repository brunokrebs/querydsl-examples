package com.brunokrebs.querydsl.repository;

import com.brunokrebs.querydsl.model.QVehicle;
import com.brunokrebs.querydsl.model.Vehicle;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class VehicleRepository {
	private EntityManager entityManager;
	private JPAQueryFactory jpaQueryFactory;

	@Autowired
	public VehicleRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
		jpaQueryFactory = new JPAQueryFactory(entityManager);
	}

	public List<Vehicle> getPlatesOnly() {
		QVehicle vehicle = QVehicle.vehicle;
		return jpaQueryFactory.select(
				Projections.fields(Vehicle.class, vehicle.plate))
				.from(vehicle).fetch();
	}
}
