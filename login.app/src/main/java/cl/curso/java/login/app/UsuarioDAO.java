/**
 * 
 */
package cl.curso.java.login.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Usuario
 *
 */

public class UsuarioDAO extends Usuario {
	public static boolean validar(Usuario usuario) throws SQLException
	{
		Conexion con = Conexion.getInstancia();
		PreparedStatement st = con.getConnection().prepareStatement("select * from usuarios where "
				+"nombre_usuario =? AND "+
				"password = ?;");
		st.setString(1, usuario.getUsuario());
		st.setString(2, usuario.getPassword());
		ResultSet rs = st.executeQuery();
				return rs.next();
		
	}


}
