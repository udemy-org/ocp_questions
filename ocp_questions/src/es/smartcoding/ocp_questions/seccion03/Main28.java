/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author jmendez
 *
 */
public class Main28 {
	
	public static <E extends Exception> void printException(E e) { // (1)
		System.out.println(e.getLocalizedMessage()); // (2)
	}

	public static void main(String[] args) {
		Main28.printException(new FileNotFoundException()); // (3)
		Main28.printException(new Exception()); // (4)
//		Main28.<Throwable>printException(new Exception()); // (5)
		Main28.<NullPointerException>printException(new NullPointerException()); // (6)
		Main28.<IOException>printException(new FileNotFoundException()); // (7)
//		Main28<Exception>.printException(new IOException()); // (8)
//		Main28.printException(new Throwable()); // (9)
	}

}
