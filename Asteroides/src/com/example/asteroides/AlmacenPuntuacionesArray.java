package com.example.asteroides;

import java.util.Vector;

public class AlmacenPuntuacionesArray implements AlmacenPuntuaciones {

	private Vector<String> puntuaciones;

	public AlmacenPuntuacionesArray() {

		puntuaciones = new Vector<String>();

		puntuaciones.add("123000 Lissandro Sosa");
		puntuaciones.add("5600  Lenin Sosa");
		puntuaciones.add("15300 Linette Sosa");
	}

	public void guardarPuntuacion(int puntos, String nombre, long fecha) {
		puntuaciones.add(0, puntos + " " + nombre);
	}

	public Vector<String> listaPuntuaciones(int cantidad) {
		return puntuaciones;
	}
}
