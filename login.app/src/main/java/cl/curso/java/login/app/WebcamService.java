/**
 * 
 */
package cl.curso.java.login.app;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

/**
 * @author Usuario
 *
 */
public class WebcamService {
	
	public static void tomarFoto () throws IOException{
		
		
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(WebcamResolution.VGA.getSize());
		webcam.setViewSize(new Dimension ( 640, 480));
		webcam.open();
		ImageIO.write(webcam.getImage(), "png", new File ("C:/Users/Usuario/fotos aplica/" + new Date().getTime()+".png"));
		
	
	}
	

}
