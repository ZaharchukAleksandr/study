package com.example.vertextrim;

public class Trim {
/*
 * Метод trim() в Java позволяет удалить пробелы в начале и конце строки. Как будто "подрезает" пробелы.
 */
	
	public static void main(String[] args) {
		String sentence1 = "     Java - очень крутой язык програмирования      ";
		String sentence2 = "     Java - очень крутой язык програмирования      ";
		
		System.out.println(sentence1);
		System.out.println(sentence2.trim());
				
	}

}
