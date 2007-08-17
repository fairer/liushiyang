package person.liusy.lsyjb.dialog;

import java.util.List;
import java.util.Map;

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
import person.liusy.lsyjb.db.doman.Aa10Domain;
import person.liusy.lsyjb.db.doman.ColumnDomain;
import person.liusy.lsyjb.db.doman.TableDomain;

import com.swtdesigner.SWTResourceManager;

public class AddColumnDialog extends Dialog {

	private Text note;
	private Text pxh;
	private Text cnname;
	private Text xslength;
	private Text length;
	private Text name;
	private Combo type;
	private Text id;
	protected Object result;
	protected Shell shell;
	private Map info;
	private Button iskey; 
	private Button isnull;
	private Button isindex;
	
	/**
	 * Create the dialog
	 * @param parent
	 * @param style
	 */
	public AddColumnDialog(Shell parent, int style) {
		super(parent, style);
	}

	/**
	 * Create the dialog
	 * @param parent
	 */
	public AddColumnDialog(Shell parent,Map info) {
		this(parent, SWT.NONE);
		this.info = info;
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
		shell.setImage(SWTResourceManager.getImage(AddColumnDialog.class, "/person/liusy/lsyjb/system/icons/table.gif"));
		shell.setSize(482, 508);
		shell.setText("数据库字段定义窗口");

		final Label label = new Label(shell, SWT.NONE);
		label.setText("字段编号:");
		label.setBounds(39, 22, 59, 19);

		id = new Text(shell, SWT.BORDER);
		id.setBounds(105, 15, 88, 22);

		iskey = new Button(shell, SWT.CHECK);
		iskey.setText("主键标志");
		iskey.setBounds(225, 15, 97, 22);

		isnull = new Button(shell, SWT.CHECK);
		isnull.setBounds(328, 15, 97, 22);
		isnull.setText("允许为空");

		final Label label1 = new Label(shell, SWT.NONE);
		label1.setBounds(39, 62, 59, 19);
		label1.setText("字段类型:");

		type = new Combo(shell, SWT.READ_ONLY);
		type.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				String typevalue = (String)type.getData(type.getText());
				if(typevalue.equals("3")){
					xslength.setEditable(true);
				}
				else{
					xslength.setText("");
					xslength.setEditable(false);
				}
			}
		});
		type.setBounds(105, 59, 320, 21);
		DbOperator dbOperator = new DbOperator();
		List typelist = dbOperator.getAa10list("type");
		String[] types = new String[typelist.size()];
		for(int i = 0 ;i <typelist.size();i++){
			Aa10Domain domain = (Aa10Domain)typelist.get(i);
			types[i] = domain.getValue()+"-"+domain.getText();
			type.setData(domain.getValue()+"-"+domain.getText(),domain.getValue());
		}
		type.setItems(types);
		type.select(0);
		
		final Label label1_1 = new Label(shell, SWT.NONE);
		label1_1.setBounds(39, 99, 59, 19);
		label1_1.setText("字段名称:");

		name = new Text(shell, SWT.BORDER);
		name.setBounds(105, 96, 320, 22);

		final Label label1_1_1 = new Label(shell, SWT.NONE);
		label1_1_1.setBounds(39, 136, 59, 19);
		label1_1_1.setText("长度:");

		length = new Text(shell, SWT.BORDER);
		length.setBounds(105, 133, 97, 22);

		final Label label1_1_1_1 = new Label(shell, SWT.NONE);
		label1_1_1_1.setBounds(225, 136, 59, 19);
		label1_1_1_1.setText("小数长度:");

		xslength = new Text(shell, SWT.BORDER);
		xslength.setBounds(290, 133, 97, 22);

		final Label label1_1_2 = new Label(shell, SWT.NONE);
		label1_1_2.setBounds(39, 171, 59, 19);
		label1_1_2.setText("中文名称:");

		cnname = new Text(shell, SWT.BORDER);
		cnname.setBounds(105, 168, 320, 22);

		isindex = new Button(shell, SWT.CHECK);
		isindex.setBounds(39, 202, 88, 22);
		isindex.setText("是否索引");

		final Label label1_1_1_1_1 = new Label(shell, SWT.NONE);
		label1_1_1_1_1.setBounds(134, 207, 47, 19);
		label1_1_1_1_1.setText("排序号:");

		pxh = new Text(shell, SWT.BORDER);
		pxh.setBounds(188, 204, 97, 22);

		final Label label1_1_1_2 = new Label(shell, SWT.NONE);
		label1_1_1_2.setBounds(39, 234, 59, 19);
		label1_1_1_2.setText("描述:");

		note = new Text(shell, SWT.BORDER);
		note.setBounds(39, 259, 386, 151);

		final Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				DbOperator dbOperator = new DbOperator();
				ColumnDomain cdomain = new ColumnDomain();
				cdomain.setCnname(cnname.getText());
				cdomain.setIsindex(isindex.getSelection()?"1":"0");
				cdomain.setIskey(iskey.getSelection()?"1":"0");
				cdomain.setIsnull(isnull.getSelection()?"1":"0");
				cdomain.setIsvalid("1");
				cdomain.setLength(new Integer(length.getText()));
				cdomain.setName(name.getText());
				cdomain.setNote(note.getText());
				cdomain.setPxh(new Integer(pxh.getText()));
				TableDomain tdomain = (TableDomain)info.get("table"); 
				System.out.println(tdomain);
				cdomain.setTable_id(tdomain.getId());
				cdomain.setType((String)type.getData(type.getText()));
				System.out.println(xslength);
				cdomain.setXslength(xslength.getText().trim().equals("")?null:new Integer(xslength.getText()));
				dbOperator.addColumn(cdomain);
				result = "OK";
				shell.dispose();
			}
		});
		button.setText("确定");
		button.setBounds(134, 427, 83, 23);

		final Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				shell.dispose();
			}
		});
		button_1.setText("取消");
		button_1.setBounds(239, 427, 83, 23);
		//
		initData();
	}
	private void initData(){
		
			String temp = (String)info.get("action");
			if(temp.equals("create")){
				id.setEditable(false);
			}
			
		
			
	}
}
