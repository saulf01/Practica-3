/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author saulf
 *
 */
public class Restaurante {
	/**
	 * Nombre del restaurante
	 */
	private String nombre;
	/**
	 * 	Primer apellido del empleado
	 */
	private String direccion;
	/**
	 * Segundo apellido del empleado
	 */
	private String pais;
	/**
	 * Segundo apellido del empleado
	 */
	private String gerente;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	

}
