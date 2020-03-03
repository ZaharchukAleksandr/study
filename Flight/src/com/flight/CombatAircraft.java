package com.flight;

public class CombatAircraft extends Aircraft {
		public static final String Rockets = null;
		private String tipe = "Боевоые самолеты";

	    public CombatAircraft (String manufacturer, String boardNumber, int weight) {
	    	 super (manufacturer, boardNumber, weight);
	    }

	    public CombatAircraft (String manufacturer, String boardNumber, int weight, int capacity) {
	        super (manufacturer, boardNumber, weight, capacity);
	    }
	    
		void sendReport() {
	        System.out.println("Полная взлетная масса по:  " + tipe + " " + manufacturer+" "+boardNumber );
	    }
	    
		int totalWeight() {
	        return super.getWeight() + super.getCapacity();
	    }
	    int calcSalary (int percentFromBonus){
	        return super.getWeight() +super.getCapacity()*percentFromBonus;
	    }
	    void writeTechnicalTask (){
	        System.out.println("Technical task creation");
	    }

			
		
	
}

	
