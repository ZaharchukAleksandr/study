package com.mycalc;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class Gui extends JFrame
{
	public JFrame window = new JFrame("Калькулятор");
	private JTextField imput = new JTextField("",9);
	
	
	public Gui() 
	{
	
		window.setBounds(1000, 100, 250, 300);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setLayout(null);
//        window.setResizable(false);
		
		enter_area();
		month_button();
		autor();
		
		window.setVisible(true);
		
	}

	private void enter_area() {
		
		getImput().setFont(new Font("Arial", Font.BOLD, 24));
        getImput().setBounds(16, 10, 248, 36);
        getImput().setBackground(Color.white);
        getImput().setHorizontalAlignment(JTextField.RIGHT);
        
        window.add(getImput());
        
        KeyboardFocusManager keyManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        keyManager.addKeyEventDispatcher(new KeyDispatcher());
		
	}
	
	class KeyDispatcher implements KeyEventDispatcher {
        public boolean dispatchKeyEvent(KeyEvent e) {   // аргумент - событие клавы
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {  // если нажат ентер - считаем результат
                result();
            }
 
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) { // если нажат эскейп - очищаем поле ввода
                imput.setText("");
            }
 
            return false;
        }
    }
	

	private void month_button() {
		int num = 0;
        String arr[] = {"1", "2", "3", "С", "4", "5", "6", "*", "7", "8", "9", "-", "0", ".", "+", "/", "(", ")", "="};
        JButton[] jbutton_n = new JButton[arr.length];
 
        for (int e = 0; e < 5; e++) {
            for (int r = 0; r < 4; r++) {
                jbutton_n[num] = new JButton();
                jbutton_n[num].setFont(new Font("Arial", Font.PLAIN, 36));
                jbutton_n[num].setText(arr[num]);
                jbutton_n[num].setMargin(new Insets(0, 0, 0, 0));
                if (num < arr.length - 1) {
                    jbutton_n[num].setBounds(16 + r * 62, 55 + e * 62, 60, 60);
                } else {
                    jbutton_n[num].setBounds(16 + r * 62, 55 + e * 62, 122, 60);
                }
                jbutton_n[num].setFocusable(false);
 
                window.add(jbutton_n[num]);
 
//                // добавляем кнопкам слушателя событий
                ActionListener num_button = new GoNumListener();
                jbutton_n[num].addActionListener(num_button);
 
                if (num < arr.length - 1) {
                    num++;
                } else {
                    break;
                }
            }
        }
    }
 
		
	public class GoNumListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText();  // получаем текст с кнопки в переменную
            if (name == "=" || name == "С") {
                //...
            } else {
                // если нажата не "=" и не "С" - добавляем в поле ввода значение кнопки
                imput.setText(imput.getText() + name);
            }
 
            if (name == "=") {  // если нажата "=" - считаем результат
                result();
            }
 
            if (name == "С") {  // если нажата "С" - очищаем поле ввода
                imput.setText("");
            }
 
            window.repaint();   // перерисовываем окно
        }
    }
	
	 protected void result() {
	        ScriptEngineManager factory = new ScriptEngineManager();
	        ScriptEngine engine = factory.getEngineByName("JavaScript");
	        try {
	            imput.setText("" + engine.eval(imput.getText()));
	        } catch (ScriptException e1) {
	            //...
	        }
	    }

	private void autor() {
		// TODO Auto-generated method stub
		
	}

	public JTextField getImput() {
		return imput;
	}

	public void setImput(JTextField imput) {
		this.imput = imput;
	}

	

}
