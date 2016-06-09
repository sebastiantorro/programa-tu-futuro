/**
 * 
 */
package cl.curso.java.login.app;

/**
 * @author Usuario
 *
 */
public class ProgramaConexion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
		Conexion con = Conexion.getInstancia();
		Conexion con2 = Conexion.getInstancia();

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}