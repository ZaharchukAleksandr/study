package com.flight;

import com.flightGeneral.Helicopter;


public class FlightMashines {
	
		public static void main(String[] args) 
		{
			
		}

			Bomber BomberAngar = new Bomber();
			System.out.println("Количество деталей: " + BomberAngar.Chassis);
			
			CombatAircraft CombatAngar = new CombatAircraft();
			System.out.println("Количество деталей: " + CombatAngar.Rockets);
			
			CommercialAircraft CommmercialAngar = new CommercialAircraft();
			System.out.println("Количество деталей: " + CommmercialAngar.Seats);
			
			GeneralAircraft GeneralAngar= new GeneralAircraft();
			System.out.println("Количество деталей: " + GeneralAngar.Engien);
			
			GliderPlane Field = new GliderPlane();
			System.out.println("Количество деталей: " + Field.hook);
			
			Helicopter HelicopterAngar = new Helicopter();
			System.out.println("Количество деталей: " + HelicopterAngar.TopPropeller + HelicopterAngar.FrontPropeller);
			
			
		}

	}



