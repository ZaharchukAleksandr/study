package operatorif;

import java.util.Scanner;

public class OperatorSwitch {
	public OperatorSwitch()
	{
		System.out.println("��� �������� Switch");
		System.out.println(" ");
		System.out.println("������� �����  1, 2, 3 ��� 4 ");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		switch (number) {
		case 1: System.out.println ("�� ����� ����� 1");
			break;
		case 2: System.out.println ("�� ����� ����� 2");
		break;
		case 3: System.out.println ("�� ����� ����� 3");
		break;
		case 4: System.out.println ("�� ����� ����� 4");
		break;

		default: System.out.println ("�� ����� ������������ �����");
			break;
		}
		
	}

}
