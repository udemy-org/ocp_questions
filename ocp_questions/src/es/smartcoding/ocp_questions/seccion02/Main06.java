/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */

public class Main06 {
	interface I {
		default void f() { System.out.println("En f() de I");}
	}
	interface J extends I {
		public default void f() {System.out.println("En f() de J");} // (1)
		public abstract void g(); // (2)
	}
	interface K extends I { // (3)
		void h(); // (4)
	}
	class C implements K {

		@Override
		public void h() {
			System.out.println("en h() de C");
			
		}
		
	}
}
