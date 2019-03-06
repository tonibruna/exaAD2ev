package controllers;


import java.util.ArrayList;
import java.util.List;

import interfaz_daos.EquipoDao;
import daos.EquipoDaoMongoDBImp;
import modelos.Equipo;
import vistas.ViewEquipo;

public class ControllerEquipo {
	
	private ViewEquipo vista = new ViewEquipo();
	
	
	public ControllerEquipo() {
	}
	
	public void create(Equipo equipo) {
		EquipoDao dao = new EquipoDaoMySQLImp();
		//EquipoDao daoMongo = new EquipoDaoMongoDBImp();
		dao.create(equipo);
		//daoMongo.create(equipo);
	}
	
	public void update(Equipo equipo) {
		EquipoDao dao = new EquipoDaoMySQLImp();
		dao.update(equipo);
	}
	
	public void remove(Equipo equipo) {
		EquipoDao dao = new EquipoDaoMySQLImp();
		dao.delete(equipo);
	}
	
	public void viewEquipos() {
		
		//MySQL
		List<Equipo> equipos = new ArrayList<Equipo>();
		EquipoDao dao = new EquipoDaoMySQLImp();
		
		
		equipos = dao.read();
		vista.viewTodosEquipos(equipos);
		
		
		///Mongo
		/*JugadorDao daoMongo = new JugadorDaoMongoDBImp();
		List<Jugador> jugadoresMongo = new ArrayList<Jugador>();
		jugadoresMongo = daoMongo.read();
		vista.viewTodosJugadores(jugadoresMongo);*/
		
		
	}
	
	public void viewEquipo(Equipo equipo) {
		vista.viewEquipo(equipo);
	}
}
