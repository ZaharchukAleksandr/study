package com.example.test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui extends JFrame {
	private String massage = " ";
	private JLabel lable =  new JLabel("New JLable");
	private JTextField field = new JTextField("New Text Feald");
	private JButton button = new JButton("Start");
	private JButton quet =  new JButton("Exit");
	
	public Gui() {
		super("Тестовая прога с GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 200, 320, 240);
		this.setVisible(true);
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(2,3,0,0));
		container.add(lable);
		container.add(field);
		container.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String massage = " ";
				massage += "Button was pressed\n";
				JOptionPane.showMessageDialog(null, "Button START was pressed");
				massage = Hello.hello;
				field.setText("Че за хуйня");
				lable.setText(massage); 
			}
		});
		
		container.add(quet);
		quet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		
	}
	
	public void mainGui() {
		
		
		
		
		
	}
	
	

}
