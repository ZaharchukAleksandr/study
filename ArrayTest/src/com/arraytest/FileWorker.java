package com.arraytest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWorker 
{
	
	

	public String readFile(String filename)
	{
	    String content = null;
	   
		File file = new File(hometask.txt); 
	    FileReader reader = null;
	    try 
	    {
	        reader = new FileReader(file);
	        char[] chars = new char[(int) file.length()];
	        reader.read(chars);
	        content = new String(chars);
	        reader.close();
	    } catch (IOException e) 
	    {
	        e.printStackTrace();
	    } finally {
	        if(reader != null){
	            reader.close();
	        }
	    }
	    return content;
	}
}




