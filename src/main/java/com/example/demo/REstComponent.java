package com.example.demo;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REstComponent {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private AttributeRepository repo;

	@RequestMapping("/greeting")
	public List<AttributeConfig> greeting(String name) {
		AttributeConfig attributeConfig = new AttributeConfig();
		attributeConfig.setPrefix("testes");
		attributeConfig.setPrefixIndex(1L);
		attributeConfig.setTableName("teste");
		attributeConfig.setUpdateAllCompositions(true);
		repo.save(attributeConfig);
		return repo.findAll();
	}
}
