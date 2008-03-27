package person.liusy.lsyjb.editor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.actions.ActionGroup;

import person.liusy.lsyjb.db.DbOperator;
import person.liusy.lsyjb.db.doman.ColumnDomain;
import person.liusy.lsyjb.db.doman.TableDomain;
import person.liusy.lsyjb.dialog.AddColumnDialog;
import person.liusy.lsyjb.system.LsyImages;
import person.liusy.lsyjb.util.LsyjbUtil;

public class ColumnEditorActionGroup extends ActionGroup{
	
	private TableViewer tv;
	private TableDomain tableDomain;
	private AddAction addAction = new AddAction();
	private EditAction editAction = new EditAction();
	private DeleteAction deleteAction = new DeleteAction();
	
	public ColumnEditorActionGroup(TableViewer tv){
		this.tv = tv;
	}
	
	private class AddAction extends Action{
		
		public AddAction(){
			setText("����");
			setHoverImageDescriptor(LsyImages.getImageDescriptor(LsyImages.ADDTABLE));
		}
		public void run(){
			Map map = new HashMap();
			map.put("action", "create");
			map.put("table", tableDomain);
			System.out.println("0000000000000000:"+tableDomain);
			AddColumnDialog dialog = new AddColumnDialog(LsyjbUtil.getShell(),map);
			String result = (String)dialog.open();
			if(result != null && result.equals("OK")){
				//��ѯ��������ֶ�
				DbOperator dbOperator = new DbOperator();
				List input  = dbOperator.getColumnlist(tableDomain.getId().toString());
				tv.setInput(input);
//				tv.expandAll();
			}
		}
	}
	private class EditAction extends Action{
		
		public EditAction(){
			setText("�޸�");
			setHoverImageDescriptor(LsyImages.getImageDescriptor(LsyImages.TABLE));
		}
		public void run(){
			if(tv.getTable().getSelectionCount()!=1){
				MessageDialog.openInformation(null, "��ʾ��Ϣ", "��ѡ��һ���ֶ���Ϣ!");
			}else{
				TableItem[] item = tv.getTable().getSelection();
				Map map = new HashMap();
				map.put("action", "edit");
				map.put("table", tableDomain);
				map.put("column", (ColumnDomain)item[0].getData());
				
				AddColumnDialog dialog = new AddColumnDialog(LsyjbUtil.getShell(),map);
				String result = (String)dialog.open();
				if(result != null && result.equals("OK")){
					//��ѯ��������ֶ�
					DbOperator dbOperator = new DbOperator();
					List input  = dbOperator.getColumnlist(tableDomain.getId().toString());
					tv.setInput(input);
				}
			}
			
			
		}
	}
	private class DeleteAction extends Action{
		
		public DeleteAction(){
			setText("ɾ��");
			setHoverImageDescriptor(LsyImages.getImageDescriptor(LsyImages.ADDDATABASE));
		}
		public void run(){
			if(tv.getTable().getSelectionCount()==0){
				MessageDialog.openInformation(null, "��ʾ��Ϣ", "��ѡ��Ҫɾ�����ֶ�!");
			}else{
				
				if(MessageDialog.openConfirm(null, "ɾ��ȷ��", "ȷ��Ҫɾ��ѡ�е��ֶ���")){
					TableItem[] item = tv.getTable().getSelection();
					DbOperator dbOperator = new DbOperator();
					for(int i=0;i<item.length;i++){
						ColumnDomain cd = (ColumnDomain)item[i].getData();
						dbOperator.deleteColumn(cd);
					}
					List input  = dbOperator.getColumnlist(tableDomain.getId().toString());
					tv.setInput(input);
				}
				
			}
			
		}
	}
	
	public void fillActionToolBars(ToolBarManager toolBarManager){
		toolBarManager.add(addAction);
		toolBarManager.add(editAction);
		toolBarManager.add(deleteAction);
	}
	public void fillContextMenu(IMenuManager menu){
		menu.add(addAction);
		menu.add(editAction);
		menu.add(deleteAction);
	}
	public TableDomain getTableDomain() {
		return tableDomain;
	}
	public void setTableDomain(TableDomain tableDomain) {
		this.tableDomain = tableDomain;
	}
	
}
