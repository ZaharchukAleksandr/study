package com.ReshetoEratosfena;

public class ReshetoEratosfena 
{
	public static void main(String[] args) 
		{
		int max = 100;
		try {
			max = Integer.parseInt(args[0]);
			} catch (Exception e) {}
		boolean[] isprime = new boolean[max+1];
		for(int i=0; i<=max; i++)
			isprime [i] = true;
			isprime [0] = isprime [1] = false;
			
		

	}

}
