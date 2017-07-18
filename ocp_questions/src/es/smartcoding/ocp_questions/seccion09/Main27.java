/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main27 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("file.txt");
		Files.lines(path) // (1)
		.flatMap(linea -> Stream.of(linea.split(","))) // (2) 
		.map(palabra -> palabra.toUpperCase()) // (3) 
		.forEach(System.out::println);
		
	}

}
