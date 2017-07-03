/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */

public class Main01 {
	
	interface I {}
	
	@FunctionalInterface interface J { public void f();}
	
	interface K extends J {}
	
	//@FunctionalInterface interface L { default void f() {} }

	public static void main(String[] args) {
	
	}

}
