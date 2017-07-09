/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author pep
 *
 */
public class Main04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * App.properties
		 * titulo=smartcoding.es
		 * subtitulo=smartcoding
		 * 
		 * App_en.properties
		 * titulo=smartcoding.es
		 * subtitulo=smartcoding
		 * 
		 * App_es.properties
		 * titulo=smartcoding.es
		 */
		Locale es = new Locale("es");
		Locale.setDefault(new Locale("en", "UK"));
		ResourceBundle bundle = ResourceBundle.getBundle("App", es);
		bundle.getString("titulo"); // (1)
		bundle.getString("subtitulo"); // (2)
	}

}


