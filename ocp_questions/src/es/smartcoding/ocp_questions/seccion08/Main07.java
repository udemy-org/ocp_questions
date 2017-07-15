/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.Console;

/**
 * @author jmendez
 *
 */
public class Main07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console console = System.console();
		String nombre = console.readLine("Cómo te llamas? ");
		console.printf("Hola "+nombre);
		console.format("Hola "+nombre);
		console.writer().println("Hola "+nombre);
		console.writer().print("Hola "+nombre);
		console.writer().printf("Hola "+nombre);
	}

}
