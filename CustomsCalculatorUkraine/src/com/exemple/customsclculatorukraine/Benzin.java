package com.exemple.customsclculatorukraine;

import java.util.Scanner;

public class Benzin extends CustomsCalculator{
	
	public double exciseTax;
	public double allCustomsTax;
	public double castomsTax;
	public double vatTax;
	
		void exciseTax() {
			System.out.println("������� ����� ��������� ����������...");
			Scanner scCapacity = new Scanner(System.in);
			engineCapacity = scCapacity.nextInt();
			
			if ( engineCapacity<2000) {
				exciseTax = (double) 50 * (double) (engineCapacity/1000) * (year - engineCapacity + 1);
			}
			else {
				exciseTax = (double) 100 * (double) (engineCapacity/1000) * (year - engineCapacity + 1);
			}
			
		}
		void castomsTax() {
			System.out.println("������� ���� ����������...");
			Scanner scPrice = new Scanner(System.in);
			carPrice = scPrice.nextInt();
			
			castomsTax = (double) (carPrice * tax) / 100;
			
		}
		void vatTax() {
			
			System.out.println("������� ��� ������������ ����������...");
			Scanner scYear = new Scanner(System.in);
			productionYear = scYear.nextInt();
			
			vatTax = (double)  ((carPrice + castomsTax + exciseTax)*vat)/100;		
		
		}
		double allCustomsTax() {
			allCustomsTax = (double) exciseTax + castomsTax + vatTax;
			return allCustomsTax;
			
		}
	
}
