package com.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.model.Direccion;
import com.edutecno.repository.DireccionRepository;

@Service
public class DireccionServiceImp implements DireccionService {

	@Autowired
	private DireccionRepository direccionRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Direccion> findAll() {
		return direccionRepository.findAll();
	}

	@Override
	@Transactional(readOnly = false) // false es default (en este caso lo podemos borrar)
	public void save(Direccion direccion) {
		direccionRepository.save(direccion);

	}

}
