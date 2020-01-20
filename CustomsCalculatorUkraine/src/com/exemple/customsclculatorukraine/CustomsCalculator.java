package com.exemple.customsclculatorukraine;

import java.security.PublicKey;
import java.util.Scanner;

public class CustomsCalculator {

	
	public int engineCapacity;
	public int carPrice;
	public int productionYear;
	
	public double kourse = 24.2527; 
	public int year = 2020;
	public int tax = 10;
	public int vat = 20;
	
	
	public void clac() {


		
		Benzin CalculationFormila = new Benzin();
		double raschet = CalculationFormila.allCustomsTax();
		
		
		System.out.println("Введите обьем двигателя автомобиля...");
		Scanner scCapacity = new Scanner(System.in);
		engineCapacity = scCapacity.nextInt();
		
		System.out.println("Введите цену автомобиля...");
		Scanner scPrice = new Scanner(System.in);
		carPrice = scPrice.nextInt();
		
		System.out.println("Введите год производства автомобиля...");
		Scanner scYear = new Scanner(System.in);
		productionYear = scYear.nextInt();
		
		
		System.out.println("Акциз:");
		System.out.println("Базовая ставка " + 55 + " * " + "обьем двигателя " + engineCapacity + " полных лет " + (year - (productionYear+1)));
		System.out.println(exciseTax * kourse);
		System.out.println("Итого платежей:");
		System.out.println("Акциз " + (exciseTax * kourse) + " Пошлина " + (castomsTax * kourse) + " НДС " + (vatTax * kourse));
		System.out.println(allCustomsTax * kourse);
		
		
	}
	
	private void getExciseTax() {
		return  getExciseTax;
		
	}

	public static void main(String[] args) {
		
		

		
	}

	
	

}
