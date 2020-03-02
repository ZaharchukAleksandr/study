package com.example.simplegui;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

public class Gui extends JFrame
{
	
	private JLabel priceLbl = new JLabel ("���� ���������   ");
	private JLabel engineCapacitylbl = new JLabel("����� ��������� ");
	private JLabel yearLbl = new JLabel("��� ������������");
	private JTextField priceFld = new JTextField(11);
	private JTextField capacityFld = new JTextField(11);
	private JTextField yearFld = new JTextField(11);
	private JRadioButton euroRadBtn = new JRadioButton("Euro");
	private JRadioButton usdRadBtn = new JRadioButton("Usd");
	private JRadioButton uahRadBtn = new JRadioButton("���");
	private JRadioButton gasRadBtn = new JRadioButton("������");
	private JRadioButton diselRadButton = new JRadioButton("������");
	private JButton okBtn = new JButton("���������");
	private JButton canceBtn = new JButton("��������");
	private JLabel resultsEuroLbl = new JLabel("��������� � EURO");
	private JLabel resultsUsdLbl = new JLabel("��������� � USD");
	private JLabel resultsUahLbl = new JLabel("��������� � ���");
	private JTextArea resultsEuroArea = new JTextArea(5,20);
	private JTextArea resultsUsdArea = new JTextArea();
	private JTextArea resultsUahArea = new JTextArea();
	
	public Gui () 
	{
		/*
		 * ������� �������� ���� ��������� � ��������� �����������
		 */
		super ("���������� �����������");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(700, 200);
		this.setResizable(true);
		this.setVisible(true);
		
		
		

		/*
		 * ������� ��� ������ � ������� ����� �������� ������� ���������
		 */
		JPanel mainPanel = new JPanel(new GridLayout(3, 1));  // �������� ����� � ������� ��������� ��� ��������� ������
		JPanel upperPanel = new JPanel(new GridLayout(1, 3, 1, 1)); 
		JPanel bottomPanel = new JPanel(new GridLayout(1, 3, 1, 1));  
		JPanel superBottomPanel = new JPanel(new GridLayout(1, 0, 0, 0));
			
		JPanel lablePanel = new JPanel(new GridLayout(3,1,1,1)); // ������ � ���������� ����� � ������
		lablePanel.add(priceLbl);
		lablePanel.add(engineCapacitylbl);
		lablePanel.add(yearLbl);
		JPanel txtFldPanel = new JPanel(new GridLayout(3,1,1,1));
		txtFldPanel.add(priceFld);
		txtFldPanel.add(capacityFld);
		txtFldPanel.add(yearFld);
		JPanel radioBtnPanel = new JPanel(new GridLayout(3,1,1,1));
		radioBtnPanel.add(euroRadBtn);
		radioBtnPanel.add(usdRadBtn);
		radioBtnPanel.add(uahRadBtn);
		radioBtnPanel.add(gasRadBtn);
		radioBtnPanel.add(diselRadButton);
		radioBtnPanel.add(new JLabel());
		radioBtnPanel.add(new JLabel());
		
		upperPanel.add(lablePanel);
		upperPanel.add(txtFldPanel);
		upperPanel.add(radioBtnPanel);
		
		JPanel resultLblPanel = new JPanel(new GridLayout(3,1,0,0));
		resultLblPanel.add(resultsEuroLbl); 
		resultLblPanel.add(resultsUsdLbl); 
		resultLblPanel.add(resultsUahLbl);
		
		JPanel resultsTxtAreaPanel = new JPanel(new GridLayout(3,1,0,0));
		resultsTxtAreaPanel.add(resultsEuroArea);
		resultsEuroArea.setEditable(false);
		resultsTxtAreaPanel.add(resultsUsdArea);
		resultsUsdArea.setEditable(false);
		resultsTxtAreaPanel.add(resultsUahArea);
		resultsUahArea.setEditable(false);
		
		
		JPanel cancelOkPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // ������ ������������� ��� ������ ��������
		cancelOkPanel.add(canceBtn);
		canceBtn.setPreferredSize(new Dimension(100, 25));
		cancelOkPanel.add(okBtn);
		okBtn.setPreferredSize(new Dimension(100, 25));
		superBottomPanel.add(cancelOkPanel);
		
		bottomPanel.add(resultLblPanel);
		bottomPanel.add(resultsTxtAreaPanel);
		mainPanel.add(upperPanel);
		mainPanel.add(bottomPanel);
		mainPanel.add(superBottomPanel);

		/*
		 * ������� � ��������� ������ JradioButton
		 */
		ButtonGroup priceBtnGroup = new ButtonGroup();
		priceBtnGroup.add(euroRadBtn);
		priceBtnGroup.add(uahRadBtn);
		priceBtnGroup.add(usdRadBtn);
		ButtonGroup gasGroup = new ButtonGroup();
		gasGroup.add(gasRadBtn);
		gasGroup.add(diselRadButton);
		
		Container mainCont = getContentPane();
		mainCont.add(mainPanel, BorderLayout.WEST);
		
	}

}
