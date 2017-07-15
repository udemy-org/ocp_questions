/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author jmendez
 *
 */

public class Main03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * A. path refers to a regular file in the file system.
		 * B. path refers to a symbolic link in the file system.
		 * C. path refers to an empty directory in the file system.
		 * D. path refers to a directory with content in the file system.
		 * E. path does not refer to a record that exists within the file system.
		 * F. The code does not compile.
		 * 
		 * B, C
		 */
		Path path = null;
		if (Files.isDirectory(path))
			System.out.println(Files.deleteIfExists(path) ? "Success" : "Try Again");
	}

}
