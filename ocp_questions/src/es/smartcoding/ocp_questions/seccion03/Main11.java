/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * @author jmendez
 *
 */
public class Main11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		HashSet<Number> c1 = new HashSet<Integer>(); // (1)
		HashSet<? super ClassCastException> c2 = new HashSet<Exception>(); // (2)
		List<String> c3 = new Vector<String>(); // (3)
//		List<Object> c4 = new HashSet<Object>(); // (4)
		Map<String, ? extends Number> c5 = new HashMap<String, Integer>(); // (5)
		Map<? extends CharSequence, ? extends Number> c6 = new LinkedHashMap<String, Double>(); // (6)
//		Collection<? super Throwable> c7 = new LinkedList<RuntimeException>(); // (7)
//		Collection<? extends Throwable> c8 = new List<RuntimeException>(); // (8)
		Collection<? super Throwable> c9 = new LinkedList<Object>(); // (9)
		Collection<?> c10 = new HashSet<Object>(); // (10)
	}

}
