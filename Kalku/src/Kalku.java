


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Kalku extends JFrame 
{
	JTextField smallField, bigField;

    public Kalku()
    {
        super("��������� ����");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // �������� ��������� �����
        smallField = new JTextField(15);
        smallField.setToolTipText("�������� ����");
        bigField = new JTextField("����� ����", 25);
        bigField.setToolTipText("������ ����");
        // ��������� ������
        bigField.setFont(new Font("Dialog", Font.PLAIN, 14));
        bigField.setHorizontalAlignment(JTextField.RIGHT);
        // ��������� ��������� �����
        
                // ����������� ���������� ������
                JOptionPane.showMessageDialog(Kalku.this, 
                               "���� �����: " + smallField.getText());
            }
        });
        // ���� � �������
        JPasswordField password = new JPasswordField(12);
        password.setEchoChar('1');
        // �������� ������ � ���������� ������
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        contents.add(bigField  );
        contents.add(password  );
        setContentPane(contents);
        // ���������� ������ ���� � ������� ��� �� �����
        setSize(400, 130);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Kalku();
    }
}