/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

import java.io.IOException;

/**
 * @author pep
 *
 */
public class Main04 implements AutoCloseable {

	@Override
	public void close() throws IOException {  
	}

	public static void main(String... args) throws Exception { // (1)
		try(Main04 main = new Main04()) {
		} 
	}

}
