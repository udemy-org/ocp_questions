/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author jmendez
 *
 */
public class Main30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path1 = Paths.get("/temp/./").resolve(Paths.get("file.txt"));
		Path path2 = new File("/temp/././stuff/../file.txt").toPath();
		System.out.println(path1);
		System.out.println(path2);
	}

}
