/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jmendez
 *
 */
public class Main06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			throw new IOException();
		} 
		catch (Exception e) {}
//		finally {}
		
		try (BufferedReader reader = new BufferedReader(new FileReader(new File("file.txt")))) {
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
