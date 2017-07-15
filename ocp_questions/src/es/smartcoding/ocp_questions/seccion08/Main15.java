/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.util.Scanner;

/**
 * @author jmendez
 *
 */
public class Main15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
	}

}
