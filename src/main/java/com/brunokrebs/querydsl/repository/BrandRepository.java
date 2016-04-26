package com.brunokrebs.querydsl.repository;

import com.brunokrebs.querydsl.model.Brand;
import com.brunokrebs.querydsl.model.QBrand;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class BrandRepository {
	private EntityManager entityManager;
	private JPAQueryFactory jpaQueryFactory;

	@Autowired
	public BrandRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
		jpaQueryFactory = new JPAQueryFactory(entityManager);
	}

	public List<Brand> getBrands() {
		QBrand brand = QBrand.brand;
		return jpaQueryFactory.selectFrom(brand)
				.orderBy(brand.name.asc())
				.fetch();
	}

	public List<Brand> getBrands(String root) {
		QBrand brand = QBrand.brand;
		return jpaQueryFactory.selectFrom(brand)
				.where(brand.name.likeIgnoreCase('%' + root + '%'))
				.orderBy(brand.name.asc())
				.fetch();
	}
}
