package com.consultorjava.propietarios;

import javax.persistence.Id;

public class PropietariosDTO {

	@Id
    private long id;
    private String nombres;
    private String apellidos;
    private String email;
    private int tipoDocumento;
    private int numDocumento;
    private int numTelefono;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	
    
}
