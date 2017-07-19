/**
 * 
 */
package es.smartcoding.ocp_questions.seccion10;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jmendez
 *
 */

public class Main03 {

	public void stmt(Connection conn, int b) throws SQLException {
		/*
		 * (1)
		 * 
		 * ResultSet.TYPE_FORWARD_ONLY 
		 * 
		 * ResultSet.TYPE_SCROLL_INSENSITIVE
		 * 
		 * ResultSet.TYPE_SCROLL_SENSITIVE
		 * 
		 * (2) ​ 
		 * 
		 * ResultSet.CONCUR_READ_ONLY
		 * 
		 * ResultSet.CONCUR_UPDATABLE
		 */
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	}

	/**
	 * @param args
	 * SQLFeatureNotSupportedException 
	 */
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "admin"); // (1)
		conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); // (2)
		System.out.println("OK");
	}

}
