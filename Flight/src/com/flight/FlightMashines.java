package com.flight;

import com.flightGeneral.Helicopter;


public class FlightMashines {
	
		public static void main(String[] args) 
		{
			
		}

			Bomber BomberAngar = new Bomber();
			System.out.println("���������� �������: " + BomberAngar.Chassis);
			
			CombatAircraft CombatAngar = new CombatAircraft();
			System.out.println("���������� �������: " + CombatAngar.Rockets);
			
			CommercialAircraft CommmercialAngar = new CommercialAircraft();
			System.out.println("���������� �������: " + CommmercialAngar.Seats);
			
			GeneralAircraft GeneralAngar= new GeneralAircraft();
			System.out.println("���������� �������: " + GeneralAngar.Engien);
			
			GliderPlane Field = new GliderPlane();
			System.out.println("���������� �������: " + Field.hook);
			
			Helicopter HelicopterAngar = new Helicopter();
			System.out.println("���������� �������: " + HelicopterAngar.TopPropeller + HelicopterAngar.FrontPropeller);
			
			
		}

	}



