/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jmendez
 *
 */
public class Main08 {

	private static List<String> sort(List<String> list) {
		List<String> copy = new ArrayList<>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
	}
	
//	private static List<String> sort1(List<String> list) {
//		return list.stream()
//				.compare((a, b) -> b.compareTo(a)) .collect(Collectors.toList());
//	}
//
//	private static List<String> sort2(List<String> list) {
//		return list.stream()
//				.compare((a, b) -> b.compareTo(a)) .sort();
//	}
//	
//	private static List<String> sort3(List<String> list) {
//		return list.stream()
//				.compareTo((a, b) -> b.compareTo(a)) .collect(Collectors.toList());
//	}
//	
//	private static List<String> sort4(List<String> list) {
//		return list.stream()
//				.compareTo((a, b) -> b.compareTo(a)) .sort();
//	}
//
//	private static List<String> sort5(List<String> list) {
//		return list.stream()
//				.sorted((a, b) -> b.compareTo(a)) .collect();
//	}
	
	private static List<String> sort6(List<String> list) {
		return list.stream()
				.sorted((a, b) -> b.compareTo(a)) .collect(Collectors.toList());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
