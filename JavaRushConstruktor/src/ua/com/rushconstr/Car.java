package ua.com.rushconstr;

public class Car implements Driving
{ 
	 private String model = "ferrari";
	 private int maxSpeed = 350;
	
		
	
	public Car(String model) 
	{
		this.model = model;
		System.out.println(model);
		
	}
	public Car(String model, int maxSpeed)
	{
		this.model = model;
		this.maxSpeed = maxSpeed;
		System.out.println(model + " " + maxSpeed);
	}
	
}



