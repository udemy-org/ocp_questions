/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author pep
 *
 */
public class Main32 {

	/**
	 * @param args
	 * 
	 * /Users/pep/git/ocp_questions/ocp_questions
	 */
	public static void main(String[] args) {
		final Path path = Paths.get(".").normalize(); // (1)
		int contador = 0;
		for (int i = 0; i < path.getNameCount(); ++i) {
			contador++;
		}
		System.out.println(contador);
	}

}
