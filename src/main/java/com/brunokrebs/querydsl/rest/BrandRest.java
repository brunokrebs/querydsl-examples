package com.brunokrebs.querydsl.rest;

import com.brunokrebs.querydsl.model.Brand;
import com.brunokrebs.querydsl.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandRest {
	@Autowired
	private BrandRepository brandRepository;

	@RequestMapping(path = "/brands/", method = RequestMethod.GET)
	public List<Brand> getBrands() {
		return brandRepository.getBrands();
	}

	@RequestMapping(path = "/brands/{name}", method = RequestMethod.GET)
	public List<Brand> getBrands(@PathVariable String name) {
		return brandRepository.getBrands(name);
	}
}