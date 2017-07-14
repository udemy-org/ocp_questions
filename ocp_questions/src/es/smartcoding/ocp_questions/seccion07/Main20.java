/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("barcelona", "tarragona", "sevilla", "soria").parallel();
		Stream<String> stream2 = Stream.of("pontevedra", "teruel", "toledo").parallel();
		ConcurrentMap<Boolean, List<String>> data = Stream.of(stream1, stream2).flatMap(s -> s).sorted() // (1)
				.collect(Collectors.groupingByConcurrent(s -> !s.startsWith("t")));
		System.out.printf("%d %d", data.get(false).size(), data.get(true).size());
	}

}
