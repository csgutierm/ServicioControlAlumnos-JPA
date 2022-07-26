package com.edutecno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Integer> {
	
	//findAll()
	//findById()
	//findByCalle()
	//findByCiudad()
	//save()
	//delete()
	
}