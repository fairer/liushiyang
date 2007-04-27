package com.lsy.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ReflectUtil {
	
	Log log = LogFactory.getLog(this.getClass());
	
	public static void copyMapToObject(Map map,Object obj){
		
		BeanInfo bi = null;
		try {
			bi = Introspector.getBeanInfo(obj.getClass());
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		PropertyDescriptor[] pd = null;
		if(bi != null){
			pd = bi.getPropertyDescriptors();
		}
		for(int i = 0;i<pd.length;i++){
			String name = pd[i].getName();
			if(map.get(name) != null){
				Method method = pd[i].getWriteMethod();
				Object value = map.get(name);
				try {
					method.invoke(obj, new Object[]{value});
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public static void copyObjectToMap(Object obj,Map map){
		
		BeanInfo bi = null;
		try {
			bi = Introspector.getBeanInfo(obj.getClass());
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PropertyDescriptor[] pd = null;
		if(bi != null){
			pd = bi.getPropertyDescriptors();
		}
		for(int i = 0;i< pd.length;i++){
			Method readMethod = pd[i].getReadMethod();
			Object value = null;
			try {
				value = readMethod.invoke(obj, new Object[]{});
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(value != null)
				map.put(pd[i].getName(), value);
		}
	}
	
	public static void copyMapToMap(Map map1 ,Map map2){
		System.out.println(Calendar.getInstance().getTimeInMillis());
		for(Iterator it = map1.entrySet().iterator();it.hasNext();){
			Map.Entry entry = (Map.Entry)it.next();
			map2.put((String)entry.getKey(), entry.getValue());
		}
		
//		for(Iterator it = map1.keySet().iterator();it.hasNext();){
//			String key = (String)it.next();
//			map2.put(key, map1.get(key));
//		}
		System.out.println(Calendar.getInstance().getTimeInMillis());
	}
	
	public static void main(String[] args){
		Map map1 = new HashMap();
		map1.put("name", "liushiyang");
		map1.put("sex", "male");
		map1.put("old", new Integer(25));
//		Person person = new Person();
//		copyMapToObject(map, person);
//		System.out.println("name:"+person.getName());
//		System.out.println("sex:"+person.getSex());
//		System.out.println("old:"+person.getOld());
		Map map2 = new HashMap();
		copyMapToMap(map1, map2);
//		Person person = new Person();
//		person.setName("liushiyang");
//		person.setSex("male");
//		person.setOld(new Integer(25));
//		copyObjectToMap(person, map);
		System.out.println("name:"+map2.get("name"));
		System.out.println("sex:"+map2.get("sex"));
		System.out.println("old:"+map2.get("old"));
		
	}
	
}
