package person.liusy.lsyjb.util;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class LsyjbUtil {

	private LsyjbUtil(){
		
	}
	public static Shell getShell(){
		return Display.getDefault().getShells()[0];
	}
}
