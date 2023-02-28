/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

/**
 * @author saulf
 *
 */
@ManagedBean
@ViewScoped//para mantener la informacion del contenido de mi pantalla
public class RestauranteController {
	/**
	 * 
	 * Lista de empleados para la tabla
	 *
	 */
	public List<Restaurante> restaurantes;
	/**
	 * 
	 * SErvicio con los metodos que realizan la logica de negocio de empleados
	 *
	 */
	public List<Restaurante> restaurantesFiltrados;
	
	private RestauranteService restauranteService = new RestauranteService();
	
	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
		
	}
	
	/**
	 * 
	 * Metodo que consulta la lista de empleados
	 *
	 */
	public void consultarRestaurantes() {
		this.restaurantes = this.restauranteService.consultarRestaurantes();
		
	}
	

	/**
	 * @return the empleados
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	/**
	 * @return the restaurantesFiltrados
	 */
	public List<Restaurante> getRestaurantesFiltrados() {
		return restaurantesFiltrados;
	}

	/**
	 * @param restaurantesFiltrados the restaurantesFiltrados to set
	 */
	public void setRestaurantesFiltrados(List<Restaurante> restaurantesFiltrados) {
		this.restaurantesFiltrados = restaurantesFiltrados;
	}
}
