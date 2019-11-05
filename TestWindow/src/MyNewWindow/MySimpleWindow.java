package MyNewWindow;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.management.loading.PrivateClassLoader;
import javax.swing.JFrame;

public class MySimpleWindow extends JFrame{
	
	private int voron = 0;
	private JLabel countVoron;
	private JButton addVoron;
	private JButton remVoron;
	
	
	MySimpleWindow () {
		super ("Вороносчет");
		
		countVoron = new JLabel("Количество ворон на заборе "+ voron);
		addVoron = new JButton("Прилетела ворона");
		remVoron = new JButton("Улетела ворона");
		
		JPanel buttonsPanel = new JPanel(new FlowLayout());
		
		buttonsPanel.add(countVoron, BorderLayout.NORTH); 
	    buttonsPanel.add(addVoron);
	    buttonsPanel.add(remVoron);
		
	    add(buttonsPanel, BorderLayout.SOUTH);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);
		
		addVoron.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				voron = voron +1;
				updateCrowCounter(); //Сообщаем приложению, что количество ворон изменилось
		    } 
		  
		}
				
				
			
			
			private void updateCrowCounter() {
				countVoron.setText("Вороны на заборе:" + voron);
		
				{
	}
			}
			}
}


