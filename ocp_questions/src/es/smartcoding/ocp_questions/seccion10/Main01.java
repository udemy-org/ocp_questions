/**
 * 
 */
package es.smartcoding.ocp_questions.seccion10;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author jmendez
 *
 */



public class Main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		DriverManager.getDriver("jdbc:mysql://localhost:3306/ocp");
		System.out.println("OK");
	}

}
