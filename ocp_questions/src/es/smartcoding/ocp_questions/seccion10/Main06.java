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
public class Main06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		String sql = "update eventos set descripcion='nueva descripción'";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "admin"); // (1)
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); // (2)
		int num = stmt.executeUpdate(sql);
		System.out.println(num);
	}

}
