
package com.iia.shop.entity;
import java.io.Console;
import java.util.ArrayList;

import com.iia.shop.entity.Car;




public class Store {
	public static void main(String[] args){
		Car c1 = new Car("Peugeot", 2004, "206", "Red", 1599.99, 210);
		Car c2= new Car("Renault", 1996, "Super 5", "White", 899.99, 180);
		
		int programme = 1;
		
		
		String make;
		int year;
		String model;
		String color;
		Double prix;
		int speed;
		
		
		Console console = System.console();
		
		ArrayList<Car> Carlist = new ArrayList<Car>();
		
		Carlist.add(c1);
		Carlist.add(c2);
		while (programme != -1 && programme < 7) {
			
			
			int n ;

			System.out.println("\n1. Afficher la liste de toutes les voitures");
			System.out.println("2. Afficher les infos d'une voiture");
			System.out.println("3. Ajouter");
			System.out.println("4. Modifier");
			System.out.println("5. Supprimer");
			
			n = Integer.parseInt(console.readLine(" Entrer une valeur : "));
			
			switch (n) {
			case 1:
				System.out.println("Liste des voitures : \n");
				int nb = 1 ;
				for (Car car : Carlist){ 
					System.out.print("\n" + nb + "-" + car.getMake()+ " " + car.getModel() + "\n");
					nb++;
				}
				break;
				
			case 2:
				System.out.println("Liste des voitures : \n");
				int voit = 1 ;
				voit = Integer.parseInt(console.readLine(" Entrer une valeur : "));
				int place = voit - 1;
					Car c = Carlist.get(place);
					System.out.print("\n" + voit + "-" + "\n"+ "Marque : " + c.getMake()+ "\n"+ "Modele : " + c.getModel()+ "\n"+ "Annee : "+ c.getYear() + "\n"+ "Couleur : "+ c.getColor() + "\n"+ "Prix : "+ c.getPrix() + "\n"+ "Vitesse : "+ c.getSpeed() + "\n");
					
				break;
			case 3:
				
				System.out.println("Ajout : \n");
				make = console.readLine(" Entrer une Marque : ");
				year = Integer.parseInt(console.readLine(" Entrer une Annee : "));
				model = console.readLine(" Entrer un Modele : ");
				color = console.readLine(" Entrer une Couleur : ");
				prix = Double.parseDouble(console.readLine(" Entrer un prix : "));
				speed = Integer.parseInt(console.readLine(" Entrer une vitesse max : "));
				
				Car car = new Car(make, year, model, color, prix, speed);
				Carlist.add(car);
				
				break;
			case 4:
				
				
				System.out.println("Modification : \n");
				int change ;
				int chiffre ;
				chiffre = Integer.parseInt(console.readLine(" Indiquer le chiffre de la voiture à modifier : "));
				change = chiffre - 1 ;
				for (int i = 0; i < Carlist.size(); i++) {
					Carlist.remove(change);
					
					make = console.readLine(" Entrer une Marque : ");
					year = Integer.parseInt(console.readLine(" Entrer une Annee : "));
					model = console.readLine(" Entrer un Modele : ");
					color = console.readLine(" Entrer une Couleur : ");
					prix = Double.parseDouble(console.readLine(" Entrer un prix : "));
					speed = Integer.parseInt(console.readLine(" Entrer une vitesse max : "));
					
					Car changedcar = new Car(make, year, model, color, prix, speed);
					Carlist.add(change, changedcar);
					
					i = Carlist.size();
					
				}
				
				break;
			case 5:
				System.out.println("Suppression : \n");
				for (int i = 0; i < Carlist.size(); i++) {
					int delete ;
					delete = Integer.parseInt(console.readLine(" Indiquer le chiffre de la voiture à supprimer : "));
					Carlist.remove(delete - 1);
				}
				break;
			default:
				System.out.println("Vous avez quitté l'application");
				break;
			}
			
		System.out.println(" \n Voulez vous continuer d'utiliser la liste ? 0 = oui / -1 = non \n");
		programme = Integer.parseInt(console.readLine(" Entrer une valeur : "));
	}
	}
}
