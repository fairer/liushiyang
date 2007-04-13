package name.xio.ui;

import java.io.Serializable;
import java.util.List;

public interface TreeNodeImpl {

	/**
	 * 
	 * @return
	 */
	public List load(TreeNode treeNode);
	
	
	public class TreeNode implements Serializable{
		
		private final static long serialVersionUID = 1;
		private String id ;
		private String title ;
		private String link;
		private String img;
		private boolean isCheckbox;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public boolean getIsCheckbox() {
			return isCheckbox;
		}
		public void setIsCheckbox(boolean isCheckbox) {
			this.isCheckbox = isCheckbox;
		}
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
		}
		
	};
}
