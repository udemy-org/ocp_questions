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



public class Main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("/user/home/pep/temp", "../file1.txt");
		System.out.println(path);
		System.out.println(path.normalize());
		System.out.println(path.normalize().relativize(Paths.get("/file2.txt")));	
	}

}
