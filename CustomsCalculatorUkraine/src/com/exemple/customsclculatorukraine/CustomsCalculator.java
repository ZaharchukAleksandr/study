package com.exemple.customsclculatorukraine;

import java.util.Scanner;

public class CustomsCalculator {

	
	public static int engineCapacity;
	public static int carPrice;
	public static int productionYear;
	
	public static double kourse = 24.2527; 
	public static int year = 2020;
	public int tax = 10;
	public int vat = 20;
	public static void main(String[] args) {
	
		Benzin CalculationFormila = new Benzin();
		double raschet = CalculationFormila.allCustomsTax();
		
		
		
		
		
		
		
		
		
		System.out.println("Акциз:");
		System.out.println("Базовая ставка " + 55 + " * " + "обьем двигателя " + engineCapacity + " полных лет " + (year - (productionYear+1)));
		System.out.println(CalculationFormila.exciseTax * kourse);
		System.out.println("Итого платежей:");
		System.out.println("Акциз " + (CalculationFormila.exciseTax * kourse) + " Пошлина " + (CalculationFormila.castomsTax * kourse) + " НДС " + (CalculationFormila.vatTax * kourse));
		System.out.println(CalculationFormila.allCustomsTax * kourse);
		
	}
	
}
