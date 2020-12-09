package com.clearminds.rgv.bdd.test;

import java.sql.Connection;

import com.clearminds.rgv.bdd.ConexionBDD;
import com.clearminds.rgv.excepciones.BDDException;

public class TestPropiedades {

	public static void main(String[] args) {
		try {
			Connection con = ConexionBDD.obtenerConexion();
			if(con!=null)
				System.out.println("Conexion exitosa");
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
