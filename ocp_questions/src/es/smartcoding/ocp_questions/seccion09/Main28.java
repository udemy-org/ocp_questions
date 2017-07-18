/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main28 {

	/**
	 * @param args
	 * Considera el siguiente código y determina la salida. (Puedes asumir que 'file.txt' existe y que su contenido es:  alfa,bravo,charlie)
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("file.txt");
		List<String> list = Files.lines(path) // (1)
		.flatMap(linea -> Stream.of(linea.split(","))) // (2) 
		.map(palabra -> palabra.toUpperCase()) // (3) 
		.collect(Collectors.toList()); // (4)
		System.out.println(list.size());
	}

}
