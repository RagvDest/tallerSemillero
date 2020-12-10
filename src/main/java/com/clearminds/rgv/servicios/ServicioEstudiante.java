package com.clearminds.rgv.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.clearminds.rgv.dtos.Estudiante;
import com.clearminds.rgv.excepciones.BDDException;
import com.clearminds.rgv.utils.DateUtil;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante est) throws BDDException{
		abrirConexion();
		System.out.println("Insertando estudiante: "+est.toString());
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String fecha = DateUtil.obtenerFecha(new Date());
			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion) "
					+ "values('"+est.getNombre()+"','"+est.getApellido()+"','"+est.getEdad()+""
							+ "','"+fecha+"')";
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
			String fecha = DateUtil.obtenerFecha(new Date());
			String sql = "update estudiantes set nombre='"+est.getNombre()+"', "
											+ "apellido='"+est.getApellido()+"',"
											+ "edad="+est.getEdad()+", "
											+ "fecha_modificacion='"+fecha+"' "
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
