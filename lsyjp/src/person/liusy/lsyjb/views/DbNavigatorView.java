package person.liusy.lsyjb.views;

import java.util.List;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import person.liusy.lsyjb.db.DbOperator;
import person.liusy.lsyjb.db.doman.TableDomain;
import person.liusy.lsyjb.editor.ColumnEditor;
import person.liusy.lsyjb.system.LabelProviderAdapter;
import person.liusy.lsyjb.system.TreeContentProviderAdapter;
import person.liusy.lsyjb.tree.ItreeEntry;
import person.liusy.lsyjb.tree.LsytreeFactory;
import person.liusy.lsyjb.tree.impl.NavigatorEntry;

public class DbNavigatorView extends ViewPart{

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		Composite comp = new Composite(parent,SWT.NONE);
		comp.setLayout(new FillLayout());
		TreeViewer tv = new TreeViewer(comp,SWT.NONE);
		tv.setContentProvider(new MyContentProvider());
		tv.setLabelProvider(new MyLabelProvider());
		tv.addDoubleClickListener(new TableDoubleClickListener());
		List inputObj = LsytreeFactory.createLatestEntryTree();
		tv.setInput(inputObj);
		tv.expandAll();
		IActionBars bars = getViewSite().getActionBars();
		NavigatorActionGroup actionGroup = new NavigatorActionGroup(tv);
		actionGroup.fillActionBars(bars);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	private static final class MyLabelProvider extends LabelProviderAdapter{
		public String getText(Object element){
			ItreeEntry itreeEntry = (ItreeEntry)element;
			return itreeEntry.getName();
		}
		public Image getImage(Object element){
			NavigatorEntry navigatorEntry = (NavigatorEntry)element;
			return navigatorEntry.getImage();
		}

	}
	private static final class MyContentProvider extends TreeContentProviderAdapter{

		public Object[] getChildren(Object parentElement) {
			// TODO Auto-generated method stub
			ItreeEntry itreeEntry = (ItreeEntry)parentElement;
			return itreeEntry.getChildren().toArray();
			
		}

		public boolean hasChildren(Object element) {
			ItreeEntry itreeEntry = (ItreeEntry)element;
			
			return itreeEntry.hasChild();
		}

		public Object[] getElements(Object inputElement) {
			// TODO Auto-generated method stub
			if(inputElement instanceof List){
				List list = (List)inputElement;
				return list.toArray();
			}else{
				return new Object[0];
			}
		}
	}
	
	private class TableDoubleClickListener implements IDoubleClickListener{

		public void doubleClick(DoubleClickEvent event) {
			
			IStructuredSelection sel = (IStructuredSelection)event.getSelection();
			NavigatorEntry navigatorEntry = (NavigatorEntry)sel.getFirstElement();
			IEditorInput editorInput = navigatorEntry.getEditorInput();
			String editorId = navigatorEntry.getEditorId();
			if(editorInput == null || editorId == null)
				return;
			IWorkbenchPage workbenchPage = getViewSite().getPage();
			IEditorPart editorPart = workbenchPage.findEditor(editorInput);
			if(editorPart != null){
				workbenchPage.bringToTop(editorPart);
				ColumnEditor a = (ColumnEditor)editorPart;
				a.setTheTitle(navigatorEntry.getName());
				a.setTableDomain((TableDomain)navigatorEntry.getData());
				DbOperator dbOperator = new DbOperator();
				TableDomain td = (TableDomain)navigatorEntry.getData();
				List input  = dbOperator.getColumnlist(td.getId().toString());
				a.getTv().setInput(input);
			}else{
				try {
					editorPart = workbenchPage.openEditor(editorInput,editorId);
					ColumnEditor a = (ColumnEditor)editorPart;
					a.setTheTitle(navigatorEntry.getName());
					a.setTableDomain((TableDomain)navigatorEntry.getData());
					DbOperator dbOperator = new DbOperator();
					TableDomain td = (TableDomain)navigatorEntry.getData();
					List input  = dbOperator.getColumnlist(td.getId().toString());
					a.getTv().setInput(input);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			
		}
		
	}
}
