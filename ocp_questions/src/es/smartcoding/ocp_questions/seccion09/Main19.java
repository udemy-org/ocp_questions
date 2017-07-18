/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author jmendez
 *
 */
public class Main19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Files.move(Paths.get("file.txt"), Paths.get("/temp"), StandardCopyOption.ATOMIC_MOVE,
				LinkOption.NOFOLLOW_LINKS);
	}

}
