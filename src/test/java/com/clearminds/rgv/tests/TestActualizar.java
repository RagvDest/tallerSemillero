package com.clearminds.rgv.tests;

import com.clearminds.rgv.dtos.Estudiante;
import com.clearminds.rgv.excepciones.BDDException;
import com.clearminds.rgv.servicios.ServicioEstudiante;

public class TestActualizar {
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("Pato", "Intriago",4));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
