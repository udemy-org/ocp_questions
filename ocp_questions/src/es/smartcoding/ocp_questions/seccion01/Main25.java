/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

import es.smartcoding.ocp_questions.seccion01.Main24.Dias;

/**
 * @author jmendez
 *
 */
public class Main25 {

	static enum Dias {

		// private String nombre;

		LUNES("Lunes"), MARTES("Martes"), MIERCOLES("Miércoles"), JUEVES("Jueves"), VIERNES("Viernes"), SABADO(
				"Sábado"), DOMINGO("Domingo");

		private String nombre;

		private Dias(String nombre) {
			this.nombre = nombre;
		}

	}

	public static void main(String[] args) {
		System.out.println(Dias.LUNES);
		System.out.println(Dias.LUNES.ordinal());
	}
}
