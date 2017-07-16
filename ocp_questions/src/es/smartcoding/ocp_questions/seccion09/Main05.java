/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author jmendez
 *
 */

public class Main05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("file.txt");
		BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class); // (1)
		if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) { // (2)
			System.out.println(attributes.toString());
		}
	}

}
