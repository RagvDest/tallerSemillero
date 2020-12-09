package com.clearminds.rgv.bdd;

import java.io.FileReader;
import java.util.Properties;

public class ConexionBDD {

	public static String leerPropiedad(String prop){
		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
			System.out.println("Uno: "+p.getProperty(prop));
			return p.getProperty(prop);
		} catch (Exception e) {
			return null;		
		}
		
		
	}
}
