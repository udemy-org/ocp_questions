/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Properties;

/**
 * @author jmendez
 *
 */
public class Main24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime hoy = LocalDateTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG); // (1)
		Properties props = new Properties();
		props.put("short", dtf1.format(hoy));
		props.put("medium", dtf2.format(hoy));
//		props.put("full", dtf3.format(hoy));
		props.keySet().stream().map(key -> props.get(key)).forEach(System.out::println);
	}

}
