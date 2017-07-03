/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

import java.util.List;

/**
 * @author jmendez
 *
 */

public class Main03 {
	String id;
	private List<String> amigos;

	public Main03(String id, List<String> amigos) {
		this.id = id;
		this.amigos = amigos;
	}

	public String getId() {
		return id;
	}

	public List<String> getAmigos() {
		return amigos;
	}

}
