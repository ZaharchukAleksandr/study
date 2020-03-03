package com.flight;

public class Bomber extends Aircraft
{
	public static final String Chassis = null;
	public Bomber(String manufacturer, String boardNumber, int weight) {
		super(manufacturer, boardNumber, weight);
		
	}
	int Bombs =20; 
	int Engien =4;
	@Override
	void sendReport() {
		// TODO Auto-generated method stub
		
	}
	@Override
	int totalWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}