/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jmendez
 *
 */

public class Main05 {

	private void lee() throws IOException {
		try (FileReader fileReader = new FileReader("file.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			System.out.println(bufferedReader.readLine());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
