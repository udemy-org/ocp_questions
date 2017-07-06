/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

/**
 * @author jmendez
 *
 */
public class Main15<T> {
	private T t;

	public Main15(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		System.out.print(new Main15<String>("Hola"));
//		System.out.print(new Main15<String>(new Integer(1))); // (1)
	}

}