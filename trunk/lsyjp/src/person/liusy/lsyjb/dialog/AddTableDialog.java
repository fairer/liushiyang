package person.liusy.lsyjb.dialog;

import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import person.liusy.lsyjb.db.DbOperator;
import person.liusy.lsyjb.db.doman.DatabaseDomain;
import person.liusy.lsyjb.db.doman.TableDomain;

import com.swtdesigner.SWTResourceManager;

public class AddTableDialog extends Dialog {

	private Text text_1;
	private Text text;
	private Combo combo;
	protected Object result;
	protected Shell shell;

	/**
	 * Create the dialog
	 * @param parent
	 * @param style
	 */
	public AddTableDialog(Shell parent, int style) {
		super(parent, style);
	}

	/**
	 * Create the dialog
	 * @param parent
	 */
	public AddTableDialog(Shell parent) {
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
		shell.setImage(SWTResourceManager.getImage(AddTableDialog.class, "/person/liusy/lsyjb/system/icons/addtable.gif"));
		shell.setSize(329, 323);
		shell.setText("增加表");

		final Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				String name = text.getText().trim();
				String note = text_1.getText().trim();
				if(name.equals("")){
					MessageDialog.openInformation(shell, "", "请输入表名");
					text.setFocus();
					text.selectAll();
					return;
				}
				DbOperator dbOperator = new DbOperator();
				TableDomain tdomain = new TableDomain();
				tdomain.setDatabase_id((Integer)combo.getData(combo.getItem(combo.getSelectionIndex())));
				tdomain.setName(name);
				tdomain.setNote(note);
				dbOperator.addTable(tdomain);
				result = "OK";
				shell.dispose();
			}
		});
		button.setText("确认");
		button.setBounds(49, 224, 81, 34);

		final Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				shell.dispose();
			}
		});
		button_1.setText("取消");
		button_1.setBounds(173, 224, 81, 34);

		combo = new Combo(shell, SWT.READ_ONLY);
		combo.setBounds(141, 21, 149, 25);
		DbOperator dbOperator = new DbOperator();
		List databaselist = dbOperator.getDatabaselist();
		String[] databases = new String[databaselist.size()];
		for(int i = 0 ;i <databaselist.size();i++){
			DatabaseDomain domain = (DatabaseDomain)databaselist.get(i);
			databases[i] = domain.getName();
			combo.setData(domain.getName(),domain.getId());
		}
 		combo.setItems(databases);
 		combo.select(0);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(141, 63, 149, 25);

		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(141, 102, 149, 101);

		final Label label = new Label(shell, SWT.NONE);
		label.setText("请选择数据库");
		label.setBounds(35, 25, 101, 21);

		final Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(34, 67, 101, 21);
		label_1.setText("请输入表名:");

		final Label label_1_1 = new Label(shell, SWT.NONE);
		label_1_1.setBounds(34, 102, 101, 21);
		label_1_1.setText("请输入注释:");
		//
	}

}
