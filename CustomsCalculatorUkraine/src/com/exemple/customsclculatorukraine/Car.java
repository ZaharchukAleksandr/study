package com.exemple.customsclculatorukraine;

public abstract class Car {
	
	private int engineCapacity = 0;
	private int carPrice = 0;
	private int productionYear = 0;
	
	public Car(int engineCapacity, int carPrice, int productionYear) {
		
		this.setEngineCapacity(engineCapacity);
		this.setCarPrice(carPrice);
		this.setEngineCapacity(productionYear);
	}
	
	public Car(int carPrice, int productionYear) {
		this.setCarPrice(carPrice);
		this.setProductionYear(productionYear);
		
	}
	
	 abstract void exciseTax(); // Акциз от обьема двигателя и года выпуска
	 abstract void dutyTax(); //Пощлина от стоимости
	 abstract void vatTax(); // НДС
	 abstract void allTax(); // Все налоги

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	
}
