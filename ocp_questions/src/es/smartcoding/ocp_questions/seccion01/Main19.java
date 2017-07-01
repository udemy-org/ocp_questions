/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

import java.util.ArrayList;
import java.util.List;

public class Main19 {

	static class Minyons {}
	
	public static void main(String[] args) {
		Minyons m = new Minyons();
		List<Minyons> l = new ArrayList<>();
		Integer i = new Integer(1);
		int r = 0;
		if (m instanceof Minyons) ++r;
		if (l instanceof Minyons) r += 5;
		System.out.println(r);
	}

}
