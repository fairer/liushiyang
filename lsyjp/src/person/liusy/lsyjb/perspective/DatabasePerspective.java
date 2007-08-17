package person.liusy.lsyjb.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class DatabasePerspective implements IPerspectiveFactory{

	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		String editArea = layout.getEditorArea();
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.3f, editArea);
		left.addView("person.liusy.lsyjb.views.DbNavigatorView");
		
	}

}
