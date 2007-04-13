package name.xio.ui;


import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.metaparadigm.jsonrpc.InvocationCallback;
import com.metaparadigm.jsonrpc.JSONRPCBridge;

public class Test implements Serializable,TreeNodeImpl
{
    private final static long serialVersionUID = 1;
    public static int id = 0;
    // Void test


    public List load(TreeNode treeNode) {
    	System.out.println("ischeck:"+treeNode.getIsCheckbox()+"\n");
    	System.out.println("id:"+treeNode.getId()+"\n");
    	System.out.println("title:"+treeNode.getTitle()+"\n");
    	System.out.println("link:"+treeNode.getLink()+"\n");
    	System.out.println("img:"+treeNode.getImg()+"\n");
		// TODO Auto-generated method stub
		List recList = new ArrayList();
		int ram = (int)Math.round(Math.random()*10);
		for(int i=0;i <ram;i++){
			TreeNode a = new TreeNode();
			a.setIsCheckbox(false);
			a.setId(String.valueOf(id++));
			a.setTitle("第"+String.valueOf(id)+"节点");
			a.setImg("images/xiorkflow/help.gif");
			
			recList.add(a);
		}
		return recList;
	}
    // Exception tests

    public static void throwException()
	throws Exception
    {
	throw new Exception("test exception");
    }



    // Debug control

    public void setDebug(JSONRPCBridge bridge, boolean flag)
    {
	bridge.setDebug(flag);
    }

    // Callback tests

    public void setCallback(JSONRPCBridge bridge, boolean flag)
    {
	if(flag) {
	    bridge.registerCallback(cb, HttpServletRequest.class);
	} else {
	    bridge.unregisterCallback(cb, HttpServletRequest.class);
	}
    }
//  Reference Tests

    static public class RefTest implements Serializable
    {
	private final static long serialVersionUID = 1;

	private String s;

	public RefTest(String s)
	{
	    this.s = s;
	}

	public String toString()
	{
	    return s;
	}
    }

    static public class CallableRefTest implements Serializable
    {
	private final static long serialVersionUID = 1;

	private static RefTest ref = new RefTest("a secret");

	public String ping()
	{
	    return "ping pong";
	}

			
	public RefTest getRef()
	{
	    return ref;
	}

	public String whatsInside(RefTest r)
	{
	    return r.toString();
	}
    }

    private static CallableRefTest callableRef = new CallableRefTest();

    public static InvocationCallback cb = new InvocationCallback()
	{
	    private final static long serialVersionUID = 1;

	    public void preInvoke(Object context, Object instance,
				  Method m, Object arguments[])
		throws Exception
	    {
		System.out.print("Test.preInvoke");
		if(instance != null)
		    System.out.print(" instance=" + instance);
		System.out.print(" method="+ m.getName());
		for(int i=0; i < arguments.length; i++)
		    System.out.print(" arg[" + i + "]=" + arguments[i]);
		System.out.println("");
	    }

	    public void postInvoke(Object context, Object instance,
				   Method m, Object result)
		throws Exception
	    {}
	};

	}

