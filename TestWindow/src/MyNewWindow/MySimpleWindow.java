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
		super ("����������");
		
		countVoron = new JLabel("���������� ����� �� ������ "+ voron);
		addVoron = new JButton("��������� ������");
		remVoron = new JButton("������� ������");
		
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
				updateCrowCounter(); //�������� ����������, ��� ���������� ����� ����������
		    } 
		  
		}
				
				
			
			
			private void updateCrowCounter() {
				countVoron.setText("������ �� ������:" + voron);
		
				{
	}
			}
			}
}


