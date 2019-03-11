package Ejercicio3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;


public class ChampionsDaoMySQLImp implements ChampionsDao {

	@Override
	public boolean create(Champions champions) {
		
	boolean created = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO Champions(nombre, fundacion, campeonatos, subcampeonatos, ult_camp, ult_sub) values "
				+ "('"+champions.getNombre()+"',"+champions.getFundacion()
			+","+champions.getCampeonatos()+","+champions.getSubcampeonatos()+","
			+champions.getUltimoTri()+","+champions.getUltimoSub()+");";
		
		try {			
			con=MySQLConnection.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			created=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ChampionsDaoMySQLImp, método create");
			e.printStackTrace();
		}
		return created;
	}

	@Override
	public List<Champions> read() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM Champions ORDER BY campeonatos ASC";
		
		List<Champions> listaJugadores= new ArrayList<Champions>();
		
		try {			
			co= MySQLConnection.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				
				Champions c = new Champions();
				c.setNombre(rs.getString(2));
				c.setFundacion(rs.getInt(3));
				c.setCampeonatos(rs.getInt(4));
				c.setSubcampeonatos(rs.getInt(5));
				c.setUltimoTri(rs.getInt(6));
				c.setUltimoSub(rs.getInt(7));
				listaJugadores.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ChampionsDaoMySQLImp, método read");
			e.printStackTrace();
		}
		
		return listaJugadores;
	}

	@Override
	public boolean update(Champions champions) {
		
		Connection connect= null;
		Statement stm= null;
		
		boolean updated=false;
		
		String sql="UPDATE Champions SET nombre='"+champions.getNombre()+"', fundacion='"
		+champions.getFundacion()+"', temp_primera='"+champions.getCampeonatos()
		+"', ligas=" + champions.getSubcampeonatos()+", copas='" 
				+ champions.getUltimoTri()+"' WHERE codigo="
				+champions.getUltimoSub();
		
		try {
			connect=MySQLConnection.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			updated=true;
		} catch (SQLException e) {
			System.out.println("Error: JugadorDaoMySQLImp, método actualizar");
			e.printStackTrace();
		}		
		return updated;
	}

	@Override
	public boolean delete(Champions champions) {
		Connection con = null;
		Statement stm = null;
		
		boolean removed = false;
		String sql = "DELETE FROM Champions WHERE nombre = "+champions.getNombre();
		
		try {
			con = MySQLConnection.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			removed = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ChampionsDaoMySQLImp, método delete");
			e.printStackTrace();
		}
		
		
		return removed;
	}

}
