package com.exemple.customsclculatorukraine;

import java.awt.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.AcceptPendingException;
import java.util.Calendar;

import javax.swing.*;

public class SimpleGui extends CustomsCalculator {
	

	
	private JTextField priceTf = new JTextField();
	private JTextField capacityTf = new JTextField();
	private JTextField yearTf = new JTextField();
	
	private JLabel priceLbl = new JLabel("Цена в евро");
	private JLabel capacityLbl = new JLabel("Обьем двигателя");
	private JLabel yearLbl = new JLabel("Год выпуска");
	private JLabel free = new JLabel();
	 
	private JRadioButton currencyRbUah = new JRadioButton ("Грн");
	private JRadioButton  currencyRbEuro = new JRadioButton ("Euro");
	private JRadioButton currencyRbDol = new JRadioButton ("USD");
	
	private JRadioButton  fuelRbGas = new JRadioButton ("Gas");
	private JRadioButton  fuelRbDisel = new JRadioButton ("Disel");
	private JRadioButton  fuelRbElektro = new JRadioButton ("Elektro");
	
	private JButton calcBtn = new JButton("Расчет");
	
		public SimpleGui() {
		this.setTitle("Калькулятор растаможки");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(250, 250, 600, 150);
		
		Container cont = this.getContentPane();
		
		cont.setLayout(new GridLayout(3, 6));
		
		ButtonGroup btnGroupCurrency = new ButtonGroup();
		btnGroupCurrency.add(currencyRbUah);
		btnGroupCurrency.add(currencyRbDol);
		btnGroupCurrency.add(currencyRbEuro);
		
		ButtonGroup btnGroupFuel = new ButtonGroup();
		btnGroupFuel.add(fuelRbGas);
		btnGroupFuel.add(fuelRbDisel);
		btnGroupFuel.add(fuelRbElektro);
		
		cont.add(priceLbl);
		cont.add(priceTf);
		priceTf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				carPrice = priceTf.getColumns();
				
			}
		});
		
			
		
		cont.add(currencyRbUah);
		cont.add(currencyRbEuro);
		cont.add(currencyRbDol);
		cont.add(capacityLbl);
		cont.add(capacityTf);
		capacityTf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				engineCapacity = capacityTf.getColumns();;
				
			}
		});
		cont.add(fuelRbGas);
		cont.add(fuelRbDisel);
		cont.add(fuelRbElektro);
		cont.add(yearLbl);
		cont.add(yearTf);
		yearTf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				productionYear = yearTf.getColumns();
				
			}
		});
		Benzin one = new Benzin();
		one.allCustomsTax();
		 
		cont.add(free);
		cont.add(free);
		cont.add(free);
		
		cont.add(calcBtn);
		calcBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Benzin one = new Benzin();
				one.allCustomsTax();
				 
				
			}
		});
		
		
		
		
		
		
		
	
		
	}
	
}
