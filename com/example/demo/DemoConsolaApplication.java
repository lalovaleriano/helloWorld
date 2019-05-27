package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lalo.reposiroryDB.PersonaRepolmpl;
import com.lalo.service.IPersonaService;
import com.lalo.service.PersonaServicelmpl;



@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	private IPersonaService service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		service = new PersonaServicelmpl();
		
		LOG.info("anonimo");
		
	}

	

}
