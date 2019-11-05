package com.flight;

public class FlightMashines {
	public static void main(String[] args) 
	{
		
	}	
	
	
	class Aircraft
	{
		int Wing =2; int Chassis =3; int Engine =1;
	}
	
	class CombatAircraft extends Aircraft
	{
		int Rockets =2; int Gun =1;
	}
	class GeneralAircraft extends Aircraft
	{
		int Engien =2; int Seats=6;
	}
	class CommercialAircraft
	{
		int Engen =4; int Seats=350; int Chassis =4;
	}
	class Helicopter 
	{
		int HelicopterPropeller =2;
	}
	
	class Bomber extends CombatAircraft
	{
		int Bombs =20; int Engien =4;
	}
	
	class GliderPlane extends GeneralAircraft
	{
		int hook =1;
	}
	
}


