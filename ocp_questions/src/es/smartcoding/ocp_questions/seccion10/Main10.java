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
public class Main10 {

	/**
	 * @param args
	 * 
	 * (Puedes asumir que hay 2 registros en la tabla 'eventos').
	 */
	public static void main(String[] args) throws SQLException {
		String sql = "select count(*) from eventos";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "admin"); // (1)
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); // (2)
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();
		int i = rs.getInt(1); // (3)
		String s = rs.getString(1); // (4)
		Object o = rs.getString(1); // (5)
		System.out.printf("%d %s %s", i, s, o);
	}

}
