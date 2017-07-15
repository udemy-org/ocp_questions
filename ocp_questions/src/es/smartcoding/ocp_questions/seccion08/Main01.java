/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * @author jmendez
 *
 */



public class Main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		InputStream is1 = new BufferedInputStream(new FileInputStream("fichero.txt"));
		InputStream is2 = new  BufferedInputStream(is1);
		InputStream is3 = new  ObjectInputStream(is1);
	}

}
