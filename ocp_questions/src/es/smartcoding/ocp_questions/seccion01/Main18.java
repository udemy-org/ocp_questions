/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Main18 {

	interface Nave {
		void destino(String destino);
	}

	class Barco implements Nave {
		@Override
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
		Main18 main = new Main18();
		Nave n = main.new Crucero(); // (1)
		n.destino("Barcelona"); // (2)
		Barco b = (Barco) n; // (3)
		b.destino("Barcelona"); // (4)
		Yate y = (Yate) b; // (5)
		b.destino("Barcelona"); // (6)
	}

}
