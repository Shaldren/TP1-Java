package com.iia.shop.entity;

public class Car {
	private String make;
	private int year;
	private String model;
	private String color;
	private Double prix;
	private int speed;
	
public Car() {
	super();
}


public Car(String make, int year, String model, String color,Double prix,int speed) {
	super();
	this.make = make;
	this.year = year;
	this.model = model;
	this.color = color;
	this.prix = prix;
	this.speed = speed;
	}

public String getMake(){
	return this.make;
}
public void setMake(String make){
	this.make = make;
}

public void reader(){
	System.out.println("Marque et Modele : " + getMake() + " " + getModel() + "\n" 
			+ "Annee : " + getYear() + "\n"
			+ "Couleur : " + getColor() + "\n"
			+ "Prix : " + getPrix() + "\n"
			+ "Vitesse : " + getSpeed());
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public Double getPrix() {
	return prix;
}

public void setPrix(Double prix) {
	this.prix = prix;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}


}
