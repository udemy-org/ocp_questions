/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

/**
 * @author jmendez
 *
 */
public class Main13<T> {
	private T t;

	public Main13(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		System.out.print(new Main13<String>("Hola"));
		System.out.print(new Main13("Mundo"));
	}

}
