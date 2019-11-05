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
		String [] item = {"Кадилак", "БМВ", "Жигули"};

float price;

		int pricePLUS;

 	Calculator () {

		JFrame frame=new JFrame("Авто");

		cb1=new JComboBox(item);
		cb2=new JComboBox();
		button=new JButton("Расчитать");

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
cb2.removeAllItems(); cb2.addItem("Черны"); cb2.addItem("Зеленый"); cb2.addItem("Синий");
break;
case 1: price=75000;
cb2.removeAllItems(); cb2.addItem("Черны"); cb2.addItem("Белый");
break;
case 2: price=3500;
cb2.removeAllItems(); cb2.addItem("Белый"); cb2.addItem("Баклажан");
break;
}}
});
cb2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(cb2.getSelectedItem()=="Черны"){
pricePLUS = (int) (price*1.1);
}
else if(cb2.getSelectedItem()=="Зеленый"){
pricePLUS =(int) (price*0.8);
}
else if(cb2.getSelectedItem()=="Синий"){
pricePLUS =(int) (price*1.05);
}
else if(cb2.getSelectedItem()=="Белый"){
pricePLUS =(int) (price*0.95);
}
else if(cb2.getSelectedItem()=="Баклажан"){
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
JOptionPane.showMessageDialog(null, "Стоимость выбранного авто — "+pricePLUS);
			}
		}
	});

	}
public static void main(String[] args){
		
	 Calculator pr=new Calculator();
	}
}