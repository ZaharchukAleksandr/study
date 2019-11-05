package com.flight;

public abstract class Aircraft {
	 
	    protected String tipe = "Воздушное судно";
   	    protected String manufacturer;
   	    protected String boardNumber;
   	    private int weight = 0;
   	    private int capacity = 0;
   	    
   	 public Aircraft (String manufacturer, String boardNumber) {
         this.manufacturer = manufacturer;
         this.boardNumber = boardNumber;
     }
   	 
   	public Aircraft (String manufacturer, String boardNumber, int weight) {
        this.manufacturer = manufacturer;
        this.boardNumber = boardNumber;
    }

     public Aircraft (String manufacturer, String boardNumber,int weight, int capacity){
         this.manufacturer = manufacturer;
         this.boardNumber = boardNumber;
         this.weight = weight;
         this.capacity = capacity;
     }



     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     public int getCapacity() {
         return capacity;
     }

     public void setCapacity(int capacity) {
         this.capacity = capacity;
     }

     abstract void sendReport();
     abstract int totalWeight();


 
}



