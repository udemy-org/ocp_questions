/**
 * 
 */
package org.escoladeltreball.ocp_questions.seccion01;

import org.escoladeltreball.ocp_questions.seccion01.DiasDeLaSemana.DiasLaborables;

/**
 * @author jmendez
 *
 */

class DiasDeLaSemana {
	enum DiasLaborables {
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
	}
}

public class Main07 {

	public static void main(String[] args) {
		DiasDeLaSemana.DiasLaborables dia = DiasLaborables.MIERCOLES;
		switch (dia) {
		case LUNES:
			System.out.println("LUNES");
			break;
		case MARTES:
			System.out.println("MARTES");
			break;
		case MIERCOLES:
			System.out.println("MIERCOLES");
			break;
		case JUEVES:
			System.out.println("JUEVES");
			break;
		case VIERNES:
			System.out.println("VIERNES");
			break;
		default:
			System.out.println("OTRO");
		}
	}
}

//enum DiasFestivos {
//SABADO, DOMINGO;
//}
// System.out.println(DiasDeLaSemana.DiasLaborables.MIERCOLES.ordinal());