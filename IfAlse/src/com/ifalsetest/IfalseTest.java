package com.ifalsetest;

import java.util.Scanner;
public class IfalseTest {

	public static void main(String[] args) {
		System.out.println("������� ����� 1, 2 ��� 3");
		Scanner scan = new Scanner(System.in);
		int number =scan.nextInt();
		if(number==1) {
			System.out.print("�� ����� ����� 1");
		}
		else if (number==2) {
			System.out.print("�� ����� ����� 2");
		}
		else if (number==3) {
			System.out.print("�� ����� ����� 3");
		}
		else {
			System.out.print("�� ����� ������������ �����");
		}
	}

}

