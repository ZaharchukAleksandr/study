package com.ifalsetest;

public class IfalseTest {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 22;
		int d = 36;
		 if ((a < b) && (a < c) && (a < d)) {
		        System.out.println(a + "� - ����������");
		    } 
		 else if ((b < a) && (b < c) && (b < d)) {
		        System.out.println(b + "B - ����������");
		    } 
		 else if ((c < a) && (c < b) && (c < d)) {
		        System.out.println(c + "� - ����������");
		    } 
		 else if ((d < a) && (d < b) && (d < c)) {
		        System.out.println(d + "D  ����������");
		    }
	}

}