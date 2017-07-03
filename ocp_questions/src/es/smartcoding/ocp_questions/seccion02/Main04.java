/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pep
 *
 */
public final class Main04 {

	private final String id;
	private final List<String> amigos;

	public Main04(String id, List<String> amigos) {
		this.id = id;
		this.amigos = new ArrayList<String>(amigos);
	}

	public String getId() {
		return id;
	}

	public List<String> getAmigos() {
		return new ArrayList<>(amigos);
	}
}
