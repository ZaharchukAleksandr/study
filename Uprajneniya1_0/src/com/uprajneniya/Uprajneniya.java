package com.uprajneniya;

public class Uprajneniya 
{
	public static void main(String[] args) 
	{	
		/*
		 * ������ ��������� ������� ���� ��������� ���������� ��� �������� ���� ����������.
		 * ����� ��� ��������� ���� ���������� ��� ���������� �����?
		 * �������� ���������, ���������� ������ 20 �������� ������ ����.	 
		 */
		
		/*
		 * ������ ���������
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
		 * �������� ���������, ������� ������� �� 1 �� 15, 
		 * �������� ������ ����� � ����� ������� �������� � �������� ����������� �� 1,
		 * ����� ������� ������ �����. 
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
