/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

import java.util.List;

/**
 * @author jmendez
 *
 */

public class Main05 {

	private static Main05 main;

	private Main05() {
	}

	public static Main05 getMain() {
		if (main == null) {
			main = new Main05();
		}
		return main;
	}

}
