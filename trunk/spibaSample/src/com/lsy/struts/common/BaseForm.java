package com.lsy.struts.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts.action.ActionForm;

public class BaseForm extends ActionForm{
	
	Map map = new HashMap();
	String[] selectArray = new String[20];
	  public String[] getSelectArray() {
	    return selectArray;
	  }

	  public void setSelectArray(String[] selectArray) {
	    this.selectArray = selectArray;
	  }

	  public String getArray(int i) {
	    return selectArray[i];
	  }

	  public void setArray(int i, String value) {
	    selectArray[i] = value;
	  }
	
	public Object getSto(String key){
		return map.get(key)!=null?map.get(key):"";
	}
	public void setSto(String key,Object obj){
		map.put(key, obj);
	}
	public Map getStoMap(){
		return map;
	}
	
}
