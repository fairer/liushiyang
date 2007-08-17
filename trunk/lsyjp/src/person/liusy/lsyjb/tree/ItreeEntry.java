package person.liusy.lsyjb.tree;

import java.util.List;

public interface ItreeEntry {

	public void setName(String name);
	public String getName();
	public void setChildren(List children);
	public List getChildren();
	public void addChild(ItreeEntry entry);
	public boolean hasChild();
	public void setParentEntry(ItreeEntry parentEntry);
	public ItreeEntry getParentEntry();
	
}
