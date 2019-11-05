
package com.arraytest;




import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) throws Exception {
		 
        FileReader fr= new FileReader("hometask.txt");
        Scanner scan = new Scanner(fr);
        int i =1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        
        
        fr.close();
 
    }
}
}
