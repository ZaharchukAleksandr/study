package com.exemple.customsclculatorukraine;


public class Benzin extends CustomsCalculator{
	
	public double exciseTax;
	public double allCustomsTax;
	public double castomsTax;
	public double vatTax;
	
		public void exciseTax() {
			if ( engineCapacity<2001) {
				exciseTax = (double) 50 * ((double) (engineCapacity/1000)) * (year - productionYear + 1);
			}
			else {
				exciseTax = (double) 100 * ((double) (engineCapacity/1000)) * (year - engineCapacity + 1);
			}
		}
		
		public void castomsTax() {
			castomsTax = (double) (carPrice * tax) / 100;
		}
		
		public void vatTax() {
			vatTax = (double)  ((carPrice + castomsTax + exciseTax)*vat)/100;		
		}
		
		public void allCustomsTax() {
			allCustomsTax = (double) exciseTax + castomsTax + vatTax;
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
