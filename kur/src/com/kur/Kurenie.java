package com.kur;
import java.util.Scanner;
import java.io.*;

public class Kurenie {

	public static void main(String[] args) throws Exception {
		System.out.println("���� ����� �� ����� ����� 0 ");
		System.out.println("���� ����� �� 7�� ����� ����� 1 ");
		System.out.println("����� ����� ������� � ���� otvet.dat, ������� ��� ��� �������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String otv ="";
		String zap = "����� ������� � ���� otvet.dat, ������� ��� ��� �������";
		newFile("");
        if(num==0) {
        	newFile("����� �� �����");
        	otv = "����� �� �����";
          System.out.println(otv);
          System.out.println("---------------------------------");
          System.out.println(zap);
          
        }
        else if (num==1) {
        	newFile("����� �� ������� �����");
        	otv = "����� �� ������� �����";
        System.out.println(otv);
        System.out.println("---------------------------------");
        System.out.println(zap);
      }
        else {
        	System.out.println("�����, �� ���� ������ �� ��)))");
		}
        
	}

	private static void newFile(String otv) throws Exception {
        FileWriter nFile = new FileWriter("otvet.dat");
        {
        nFile.write(otv);
        }
        nFile.close();
	}
	

}
