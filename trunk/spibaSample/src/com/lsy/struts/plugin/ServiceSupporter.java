package com.lsy.struts.plugin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceSupporter {

	
	private static ApplicationContext ctx;
	
    private static final Log log = LogFactory.getLog(ServiceSupporter.class);
	static {
		String[] as = null;
		 try
	        {
			 as = ServiceBuilder.buildServiceConfig();
			 ctx = new ClassPathXmlApplicationContext(as);
	        }
	        catch(Exception exception)
	        {
	            exception.printStackTrace();
	        }
	}
	public static Object getService(String serviceName){
		return ctx.getBean(serviceName);
			
	}

	
}
