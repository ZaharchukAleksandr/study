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
	
	private JLabel priceLbl = new JLabel("���� � ����");
	private JLabel capacityLbl = new JLabel("����� ���������");
	private JLabel yearLbl = new JLabel("��� �������");
	private JLabel free = new JLabel();

	private JRadioButton currencyRb = new JRadioButton();
	private JRadioButton fuelRb = new JRadioButton("Gas");
	
	private JButton calcBtn = new JButton("������");
	
		public SimpleGui() {
		this.setTitle("����������� ����������");
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
