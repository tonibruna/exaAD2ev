package Ejercicio1;

import java.io.File;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.And;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import Ejercicio1.Champions;

public class CrearBD_Champions {
	
	static ODB odb;
	
	public static void main(String[] args) {

		File fichero = new File("C:\\Users\\ifc\\eclipse-workspace\\Examen_2ev_Recup\\src\\Ejercicio1\\Data\\ad_1_articulos.dat");
		if (fichero.delete())
			
			   System.out.println("BD Borrada");
		
		// creación de registros en la BD
		 odb = ODBFactory.open("C:\\Users\\ifc\\eclipse-workspace\\Examen_2ev_Recup\\src\\Ejercicio1\\Data\\ad_1_articulos.dat"); 
		  
		  //Creo los equipos de Champions
		  
		  Champions eq1 = new Champions("Real Madrid",1902,13,3,2018,1981);
		  Champions eq2 = new Champions("AC Milano",1899 ,7,4,2007,2005);
		  Champions eq3 = new Champions("Bayern Munchen", 1900,5,5,2013,2012);
		  Champions eq4 = new Champions("FC Barcelona", 1899,5,3,2015,1994);
		  Champions eq5 = new Champions("Liverpool FC", 1892,5,3,2005,2018);
		  Champions eq6 = new Champions("Ajax FC", 1900,4,2,1995,1996);
		  Champions eq7 = new Champions("Manchester United",1878,3,2,2008,2011);
		  Champions eq8 = new Champions ("Juventus FC",1897,2,7,1996,2017);
		  Champions eq9 = new Champions ("SL Benfica",1904,2,5,1962,1990);
		  Champions eq10 = new Champions ("Inter de Milan",1908,3,2,2010,1972);
		
		  
		  // Almacenamos los equipos de Champions 
		  odb.store(eq1); 
		  odb.store(eq2);
		  odb.store(eq3);
		  odb.store(eq4);
		  odb.store(eq5);
		  odb.store(eq6); 
		  odb.store(eq7);
		  odb.store(eq8);
		  odb.store(eq9);
		  odb.store(eq10);
		  
		  equipoMasAntiguoGanador();
		  
		  odb.close();
          System.out.println("BASE DE DATOS CREADA");
          
    }
	
	public static void equipoMasAntiguoGanador() {
		
		IQuery query = new CriteriaQuery(Champions.class,Where.lt("ultimoTri", 2001));
		query.orderByAsc("fundacion");
		
		Objects<Champions> objects = odb.getObjects(query);
		
		while(objects.hasNext()){
			Champions equipo = objects.next();
		     
			System.out.println("---------------------------------------------");
			System.out.println("Equipo mas antiguo que ha ganado alguna champions en SXXI:");
		    System.out.println("Nombre equipo: "+equipo.getNombre()
		    	+ " | Año fundado: " + equipo.getFundacion() + " | Numero Champions: " + equipo.getCampeonatos()
		    	+ " | Subcampeonatos: " + equipo.getSubcampeonatos());
		    System.out.println("---------------------------------------------");
		   break;
		}
	}
	
}
