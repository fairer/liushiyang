package com.lsy.struts.common;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class BaseAction extends Action{

	
	Class[] paramTypes = {ActionMapping.class,ActionForm.class,HttpServletRequest.class,HttpServletResponse.class};
	
	public final ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String parameter = mapping.getParameter();
		
		String methodName = request.getParameter(parameter);
		Method method = null;
		if(methodName != null){
			method = this.getClass().getMethod(methodName, paramTypes);
		}
		ActionForward methodFoward = null;
		if(method != null){
			methodFoward = (ActionForward)method.invoke(this,new Object[]{mapping,form,request,response}); 
		}
		return methodFoward;
	}
}
