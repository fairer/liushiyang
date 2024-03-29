package name.xio.xiorkflow.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import name.xio.xiorkflow.domain.Process;
import name.xio.xiorkflow.domain.ProcessResult;
import name.xio.xiorkflow.domain.logic.ProcessService;
import name.xio.xml.SimpleXMLWorkShop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jdom.Document;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class GetProcess implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");

        log.info("get process:" + name);

        ProcessResult processResult = this.getProcessService().getProcess(name);

        Process process = processResult.getProcess();

        response.setContentType("text/xml");
        response.setHeader("Cache-Control", "no-cache");

        Document doc = null;
        if (process != null) {
            doc = process.getDoc();
        }
        doc = (doc == null) ? ProcessResult.convertXml(processResult) : doc;

        SimpleXMLWorkShop.outputXML(doc, response.getOutputStream());

        //not redirect to other view,it processed on response
        return null;
    }

    /**
     * @return Returns the processService.
     */
    public ProcessService getProcessService() {
        return processService;
    }

    /**
     * @param processService The processService to set.
     */
    public void setProcessService(ProcessService processService) {
        this.processService = processService;
    }

    private Log log = LogFactory.getLog(GetProcess.class);

    private ProcessService processService;
}