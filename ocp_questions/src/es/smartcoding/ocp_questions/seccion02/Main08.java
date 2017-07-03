/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */
interface Traductor {
	String habla(double d);
}

public class Main08 {

	public static void main(String[] args) {
		Traductor t1 = d -> String.valueOf(d);
		Traductor t2 = (double d) -> String.valueOf(d);
		// Traductor t3 = (Double d) -> String.valueOf(d);
		// Traductor t4 = double d -> String.valueOf(d);
		// Traductor t5 = (double d) -> {return String.valueOf(d)};
		// Traductor t6 = (double d) -> {return String.valueOf(d);}
		Traductor t7 = (double d) -> {return String.valueOf(d);};
	}

}
