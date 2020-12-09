package com.clearminds.rgv.bdd;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.rgv.excepciones.BDDException;

public class ConexionBDD {

	private static String leerPropiedad(String prop){
		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
			System.out.println(prop+": "+p.getProperty(prop));
			return p.getProperty(prop);
		} catch (Exception e) {
			return null;		
		}	
	}
	
	public static Connection obtenerConexion() throws BDDException{
		String url = leerPropiedad("urlConexion");
		String user = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		Connection con;
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		}
		return con;
		
	}
	
	
}
