package com.formacionspringboot.apirest.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "asignacion")
public class Asignacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdAsignacion;
	//many to one
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CodEmpleado")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Empleado empleado;
	
	
	//many to one
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CodProyecto")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Proyecto proyecto;


	public Long getIdAsignacion() {
		return IdAsignacion;
	}


	public void setIdAsignacion(Long idAsignacion) {
		IdAsignacion = idAsignacion;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public Proyecto getProyecto() {
		return proyecto;
	}


	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}


	
	
	
}
