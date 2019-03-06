package Ejercicio1;

import java.io.File;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

import Ejercicio1.Equipo;

public class CrearBD_Equipos {
	
	public static void main(String[] args) {

		File fichero = new File("C:\\Users\\ifc\\eclipse-workspace\\Examen_2ev_AD\\src\\Ejercicio1\\Data\\ad_1_articulos.dat");
		if (fichero.delete())
			   System.out.println("BD Borrada");
		// creación de registros en la BD
		  ODB odb = ODBFactory.open("C:\\Users\\ifc\\eclipse-workspace\\Examen_2ev_AD\\src\\Ejercicio1\\Data\\ad_1_articulos.dat"); 
		  
		  //Creo los equipos
		  
		  Equipo eq1 = new Equipo ("Recreativo", 0, 0, 1889, 5);
		  Equipo eq2 = new Equipo ("Athletic", 8, 23, 1898, 83);
		  Equipo eq3 = new Equipo ("Barcelona", 22, 26, 1899, 83);
		  Equipo eq4 = new Equipo ("Espanyol", 0, 4, 1900, 79);
		  Equipo eq5 = new Equipo ("Madrid", 32, 18, 1902, 83);
		  
		  // Almacenamos los equipos 
		  odb.store(eq1); 
		  odb.store(eq2);
		  odb.store(eq3);
		  odb.store(eq4);
		  odb.store(eq5);
		  
		  odb.close();
          System.out.println("BASE DE DATOS CREADA");

    }
}
