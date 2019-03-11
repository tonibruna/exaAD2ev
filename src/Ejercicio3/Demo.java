package Ejercicio3;

import Ejercicio3.ControlerChampions;

public class Demo {
	
	static ControlerChampions controllerChampions;

	public static void main(String[] args) {
		
		ControlerChampions controllerChampions = new ControlerChampions();
		
		controllerChampions.viewChampions();

		
		controllerChampions.create(new Champions("Atletico de Madrid", 1903, 0, 3, 0, 2016));
		
		controllerChampions.viewChampions();
		
	}
	
}