package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import driverMySQL.MySQLConnection;
import interfaz_daos.EquipoDao;
import modelos.Equipo;


public class EquipoDaoMySQLImp implements EquipoDao {

	@Override
	public boolean create(Equipo equipo) {
		
	boolean created = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO equipoes values ("+equipo.getNombre()+",'"+equipo.getCiudad()+"','"+equipo.getConferencia()+"','"+equipo.getDivision()+"')";
		
		try {			
			con=MySQLConnection.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			created=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase equipoDaoMySQLImp, método create");
			e.printStackTrace();
		}
		return created;
	}

	@Override
	public List<Equipo> read() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM equipoes ORDER BY codigo";
		
		List<Equipo> listaequipoes= new ArrayList<Equipo>();
		
		try {			
			co= MySQLConnection.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				
				Equipo e = new Equipo();
				e.setNombre(rs.getString(1));
				e.setCiudad(rs.getString(2));
				e.setConferencia(rs.getString(3));
				e.setDivision(rs.getString(4));
				listaequipoes.add(e);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase EquipoDaoMySQLImp, método read");
			e.printStackTrace();
		}
		
		return listaequipoes;
	}

	@Override
	public boolean update(Equipo equipo) {
		
		Connection connect= null;
		Statement stm= null;
		
		boolean updated=false;
		
		String sql="UPDATE equipoes SET nombre='"+equipo.getNombre()+;
		
		try {
			connect=MySQLConnection.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			updated=true;
		} catch (SQLException e) {
			System.out.println("Error: equipoDaoMySQLImp, método actualizar");
			e.printStackTrace();
		}		
		return updated;
	}

	@Override
	public boolean delete(Equipo equipo) {
		Connection con = null;
		Statement stm = null;
		
		boolean removed = false;
		String sql = "DELETE FROM equipoes WHERE codigo = "+equipo.getCodigo();
		
		try {
			con = MySQLConnection.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			removed = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase equipoDaoMySQLImp, método delete");
			e.printStackTrace();
		}
		
		
		return removed;
	}

}
