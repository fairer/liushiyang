package person.liusy.lsyjb.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class ColumnEditorInput implements IEditorInput{

	private static ColumnEditorInput columnEditorInput = null;
	private String name = "";
	
	private ColumnEditorInput(){
		
	}
	public static ColumnEditorInput getColumnEditorInput(){
		if(columnEditorInput == null){
			columnEditorInput = new ColumnEditorInput();
		}
		return columnEditorInput;
	}
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getToolTipText() {
		// TODO Auto-generated method stub
		return name;
	}

	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setName(String name){
		this.name = name ;
	}
	
}
