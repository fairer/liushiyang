 <%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>��½ </title>
</head>

<body >
<%if(session.getAttribute("UserInfo")==null){%>
<form  action="servlet/WuziQiServlet">
<INPUT type="hidden" name="reqCode" value="login">
<INPUT type="text" name="userName" size="20"> <INPUT type="submit" value="�ύ">
</form>
<%}else{%>
<a href = 'servlet/WuziQiServlet?reqCode=createRoom'>��������</a><br>
�����:<input type= "text" name="roomId" size="5"><input type="button" value="���뷿��" onclick="joinRoom()">
<%}%>
</body>
</html>
<script>
	function joinRoom(){
		location.href='servlet/WuziQiServlet?reqCode=joinRoom&roomId='+roomId.value;
	}
</script>