/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */
interface Ordenador {
	double velocidad = 6.7; // (1)
	static void overclock() {} // (2)
	int reset(); // (3)
	default void boot() {} // (4)
}
public class Main12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
