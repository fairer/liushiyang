package person.liusy.lsyjb.system;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

public class LsyImages {

	private static final String ICONS_PATH= "icons/";
	
	public static final String DATABASE = "DATABASE";
	
	public static final String TABLE = "TABLE";
	
	public static final String ADDDATABASE = "ADDDATABASE";
	
	public static final String ADDTABLE = "ADDTABLE";
	//http://www.poohu.com/special/200703102450.shtml
	private static ImageRegistry imageRegistry;
	
	public static ImageRegistry getImageRegistry(){
		if(imageRegistry == null){
			imageRegistry = new ImageRegistry();
			declareImages();
		}
		return imageRegistry;
	}
	
	private static final void declareImages(){
		declareRegistryImage(DATABASE,ICONS_PATH+"database.gif");
		declareRegistryImage(TABLE,ICONS_PATH+"table.gif");
		declareRegistryImage(ADDDATABASE,ICONS_PATH+"adddatabase.gif");
		declareRegistryImage(ADDTABLE,ICONS_PATH+"addtable.gif");
		
	}
	private static final void declareRegistryImage(String key,String path){
		
		ImageDescriptor desc = ImageDescriptor.createFromFile(LsyImages.class, path);
		imageRegistry.put(key, desc);
	}
	
	public static Image getImage(String key){
		return getImageRegistry().get(key);
	}
	public static ImageDescriptor getImageDescriptor(String key){
		return getImageRegistry().getDescriptor(key);
	}
}
