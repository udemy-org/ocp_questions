/**
 * 
 */
package org.escoladeltreball.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Main10 {
	private int x = 1;

	protected class Inner {
		//*public static final int x = x; // (1)

		public void f() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Main10 main = new Main10();
		Main10.Inner inner = main.new Inner(); // (2)
		inner.f();
	}
}
