package urok;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class Program  {

	
	 
	    public static void main(String [] args){
		
	    	
	    	System.out.println("Задание 16");
	    	System.out.println("------------------------------------------------------------------");
	    	System.out.println("Пользователь вводит три числа.");
	    	System.out.println("Увеличьте первое число в два раза, ");
	    	System.out.println("Второе числа уменьшите на 3 ");
	    	System.out.println("Третье число возведите в квадрат и затем найдите сумму новых трех чисел.");
	    	System.out.println("------------------------------------------------------------------");
	    	System.out.println("Введите три числа: ");

	    	Zadanie16 zadanie16 = new Zadanie16();
	    	int rez0 = zadanie16.rez0;
	    	double rez1 = zadanie16.rez1;
	    	int rez2 = zadanie16.rez2;
	    	
	    	
			System.out.println("------------------------------------------------------------------");
			System.out.println("Увеличьте первое число в два раза - " + rez0);
			System.out.println("Второе числа уменьшите на 3 - " + rez1);
			System.out.println("Третье число возведите в квадрат - " + rez2);
			System.out.println("Затем найдите сумму новых трех чисел - " + (rez0+rez1+rez2));
			System.out.println("------------------------------------------------------------------");
			
			System.out.println("Задание 17");
			System.out.println("Пользователь вводит три числа. ");
			System.out.println("Найдите среднее арифметическое этих чисел, ");
			System.out.println("а также разность удвоенной суммы первого и третьего чисел и утроенного второго числа.");
			System.out.println("------------------------------------------------------------------");
			
			Zadanie17 zadanie17 = new Zadanie17();
			int rez17_1 = zadanie17.rez17_1;
			System.out.println("Найдите среднее арифметическое этих чисел - " + rez17_1);
			
			
			
					
			
		
			}
	}
				
	    
	    



