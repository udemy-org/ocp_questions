/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author jmendez
 *
 */

public class Main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(new Locale("es", "ES")); 
		ResourceBundle bundle = ResourceBundle.getBundle("App"); 
		String titulo = bundle.getString("titulo"); 
		System.out.println(titulo);
	}

}
