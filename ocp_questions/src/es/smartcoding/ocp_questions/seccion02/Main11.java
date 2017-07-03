/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

import es.smartcoding.ocp_questions.seccion02.Main10.Bota;
import es.smartcoding.ocp_questions.seccion02.Main10.Botijo;
import es.smartcoding.ocp_questions.seccion02.Main10.Contenedor;
import es.smartcoding.ocp_questions.seccion02.Main10.Porron;

/**
 * @author jmendez
 *
 */
public class Main11 {

	interface Contenedor {}
	class Botijo implements Contenedor {}
	class Bota extends Botijo {}
	class Porron extends Bota {}

	public static void main(String[] args) {
		Main11 main = new Main11();
		Contenedor contenedor = main.new Porron(); // (1)
		Botijo botijo = main.new Porron(); // (2)
		Bota bota = main.new Porron(); // (3)
		Porron porron = main.new Porron(); // (4)
	}
}
