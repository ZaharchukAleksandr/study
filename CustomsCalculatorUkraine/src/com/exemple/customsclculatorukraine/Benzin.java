package com.exemple.customsclculatorukraine;



public class Benzin extends Car{

	public Benzin(int engineCapacity, int carPrice, int productionYear) {
		super(engineCapacity, carPrice, productionYear);
		
	}
	
	
	// ������ ������
	@Override
	void exciseTax() {
		// ���� ����� ��������� ������ 2� ������
		if ( getEngineCapacity()<2001) {
			CustomsCalculator.exciseTax =  50 * (getEngineCapacity()/1000) * (CustomsCalculator.year - getProductionYear() + 1);

		// ���� ����� ��������� ������ 2� ������
		}
		else { 
			CustomsCalculator.exciseTax = 100 * (getEngineCapacity()/1000) * (CustomsCalculator.year - getEngineCapacity() + 1);
		}
		
	}
	// ������ ������� ������� 
	@Override
	void dutyTax() {
		CustomsCalculator.castomsTax = (getCarPrice() * 100) / CustomsCalculator.tax;
		
	}
	// ������ ���
	@Override
	void vatTax() {
		CustomsCalculator.vatTax = ((CustomsCalculator.castomsTax + CustomsCalculator.exciseTax) / 100)*CustomsCalculator.vat ;
		
		
	}
	// ����� ���� �������
	@Override
	void allTax() {
		CustomsCalculator.allTax = CustomsCalculator.exciseTax + CustomsCalculator.castomsTax + CustomsCalculator.vatTax;
		
		
		
	}


	
	
	 
}
