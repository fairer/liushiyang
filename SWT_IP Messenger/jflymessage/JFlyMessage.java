package jflymessage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import jflymessage.common.Define;
import jflymessage.thread.CircleSendThread;
import jflymessage.thread.DoOnlineListenner;
import jflymessage.util.TableList;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.swtdesigner.SWTResourceManager;

//import com.swtdesigner.SWTResourceManager;

public class JFlyMessage extends ApplicationWindow {

	private StyledText text;

	private Table table;

	private TableList tablelist = new TableList();

	// private static QueryOnlineListenner queryOnlineListenner = null;
	private static DoOnlineListenner doOnlineListenner = null;

	/**
	 * Create the application window
	 */
	public JFlyMessage() {
		super(null);

		createActions();
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Create contents of the application window
	 * 
	 * @param parent
	 */
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		final ScrolledComposite scrolledComposite = new ScrolledComposite(
				container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(10, 0, 244, 125);

		table = new Table(scrolledComposite, SWT.BORDER);
		table.setSize(244, 125);
		scrolledComposite.setContent(table);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		final TableColumn newColumnTableColumn = new TableColumn(table,
				SWT.NONE);
		newColumnTableColumn.setWidth(60);
		newColumnTableColumn.setText("用户名");

		final TableColumn newColumnTableColumn_1 = new TableColumn(table,
				SWT.NONE);
		newColumnTableColumn_1.setWidth(60);
		newColumnTableColumn_1.setText("工作组");

		final TableColumn newColumnTableColumn_2 = new TableColumn(table,
				SWT.NONE);
		newColumnTableColumn_2.setWidth(60);
		newColumnTableColumn_2.setText("主机名");

		final TableColumn newColumnTableColumn_3 = new TableColumn(table,
				SWT.NONE);
		newColumnTableColumn_3.setWidth(60);
		newColumnTableColumn_3.setText("IP 地址");
		/**
		 * 循环发布上线消息
		 */
		byte[] sendBuffer = new byte[] { Define.SENDTYPE_THEFIRSTONLINE };
		new CircleSendThread(sendBuffer, Define.START_CIRCLE_PORT,
				Define.DO_ONLINE_PORT).start();
		/**
		 * 开启处理"查询在线"的监听线程,如果收到查询 信息则返回询问端在线
		 */
		// queryOnlineListenner = new
		// QueryOnlineListenner(Display.getCurrent(),table,tablelist);
		// queryOnlineListenner.start();
		/**
		 * 开启处理"用户在(离)线"的监听线程,网列表里添加(删除)一个用户
		 */
		doOnlineListenner = new DoOnlineListenner(Display.getCurrent(), table,
				tablelist);

		
		text = new StyledText(container, SWT.V_SCROLL | SWT.BORDER | SWT.MIRRORED | SWT.WRAP);
		text.setBounds(10, 138, 314, 71);

		final Button button = new Button(container, SWT.NONE);
		button.setText("发送");
		button.setBounds(40, 212, 125, 23);
		button.addMouseListener(new MouseAdapter() {
			public void mouseDown(MouseEvent e) {
				try {
					int index = table.getSelectionIndex();
					
					if (index < 0) {
						MessageDialog.openWarning(null, "提示信息", "必须先选择一个用户!");
					} else if(text.getText().getBytes().length > 1023){
						MessageDialog.openWarning(null, "提示信息", "您输入的消息内容过长!不能大于1024个字节");
					}
					else {
						InetAddress selectAddress = (InetAddress) tablelist.get(index);
						// 发送文本消息
						DatagramSocket ds_temp = new DatagramSocket(Define.TEMP_PORT);
						byte[] sendBuffer = new byte[text.getText().getBytes().length + 1];
						sendBuffer[0] = Define.SENDTYPE_MESSAGE;
						byte[] tempBuffer = text.getText().getBytes();
						for (int i = 0; i < tempBuffer.length; i++) {
							sendBuffer[i + 1] = tempBuffer[i];
						}
						ds_temp.send(new DatagramPacket(sendBuffer,sendBuffer.length, selectAddress,Define.DO_ONLINE_PORT));
						ds_temp.close();
						text.setText("");
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		doOnlineListenner.start();

		//
		return container;
	}

	/**
	 * Create the actions
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Create the menu manager
	 * 
	 * @return the menu manager
	 */
	protected MenuManager createMenuManager() {
		MenuManager menuManager = new MenuManager("menu");
		return menuManager;
	}

	/**
	 * Create the toolbar manager
	 * 
	 * @return the toolbar manager
	 */
	protected ToolBarManager createToolBarManager(int style) {
		ToolBarManager toolBarManager = new ToolBarManager(style);
		return toolBarManager;
	}

	/**
	 * Create the status line manager
	 * 
	 * @return the status line manager
	 */
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		statusLineManager.setMessage(null, "");
		return statusLineManager;
	}

	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			JFlyMessage window = new JFlyMessage();
			window.setBlockOnOpen(true);

			window.open();
			byte[] sendBuffer = new byte[] { Define.SENDTYPE_OUTLINE };
			new CircleSendThread(sendBuffer, Define.END_CIRCLE_PORT,
					Define.DO_ONLINE_PORT).start();
			Display.getCurrent().dispose();
			while (doOnlineListenner.isAlive()) {
				DoOnlineListenner.ds.close();
				doOnlineListenner.stop();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell
	 * 
	 * @param newShell
	 */
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("飞鸽传书 IP Messenger");
		newShell.setImage(SWTResourceManager.getImage(JFlyMessage.class, "/jflymessage/resources/mobile.ico"));
		// newShell.setImage(SWTResourceManager.getImage(JFlyMessage.class,
		// "/jflymessage/resources/mobile.ico"));
	}

	/**
	 * Return the initial size of the window
	 */
	protected Point getInitialSize() {
		return new Point(342, 314);
	}

}
