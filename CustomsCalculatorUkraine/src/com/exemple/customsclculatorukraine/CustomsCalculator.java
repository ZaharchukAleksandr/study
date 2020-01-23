package com.exemple.customsclculatorukraine;

import java.util.Scanner;

import javax.swing.JFrame;

public class CustomsCalculator extends JFrame{
	
	public static int engineCapacity;
	public static int carPrice;
	public static int productionYear;
	
	final double kourse = 24.2527; 
	final int year = 2020;
	final int tax = 10;
	final int vat = 20;
	


	public static void main(String[] args) {
		
		SimpleGui gui = new SimpleGui();
		gui.setVisible(true);
		
		
		System.out.println("¬ведите обьем двигател€ автомобил€...");
		Scanner scCapacity = new Scanner(System.in);
		engineCapacity = scCapacity.nextInt();
		
		System.out.println("¬ведите цену автомобил€...");
		Scanner scPrice = new Scanner(System.in);
		carPrice = scPrice.nextInt();
		
		System.out.println("¬ведите год производства автомобил€...");
		Scanner scYear = new Scanner(System.in);
		productionYear = scYear.nextInt();
		
		Benzin CalculationFormila = new Benzin();
		
		
		CalculationFormila.exciseTax();
		CalculationFormila.castomsTax();
		CalculationFormila.vatTax();
		CalculationFormila.allCustomsTax();
		
		
		
		CalculationFormila.ptintOut();

		
	}

	
	

}
