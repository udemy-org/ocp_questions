/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Main13 {

	static class Barco {
		public void whoami() {
			System.out.println("Soy un barco");
		}
	}

	static class Crucero extends Barco {
		public void whowami() {
			System.out.println("Soy un crucero");
		}
	}

	static class Fragata extends Barco {
		@Override
		public void whoami() {
			System.out.println("Soy una fragata");
		}
	}

	public static void main(String[] args) {
		Barco b = new Crucero(); // (1)
		Fragata f = (Fragata) b; // (2)
		f.whoami(); // (3)
	}

}
