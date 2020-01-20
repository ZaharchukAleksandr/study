package com.exemple.customsclculatorukraine;


public class Benzin extends CustomsCalculator{
	
	public double exciseTax;
	public double allCustomsTax;
	public double castomsTax;
	public double vatTax;
	
		public double exciseTax() {
			if ( engineCapacity<2000) {
				exciseTax = (double) 50 * (double) (engineCapacity/1000) * (year - engineCapacity + 1);
			}
			else {
				exciseTax = (double) 100 * (double) (engineCapacity/1000) * (year - engineCapacity + 1);
			}
			return exciseTax;
		}
		public double castomsTax() {
			castomsTax = (double) (carPrice * tax) / 100;
			return castomsTax;
		}
		public double vatTax() {
			vatTax = (double)  ((carPrice + castomsTax + exciseTax)*vat)/100;		
			return vatTax;
		}
		public double allCustomsTax() {
			allCustomsTax = (double) exciseTax + castomsTax + vatTax;
			return allCustomsTax;
		}
	
}
