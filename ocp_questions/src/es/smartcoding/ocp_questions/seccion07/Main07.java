/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author jmendez
 *
 */
public class Main07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * CopyOnWriteArrayList es una variante a prueba de hilos de ArrayList
		 * donde todas las operaciones mutantes (add, set, etc.) se implementan
		 * haciendo una copia del array de soporte. Aunque es un implementación
		 * costosa, puede ser beneficiona cuando se hacen muchos más recorridos
		 * de la colección que modificaciones.
		 */
		/*
		 * En computación, una lista de salto (skip list) es una estructura de
		 * datos que permite una búsqueda rápida dentro de una secuencia
		 * ordenada de elementos.
		 */
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = new CopyOnWriteArrayList<>(list1);
		Set<Integer> set3 = new ConcurrentSkipListSet<>();
		set3.addAll(list1);
		for (Integer item : list2)
			list2.add(4); // (1)
		for (Integer item : set3)
			set3.add(5); // (2)
		System.out.println(list1.size() + " " + list2.size() + " " + set3.size());
	}

}
