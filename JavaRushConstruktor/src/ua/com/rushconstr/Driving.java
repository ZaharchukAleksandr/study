package ua.com.rushconstr;

import java.io.ObjectInputStream.GetField;

public interface Driving
{
	public default void driving () {
		
		System.out.println ("Автомобиль едет");
	}
}
