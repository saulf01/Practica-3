/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author saulf
 *
 */
public class RestauranteService {
	/**
	 *
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 *
	 */
	public List<Restaurante> consultarRestaurantes(){
		
		//Generar la lista de empleados a consultar
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		Restaurante mcDonalds = new Restaurante();
		Restaurante laVidArgentina = new Restaurante();
		Restaurante laChilaca = new Restaurante();
		Restaurante Cienega = new Restaurante();
		Restaurante Socarrat = new Restaurante();
	
		mcDonalds.setNombre("McDonalds");
		mcDonalds.setDireccion("Dirección 1");
		mcDonalds.setPais("Estados Unidos");
		mcDonalds.setGerente("Diego Paniagua López");
		
		laVidArgentina.setNombre("La Vid Argentina");
		laVidArgentina.setDireccion("Dirección 2");
		laVidArgentina.setPais("Argentina");
		laVidArgentina.setGerente("Erick Guerrero López");
		
		laChilaca.setNombre("La Chilaca");
		laChilaca.setDireccion("Dirección 3");
		laChilaca.setPais("Chile");
		laChilaca.setGerente("Luis Jesús López Romero");
		
		Cienega.setNombre("Cienega");
		Cienega.setDireccion("Dirección 4");
		Cienega.setPais("Colombia");
		Cienega.setGerente("Gerardo Guerrero Gómez");
		
		Socarrat.setNombre("Socarrat");
		Socarrat.setDireccion("Dirección 5");
		Socarrat.setPais("España");
		Socarrat.setGerente("Daniel López Romero");
		
		restaurantes.add(mcDonalds);
		restaurantes.add(laVidArgentina);
		restaurantes.add(laChilaca);
		restaurantes.add(Cienega);
		restaurantes.add(Socarrat);
		
		
		
		return restaurantes;
		
	}
}
