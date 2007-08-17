package person.liusy.lsyjb.system;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class LsyTableContentProvider implements IStructuredContentProvider{

	public Object[] getElements(Object inputElement) {
		
		if(inputElement instanceof List)
			return ((List)inputElement).toArray();
		return new Object[0];
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}

}
