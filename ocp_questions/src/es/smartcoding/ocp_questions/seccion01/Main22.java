/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;


/**
 * @author jmendez
 *
 */
public class Main22 {

	static enum Dias {
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
	}

	public static void main(String[] args) {
		System.out.println(Dias.LUNES);
		System.out.println(Dias.LUNES.ordinal());
	}

}
