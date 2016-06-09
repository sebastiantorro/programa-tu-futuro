/**
 * 
 */
package cl.curso.java.login.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author Usuario
 *
 */
public class ProgramaPreparedStatement {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws SQLException, Throwable {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso","alumnos","java123");		
		

		PreparedStatement pstatementInsert = (PreparedStatement) conexion.prepareStatement("INSERT INTO alumnos(idalumno, nombre, apellido, apellidoMaterno)"+ "VALUES(?,?,?,?);");
		
		pstatementInsert.setInt(1, 95);
		pstatementInsert.setString(2, "James");
		pstatementInsert.setString(3, "Gosling");
		pstatementInsert.setString(4, "Lion");
		int resultpInsert = pstatementInsert.executeUpdate();
		System.out.println(resultpInsert);
		
		
	}

}
