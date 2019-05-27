package com.lalo.service;

import com.lalo.reposiroryDB.IPersonaRepo;
import com.lalo.reposiroryDB.PersonaRepolmpl;

public class PersonaServicelmpl implements IPersonaService{

	private IPersonaRepo repo;
	@Override
	public void registrar(String nombre) {
		repo = new PersonaRepolmpl();
		repo.registrar(nombre);
		
	}

	
}
