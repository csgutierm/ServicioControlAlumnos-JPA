package com.edutecno.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "direccion")
@SequenceGenerator(name = "SQ_DIRECCION", initialValue = 1, allocationSize = 1)
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DIRECCION")
	private Integer id;
	private String calle;
	private String numero;
	private String ciudad;
	@Enumerated(EnumType.STRING)
	private TipoDireccion tipo;
}
