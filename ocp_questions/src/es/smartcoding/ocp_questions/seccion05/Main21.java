/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.util.Properties;

/**
 * @author jmendez
 *
 */
public class Main21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties props = new Properties();
		props.put("a", "Alpha");
		props.put("b", "Bravo");
		props.put("c", "Charlie");
		props.put("d", "Delta");
		props.put("e", "Echo");
		props.keySet().stream().map(key -> props.get(key)).forEach(System.out::println);
	}

}
