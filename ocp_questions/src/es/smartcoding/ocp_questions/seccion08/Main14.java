/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author jmendez
 *
 */
public class Main14 {

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner s = new Scanner(new BufferedReader(new FileReader("file.txt")));) {
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		}
	}

}
