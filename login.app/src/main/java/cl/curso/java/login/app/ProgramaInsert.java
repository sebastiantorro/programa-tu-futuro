/**
 * 
 */
package cl.curso.java.login.app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author Usuario
 *
 */
public class ProgramaInsert {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso","alumnos","java123");
		
		String nombreUsuario = JOptionPane.showInputDialog("Ingrese usuario");
		String password = JOptionPane.showInputDialog("Ingrese password");

		PreparedStatement st = (PreparedStatement) conexion.prepareStatement("select * from usuarios where "
				+"nombre_usuario =? AND "+
				"password = ?;");
		//st.executeUpdate(" INSERT INTO usuarios"+"(nombre_usuario, password)"+ " VALUES('"+nombreUsuario+"', '"+password+"');");
		st.setString(1, nombreUsuario);
		st.setString(2, password);
		ResultSet rs = st.executeQuery( );
		
		if(rs.next()){
			JOptionPane.showMessageDialog(null, "Acceso correcto");
		}
		else{
			JOptionPane.showMessageDialog(null, "Acceso denegado");
		}
	}

}
