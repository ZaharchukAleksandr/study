package com.ifalsetest;

import java.util.Scanner;
public class IfalseTest {

	public static void main(String[] args) {
		System.out.println("Введите число 1, 2 или 3");
		Scanner scan = new Scanner(System.in);
		int number =scan.nextInt();
		if(number==1) {
			System.out.print("Вы ввели число 1");
		}
		else if (number==2) {
			System.out.print("Вы ввели число 2");
		}
		else if (number==3) {
			System.out.print("Вы ввели число 3");
		}
		else {
			System.out.print("Вы ввели неправильное число");
		}
	}

}

