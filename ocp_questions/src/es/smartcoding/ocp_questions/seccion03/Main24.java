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
public class Main24 implements Comparator<String> {

	public static void main(String[] args) {
		String[] valores = { "123", "Abb", "aab" };
		Arrays.sort(valores, new Main24());
		for (String string : valores) {
			System.out.print(string + " ");
		}
	}

	@Override
	public int compare(String s1, String s2) {
		int ret = s2.toLowerCase().compareTo(s1.toLowerCase());
		System.out.println("s1 " + s1.toLowerCase() + " s2 " + s2.toLowerCase() + " " + ret);
		return ret;
	}

}
