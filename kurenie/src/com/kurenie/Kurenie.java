package com.kurenie;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kurenie extends JFrame {
	private JButton button = new JButton("Жми");
	private JRadioButton radio1 = new JRadioButton("Идем курить на улицу");
	private JRadioButton radio2 = new JRadioButton("Идем курить на 7 этаж");
	
	
	public Kurenie() {
	    super("Ну что покурим?");
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
			message += "Напиши мне что - \n";
			
			
			
			
			
			
			
			
			
			message += (radio1.isSelected()?"идем на улицу":"идем на 7ой этаж") 
                                + " "; 
			
			JOptionPane.showMessageDialog(null,
		    		message,
		    		"Дальнейшие действия",
		    	    JOptionPane.PLAIN_MESSAGE);
		}
	}

	public static void main(String[] args) {
		Kurenie app = new Kurenie();
		app.setVisible(true);
	}
}