package Ejercicio3;


import java.util.ArrayList;
import java.util.List;

public class ControlerChampions {
	
	private ViewChampions vista = new ViewChampions();
	
	
	public ControlerChampions() {
	}
	
	public void create(Champions champions) {
		ChampionsDao dao = new ChampionsDaoMySQLImp();
		dao.create(champions);
	}
	
	public void update(Champions champions) {
		ChampionsDao dao = new ChampionsDaoMySQLImp();
		dao.update(champions);
	}
	
	public void remove(Champions champions) {
		ChampionsDao dao = new ChampionsDaoMySQLImp();
		dao.delete(champions);
	}
	
	public void viewChampions() {
	
		
		ChampionsDao dao = new ChampionsDaoMySQLImp();
		List<Champions> champions = new ArrayList<Champions>();

		champions = dao.read();
		 vista.viewTodosChampions(champions);
	}
	
	/*public void viewChampionss(Champions champions) {
		vista.viewChampions(champions);
	}*/
	
	public static void actualizarChampions(Champions champions) {
		
	}
}

