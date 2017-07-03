/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */

public class Main10 {
	
	interface Contenedor {}
	class Botijo implements Contenedor {}
	class Bota extends Botijo {}
	class Porron extends Botijo {}

	public static void main(String[] args) {
		Main10 main = new Main10();
		Contenedor contenedor = main.new Porron(); // (1)
		Botijo botijo = main.new Porron(); // (2)
		//Bota bota = main.new Porron(); // (3)
		Porron porron = main.new Porron(); // (4)
	}

}
