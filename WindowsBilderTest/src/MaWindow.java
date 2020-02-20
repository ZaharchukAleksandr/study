import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.awt.event.ActionListener;
import java.awt.Toolkit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Text;

public class MaWindow {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtNewText;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MaWindow window = new MaWindow();
			window.open();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(605, 394);
		shell.setText("ТурбоАтомный Чат");
		
		Label chatArea = new Label(shell, SWT.NONE);
		chatArea.setBounds(10, 10, 55, 15);
		chatArea.setText("Наш чат");
		
		Button Send = new Button(shell, SWT.NONE);
		Send.setBounds(494, 290, 85, 25);
		Send.setText("Отправить");
	
		
		Button btnCancel = new Button(shell, SWT.NONE);
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnCancel.setBounds(494, 321, 85, 25);
		btnCancel.setText("Отменить");
		
		Label label_1 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(0, 344, 589, 2);
		formToolkit.adapt(label_1, true, true);
		
		ToolBar toolBar = new ToolBar(shell, SWT.FLAT | SWT.RIGHT);
		toolBar.setTouchEnabled(true);
		toolBar.setBounds(10, 38, 573, 168);
		formToolkit.adapt(toolBar);
		formToolkit.paintBordersFor(toolBar);
		
		Label label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(10, 212, 573, 2);
		formToolkit.adapt(label, true, true);
		
		Label label_2 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(10, 31, 573, 2);
		formToolkit.adapt(label_2, true, true);
		
		txtNewText = formToolkit.createText(shell, "Пиши тут", SWT.NONE);
		txtNewText.setBounds(10, 234, 573, 50);
		
	}
	
		
	}
}
