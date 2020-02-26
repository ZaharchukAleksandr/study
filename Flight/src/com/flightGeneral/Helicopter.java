package com.flightGeneral;

import com.flight.Aircraft;
import com.other.Service;

 public class Helicopter extends Aircraft implements Service {

	public Helicopter(String manufacturer, String boardNumber) {
		super(manufacturer, boardNumber);
		// TODO Auto-generated constructor stub
	}
//	public int TopPropeller = 1;
//	public int FrontPropeller=1;

	@Override
	public void Service() {
		// TODO Auto-generated method stub
		
	}

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
	