package com.example.mynewcalculator;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorGui extends JFrame{
	public JFrame mainFrame = new JFrame("Калькулятор");
	private JTextField imput = new JTextField("", 25);
	
	public CalculatorGui() 
	{
		mainFrame.setBounds(100, 100, 250, 320);
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calcuImputArea();
		monthButton();
		mainFrame.setVisible(true);
		mainFrame.setLayout(null);
		mainFrame.setResizable(true);
		mainFrame.setLayout(new GridLayout(5,4,0,0));
		
	}
	
	private void calcuImputArea() {
		
		mainFrame.add(imput);
		
		
	}
	
	private void monthButton() {
		int num = 0;
		String arr [] = {"AC", "+/-", "%", "/", "7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3", "+", "0", "00", ",", "=" }; 
		JButton [] jbuttons = new JButton[arr.length];
		
		for (int i = 0; i<5; i++) {
			for (int e = 0; e<4; e++) {
				jbuttons[num] = new JButton();
				
				jbuttons[num].setText(arr[num]);
				
				mainFrame.add(jbuttons[num]);
			}
		}
	}
	
}
