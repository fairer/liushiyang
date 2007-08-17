package person.liusy.lsyjb.tree.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;

import person.liusy.lsyjb.tree.ItreeEntry;

public class NavigatorEntry implements ItreeEntry{

	private String name ;
	private ItreeEntry parentEntry;
	private List children = new ArrayList();
	private Image image;
	private Object data;
	
	//
	private IEditorInput editorInput;
	private String editorId;
	
	public IEditorInput getEditorInput() {
		return editorInput;
	}

	public void setEditorInput(IEditorInput editorInput) {
		this.editorInput = editorInput;
	}

	public String getEditorId() {
		return editorId;
	}

	public void setEditorId(String editorId) {
		this.editorId = editorId;
	}

	public NavigatorEntry(String name){
		this.name = name ;
	}
	
	public void addChild(ItreeEntry entry) {
		// TODO Auto-generated method stub
		this.children.add(entry);
	}

	public List getChildren() {
		// TODO Auto-generated method stub
		return this.children;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public ItreeEntry getParentEntry() {
		// TODO Auto-generated method stub
		return parentEntry;
	}

	public boolean hasChild() {
		// TODO Auto-generated method stub
		return children.size() > 0;
	}

	public void setChildren(List children) {
		// TODO Auto-generated method stub
		this.children = children;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name ;
	}

	public void setParentEntry(ItreeEntry parentEntry) {
		// TODO Auto-generated method stub
		this.parentEntry = parentEntry;
	}

	public Image getImage(){
		return image;
	}
	public void setImage(Image image){
		this.image = image;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
