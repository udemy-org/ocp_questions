/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @author jmendez
 *
 */
public class Main26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Path actual = Paths.get(".");
		Files.find(actual, 1, (path, attribute) -> attribute.isRegularFile()).map(path -> path.toString()) // (1)
				.collect(Collectors.toList()) // (2)
				.stream() // (3)
				.filter(string -> string.toString().endsWith(".txt")) // (4)
				.forEach(System.out::println);
	}

}
