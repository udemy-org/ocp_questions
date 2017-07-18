/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author jmendez
 *
 */
public class Main16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/Users");
		boolean presente = Files.walk(path).filter((p) -> p.toFile().isDirectory() && !path.equals(p)) // (1)
				.findFirst().isPresent(); // (2)
		System.out.println(!presente ? "Directorio vacío" : "Directorio tiene subdirectorios");
	}

}
