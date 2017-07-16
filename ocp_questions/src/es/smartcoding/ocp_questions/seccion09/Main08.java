/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author jmendez
 *
 */
public class Main08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get(".");
		System.out.println(path.toAbsolutePath());
	}

}
