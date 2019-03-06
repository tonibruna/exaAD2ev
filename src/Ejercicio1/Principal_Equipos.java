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
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
import org.neodatis.odb.impl.core.query.values.GroupByValuesQueryResultAction;
import org.neodatis.odb.impl.core.query.values.ValuesCriteriaQuery;

import P02_NeoDatis.AD_1_Ventas;

public class Principal_Equipos {
	static ODB odb;
	public static void main(String[] args) {
		
		odb = ODBFactory.open("C:\\Users\\ifc\\eclipse-workspace\\Examen_2ev_AD\\src\\Ejercicio1\\Data\\ad_1_articulos.dat");
		
		//-----CONSULTAS-------
		equipoMasAntiguo();
		//equipoMenosEnPrimera();
		
		//---------------------
		odb.close();
	}

	public static void equipoMasAntiguo() {
		
		Objects<Equipo> eq = odb.getObjects(Equipo.class);
		
		System.out.println("Equipo mas antigüo que ha ganado una liga:");
		
		System.out.println();
		
		

		System.out.println("\n---------------------------------------------------------------------------------------\n");
	}
}
