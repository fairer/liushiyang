package com.lsy.struts.plugin;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import org.springframework.orm.ibatis.SqlMapClientFactoryBean;

import com.lsy.spring.dao.sqlmap.Ab01DaoSqlMap;

public class ServicePlugin implements PlugIn{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("开始加载Services...");
		try {
			Class.forName("com.lsy.struts.plugin.ServiceSupporter");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("加载Services结束");
//		try{
//		Object obj = ServiceSupporter.getService("dataSource");
//		SqlMapClientFactoryBean obj1 = (SqlMapClientFactoryBean)ServiceSupporter.getService("sqlMapClient_example");
//		Ab01DaoSqlMap dao = (Ab01DaoSqlMap)ServiceSupporter.getService("ab01Dao");
//		System.out.println("=========");
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
	}
}
