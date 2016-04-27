package com.brunokrebs.querydsl.rest;

import com.brunokrebs.querydsl.model.Vehicle;
import com.brunokrebs.querydsl.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleRest {

	@Autowired
	private VehicleRepository vehicleRepository;

	@RequestMapping(path = "/plates-only/", method = RequestMethod.GET)
	public List<Vehicle> getPlatesOnly() {
		return vehicleRepository.getPlatesOnly();
	}
}
