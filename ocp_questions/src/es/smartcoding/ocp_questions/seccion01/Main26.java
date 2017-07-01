/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
interface Vehiculo {
	default void arranca() {
	}
}

public class Main26 implements Vehiculo {

	// (1)
	@Override public boolean equals(Object object) {return false;}
	@Override public int hashCode() {return 1;}
	@Override public void arranca() {}
}
