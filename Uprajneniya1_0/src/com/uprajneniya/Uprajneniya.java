package com.uprajneniya;

public class Uprajneniya 
{
	public static void main(String[] args) 
	{	
		/*
		 * Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих.
		 * Какой ряд получится если складывать три предыдущих числа?
		 * Напишите программу, печатающую первые 20 элемента такого ряда.	 
		 */
		
		/*
		 * Просто Фибоначчи
		 */
		
		int fibo;
		int n0 = 1;
		int n1 = 1;
		int n2 = 1;
		System.out.print(n0 + " " + n1 + " " + n2 + " ");
		for (int i=1; i<=20; i++) 
		{
			fibo = n0+n1+n2;
			System.out.print(fibo + " ");
			n0 = n1;
			n1 = n2;
			n2 = fibo;
		}
		
		
		/*	
		 * Напишите программу, которая считает от 1 до 15, 
		 * печатает каждое число и затем считает двойками в обратном направлении до 1,
		 * снова печатая каждое число. 
		 */
		
//		for (int i=1; i<=15; i++) 
//		{
//			System.out.print(i + " ");
//		}
//		System.out.println(" ");
//		for (int i=15; i>=1; i-=2)
//		{
//			System.out.print(i + " ");
//		}
		
		
	}
}
