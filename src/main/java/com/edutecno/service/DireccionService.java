package com.edutecno.service;

import java.util.List;

import com.edutecno.model.Direccion;

public interface DireccionService {
	
	public List<Direccion> findAll();
	public void save(Direccion direccion);
}