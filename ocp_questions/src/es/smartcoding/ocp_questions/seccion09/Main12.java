/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author jmendez
 *
 */
public class Main12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = FileSystems.getDefault().getPath("file.txt"); // (1)
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) { // (2)
			System.out.println(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
