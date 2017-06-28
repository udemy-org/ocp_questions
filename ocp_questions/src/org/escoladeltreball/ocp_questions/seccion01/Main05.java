/**
 * 
 */
package org.escoladeltreball.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
class Book {
	private int ISBN;
	private String title, author;
	private int pageCount;

	public int hashCode() {
		return ISBN;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return this.ISBN == other.ISBN;
	}
	// imagine getters and setters are here
}

public class Main05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
