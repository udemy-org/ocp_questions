/**
 * 
 */
package org.escoladeltreball.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Main08 {
	private int x = 5;

	protected class Inner {
		//public static int x = 10;

		public void f() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Main08 main = new Main08();
		Main08.Inner inner = main.new Inner();
		inner.f();
	}

}
