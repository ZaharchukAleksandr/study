package com.kur;
import java.util.Scanner;
import java.io.*;

public class Kurenie {

	public static void main(String[] args) throws Exception {
		System.out.println("Если курим на улице введи 0 ");
		System.out.println("Если курим на 7ом этаже введи 1 ");
		System.out.println("ответ будет записан в файл otvet.dat, перешли мне его обратно");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String otv ="";
		String zap = "ответ записан в файл otvet.dat, перешли мне его обратно";
		newFile("");
        if(num==0) {
        	newFile("курим на улице");
        	otv = "курим на улице";
          System.out.println(otv);
          System.out.println("---------------------------------");
          System.out.println(zap);
          
        }
        else if (num==1) {
        	newFile("курим на седьмом этаже");
        	otv = "курим на седьмом этаже";
        System.out.println(otv);
        System.out.println("---------------------------------");
        System.out.println(zap);
      }
        else {
        	System.out.println("Антон, ты ввел совсем не то)))");
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
