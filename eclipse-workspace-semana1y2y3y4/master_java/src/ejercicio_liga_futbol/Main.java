package ejercicio_liga_futbol;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Equipo e1 = new Equipo("Salamanca");
		Equipo e2 = new Equipo("Avila");
		Equipo e3 = new Equipo("Burgos");
		Equipo e4 = new Equipo("Leon");
		
		Jugador j1 = new Jugador("Manuel",33,e1);
		Jugador j2 = new Jugador("Pablo C",30,e1);
		Jugador j3 = new Jugador("Pablo G",12,e1);
		Jugador j4 = new Jugador("Diego",17,e1);
		Jugador j5 = new Jugador("Alberto",6,e1);
		
		Partido p1 = new Partido(e3,e4,0,2);
		Partido p2 = new Partido(e1,e2,3,2);
		Partido p3 = new Partido(e2,e3,1,2);
		Partido p4 = new Partido(e4,e1,2,1);
		Partido p5 = new Partido(e1,e3,5,2);
		Partido p6 = new Partido(e4,e1,5,7);
		
		
		Liga l1 = new Liga();
		
		l1.addPartido(p1);
		l1.addPartido(p2);
		l1.addPartido(p3);
		l1.addPartido(p4);
		l1.addPartido(p5);
		l1.addPartido(p6);
		
		l1.setPartidosGanados(e1);
		l1.setPartidosGanados(e2);
		l1.setPartidosGanados(e3);
		l1.setPartidosGanados(e4);
		
		ArrayList<Jugador> listaJugadores = new ArrayList<>();
		listaJugadores.add(j1);
		listaJugadores.add(j2);
		listaJugadores.add(j3);
		listaJugadores.add(j4);
		listaJugadores.add(j5);
		
		ArrayList<Equipo> listaEquipos = new ArrayList<>();
		
		listaEquipos.add(e1);
		listaEquipos.add(e2);
		listaEquipos.add(e3);
		listaEquipos.add(e4);
		
		e1.setPlantilla(listaJugadores);
		l1.setClasificacionEquipos(listaEquipos);
		
		System.out.println("***CLASIFICACIÓN PICHICHI***");
		System.out.println(e1.getPlantillaOrdenadaPorGoles());
		System.out.println("***PARTIDOS DE LA JORNADA***");
		System.out.println(l1.getListaPartidos());
		System.out.println("***CLASIFICACIÓN LIGA***");
		System.out.println(l1.getClasificacion());
		

	}

}
