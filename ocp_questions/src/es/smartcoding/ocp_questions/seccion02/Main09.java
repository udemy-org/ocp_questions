/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */
interface Sumador {
	String concat(String msg, double d);
}

public class Main09 {

	public static void main(String[] args) {
		Sumador s1 = (String s, double d) -> new StringBuilder(s).append(d).toString();
		Sumador s2 = (s, d) -> new StringBuilder(s).append(d).toString();
		Sumador s3 = (String s, double d) -> s + d;
		Sumador s4 = (s, d) -> {return s + d;};
		//Sumador s5 = (String s, Double d) -> new StringBuilder(s).append(d).toString();
		//Sumador s6 = (String s, d) -> new StringBuilder(s).append(d).toString();
		//Sumador s7 = (String s, double d) -> {return s + d;}
		//Sumador s8 = (s, d) -> {return s + d};
	}

}
