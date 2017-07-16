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
 * @author pep
 *
 */
public class Main04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("file.txt");
		BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class); // (1)
		if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) { // (2)
//			attributes.setTime(6, 34, 0); // (3)
		}

	}

}
