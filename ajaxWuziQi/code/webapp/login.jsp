 <%@ page contentType="text/html; charset=GBK" %>
 <%@page import="person.liusy.DaTing"%>
 <%@page import="person.liusy.Room"%>
 
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
<table>
<tr><td>房间号</td><td>玩家一</td><td>玩家二</td><td>房间状态</td></tr>
<%for(int i= 0;i < DaTing.rooms.size();i++){
	Room room = (Room)DaTing.rooms.get(i);
	
	
	
%>
<tr><td><%=i%></td><td><%=room.getUserA().getUserName()%></td><td><%=room.getUserB()!=null?room.getUserA().getUserName():"暂无"%></td><td><%if(room.roomStatus==0){%>等待加入中<%}else if(room.roomStatus==1){%>正在下棋中<%}else if(room.roomStatus==2){%>游戏结束<%}%></td></tr>
<%}%>
</table>	
</body>
</html>
<script>
	function joinRoom(){
		location.href='servlet/WuziQiServlet?reqCode=joinRoom&roomId='+roomId.value;
	}
</script>