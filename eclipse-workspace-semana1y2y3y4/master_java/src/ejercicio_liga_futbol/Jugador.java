package ejercicio_liga_futbol;

public class Jugador implements Comparable<Jugador> {

	private String nombre;
	private int goles;
	private Equipo equipo;

	public Jugador(String nombre, int goles, Equipo equipo) {

		this.nombre = nombre;
		this.goles = goles;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public int compareTo(Jugador jugador) {

		if (this.goles >= jugador.getGoles()) {

			return -1;
		} else {

			return 1;
		}
	}

	@Override
	public String toString() {
		return nombre + " Goles: " + goles + " Equipo: " + equipo.getNombre() + "\n";
	}

}
