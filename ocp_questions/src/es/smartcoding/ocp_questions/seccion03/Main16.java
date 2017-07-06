/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

/**
 * @author jmendez
 *
 */
public class Main16<T> {
	private T t;

	public Main16(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		System.out.print(new Main16<String>("Hola"));
//		System.out.print(new Main16<Integer>(1.3)); // (1)
	}

}
