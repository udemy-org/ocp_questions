/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author jmendez
 *
 */
public class Main23 {

	private void readFromDatabase() throws SQLException { } 

	public void read() {
		try {
			readFromDatabase();
		} catch (SQLException | RuntimeException e) { // (1)
		
		}
	}

}
