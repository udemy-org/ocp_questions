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
public class Main09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("/Users/pep/git/ocp_questions/ocp_questions/", "file1.txt");
		System.out.println(path.getFileName());
	}

}
