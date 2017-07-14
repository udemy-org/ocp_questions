/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

/**
 * @author jmendez
 *
 */
public class Main29 {

	static class GestorDeTickets {

		private static GestorDeTickets instance;
		private int tickets;

		private GestorDeTickets() {
			super();
		}

		public static synchronized GestorDeTickets getInstance() { // (1)
			if (instance == null)
				instance = new GestorDeTickets(); // (2)
			return instance;
		}

		public int getTickets() {
			return tickets;
		}

		public void ticketsDisponibles(int value) { // (3)
			tickets += value;
		} 

		public void vendeTickets(int value) {
			synchronized (this) { // (4)
				tickets -= value;
			}
		}

	}

	public static void main(String[] args) {

	}

}
