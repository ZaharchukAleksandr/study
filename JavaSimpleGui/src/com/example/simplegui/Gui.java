package com.example.simplegui;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

public class Gui extends JFrame
{
	
	private JLabel price = new JLabel ("Цена автомбиля   ");
	private JLabel engineCapacity = new JLabel("Обьем двигателя ");
	private JLabel year = new JLabel("Год производства");
	private JTextField priceFeald = new JTextField("     ",11);
	private JTextField capacityFeald = new JTextField("     ",11);
	private JTextField yearFeald = new JTextField("     ",11);
	private JRadioButton euroRadButton = new JRadioButton("Euro");
	private JRadioButton usdRadButton = new JRadioButton("Usd");
	private JRadioButton uahRadButton = new JRadioButton("Грн");
	private JRadioButton gasRadButton = new JRadioButton("Бензин");
	private JRadioButton diselRadButton = new JRadioButton("Дизель");
	
	public Gui () 
	{
		super ("Таможенный калькулятор");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 200);
		this.setResizable(true);
		this.setVisible(true);

		JPanel mainPanel = new JPanel(new GridLayout(2, 2, 0, 0));
		JPanel autoPanel = new JPanel(new GridLayout(3, 1, 0, 0));
		JPanel pricePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pricePanel.add(price);
		pricePanel.add(priceFeald);
		pricePanel.add(euroRadButton);
		pricePanel.add(usdRadButton);
		pricePanel.add(uahRadButton);
		JPanel capacityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		capacityPanel.add(engineCapacity);
		capacityPanel.add(capacityFeald);
		capacityPanel.add(gasRadButton);
		capacityPanel.add(diselRadButton);
		JPanel yaerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		yaerPanel.add(year);
		yaerPanel.add(yearFeald);
		yaerPanel.add(new JLabel("   "));
		yaerPanel.add(new JLabel("   "));
		yaerPanel.add(new JLabel("   "));
		
		autoPanel.add(pricePanel);
		autoPanel.add(capacityPanel);
		autoPanel.add(yaerPanel);
		
		mainPanel.add(autoPanel);
		
		Container mainCont = getContentPane();
		mainCont.add(mainPanel, BorderLayout.WEST);
		
		ButtonGroup priceBtnGroup = new ButtonGroup();
		priceBtnGroup.add(euroRadButton);
		priceBtnGroup.add(uahRadButton);
		priceBtnGroup.add(usdRadButton);
		
		ButtonGroup gasGroup = new ButtonGroup();
		gasGroup.add(gasRadButton);
		gasGroup.add(diselRadButton);
		
		
		
	}

	

}
