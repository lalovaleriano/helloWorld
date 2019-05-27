package com.lalo.reposiroryDB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.DemoConsolaApplication;

public class PersonaRepolmpl implements IPersonaRepo{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("se registra a:  "+ nombre);
		
	}

	
}
