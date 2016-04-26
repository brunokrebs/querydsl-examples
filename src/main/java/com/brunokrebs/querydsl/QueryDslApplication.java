package com.brunokrebs.querydsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class QueryDslApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(QueryDslApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(QueryDslApplication.class);
	}
}
