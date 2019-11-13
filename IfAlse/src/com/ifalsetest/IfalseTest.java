package com.ifalsetest;

import java.util.Scanner;
public class IfalseTest {

	public static void main(String[] args) {
		int i =1;
		System.out.println("Введите количество участников розыгрыша ...");
		Scanner kol = new Scanner(System.in);
		int klvUch = kol.nextInt();
		System.out.println("ВВедите количество победителей ...");
		Scanner pobed = new Scanner(System.in);
		int klvPobed = kol.nextInt();
		
		while ( i<=klvPobed) 
		{
		int pobeditel = (int) ( Math.random() * klvUch );
		System.out.println("Выиграл участник под номером - " + pobeditel);
		i++;
		}
	}

}

