package com.combobox;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ComboBox extends JFrame {
	
	public ComboBox() {
		super("�������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String [] items = {
				"������� ����� 1",
				"������� ����� 2",
				"������� ����� 3",
				"������� ����� 4"
		};
		JComboBox editComboBox = new JComboBox(items);
		editComboBox.setEditable(true);
	
		
	}

}
