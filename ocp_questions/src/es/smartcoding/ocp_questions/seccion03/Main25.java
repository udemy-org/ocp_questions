/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jmendez
 *
 */
public class Main25 implements Comparator<String> {

	public static void main(String[] args) {
		String[] valores = { "123", "Abb", " aab" };
		Arrays.sort(valores, new Main25());
		for (String string : valores) {
			System.out.print(string + " ");
		}
	}

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}

}
