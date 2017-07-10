/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.ZoneId;
import java.util.Map;

/**
 * @author jmendez
 *
 */
public class Main28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> zones = ZoneId.SHORT_IDS;
		zones.keySet().stream().map(k -> zones.get(k)).filter(v -> v.startsWith("America")).limit(5).forEach(System.out::println);
	}

}
