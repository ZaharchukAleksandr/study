package com.example.array;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		
		
		 int [] randArray = new int[10];
		
		 System.out.println("------------------- —оздаем массив и заполн€ем его рандомными значени€ми ----------------------");
		 System.out.println(" ");
		 
		for (int i = 0; i<randArray.length; i++) {
			randArray[i] = (int) (Math.random()*100); 
		}
		
		for (int i = 0; i<randArray.length; i++) {
			System.out.print(randArray[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("------------------- “епер сортируем массив по возврастанию ----------------------");
		
		boolean isSorted = false;
		int buf;
		while (!isSorted) {
			isSorted=true;
			
			for (int i=0; i<randArray.length-1; i++) {
				if (randArray[i]>randArray[i+1]) {
					isSorted=false;
					
					buf = randArray[i];
					randArray[i] = randArray [i+1];
					randArray[i+1] = buf;
				}
			}
			System.out.println(Arrays.toString(randArray));
		}
		
		
		
		
		
		}
		
}

	
	
		
	
	



