/**
 * 
 */
package es.smartcoding.ocp_questions.seccion10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jmendez
 *
 */



public class Main02 {

	/**
	 * @param args
	 * ​Considera el siguiente código y determina la salida. (Puedes asumir que existe una tabla eventos(id int primary key, nombre marchar(32), descripcion marchar(255)) en la base de datos ocp con varios registros).
	 */
	public static void main(String[] args) throws SQLException {
		//DriverManager.getConnection(url);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "admin"); // (1)
		Statement stmt = conn.createStatement(); // (2)
		ResultSet rs = stmt.executeQuery("select count(*) from eventos"); // (3)
		if (rs.next()) {
			System.out.println(rs.getInt(1)); // (4)
		}
	}

}
