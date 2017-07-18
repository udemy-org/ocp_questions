/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @author jmendez
 *
 */
public class Main29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// /Users/pep/git/ocp_questions/ocp_questions/file.txt
		Files.walk(Paths.get("/Users/pep/").toRealPath()) // (1) 
		.map(p -> p.toAbsolutePath().toString()) // (2)
		.filter(s -> s.endsWith(".txt")) // (3)
		.collect(Collectors.toList()) 
		.forEach(System.out::println);
	}

}
