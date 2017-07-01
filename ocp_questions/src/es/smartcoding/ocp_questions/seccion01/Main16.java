/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Main16 {
	class Barco {
		public void destino(String destino) {
			System.out.println(destino);
		}
	}

	class Crucero extends Barco {
		@Override
		public void destino(String destino) {
			System.out.println(destino);
		}
	}

	class Yate extends Crucero {
		@Override
		public void destino(String destino) {
			System.out.println(destino);
		}
	}

	public static void main(String[] args) {
//		Barco b = new Yate(); // (1)
//		Crucero c = (Crucero) b; // (2)
//		c.destino("Barcelona"); // (3)
	}
}
