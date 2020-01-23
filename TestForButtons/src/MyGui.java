
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyGui extends JFrame{
	
	public JButton button = new JButton("Button");
	public JTextField txtField = new JTextField("Text field");
	public JLabel lbl = new JLabel("Text lbl");
	
	
	public MyGui() {
		super("Проверка калькулятора");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 320, 240);
		this.setResizable(false);
		
		Container cont = this.getContentPane();
		cont.setLayout(new GridLayout(2,2,2,2));
		cont.add(txtField);
		cont.add(button);
		cont.add(lbl);
		
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}

	
}
