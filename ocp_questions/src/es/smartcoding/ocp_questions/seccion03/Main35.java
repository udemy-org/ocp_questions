package es.smartcoding.ocp_questions.seccion03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pep
 *
 */
public class Main35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Si la clave no existe o está asociada con null, el método merge() la
		 * asocia con el valor no nulo especificado. De otro modo, sustituye el
		 * valor asociado con el resultado de la función de mapeo o bien lo
		 * elimina si el resultado es null
		 */
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null); // (1)
		map.merge(1, 3, (Integer oldValue, Integer newValue) -> oldValue - newValue); // (2)
		map.merge(3, 5, (Integer oldValue, Integer newValue) -> oldValue % newValue); // (3)
		System.out.println(map);
	}

}
