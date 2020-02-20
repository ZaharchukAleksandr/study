package com.example.internetchat;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ServerGui extends JFrame {
	public JTextArea massagesArea = new JTextArea("Сообщения чата", 300, 150);
	public JButton quitButton = new JButton("Quit");
	public JButton clearButton = new JButton("Clear");
	private JPanel tatPanel = new JPanel();
	private JPanel btnPanel = new JPanel();
	
	 public ServerGui() {
		super("Server");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(200, 200, 320, 240);
		this.setVisible(true);
		this.setLayout(new GridLayout(3,1,0,0));
		
		Container mainContainer = getContentPane();
		
		mainContainer.add(tatPanel);
		tatPanel.add(massagesArea);
		mainContainer.add(btnPanel);
		btnPanel.add(quitButton);
		btnPanel.add(clearButton);
		
	}
		
	

}
