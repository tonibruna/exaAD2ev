package Ejercicio1;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.neodatis.odb.ODB;

import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ObjectValues;
import org.neodatis.odb.Objects;
import org.neodatis.odb.Values;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.IValuesQuery;
import org.neodatis.odb.core.query.criteria.And;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
import org.neodatis.odb.impl.core.query.values.GroupByValuesQueryResultAction;
import org.neodatis.odb.impl.core.query.values.ValuesCriteriaQuery;


public class Principal_Champions {
	static ODB odb;
	public static void main(String[] args) {
		
		odb = ODBFactory.open("C:\\Users\\ifc\\eclipse-workspace\\Examen_2ev_Recup\\src\\Ejercicio1\\Data\\ad_1_articulos.dat");
		
		//-----CONSULTAS-------
		
		equipoMasAntiguoGanador();
		//equipoMenosTempsPrimera();
		
		//---------------------
		odb.close();
	}

	public static void equipoMasAntiguoGanador() {
		
		IQuery query = new CriteriaQuery(Champions.class,Where.gt("ultimoTri", 2001));
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
