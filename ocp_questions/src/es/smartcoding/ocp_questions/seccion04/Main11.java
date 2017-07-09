/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author jmendez
 *
 */
public class Main11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BiConsumer<String, String> bc1 = (s1, s2) -> System.out.println(s1 + " " + s2); // (1)
		BiFunction<String, String, Integer> bf1 = (s1, s2) -> s1.length() + s2.length();	 // (2)
		Consumer<String> c1 = String::new; // (3)
		Consumer<String> c2 = System.out::print; // (4)
		Supplier<String> s1 = String::new; // (5)
		Supplier<String> s2 = () -> ""; // (6)
		UnaryOperator<String> uo1 = (string) -> string.substring(0, string.length() / 2); // (7)
	}

}

//System.out.println(bf.apply("hola", "que tal."));
//bc1.accept("hola", "que tal.");
// BinaryConsumer<String, String> bc2 = null;
// BinaryFunction<String, String, Integer> bf 2 = null;
// UnaryOperator<String, String> uo2 = null;