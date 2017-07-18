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
public class Main17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("temp");
		if (Files.isSameFile(path, Paths.get("/home/user1"))) {// (1)
			Files.createDirectory(path.resolve("log")); // (2)
		}
	}

}
