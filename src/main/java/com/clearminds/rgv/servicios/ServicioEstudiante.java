package com.clearminds.rgv.servicios;

import java.sql.SQLException;

import com.clearminds.rgv.bdd.ConexionBDD;
import com.clearminds.rgv.dtos.Estudiante;
import com.clearminds.rgv.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante est) throws BDDException{
		abrirConexion();
		System.out.println("Insertando estudiante: "+est.toString());
		cerrarConexion();
	}
}
