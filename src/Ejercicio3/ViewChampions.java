package Ejercicio3;


import java.util.List;

public class ViewChampions {
	
	public void viewChampions(List<Champions> champions) {
		System.out.println("Datos de Champions: " +champions);
	}
	
	public void viewTodosChampions(List<Champions> champions) {
		for (Champions champions1: champions) {
			System.out.println("Datos del Champions: "+ champions1);
		}
	}
}