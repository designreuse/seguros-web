/*
 * Created on 14 nov 2013 ( Time 17:20:05 )
 * Generated by Telosys Tools Generator ( version 2.0.6 )
 */
// This Bean has a basic Primary Key (not composite) 
package com.lix.clientes.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.lix.polizas.model.Polizas;

/**
 * Persistent class for entity stored in table "clientes"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {
	private static final long serialVersionUID = 1L;

	// ----------------------------------------------------------------------
	// ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
	// ----------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	// ----------------------------------------------------------------------
	// ENTITY DATA FIELDS
	// ----------------------------------------------------------------------
	@Column(name = "nombre", length = 30)
	private String nombre;

	@Column(name = "apellido", length = 30)
	private String apellido;

	@Column(name = "direccion", length = 100)
	private String direccion;

	@Column(name = "telefono", length = 30)
	private String telefono;

	@Column(name = "email", length = 30)
	private String email;

	@Column(name = "observaciones", length = 100)
	private String observaciones;

	@Column(name = "f_nacimiento")
	private Date fNacimiento;

	@Column(name = "DNICUIT", length = 30)
	private String dnicuit;

	// ----------------------------------------------------------------------
	// ENTITY LINKS ( RELATIONSHIP )
	// ----------------------------------------------------------------------
	@OneToMany(mappedBy = "clientes", targetEntity = Polizas.class)
	private List<Polizas> polizas;

	// ----------------------------------------------------------------------
	// CONSTRUCTOR(S)
	// ----------------------------------------------------------------------
	public Clientes() {
		super();
	}

	// ----------------------------------------------------------------------
	// GETTER & SETTER FOR THE KEY FIELD
	// ----------------------------------------------------------------------
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	// ----------------------------------------------------------------------
	// GETTERS & SETTERS FOR FIELDS
	// ----------------------------------------------------------------------
	// --- DATABASE MAPPING : nombre ( VARCHAR )
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	// --- DATABASE MAPPING : apellido ( VARCHAR )
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return this.apellido;
	}

	// --- DATABASE MAPPING : direccion ( VARCHAR )
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	// --- DATABASE MAPPING : telefono ( VARCHAR )
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono() {
		return this.telefono;
	}

	// --- DATABASE MAPPING : email ( VARCHAR )
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	// --- DATABASE MAPPING : observaciones ( VARCHAR )
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	// --- DATABASE MAPPING : f_nacimiento ( DATETIME )
	public void setFNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	public Date getFNacimiento() {
		return this.fNacimiento;
	}

	// --- DATABASE MAPPING : DNICUIT ( VARCHAR )
	public void setDnicuit(String dnicuit) {
		this.dnicuit = dnicuit;
	}

	public String getDnicuit() {
		return this.dnicuit;
	}

	// ----------------------------------------------------------------------
	// toString METHOD
	// ----------------------------------------------------------------------
	public String toString() {
		// return "";
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public List<Polizas> getPolizas() {
		return polizas;
	}

	public void setPolizas(List<Polizas> polizas) {
		this.polizas = polizas;
	}

}
