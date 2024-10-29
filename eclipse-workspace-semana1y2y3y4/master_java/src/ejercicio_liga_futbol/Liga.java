package ejercicio_liga_futbol;

import java.util.ArrayList;
import java.util.Collections;

public class Liga {

	private ArrayList<Partido> listaPartidos;
	private ArrayList<Equipo> clasificacionEquipos;

	public Liga() {
		listaPartidos = new ArrayList<>();
	}

	public Liga(ArrayList<Partido> listaPartidos) {

		this.listaPartidos = listaPartidos;
	}

	public ArrayList<Equipo> getClasificacionEquipos() {
		return clasificacionEquipos;
	}

	public void setClasificacionEquipos(ArrayList<Equipo> clasificacionEquipos) {
		this.clasificacionEquipos = clasificacionEquipos;
	}

	public ArrayList<Partido> getListaPartidos() {
		return listaPartidos;
	}

	public void setListaPartidos(ArrayList<Partido> listaPartidos) {
		this.listaPartidos = listaPartidos;
	}

	public ArrayList<Partido> addPartido(Partido partido) {

		listaPartidos.add(partido);

		return listaPartidos;

	}

	public void setPartidosGanados(Equipo equipo) {

		int victorias = 0;

		for (int i = 0; i < listaPartidos.size(); i++) {

			if (equipo == listaPartidos.get(i).getGanador()) {
				victorias++;
			}
		}
		equipo.setVictorias(victorias);
	}

	public ArrayList<Equipo> getClasificacion() {

		Collections.sort(clasificacionEquipos);

		return clasificacionEquipos;
	}

}
