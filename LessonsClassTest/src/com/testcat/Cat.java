package com.testcat;

public class Cat {
	//�������� ������
	private int weight;
	private String name;
	private String color;
	
	public void eat() {
		//��� ������
		System.out.println("Eating...");
	}
	public void sleep() {
		//��� ����
		System.out.println("Sleeping zz-z-zz...");
	}
	public String speak(String words) {
		//��� �������
		String phraze = words + "...mauu...\n";
		return phraze;
	}

	

}
