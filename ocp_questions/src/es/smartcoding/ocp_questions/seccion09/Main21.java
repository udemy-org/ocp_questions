/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author jmendez
 *
 */
public class Main21 {

	public static void main(String[] args) throws IOException {
		Path origen = Paths.get("./file.txt").normalize(); // (1)
		Path destino = Paths.get("foto.png");
		Files.copy(origen, destino, StandardCopyOption.COPY_ATTRIBUTES); // (2)
		System.out.println(Files.isSameFile(origen, destino)); // (3)
	}

}
