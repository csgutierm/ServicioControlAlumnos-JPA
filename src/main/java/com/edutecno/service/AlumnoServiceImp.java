package com.edutecno.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.model.Alumno;
import com.edutecno.repository.AlumnoRepository;

@Service
public class AlumnoServiceImp implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		return alumnoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = false) // false es default (en este caso lo podemos borrar)
	public void save(Alumno alumno) {
		alumnoRepository.save(alumno);
	}

	//agregados
	@Override
	public void update(Alumno alumno) {
		alumnoRepository.save(alumno);
	}

	@Override
	public void delete(Alumno alumno) {
		alumnoRepository.delete(alumno);
	}

	@Override
	public Alumno findById(Integer id) {	
		return alumnoRepository.findById(id).get();
	}

}
