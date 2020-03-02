import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestactionAndFrama extends JFrame 
{
	private JTextArea txtArea = new JTextArea("",5,29);
	private JTextField txtField = new JTextField("", 29);
	private JButton btnCancel = new JButton("Отмена");
	private JButton btnOk = new JButton("Send");
	private JPanel bottomPanel = new JPanel();
	
	public TestactionAndFrama() 
	{
		super("Тестовая прога");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(200, 200, 320, 241);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new GridLayout(3,1,0,0));
		
		Container container = this.getContentPane();
		container.add(txtArea);
		container.add(txtField);
		container.add(bottomPanel);
		
		
		
		bottomPanel.add(btnCancel);
		bottomPanel.add(btnOk);
	}
		
		
	
		
		
		


	
	public static void main(String[] args) 
	{
		new TestactionAndFrama();
		

	}

}
