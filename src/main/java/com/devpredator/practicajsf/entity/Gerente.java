/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author saulf
 *
 */
public class Gerente {

		/**
		 * Nombre del empleado
		 */
		private String nombre;
		/**
		 * 	Primer apellido del empleado
		 */
		private String primerApellido;
		/**
		 * Segundo apellido del empleado
		 */
		private String segundoApellido;

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
		/**
		 * @return the primerApellido
		 */
		public String getPrimerApellido() {
			return primerApellido;
		}
		/**
		 * @param primerApellido the primerApellido to set
		 */
		public void setPrimerApellido(String primerApellido) {
			this.primerApellido = primerApellido;
		}
		/**
		 * @return the segundoApellido
		 */
		public String getSegundoApellido() {
			return segundoApellido;
		}
		/**
		 * @param segundoApellido the segundoApellido to set
		 */
		public void setSegundoApellido(String segundoApellido) {
			this.segundoApellido = segundoApellido;
		}
}

