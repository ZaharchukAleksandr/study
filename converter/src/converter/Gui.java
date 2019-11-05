package converter;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame 
{
	private JLabel imputLblLeft, imputLblRight;
	private JTextField imputTxtFealdLeft, imputTxtFealdRigt;
	private JButton convButLeft, convButRight;
	
	
	
	public Gui()
	{
	super("Конвертер величин");
	this.setBounds(300,350,350,500);
	
	JPanel kmToMile = new JPanel(); 
	JPanel celToFar = new JPanel();
	JPanel gradToRad = new JPanel();
	
	imputLblLeft = new JLabel("   Километры");
	imputTxtFealdLeft = new JTextField("",10);
	convButLeft = new JButton("<<<");
	convButRight = new JButton(">>>");
	imputTxtFealdRigt = new JTextField("",10);
	imputLblRight = new JLabel("Мили     ");
	
	
	
	celToFar.add(convButLeft);
	
	
	
	
	add(celToFar);
	
	
	
		
		
		
	}
}
	