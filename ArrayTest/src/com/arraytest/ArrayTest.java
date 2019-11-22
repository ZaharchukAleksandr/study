
package com.arraytest;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) throws Exception {
		 
        FileReader fr= new FileReader("d:/hometask.txt");
        Scanner scan = new Scanner(fr);
        int i =1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        
        
        fr.close();
 
    }
}
}
