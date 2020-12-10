package com.clearminds.rgv.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.rgv.bdd.ConexionBDD;
import com.clearminds.rgv.dtos.Estudiante;
import com.clearminds.rgv.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante est) throws BDDException{
		abrirConexion();
		System.out.println("Insertando estudiante: "+est.toString());
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String sql = "insert into estudiantes(nombre,apellido,edad) "
					+ "values('"+est.getNombre()+"','"+est.getApellido()+"','"+est.getEdad()+"')";
			System.out.println("Script: "+sql);
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}
	public void actualizarEstudiante(Estudiante est) throws BDDException{
		abrirConexion();
		System.out.println("Actualizando estudiante: "+est.toString());
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String sql = "update estudiantes set nombre='"+est.getNombre()+"', "
											+ "apellido='"+est.getApellido()+"',"
											+ "edad="+est.getEdad()+" "
											+ "where id="+est.getId();
			System.out.println("Script: "+sql);
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
	}
}
