/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author jmendez
 *
 */
public class Main23 {

	public static void main(String[] args) {
		//Path path1 = new Path("file.txt"); // (1) no compila no se puede instanciar Path
		Path path2 = FileSystems.getDefault().getPath("file.txt"); // (2)
		//Path path3 = Paths.get(new URI("file.txt")); // (3) throws URISyntaxException 
		Path path4 = Paths.get("temp", "file.txt");  // (4)
		Path path5 = new java.io.File("file.txt").toPath();  // (5)
		// Path path6 = new FileSystem().getPath("file.txt");  // (6) no compila no se puede instancia FileSystem
		Path path7 = Paths.get(".");  // (7)
		// Path path8 = Paths.get(null);  // (8) lanza excepción en tiempo de ejecución java.lang.NullPointerException
		Path path9 = FileSystems.getDefault().getPath(".");  // (9)
		//Path path10 = FileSystems.getDefault().getPath(null);  // (10) lanza excepción en tiempo de ejecución java.lang.NullPointerException
	}

}
