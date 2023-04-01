package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Brood;
import com.example.demo.repository.BroodRepo;


@SpringBootTest
@Transactional
class DemoApplicationTests {

	@Autowired
	private BroodRepo broodRepo;

	@Test
	public void addDataTest() {
		Brood brood = new Brood();
		broodRepo.save(brood);
	}

}
