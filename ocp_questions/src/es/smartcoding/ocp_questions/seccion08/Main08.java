/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author jmendez
 *
 */
public class Main08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// OutputStream stream1 = new BufferedOutputStream(new ObjectOutputStream(new FileOutputStream(new File(""))));
		OutputStream stream = new BufferedOutputStream(new ObjectOutputStream(new FileOutputStream("")));
		
	}

}
