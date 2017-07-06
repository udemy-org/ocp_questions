/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */
public class Main20 {

//	@FunctionalInterface
//	public interface Funcional {
//		void f1();
//		void f2();
//	}

	public interface NoFuncional {
		public abstract void g(); 
	}

	public interface PuedeSerFuncional {
		public void h();
		static void i() {}
		default void j() {}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
