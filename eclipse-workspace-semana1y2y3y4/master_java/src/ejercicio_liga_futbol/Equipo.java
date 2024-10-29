package ejercicio_liga_futbol;

import java.util.ArrayList;
import java.util.Collections;

public class Equipo implements Comparable<Equipo> {

	private String nombre;
	private ArrayList<Jugador> plantilla;
	private int victorias;

	public Equipo(String nombre, ArrayList<Jugador> plantilla) {
		this.nombre = nombre;
		this.plantilla = plantilla;
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Jugador> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(ArrayList<Jugador> plantilla) {
		this.plantilla = plantilla;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public ArrayList<Jugador> getPlantillaOrdenadaPorGoles() {

		Collections.sort(plantilla);

		return plantilla;

	}

	@Override
	public int compareTo(Equipo equipo) {

		if (victorias >= equipo.getVictorias()) {
			return -1;
		} else {

			return 1;
		}
	}

	@Override
	public String toString() {
		return nombre + " Victorias: " + victorias + "\n";
	}

}
