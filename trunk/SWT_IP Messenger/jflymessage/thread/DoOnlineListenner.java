package jflymessage.thread;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import jflymessage.common.Define;
import jflymessage.util.TableList;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
	
public class DoOnlineListenner extends Thread{
	
	private byte[] buffer = new byte[1024];
	private Display display;
	private Table table;
	private TableList tablelist;
	public static DatagramSocket ds;
	public DoOnlineListenner(Display display,Table table,TableList tablelist){
		this.display = display;
		this.table = table;
		this.tablelist = tablelist;
	}
	
	public void run() {
		try {
			ds = new DatagramSocket(Define.DO_ONLINE_PORT);
			while (true) {
				final DatagramPacket p = new DatagramPacket(buffer,buffer.length);
				ds.receive(p);
				final InetAddress address =  p.getAddress();
				int sendType = (int)p.getData()[0];
				switch(sendType){
					//处理用户第一次上线消息
					case Define.SENDTYPE_THEFIRSTONLINE:
						if(tablelist.find(address.getHostAddress()) == -1){
							if (!display.isDisposed()) {
								Runnable runnable = new Runnable(){
									public void run() {
										// TODO Auto-generated method stub
										TableItem item = new TableItem(table,0);
										item.setText(new String[]{address.getHostName(),"",address.getHostName(),address.getHostAddress()});
										tablelist.add(address);
									}
								};
								display.syncExec(runnable);
							}
						}
						//再返回用户自己在线消息
						DatagramSocket ds_temp = new DatagramSocket(Define.TEMP_PORT);
						byte[] sendBuffer = new byte[]{Define.SENDTYPE_ONLINE}; 
						ds_temp.send(new DatagramPacket(sendBuffer,sendBuffer.length,address,Define.DO_ONLINE_PORT));
						ds_temp.close();
						break;
					//处理用户返回上线消息
					case Define.SENDTYPE_ONLINE:
						if(tablelist.find(address.getHostAddress()) == -1){
							if (!display.isDisposed()) {
								Runnable runnable = new Runnable(){
									public void run() {
										// TODO Auto-generated method stub
										TableItem item = new TableItem(table,0);
										item.setText(new String[]{address.getHostName(),"",address.getHostName(),address.getHostAddress()});
										tablelist.add(address);
									}
								};
								display.syncExec(runnable);
							}
						}
						break;
					//处理用户下线消息	
					case Define.SENDTYPE_OUTLINE:
						final int temp = tablelist.find(address.getHostAddress());
						if( temp  >= 0){
							if (!display.isDisposed()) {
								Runnable runnable = new Runnable(){
									public void run() {
										// TODO Auto-generated method stub
										table.remove(temp);
										tablelist.remove(temp);
									}
								};
								display.syncExec(runnable);
							}
						}
						break;
						//处理用户发送文本消息	
					case Define.SENDTYPE_MESSAGE:
						if (!display.isDisposed()) {
							Runnable runnable = new Runnable(){
								public void run() {
									MessageDialog.openInformation(null, "消息提示", 
											address.getHostName()+"["+address.getHostAddress()+"] 给您发来消息:\n"
											+"  "+new String(p.getData(),1,p.getLength()));
									
								}
							};
							display.syncExec(runnable);
							break;
						}
					default:
						break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}	
