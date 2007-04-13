<%@page contentType="text/html; charset=UTF-8" %>
<%@page language="java" %>
<%@page import="name.xio.ui.Test"%>
<jsp:useBean id="JSONRPCBridge" scope="session"
     class="com.metaparadigm.jsonrpc.JSONRPCBridge"/>
<jsp:useBean id="testObject" scope="session"
     class="name.xio.ui.Test"/>
<%
   response.setDateHeader ("Expires", 0);
   JSONRPCBridge.enableReferences();
   JSONRPCBridge.registerObject("test", testObject);
   JSONRPCBridge.registerReference(Test.RefTest.class);
   JSONRPCBridge.registerCallableReference(Test.CallableRefTest.class);
%>
<script charset="UTF-8" src="../XiorkFlow/js/XiorkFlowWorkSpace.js" language="javascript"></script>
		<script charset="UTF-8" src="test.js" language="javascript"></script>

	

	<body onload="init()" onselectstart="return false;" style="margin: 0px;overflow: hidden;">

		<div id="designer" style="width: 30%;height: 100%;border: #e0e0e0 1px solid;overflow: auto;" ></div>
		<div id="message"></div>
	</body>