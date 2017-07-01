/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Main17 {

	class Barco {
		public void destino(String destino) {
			System.out.println(destino);
		}
	}

	class Crucero extends Barco {
		@Override
		public void destino(String destino) {
			System.out.println(destino.toLowerCase());
		}
	}

	class Yate extends Crucero {
		@Override
		public void destino(String destino) {
			System.out.println(destino.toUpperCase());
		}
	}

	public static void main(String[] args) {
		Main17 main = new Main17();
		Barco b = main.new Yate(); // (1)
		b.destino("Barcelona"); // (2)
		Crucero c = (Crucero) b; // (3)
		c.destino("Barcelona"); // (4)
		Barco b2 = (Barco) c; // (5)
		b2.destino("Barcelona"); // (6)
	}

}
