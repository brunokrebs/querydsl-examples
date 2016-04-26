package com.brunokrebs.querydsl.rest;

import com.brunokrebs.querydsl.model.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BrandRest {

	@RequestMapping(path = "/brands/", method = RequestMethod.GET)
	public List<Brand> getUser() {
		return new ArrayList<>();
	}
}