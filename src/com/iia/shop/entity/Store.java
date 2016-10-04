
package com.iia.shop.entity;
import java.io.Console;
import java.util.ArrayList;

import com.iia.shop.entity.Car;




public class Store {
	public static void main(String[] args){
		Car c1 = new Car("Peugeot", 2004, "206", "Red", 1599.99, 210);
		Car c2= new Car("Renault", 1996, "Super 5", "White", 899.99, 180);
		
		int programme = 1;
		Console console = System.console();
		
		ArrayList<Car> Carlist = new ArrayList<Car>();
		
		Carlist.add(c1);
		Carlist.add(c2);
		while (programme != -1 && programme < 7) {
			
			
			int n ;

			System.out.println("1. Afficher la liste");
			System.out.println("2. Modifier");
			System.out.println("3. Supprimer");
			
			n = Integer.parseInt(console.readLine(" Entrer une valeur : "));
			
			switch (n) {
			case 1:
				System.out.println("Liste des voiture");
				
				for (Car o : Carlist){ 
					System.out.print("\n" + o.getMake()+ " " + o.getModel() + "\n");
					}
				break;
			case 2:
				System.out.println("Ajout");
				break;
			case 3:
				System.out.println("Modification");
				break;
			case 4:
				System.out.println("Suppression");
				break;
			default:
				System.out.println("Vous avez quitté l'application");
				break;
			}
			
		System.out.println("Voulez vous continuer d'utiliser la liste ? 0 = oui / -1 = non");
		programme = Integer.parseInt(console.readLine(" Entrer une valeur : "));
	}
	}
}
