package operatorif;

import java.util.Scanner;

public class OperartorIf 
{
	public  OperartorIf() {
	System.out.println("Это условный оператор If ");
	System.out.println(" ");
	System.out.println("Ведите число от 1 до 3 ");
	
	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	
	if (number == 1)
		{
			System.out.println("Вы ввели число 1 ");
		}
	else if (number == 2) 
		{
			System.out.println("Вы ввели число 2 ");
		}
	else if (number == 3) 
		{
			System.out.println("Вы ввели число 3 ");
		}
	else 
		{
		System.out.println("Вы ввели не правильное число ");
		}
	
	}
}
