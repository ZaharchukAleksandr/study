package com.example.vertexcikli;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class CiklGui extends JFrame
{
	JPanel textPanel = new JPanel();
	JPanel btnPanel = new JPanel();
	JTextArea area = new JTextArea(20,30);
	JButton button = new JButton("Cancel");
	JButton button1 = new JButton("Send");
	
	public CiklGui() 
	{
		super("Таблица умножения");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(320, 240);
		this.setVisible(true);	
		
		
	 
		Container cont = this.getContentPane();
		cont.setLayout(new GridLayout(2,1,1,1));
		
		textPanel.add(area);
		btnPanel.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i;
				String otv = "";
				for( i = 1; i >=9; i++) {
					
					otv =  Integer.toString(3*i);
					
				}
				area.setText(""+otv);
				
				
				
			}
		});
		btnPanel.add(button1);
		
		cont.add(textPanel);
		cont.add(btnPanel);
		
		
		
	}
	
	

}
