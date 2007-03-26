

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class DateConverterTag extends TagSupport {
    
    //~ Instance fields ////////////////////////////////////////////////////////
    private String textformat;
    private String defaultValue;
    private String value;
    private boolean escape = false;

    //~ Methods ////////////////////////////////////////////////////////////////
	
    public void setDefault(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setEscape(boolean escape) {
        this.escape = escape;
    }

    public void setValue(String value) {
        this.value = value;
    }

	public void setTextformat(String textformat) {
		this.textformat = textformat;
	}
	
    public int doStartTag() throws JspException {
        try {
            Object actualValue = null;

            if (value == null) {
                value = "top";
            }

            // exception: don't call findString(), since we don't want the
            //            expression parsed in this one case. it really
            //            doesn't make sense, in fact.
            actualValue = value;
            Date aValue = (Date)actualValue;
            if (actualValue != null) {
            	if ("yyyy��MM��dd�� HH:mm:ss".equals(textformat)){
            		pageContext.getOut().print(formatDateTime(aValue));	
            	}
            	if ("yyyy��MM��dd�� HH:mm".equals(textformat)){
            		pageContext.getOut().print(formatDateTime2(aValue));	
            	}
                else if ("yyyy��MM��dd��".equals(textformat)){
                	pageContext.getOut().print(formatDate(aValue));	
                }
                else if ("yyyy-MM-dd".equals(textformat)){
                	pageContext.getOut().print(formatInput(aValue));	
                }
                else if ("yyyy.MM.dd".equals(textformat)){
                	pageContext.getOut().print(formatInput2(aValue));	
                }
                else{
                	Object bValue = value;
                	pageContext.getOut().print(prepare(bValue));
                }
            } else if (defaultValue != null) {
                pageContext.getOut().print(prepare(defaultValue));
            }
        } catch (IOException e) {
           
        }

        return SKIP_BODY;
    }

    private Object prepare(Object value) {
        if (escape) {
            return value.toString();
        } else {
            return value;
        }
    }
    
    /**
     * �õ�����ʱ���ʽ��
     * */
    public String formatDateTime(Date d) {
      DateFormat dateTimeFmt = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
      if (d == null || "".equals(d)) {
        return "ʱ��δ֪";
      }
      else {
        return dateTimeFmt.format(d);
      }
    }
    
    /**
     * �õ�����ʱ���ʽ��
     * */
    public String formatDateTime2(Date d) {
      DateFormat dateTimeFmt = new SimpleDateFormat("yyyy��MM��dd�� HH:mm");
      if (d == null || "".equals(d)) {
        return "ʱ��δ֪";
      }
      else {
        return dateTimeFmt.format(d);
      }
    }    
    
    /**
     * �õ����ڸ�ʽ��
     * */
    public String formatDate(Date d) {
      DateFormat dateFmt = new SimpleDateFormat("yyyy��MM��dd��");
      if (d == null || "".equals(d)) {
        return "ʱ��δ֪";
      }
      else {
        return dateFmt.format(d);
      }
    }

    /**
     * �õ����ڸ�ʽ��
     * */
    public String formatInput(Date d) {
      DateFormat inputFmt = new SimpleDateFormat("yyyy-MM-dd");
      if (d == null || "".equals(d)) {
        return "ʱ��δ֪";
      }
      else {
        return inputFmt.format(d);
      }
    }
    
    /**
     * �õ����ڸ�ʽ��
     * */
    public String formatInput2(Date d) {
      DateFormat inputFmt = new SimpleDateFormat("yyyy.MM.dd");
      if (d == null || "".equals(d)) {
        return "ʱ��δ֪";
      }
      else {
        return inputFmt.format(d);
      }
    }
}
