/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author jmendez
 *
 */
public class Main10 {
	
	public static String pullBytes(InputStream is, int count) throws IOException {
		is.mark(count);
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++)
			sb.append((char) is.read());
		is.reset();
		is.skip(1);
		sb.append((char) is.read());
		return sb.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
