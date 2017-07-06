/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

import java.io.Serializable;

/**
 * @author jmendez
 *
 */
public class Main17 {

	public class Laptop implements Serializable {
		public String marca;
		public int cores;
		public boolean ultraligero;

		public Laptop() {
		}

		public Laptop(String marca, int cores, boolean ultraligero) {
			this.marca = marca;
			this.cores = cores;
			this.ultraligero = ultraligero;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public int getCores() {
			return cores;
		}

		public void setCores(int cores) {
			this.cores = cores;
		}

		public boolean isUltraligero() {
			return ultraligero;
		}

		public void setUltraligero(boolean ultraligero) {
			this.ultraligero = ultraligero;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
