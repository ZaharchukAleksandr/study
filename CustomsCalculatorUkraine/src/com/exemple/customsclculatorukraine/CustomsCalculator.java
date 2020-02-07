package com.exemple.customsclculatorukraine;

import java.util.Scanner;

import javax.swing.JFrame;

public class CustomsCalculator extends JFrame{
	
	public static int engineCapacity;
	public static int carPrice;
	public static int productionYear;
	
<<<<<<< HEAD
	public static double kourse = 24.2527; 
	public static int year = 2020;
	public int tax = 10;
	public int vat = 20;
	public static void main(String[] args) {
	
		Benzin CalculationFormila = new Benzin();
		double raschet = CalculationFormila.allCustomsTax();
=======
	final double kourse = 24.2527; 
	final int year = 2020;
	final int tax = 10;
	final int vat = 20;
	


	public static void main(String[] args) {
		
		SimpleGui gui = new SimpleGui();
		gui.setVisible(true);
>>>>>>> aa1e09ce26200f9a4ac0a319aef106ae7f886533
		
		
		
		
		
<<<<<<< HEAD
		
		
		
		
		System.out.println("Акциз:");
		System.out.println("Базовая ставка " + 55 + " * " + "обьем двигателя " + engineCapacity + " полных лет " + (year - (productionYear+1)));
		System.out.println(CalculationFormila.exciseTax * kourse);
		System.out.println("Итого платежей:");
		System.out.println("Акциз " + (CalculationFormila.exciseTax * kourse) + " Пошлина " + (CalculationFormila.castomsTax * kourse) + " НДС " + (CalculationFormila.vatTax * kourse));
		System.out.println(CalculationFormila.allCustomsTax * kourse);
=======
		Benzin CalculationFormila = new Benzin();
		
		
		CalculationFormila.exciseTax();
		CalculationFormila.castomsTax();
		CalculationFormila.vatTax();
		CalculationFormila.allCustomsTax();
		
		
		
		CalculationFormila.ptintOut();

>>>>>>> aa1e09ce26200f9a4ac0a319aef106ae7f886533
		
	}
	
}
