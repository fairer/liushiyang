package person.liusy.lsyjb.system;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public abstract class LabelProviderAdapter implements ILabelProvider{

	public Image getImage(Object element){
		return null;
	}

	public String getText(Object element) {
		return null;
	}

	public void addListener(ILabelProviderListener listener) {
	}

	public void dispose() {
		
	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}
	
}
