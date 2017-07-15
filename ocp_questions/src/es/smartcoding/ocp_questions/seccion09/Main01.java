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

public class Main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1. /user/.././root/../kodiacbear.txt
		 * 2. /user/./root/kodiacbear.txt/lion 
		 * 3. /kodiacbear.txt
		 * 4. kodiacbear.txt
		 * 5. ../lion 
		 * 6. The code does not compile.
		 */
		Path path = Paths.get("/user/.././root", "../file1.txt");
		// path.normalize().relativize(Paths.get("/pep"));
		System.out.println(path);
		System.out.println(path.normalize().relativize(Paths.get("/pep")));
	}

}
