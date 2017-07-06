/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

/**
 * @author jmendez
 *
 */
public class Main14<T> {
	private T t;

	public Main14(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		System.out.print(new Main14<String>("Hola"));
		System.out.print(new Main14(new Integer(1)));
	}

}
