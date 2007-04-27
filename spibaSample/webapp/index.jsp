<%@ page contentType="text/html; charset=GBK" %>
<%@ page import="com.lsy.struts.plugin.*" %>
<%@ page import="com.lsy.spring.dao.sqlmap.*" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
//Ab01Service ab01Service = (Ab01Service)ServiceSupporter.getService("ab01Service");

%>
ab01 的 条数为:<%//=ab01Service.getAb01Nums()%> 条。 
<form action="test.do" method="post">
<input type="text" name="sto(text1)"><br>
<input type="text" name="sto(text2)"><br>
<input type="text" name="sto(text3)"><br>
<input type="text" name="sto(text4)"><br>
<input type="checkbox" name="selectArray" value="1">
<input type="checkbox" name="selectArray" value="2">
<input type="checkbox" name="selectArray" value="3">
<input type="checkbox" name="selectArray" value="4">


<input type="hidden" name="reqCode" value="test">
<input type="submit" value="submit">
</form>
</body>
</html>