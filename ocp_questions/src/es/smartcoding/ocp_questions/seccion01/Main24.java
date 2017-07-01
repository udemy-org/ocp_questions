/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Main24 {

	static enum Dias {

		// private String nombre;

		LUNES("Lunes"), MARTES("Martes"), MIERCOLES("Miércoles"), JUEVES("Jueves"), VIERNES("Viernes"), SABADO(
				"Sábado"), DOMINGO("Domingo");

		private String nombre;

		private Dias(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return nombre;
		}
	}

	public static void main(String[] args) {
		System.out.println(Dias.LUNES);
		System.out.println(Dias.LUNES.ordinal());
	}

}
