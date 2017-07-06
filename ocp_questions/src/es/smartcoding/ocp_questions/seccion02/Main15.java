/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

/**
 * @author jmendez
 *
 */
public class Main15 {
	
	public interface Saltarin {
		void salta(); // (1)
	}
	
	private interface Zancudo { // (2)
		public abstract Object getPatas();
	}
	
	//protected final class Saltamontes implements Saltarin, Zancudo {} // (3)

	public static void main(String[] args) {

	}

}
