package com.example.classes;

import java.util.Date;

public class ClassesMain {

	

	public static void main(String[] args ) {
		NonStaticClass nonStsticClasss = new NonStaticClass();
		
		for (int i = 0; i<nonStsticClasss.myArray.length; i++)
		{
			System.out.print(nonStsticClasss.myArray[i]+" ");
		}
		
		Airplane cesna = new Airplane("Cesna", "A3745", "Полет хует" );
		System.out.println(cesna.flight);
		Date time =  new Date();
		System.out.println(time);
		
		

	}

}
