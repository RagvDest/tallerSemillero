package com.clearminds.rgv.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.rgv.bdd.ConexionBDD;
import com.clearminds.rgv.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;
	
	public void abrirConexion() throws BDDException{
		conexion = ConexionBDD.obtenerConexion();
		System.out.println("Conexión exitosa");
	}
	public void cerrarConexion() throws BDDException{
		if(conexion!=null){
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new BDDException("Error al cerrar conexión");
			}
		}
		System.out.println("Conexión cerrada");
			
		
	}
	
}
