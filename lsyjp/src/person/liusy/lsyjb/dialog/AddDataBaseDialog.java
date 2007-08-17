package person.liusy.lsyjb.dialog;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import person.liusy.lsyjb.db.DbOperator;

import com.swtdesigner.SWTResourceManager;

public class AddDataBaseDialog extends Dialog {

	private Text text_2;
	private Text text_1;
	private Text text;
	protected Object result;

	protected Shell shell;

	/**
	 * Create the dialog
	 * @param parent
	 * @param style
	 */
	public AddDataBaseDialog(Shell parent, int style) {
		super(parent, style);
	}

	/**
	 * Create the dialog
	 * @param parent
	 */
	public AddDataBaseDialog(Shell parent) {
		this(parent, SWT.NONE);
	}

	/**
	 * Open the dialog
	 * @return the result
	 */
	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		return result;
	}

	/**
	 * Create contents of the dialog
	 */
	protected void createContents() {
		shell = new Shell(getParent(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shell.setImage(SWTResourceManager.getImage(AddDataBaseDialog.class, "/person/liusy/lsyjb/system/icons/adddatabase.gif"));
		shell.setSize(383, 287);
		shell.setText("添加数据库");

		final Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("", 12, SWT.NONE));
		label.setText("输入数据库名:");
		label.setBounds(38, 23, 114, 22);

		text = new Text(shell, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("", 12, SWT.NONE));
		text.setBounds(167, 22, 182, 28);

		final Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(22, 69, 131, 22);
		label_1.setFont(SWTResourceManager.getFont("", 12, SWT.NONE));
		label_1.setText("输入数据库描述:");

		

		text_2 = new Text(shell, SWT.BORDER);
		text_2.setFont(SWTResourceManager.getFont("", 12, SWT.NONE));
		text_2.setBounds(167, 64, 182, 102);

		final Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				String name = text.getText().trim();
				String note = text_2.getText().trim();
				if(name.equals("")){
					MessageDialog.openInformation(shell, "", "请输入数据库名");
					text.setFocus();
					text.selectAll();
					return;
				}
				DbOperator dbOperator = new DbOperator();
				dbOperator.addDatabase(name, note);
				result = "OK";
				shell.dispose();
			}
		});
		button.setText("确认");
		button.setBounds(92, 194, 78, 28);

		final Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				shell.dispose();
			}
		});
		button_1.setText("取消");
		button_1.setBounds(215, 194, 78, 28);
		//
	}
   
}
