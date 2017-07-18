/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author jmendez
 *
 */
public class Main18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path1 = Paths.get("/temp/../file1.txt");
		Path path2 = Paths.get("./fiel2.txt");
		System.out.println(path1.resolve(path2));
		System.out.println(path2.resolve(path1));
	}

}
