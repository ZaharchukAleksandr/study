package calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Calculator {

		JPanel panel;
		JButton button;
		JComboBox cb1, cb2;
		String [] item = {"�������", "���", "������"};

float price;

		int pricePLUS;

 	Calculator () {

		JFrame frame=new JFrame("����");

		cb1=new JComboBox(item);
		cb2=new JComboBox();
		button=new JButton("���������");

panel=new JPanel();
panel.setLayout(new GridLayout(3,1));
panel.add(cb1);
panel.add(cb2);
panel.add(button);

frame.setContentPane(panel);
frame.setSize(250, 250);
frame.setVisible(true);
frame.setLocationRelativeTo(null);

cb1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
switch(cb1.getSelectedIndex()){
case 0: price=150000;
cb2.removeAllItems(); cb2.addItem("�����"); cb2.addItem("�������"); cb2.addItem("�����");
break;
case 1: price=75000;
cb2.removeAllItems(); cb2.addItem("�����"); cb2.addItem("�����");
break;
case 2: price=3500;
cb2.removeAllItems(); cb2.addItem("�����"); cb2.addItem("��������");
break;
}}
});
cb2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(cb2.getSelectedItem()=="�����"){
pricePLUS = (int) (price*1.1);
}
else if(cb2.getSelectedItem()=="�������"){
pricePLUS =(int) (price*0.8);
}
else if(cb2.getSelectedItem()=="�����"){
pricePLUS =(int) (price*1.05);
}
else if(cb2.getSelectedItem()=="�����"){
pricePLUS =(int) (price*0.95);
}
else if(cb2.getSelectedItem()=="��������"){
pricePLUS =(int) (price*0.5);
}
else{
		pricePLUS = 0;
	}
	}
	});
	button.addActionListener(new ActionListener(){
	
	public void actionPerformed(ActionEvent e){

	if(e.getSource()==button){
JOptionPane.showMessageDialog(null, "��������� ���������� ���� � "+pricePLUS);
			}
		}
	});

	}
public static void main(String[] args){
		
	 Calculator pr=new Calculator();
	}
}