package person.liusy.lsyjb.views;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionGroup;

import person.liusy.lsyjb.dialog.AddDataBaseDialog;
import person.liusy.lsyjb.dialog.AddTableDialog;
import person.liusy.lsyjb.system.LsyImages;
import person.liusy.lsyjb.tree.LsytreeFactory;
import person.liusy.lsyjb.util.LsyjbUtil;

public class NavigatorActionGroup extends ActionGroup{

	private TreeViewer tv = null;
	
	public NavigatorActionGroup(TreeViewer tv){
		this.tv = tv;
	}
	@Override
	public void fillActionBars(IActionBars actionBars) {
		
		IToolBarManager toolBar = actionBars.getToolBarManager();
		toolBar.add(new AddDataBaseAction());
		toolBar.add(new AddTableAction());
		
	}
	private class AddDataBaseAction extends Action{
		
		public AddDataBaseAction(){
			setHoverImageDescriptor(LsyImages.getImageDescriptor(LsyImages.ADDDATABASE));
			setText("添加数据库");
		}
		@Override
		public void run() {
			 
			AddDataBaseDialog dialog = new AddDataBaseDialog(LsyjbUtil.getShell());
			String result = (String)dialog.open();
			if(result != null && result.equals("OK")){
//				tv.setInput();
				List input  = LsytreeFactory.createLatestEntryTree();
				tv.setInput(input);
				tv.expandAll();
			}
		}
		
	}
	private class AddTableAction extends Action{
		
		public AddTableAction(){
			setHoverImageDescriptor(LsyImages.getImageDescriptor(LsyImages.ADDTABLE));
			setText("添加表");
		}
		public void run() {
			AddTableDialog dialog = new AddTableDialog(LsyjbUtil.getShell());
			String result = (String)dialog.open();
			if(result != null && result.equals("OK")){
				List input  = LsytreeFactory.createLatestEntryTree();
				tv.setInput(input);
				tv.expandAll();
			}
		}
		
	}
}
