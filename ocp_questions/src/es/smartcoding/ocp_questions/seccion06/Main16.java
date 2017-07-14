/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

import es.smartcoding.ocp_questions.seccion06.Main15.SimpleException;

/**
 * @author jmendez
 *
 */
public class Main16 {

	static class SimpleException extends Exception {	}

	static class ComplejaException extends SimpleException { }

	public static void main(String[] args) throws SimpleException {
		try {
			throw new SimpleException();
		} 
		finally {}
//		catch (ComplejaException | SimpleException e) {
//			// (1)
//			e = new Exception();
//			e = new RuntimeException();
//			e = new ComplejaException();
//			e = new SimpleException();
//			throw e;
//		}
	}

}
