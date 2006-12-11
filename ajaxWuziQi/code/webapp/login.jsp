 <%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>登陆 </title>
</head>

<body >
<%if(session.getAttribute("UserInfo")==null){%>
<form  action="servlet/WuziQiServlet">
<INPUT type="hidden" name="reqCode" value="login">
<INPUT type="text" name="userName" size="20"> <INPUT type="submit" value="提交">
</form>
<%}else{%>
<a href = 'servlet/WuziQiServlet?reqCode=createRoom'>创建房间</a><br>
房间号:<input type= "text" name="roomId" size="5"><input type="button" value="加入房间" onclick="joinRoom()">
<%}%>
</body>
</html>
<script>
	function joinRoom(){
		location.href='servlet/WuziQiServlet?reqCode=joinRoom&roomId='+roomId.value;
	}
</script>