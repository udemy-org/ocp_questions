/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.ZoneId;

/**
 * @author jmendez
 *
 */
public class Main26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZoneId
		.getAvailableZoneIds()
		.stream()
		.filter(s -> s.startsWith("Europe"))
		.sorted()
		.limit(6)
		.forEach(System.out::println);
	}

}
