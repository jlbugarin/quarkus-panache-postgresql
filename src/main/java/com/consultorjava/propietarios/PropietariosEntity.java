package com.consultorjava.propietarios;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class PropietariosEntity extends PanacheEntity {

	//private long id;
	@Column
	private String nombres;
	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getTipoDocumento() {
		return tipoDocumento;
	}



	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}



	public int getNumDocumento() {
		return numDocumento;
	}



	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
	}



	public int getNumTelefono() {
		return numTelefono;
	}



	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}



	@Column
	private String apellidos;
	@Column
	private String email;
	@Column
	private int tipoDocumento;
	@Column
	private int numDocumento;
	@Column
	private int numTelefono;

	

	@Override
    public String toString() {
        return "PropietariosEntity [Id='" + id + '\'' + ", email=" + email + ']';
    }

}
