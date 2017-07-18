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
public class Main14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("/Users/pep/git/ocp_questions/ocp_questions/", "file1.txt");
		path.forEach(System.out::println);
	}

}
