package com.exemple.customsclculatorukraine;

import java.awt.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.*;

public class SimpleGui extends JFrame {
	

	
	private JTextField priceTf = new JTextField();
	private JTextField capacityTf = new JTextField();
	private JTextField yearTf = new JTextField();
	
	private JLabel priceLbl = new JLabel("Цена в евро");
	private JLabel capacityLbl = new JLabel("Обьем двигателя");
	private JLabel yearLbl = new JLabel("Год выпуска");
	private JLabel free = new JLabel();

	private JRadioButton currencyRb = new JRadioButton();
	private JRadioButton fuelRb = new JRadioButton("Gas");
	
	private JButton calcBtn = new JButton("Расчет");
	
		public SimpleGui() {
		this.setTitle("Калькулятор растаможки");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(250, 250, 300, 250);
		
		Container cont = this.getContentPane();
		
		cont.setLayout(new GridLayout(4, 3, 3, 3));
		cont.add(priceLbl);
		cont.add(priceTf);
		cont.add(currencyRb);
		cont.add(capacityLbl);
		cont.add(capacityTf);
		cont.add(fuelRb);
		cont.add(yearLbl);
		cont.add(yearTf);
		cont.add(free);
		cont.add(free);
		cont.add(free);
		cont.add(calcBtn);
		
		
		
		
		
		
		
	
		
	}
	
}
