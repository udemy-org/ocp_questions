/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

/**
 * @author jmendez
 *
 */

public class Main03 implements AutoCloseable {

	@Override
	public void close() {  // (1)
	}

	public static void main(String... args) { // (2)
		try(Main03 main = new Main03()) {
		} catch (Exception e) {	}
	}

}
