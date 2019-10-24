package com.example.demo;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class HibernateConfig {

	@Bean
	public HibernateConfig sessionFactory(EntityManagerFactory emf) {
		HibernateConfig factory = new HibernateConfig();
		factory.sessionFactory(emf);
		return factory;
	}
}