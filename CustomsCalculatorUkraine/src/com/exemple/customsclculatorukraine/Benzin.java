package com.exemple.customsclculatorukraine;

import java.util.Scanner;

public class Benzin extends CustomsCalculator{
	
	public double exciseTax;
	public double allCustomsTax;
	public double castomsTax;
	public double vatTax;
	

		void exciseTaxInput() {
			System.out.println("������� ����� ��������� ����������...");
			Scanner scCapacity = new Scanner(System.in);
			engineCapacity = scCapacity.nextInt();
			
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
			System.out.println("������� ���� ����������...");
			Scanner scPrice = new Scanner(System.in);
			carPrice = scPrice.nextInt();
			
			castomsTax = (double) (carPrice * tax) / 100;
			
		}
		void vatTaxInput() {
			
			System.out.println("������� ��� ������������ ����������...");
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
			System.out.println("�����:");
			System.out.println("������� ������ " + 55 + " * " + "����� ��������� " + (double)(engineCapacity/1000) + " ������ ��� " + (year - (productionYear+1)));
			System.out.println(exciseTax * kourse);
			System.out.println("����� ��������:");
			System.out.println("����� " + (exciseTax * kourse) + " ������� " + (castomsTax * kourse) + " ��� " + (vatTax * kourse));
			System.out.println(allCustomsTax * kourse);
}
}
