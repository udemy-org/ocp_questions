/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

import java.io.Closeable;

import es.smartcoding.ocp_questions.seccion06.Main07.Caja;
import es.smartcoding.ocp_questions.seccion06.Main07.CajaFuerte;

/**
 * @author jmendez
 *
 */
public class Main09 {

	static class CajaFuerte implements AutoCloseable {
		public void close() {
			System.out.print("S");
			throw new RuntimeException("CajaFuerte");
		}
	}

	static class Caja implements Closeable {
		public void close() {
			System.out.print("O");
			throw new RuntimeException("Caja");
		}
	}

	public static void main(String[] args) {
		try (CajaFuerte d = new CajaFuerte(); Caja w = new Caja()) {
			System.out.print("J");
		} catch (Exception e) {
			System.out.print(e.getMessage());
			System.out.print("E");
		} finally {
			System.out.print("P");
		}
	}

}
