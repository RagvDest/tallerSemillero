package com.clearminds.rgv.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.rgv.bdd.ConexionBDD;
import com.clearminds.rgv.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;
	
	public void abrirConexion() throws BDDException{
		conexion = ConexionBDD.obtenerConexion();
	}
	public void cerrarConexion() throws SQLException{
		if(conexion!=null){
			conexion.close();
			System.out.println("Conexión cerrada");			
		}else
			System.out.println("Error al cerrar conexión");
		
	}
	
}
