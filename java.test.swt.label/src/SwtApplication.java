import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class SwtApplication {

	private Display display;
	private Shell shell;

	public SwtApplication() {
		display = new Display();
		shell = new Shell(display);
		shell.setText("Пример виджета Label (v1)");
		shell.setSize(500, 400);
	}

	public void createContent() {
		Label label1 = new Label(shell, SWT.BORDER);
		label1.setText("See no evil");
		label1.setSize(100, 20);
		label1.setLocation(30, 30);

		Label sep1 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL | SWT.SHADOW_IN);
		sep1.setBounds(30, 60, 100, 20);

		Label label2 = new Label(shell, SWT.NONE);
		label2.setText("Hear no evil");
		label2.setSize(100, 20);
		label2.setLocation(30, 90);

		Label sep2 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		sep2.setBounds(30, 120, 100, 20);

		Label label3 = new Label(shell, SWT.NONE);
		label3.setSize(100, 20);
		label3.setLocation(30, 150);
		label3.setBackground(new Color(display, 200, 111, 50));
		label3.setText("Speak no evil");
	}

	public void working() {
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
