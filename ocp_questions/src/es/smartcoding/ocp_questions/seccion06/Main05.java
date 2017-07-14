/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

import java.io.IOException;

/**
 * @author jmendez
 *
 */

public class Main05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (IOException | RuntimeException e) { } // (1)

	}

}
