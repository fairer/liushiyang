 <%@ page contentType="text/html; charset=GBK" %>
 <%@page import="person.liusy.DaTing"%>
 <%@page import="person.liusy.Room"%>
 
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
<table>
<tr><td>�����</td><td>���һ</td><td>��Ҷ�</td><td>����״̬</td></tr>
<%for(int i= 0;i < DaTing.rooms.size();i++){
	Room room = (Room)DaTing.rooms.get(i);
	
	
	
%>
<tr><td><%=i%></td><td><%=room.getUserA().getUserName()%></td><td><%=room.getUserB()!=null?room.getUserA().getUserName():"����"%></td><td><%if(room.roomStatus==0){%>�ȴ�������<%}else if(room.roomStatus==1){%>����������<%}else if(room.roomStatus==2){%>��Ϸ����<%}%></td></tr>
<%}%>
</table>	
</body>
</html>
<script>
	function joinRoom(){
		location.href='servlet/WuziQiServlet?reqCode=joinRoom&roomId='+roomId.value;
	}
</script>