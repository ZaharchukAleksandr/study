package com.interfacetest;


public class InterfaceTest implements Swimmable{
	
	public void swim() {
		System.out.println("������ �����");
		
	}
	

	public static void main(String[] args) {
		InterfaceTest duck = new InterfaceTest();
        duck.swim();
		
	}


	@Override
	public void krya() {
	
		
	}


	

	
}
