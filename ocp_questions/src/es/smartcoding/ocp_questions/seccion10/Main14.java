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
public class Main14 {

	/**
	 * @param args
	 
Considera el siguiente código y determina la salida. 
Puedes asumir que la estructura y el estado de la tabla 'eventos' es el que se detalla a continuación:
	
desc eventos;
+-------------+--------------+------+-----+-------------------+----------------+
| Field       | Type         | Null | Key | Default           | Extra          |
+-------------+--------------+------+-----+-------------------+----------------+
| id          | int(11)      | NO   | PRI | NULL              | auto_increment |
| nombre      | varchar(65)  | NO   |     | NULL              |                |
| descripcion | varchar(255) | YES  |     | NULL              |                |
| fecha       | timestamp    | NO   |     | CURRENT_TIMESTAMP |                |
+-------------+--------------+------+-----+-------------------+----------------+	
	
select * from eventos;
+----+-----------+-----------------------+---------------------+
| id | nombre    | descripcion           | fecha               |
+----+-----------+-----------------------+---------------------+
|  1 | Shut down | Shut down del sistema | 2017-06-17 10:09:25 |
|  2 | Copia     | Copia del sistema     | 2017-06-27 19:12:55 |
|  3 | Reset     | Reset del sistema     | 2017-07-01 16:39:38 |
|  4 | Update    | Update del sistema    | 2017-07-09 15:31:54 |
|  5 | Scan      | Scan del sistema      | 2017-07-22 12:40:09 |
+----+-----------+-----------------------+---------------------+	 
	 
	 */
	public static void main(String[] args) throws SQLException {
		String sql = "select * from eventos";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "admin");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			rs.next(); // (1)
			int i = rs.getInt(1);
			System.out.printf("%d ", i);
		}
	}

}
