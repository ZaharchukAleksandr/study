
public class WhileCicl {
	/*
	  * Необходимо вывести на экран числа от 1 до 7. То есть на экране должно быть: 1 2 3 4 5 6 7
	  */
	
	int i1 = 1, i2 = 100;
	public WhileCicl() {
		while (i1<8) {
			
			System.out.print(i1 + " ");
			i1++;
		}
		System.out.println(" ");
		
		/*
		 * Необходимо вывести на экран вот такую последовательность чисел:
		 * 100 90 80 70 60 50 40 30 20 10
		 */
		while (i2>0) {
			System.out.print(i2 +" ");
			i2-=10;
		}
		
		System.out.println(" ");
		
		String str1 = "Java";
		String str2 = "Hello";
		char ch = str2.charAt(1);
		String str3 = String.join(" ", str2, str1);
		System.out.println(str3);
		System.out.println(ch);
		
		
	}
	
	
	
}



