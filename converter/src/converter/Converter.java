package converter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Converter extends JFrame {
	
	private JLabel lblKm;
	private JLabel lblMl;
	private JTextField leftImput;
	private JTextField rightImput;
	private JButton convertBtn;

	
	
	public Converter() {
		super("Конвертер величин");
		this.setBounds(500,350,350,500);
		
		lblKm = new JLabel("   Километры");
		leftImput = new JTextField("",10);
		convertBtn = new JButton(">>>");
		rightImput = new JTextField("",10);
		lblMl = new JLabel("Мили     ");
		
		JPanel pnl = new JPanel(); 
		pnl.setLayout(new FlowLayout());
		
		add(lblKm);
//		add(lblKm);
//		pnl.add(lblKm);
		add(leftImput);
		add(convertBtn);
		add(rightImput);
		add(lblMl);
	
		
	
		
		
		
		

		
		
		
		
		
	}
		
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			leftImput.getText();
			System.out.println(leftImput);
			
			
		}
	}
	

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		
	    System.exit(0);
	                } 
	

}
