package com.kurenie;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kurenie extends JFrame {
	private JButton button = new JButton("���");
	private JRadioButton radio1 = new JRadioButton("���� ������ �� �����");
	private JRadioButton radio2 = new JRadioButton("���� ������ �� 7 ����");
	
	
	public Kurenie() {
	    super("�� ��� �������?");
	    this.setBounds(200,200,350,100);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(3,2,2,2));
	   
	   

	    ButtonGroup group = new ButtonGroup();
	    group.add(radio1);
	    group.add(radio2);
	    container.add(radio1);

	    radio1.setSelected(true);
	    container.add(radio2);
	   
	    button.addActionListener(new ButtonEventListener());
	    container.add(button);
	}
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String message = "";
			message += "������ ��� ��� - \n";
			
			
			
			
			
			
			
			
			
			message += (radio1.isSelected()?"���� �� �����":"���� �� 7�� ����") 
                                + " "; 
			
			JOptionPane.showMessageDialog(null,
		    		message,
		    		"���������� ��������",
		    	    JOptionPane.PLAIN_MESSAGE);
		}
	}

	public static void main(String[] args) {
		Kurenie app = new Kurenie();
		app.setVisible(true);
	}
}