package main;

import controllers.ControllerEquipo;
import modelos.Equipo;

public class Demo {

	public static void main(String[] args) {
		
		
		//Jugadores
		//ControllerJugador controller = new ControllerJugador();
		/*
		Jugador j = new Jugador(0, "fulanito", "Raptors", "Tarazona", "6-2", "C", 195);
	
		
		
		
		controller.create(j);
		
		controller.viewJugadores();

		
		j.setAltura("7-2");
		j.setNombre_equipo("Lakers");
		controller.update(j);
		
		controller.viewJugador(j);
		
		controller.remove(j);
		*/
		//controller.viewJugadores();

		//Equipos
		ControllerEquipo controller = new ControllerEquipo();
		
		Equipo e = new Equipo("Real Zaragoza", 0, 6, 59, 1932);
		
		controller.create(e);
		
		
		controller.viewEquipos();
		
	}
}