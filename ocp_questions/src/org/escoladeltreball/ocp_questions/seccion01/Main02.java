/**
 * 
 */
package org.escoladeltreball.ocp_questions.seccion01;

import java.time.LocalDate;

/**
 * @author jmendez
 *
 */



public class Main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Estudiante one = new Estudiante();
		one.id = 12345;
		Estudiante two = new Estudiante();
		two.id = 12345;
		if (one.equals(two))
			System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
	}

}
