/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;



/**
 * @author jmendez
 *
 */
public class Main09 {

	private int x = 1;

	protected class Inner {
		public static final int x = 10; // (1)

		public void f() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Main09 main = new Main09();
		Main09.Inner inner = main.new Inner(); // (2)
		inner.f();
	}

}
