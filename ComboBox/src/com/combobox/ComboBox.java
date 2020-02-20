package com.combobox;

import java.awt.Component;
import java.awt.Frame;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame{
	
	public ComboBox() {
		
		JFrame frame = new JFrame("Тестирем JComboBox");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 320, 240);
		frame.setVisible(true);
		
		JComboBox petList = new JComboBox(items);
		frame.add(petList);
		
	}
	
   public static void main(String[] args) {
	   new ComboBox();

	   
	 
	 
	   
	   
   }
}
