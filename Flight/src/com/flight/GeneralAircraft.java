package com.flight;

import com.flight.Aircraft;;

public class GeneralAircraft extends Aircraft
{
	
	    private String tipe = "Гражданский Самолет";

	    public GeneralAircraft (String manufacturer, String boardNumber, int weight) {
	    	 super (manufacturer, boardNumber, weight);
	    }

	    public GeneralAircraft (String manufacturer, String boardNumber, int weight, int capacity) {
	        super (manufacturer, boardNumber, weight, capacity);
	    }
	    void sendMail () {
	        System.out.println("Отчет по: " + tipe + " " + manufacturer+" "+boardNumber );
	    }
	    int calcSalary() {
	        return super.getWeight() + super.getCapacity();
	    }
	    int calcSalary (int percentFromBonus){
	        return super.getWeight() +super.getCapacity()*percentFromBonus;
	    }
	    void writeTechnicalTask (){
	        System.out.println("Technical task creation");
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

		