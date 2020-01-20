import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
 
 
public class Kalku {
    public JFrame window = new JFrame("Calculator");
    public JTextField imput = new JTextField();
 
    public Kalku() {    // устанавливаем параметры окна
        window.setSize(480, 405);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.white);
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
 
        enter_area();       // подготавливаем окно ввода и обработчик клавиатуры
        month_button();     // подготовка кнопок
        autor();            // вешаем в окно лого автора
//        logo();             // вешаем в окно картинку-фон
 
        window.setVisible(true);
    }
 
    private void enter_area() {
        imput.setFont(new Font("Arial", Font.BOLD, 24));
        imput.setBounds(16, 10, 248, 36);
        imput.setBackground(Color.white);
        imput.setHorizontalAlignment(JTextField.RIGHT);
 
        window.add(imput);
 
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new KeyDispatcher());
    }
 
 
    // обработка клавиатуры
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
        JButton[] jbutton_n = new JButton[arr.length];  // создаем массив кнопок
 
        for (int e = 0; e < 5; e++) {
            for (int r = 0; r < 4; r++) {
                jbutton_n[num] = new JButton();         // заполняем этот массив собственно кнопками
                // настраиваем вид кнопок, расположение
                jbutton_n[num].setFont(new Font("Arial", Font.PLAIN, 36));
                jbutton_n[num].setText(arr[num]);
                jbutton_n[num].setMargin(new Insets(0, 0, 0, 0));
                if (num < arr.length - 1) {
                    jbutton_n[num].setBounds(16 + r * 62, 55 + e * 62, 60, 60);
                } else {
                    jbutton_n[num].setBounds(16 + r * 62, 55 + e * 62, 122, 60);
                }
                jbutton_n[num].setFocusable(false);
 
                window.add(jbutton_n[num]);     // вешаеам кнопки в окно
 
                // добавляем кнопкам слушателя событий
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
 
// слушатель событий кнопок
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
 
// подсчет результата. вот тут точно нужно почитать офф.доку :)
    private void result() {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try {
            imput.setText("" + engine.eval(imput.getText()));
        } catch (ScriptException e1) {
            //...
        }
    }
 
// метод вешает картинку на фон
    private void logo() {
        JLabel fon = new JLabel();
        fon.setBounds(0, 0, 480, 405);
        fon.setIcon(new ImageIcon(getClass().getResource("/res/fon.jpg")));
        fon.setHorizontalAlignment(SwingConstants.LEFT);
 
        window.add(fon);
    }
 
 
    // метод выводит метку с лого автора
    private void autor() {
        JLabel autor = new JLabel();
        autor.setFont(new Font("Arial", Font.BOLD, 14));
        autor.setBounds(400, 350, 80, 18);
        autor.setText("© Nidl");
        autor.setHorizontalAlignment(SwingConstants.CENTER);
        autor.setVerticalAlignment(JLabel.CENTER);
        autor.setOpaque(false);
 
        window.add(autor);
    }
 
// собсна запуск программы
    public static void main(String[] args) {
        new Kalku();
    }
}