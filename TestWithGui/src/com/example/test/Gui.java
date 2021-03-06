package com.example.test;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui extends JFrame {
	
	private JTextArea area =  new JTextArea("���������� ������� �� ����� ����� �� 1 �� 5.�� ������ ������ ����:  1 2 3 4 5 ");
	private JScrollPane sp = new JScrollPane(area);
	private JTextField field = new JTextField();
	private JButton clearButton = new JButton("Clear");
	private JButton freeButton = new JButton("Free Button");
	private JButton startButton = new JButton("Start");
	private JButton quetButton =  new JButton("Exit");
	
	
	public Gui() {
		// ������� �������� ���� ���������
		super("�������� ����� � GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(200, 200, 320, 240);
		this.setVisible(true);
		
		//������� ������� ��������� � ������� ����� ������ ��� ��������� ������
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3,1,5,0));
		
		//������� ������ � ������� ������ ��������� ������
		JPanel textJPanel = new JPanel();
		textJPanel.setLayout(new GridLayout(1,2,5,0));
		textJPanel.add(sp);
		sp.setVerticalScrollBarPolicy(sp.VERTICAL_SCROLLBAR_ALWAYS);
		area.setEditable(false);
		
		textJPanel.add(field);
		field.setEditable(true);
		
		container.add(textJPanel);
		
		//������� ������ ��� ������ free � Clear
		JPanel freeClearBtnPanel = new JPanel(new GridLayout(1,2,5,0));
		freeClearBtnPanel.add(freeButton);
		freeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Buton Free was pressed");
				
			}
		});
		freeClearBtnPanel.add(clearButton);
		clearButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				field.setText(" ");
				area.setText(" ");
				
			}
		});
		container.add(freeClearBtnPanel);
		
		// ������� ������ ��� ������ Start and Exit
		JPanel startQuetBtnPanelGrid = new JPanel();
		startQuetBtnPanelGrid.setLayout(new GridLayout(1,2,5,0));
		startQuetBtnPanelGrid.add(startButton);
		
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				for (int i = 1; i <= 5; i++) {
					area.setText("��������� \n");
					area.append(  String.valueOf(i) + " \n");
					
					
				}
				
				
				
			}
		});
		
		startQuetBtnPanelGrid.add(quetButton);
		quetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		
		JPanel startQuetBtnPanelFlow = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		startQuetBtnPanelFlow.add(startQuetBtnPanelGrid);
		
		container.add(startQuetBtnPanelFlow);
		
	}
	
	public void mainGui() {
		
		for (int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		
		
	}

}
