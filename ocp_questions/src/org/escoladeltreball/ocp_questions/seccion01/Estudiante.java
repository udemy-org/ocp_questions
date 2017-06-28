/**
 * 
 */
package org.escoladeltreball.ocp_questions.seccion01;

import java.time.LocalDate;

/**
 * @author jmendez
 *
 */
public class Estudiante {
	int id;
	String nombre;
	String apellidos;
	LocalDate alta;

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object e) {
		if (e instanceof Estudiante) {
			Estudiante estudiante = (Estudiante) e;
			return this.id == estudiante.id;
		}
		return false;
	}
}