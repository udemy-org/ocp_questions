/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
public class Libro {
	private int ISBN;
	private String titulo;
	private String[] autores;
	private String editorial;

	public int hashCode() {
		return ISBN;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Libro)) {
			return false;
		}
		Libro other = (Libro) obj;
		return this.ISBN == other.ISBN;
	}
	// getters/setters
}