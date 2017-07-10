/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Properties;

/**
 * @author jmendez
 *
 */
public class Main22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime hoy = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		Properties props = new Properties();
		props.put("hoy", dtf.format(hoy));
		props.put("mañana", dtf.format(hoy.plusDays(1)));
		props.put("ayer", dtf.format(hoy.minusDays(1)));
		props.keySet().stream().map(key -> props.get(key)).forEach(System.out::println);
	}

}
