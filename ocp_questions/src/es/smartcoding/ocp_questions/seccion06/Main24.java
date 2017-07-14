/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

/**
 * @author jmendez
 *
 */
public class Main24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Excepciones suprimidas
		 * 
		 * Las excepciones suprimidas es un concepto nuevo de Java 7​
		 * 
		 * En un escenario try-with-resources donde el cuerpo del bloque lanza
		 * una excepción y el propio try-with-resources también, se considera
		 * esta última la excepción principal y las demas suprimidas​
		 * 
		 * Las excepciones suprimidas pueden leerse con el método:
		 * 
		 * public​ final Throwable[] getSuppressed()
		 * 
		 * 
		 */
		
		Exception e = new Exception("A");
		e.addSuppressed(e);
		System.out.println(e.getMessage());

	}

}
