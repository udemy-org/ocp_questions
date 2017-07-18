/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author pep
 *
 */
public class Main31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("././").resolve(Paths.get("file.txt"));
		Path path2 = new File("file.txt").toPath();
		System.out.print(Files.isSameFile(path1, path2));
		System.out.print(" " + path1.equals(path2));
		System.out.print(" " + path1.normalize().equals(path2.normalize()));
	}

}
