package com.lsy.struts.plugin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import com.lsy.util.Resources;


public class ServiceBuilder {
	private static final Log log = LogFactory.getLog(ServiceBuilder.class);
	public static String[] buildServiceConfig() throws Exception
    {
        java.io.Reader reader = null;
        try
        {
            reader = Resources.getResourceAsReader("com/lsy/spring/config/spring-config.xml");
        }
        catch(Exception exception)
        {
            log.error("Could not initialize BaseLogic.  Cause: " + exception);
            throw new RuntimeException("Could not initialize BaseLogic.  Cause: " + exception);
        }
        SAXBuilder saxbuilder = new SAXBuilder();
        Document document = null;
        try
        {
            document = saxbuilder.build(reader);
        }
        catch(IOException ioexception)
        {
            log.error("Can't load config xml file", ioexception);
            throw new Exception(ioexception.getMessage());
        }
        catch(JDOMException jdomexception)
        {
            log.error("Can't load config xml file", jdomexception);
            throw new Exception(jdomexception.getMessage());
        }
        Element element = document.getRootElement();
        String s1 = element.getName();
        if(!"spring-config".equals(s1))
            throw new Exception("Error while configuring yhcip-config.  The root tag of the Yhcip-config configuration XML document must be 'spring-config'.");
        Element element1 = element.getChild("services");
        List valueList = new ArrayList();
        if(element1 != null)
        {
            List list = element1.getChildren("serviceConfig");
            for(int i = 0; i < list.size(); i++)
            {
                Element element2 = (Element)list.get(i);
                if("serviceConfig".equals(element2.getName()))
                	valueList.add(element2.getAttribute("resource").getValue());
            }

        }
        return (String[])valueList.toArray(new String[valueList.size()]);
    }
}
