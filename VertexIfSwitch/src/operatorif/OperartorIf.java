package operatorif;

import java.util.Scanner;

public class OperartorIf 
{
	public  OperartorIf() {
	System.out.println("��� �������� �������� If ");
	System.out.println(" ");
	System.out.println("������ ����� �� 1 �� 3 ");
	
	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	
	if (number == 1)
		{
			System.out.println("�� ����� ����� 1 ");
		}
	else if (number == 2) 
		{
			System.out.println("�� ����� ����� 2 ");
		}
	else if (number == 3) 
		{
			System.out.println("�� ����� ����� 3 ");
		}
	else 
		{
		System.out.println("�� ����� �� ���������� ����� ");
		}
	
	}
}
