package com.exemple.customsclculatorukraine;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.*;

public class SimpleGui extends JFrame {
	

	
	private JTextField priceTf;
	private JTextField capacityTf;
	private JTextField yearTf;
	
	private JLabel priceLbl;
	private JLabel capacityLbl;
	private JLabel yearLbl;

	private JRadioButton currencyRb;
	private JRadioButton fuelRb;
	
	private JButton calcBtn;
	
		public SimpleGui() {
		this.setTitle("Калькулятор растаможки");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(250, 250, 300, 250);
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,2));
		container.add(priceTf);
		container.add(capacityTf);
		container.add(yearTf);
		
		
		
		
	
		
	}
	
}
