package Ejercicio3;

import java.util.List;

public interface ChampionsDao {
	
	public boolean create(Champions champions);
	public List<Champions>read();
	public boolean update(Champions champions);
	public boolean delete(Champions champions);
	
}