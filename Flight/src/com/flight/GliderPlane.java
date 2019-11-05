package com.flight;

import com.flight.Aircraft;;

public class GliderPlane extends Aircraft
{
		
		   private String tipe = "Гражданский Самолет";

		   public GliderPlane (String manufacturer, String boardNumber, int weight) {
		    	 super (manufacturer, boardNumber, weight);
		    }

		    public GliderPlane (String manufacturer, String boardNumber, int weight, int capacity) {
		        super (manufacturer, boardNumber, weight, capacity);
		    }
		    void sendMail () {
		        System.out.println("Mail from " + tipe + " " + manufacturer+" "+boardNumber );
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
	}