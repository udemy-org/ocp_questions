/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

import java.io.Closeable;

/**
 * @author jmendez
 *
 */
public class Main07 {

	static class CajaFuerte implements AutoCloseable {
		public void close() {
			System.out.print("S");
		}
	}

	static class Caja implements Closeable {
		public void close() {
			System.out.print("O");
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		try (CajaFuerte d = new CajaFuerte(); Caja w = new Caja()) {
			System.out.print("J");
		} catch (Exception e) {
			System.out.print("E");
		} finally {
			System.out.print("P");
		}
	}
}
