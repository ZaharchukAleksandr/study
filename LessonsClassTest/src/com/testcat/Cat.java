package com.testcat;

public class Cat {
	//атрибуты класса
	private int weight;
	private String name;
	private String color;
	
	public void eat() {
		//кот кушает
		System.out.println("Eating...");
	}
	public void sleep() {
		//кот спит
		System.out.println("Sleeping zz-z-zz...");
	}
	public String speak(String words) {
		//кот говорит
		String phraze = words + "...mauu...\n";
		return phraze;
	}

	

}
