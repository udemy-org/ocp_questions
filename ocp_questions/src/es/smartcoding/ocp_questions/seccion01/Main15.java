/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Main15 {

	static class Barco {
		public void destino(String destino) {
			System.out.println(destino);
		}
	}

	static class Crucero extends Barco {
		@Override
		public void destino(String destino) {
			System.out.println(destino);
		}
	}

	static class Yate extends Crucero {
		@Override
		public void destino(String destino) {
			System.out.println(destino);
		}
	}

	public static void main(String[] args) {
		Barco b = new Yate(); // (1)
		Crucero c = (Crucero) b;
		c.destino("Barcelona");
	}
}
