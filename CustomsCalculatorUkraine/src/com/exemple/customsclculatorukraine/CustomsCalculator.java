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
		
		
		System.out.println("������� ����� ��������� ����������...");
		Scanner scCapacity = new Scanner(System.in);
		engineCapacity = scCapacity.nextInt();
		
		System.out.println("������� ���� ����������...");
		Scanner scPrice = new Scanner(System.in);
		carPrice = scPrice.nextInt();
		
		System.out.println("������� ��� ������������ ����������...");
		Scanner scYear = new Scanner(System.in);
		productionYear = scYear.nextInt();
		
		
		System.out.println("�����:");
		System.out.println("������� ������ " + 55 + " * " + "����� ��������� " + engineCapacity + " ������ ��� " + (year - (productionYear+1)));
		System.out.println(exciseTax * kourse);
		System.out.println("����� ��������:");
		System.out.println("����� " + (exciseTax * kourse) + " ������� " + (castomsTax * kourse) + " ��� " + (vatTax * kourse));
		System.out.println(allCustomsTax * kourse);
		
		
	}
	
	private void getExciseTax() {
		return  getExciseTax;
		
	}

	public static void main(String[] args) {
		
		

		
	}

	
	

}
