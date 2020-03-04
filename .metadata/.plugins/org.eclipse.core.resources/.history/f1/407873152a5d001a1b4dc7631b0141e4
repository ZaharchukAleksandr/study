package com.exemple.customsclculatorukraine;

import java.util.Scanner;

public class Benzin extends CustomsCalculator{
	
	public double exciseTax;
	public double allCustomsTax;
	public double castomsTax;
	public static double vatTax;
	

		void exciseTaxInput() {
			System.out.println("Введите обьем двигателя автомобиля...");
			Scanner scCapacity = new Scanner(System.in);
			
			engineCapacity = scCapacity.nextInt();
			engineCapacity = Integer.parseInt(SimpleGui.capacityFld.getText());
			
			if ( engineCapacity<2000) {
				exciseTax = (double) 50 * (double) (engineCapacity/1000) * (year - engineCapacity + 1);
			}
		}
		public void exciseTax() {
			if ( engineCapacity<2001) {
				exciseTax = (double) 50 * ((double) (engineCapacity/1000)) * (year - productionYear + 1);

			}
			else {
				exciseTax = (double) 100 * ((double) (engineCapacity/1000)) * (year - engineCapacity + 1);
			}

			
		}
		void castomsTaxInput() {
			System.out.println("Введите цену автомобиля...");
			Scanner scPrice = new Scanner(System.in);
			carPrice = scPrice.nextInt();
			carPrice = Integer.parseInt(SimpleGui.priceFld.getText());
			
			castomsTax = (double) (carPrice * tax) / 100;
			
		}
		void vatTaxInput() {
			
			System.out.println("Введите год производства автомобиля...");
			Scanner scYear = new Scanner(System.in);
			productionYear = scYear.nextInt();
			
			
			vatTax = (double)  ((carPrice + castomsTax + exciseTax)*vat)/100;		
		
		}
		double allCustomsTax() {
			allCustomsTax = (double) exciseTax + castomsTax + vatTax;
			return allCustomsTax;
			

		}
		
		public void castomsTax() {
			castomsTax = (double) (carPrice * tax) / 100;
		}
		
		public void vatTax() {
			vatTax = (double)  ((carPrice + castomsTax + exciseTax)*vat)/100;		
		}
		
		
		
		
		public void ptintOut() {
			System.out.println("Акциз:");
			System.out.println("Базовая ставка " + 55 + " * " + "обьем двигателя " + (double)(engineCapacity/1000) + " полных лет " + (year - (productionYear+1)));
			System.out.println(exciseTax * kourse);
			System.out.println("Итого платежей:");
			System.out.println("Акциз " + (exciseTax * kourse) + " Пошлина " + (castomsTax * kourse) + " НДС " + (vatTax * kourse));
			System.out.println(allCustomsTax * kourse);
}
}
