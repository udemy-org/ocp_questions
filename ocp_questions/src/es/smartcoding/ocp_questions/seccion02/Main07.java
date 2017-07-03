/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */

public class Main07 {
	interface I {
		default void f() {
			System.out.println("En f() de I");
		}
	}

	interface J extends I {
		public default void f() {
			System.out.println("En f() de J");
		} 

		public abstract void g(); 
	}

	interface K extends J { // (1) 
		void h(); 
	}

	class C implements K { // (2)

		@Override
		public void h() {
			System.out.println("en h() de C");

		}

		@Override
		public void g() {
			System.out.println("en g() de C");

		}

	}

	
	public static void main(String[] args) {
//		C c = new C();
//		c.f();
	}

}
