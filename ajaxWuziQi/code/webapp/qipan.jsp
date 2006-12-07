<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>棋盘</title>
<script language="javascript" type="text/javascript" src="js/prototype.js"></script>
</head>

<body >
<%for(int i=0;i<20;i++){
	for(int j=0;j<20;j++){%>
	<div  id="chess<%=i%><%=j%>"  style="position:absolute; top: <%=20+i*30%>px; left:<%=20+j*30%>px; z-index:1; visibility:visible; width: 30px; height: 30px">
	<%if(i!=0&&j!=0&&i!=19&&j!=19){%>
	<img id="img<%=i%><%=j%>" src="img/xx.GIF"></img>
	<%}else if(i==0&&j!=0&&j!=19){%>
	<img id="img<%=i%><%=j%>" src="img/0x.GIF"></img>
	<%}else if(j==0&&i!=0&&i!=19){%>
	<img id="img<%=i%><%=j%>" src="img/x0.GIF"></img>
	<%}else if(j==19&&i!=0&&i!=19){%>
	<img id="img<%=i%><%=j%>" src="img/x19.GIF"></img>
	<%}else if(i==19&&j!=0&&j!=19){%>
	<img id="img<%=i%><%=j%>" src="img/19x.GIF"></img>
	<%}else{%>
	<img id="img<%=i%><%=j%>" src="img/<%=i%><%=j%>.GIF"></img>
	<%}%>
	</div>
	<%}
 }	%>
</body>
</html>
<script language="javascript">
	var black = true;
	var object,url;
	temp = 0;
	setTimeout("showChess()",2000);
	function showChess(){
		try{
		var i = Math.floor(Math.random()*19);
		var j = Math.floor(Math.random()*19);
		if($('img'+i+j)){
			if(black){
				object = 'img'+i+j;
				url = 'img/10.GIF';
				donghua();
				black = false;
			}else{
				object = 'img'+i+j;
				url = 'img/11.GIF';
				donghua();
				black = true;
			}
		}
		setTimeout("showChess()",2000);
		}catch(e){
			alert(e.message);
		}	
	}
	function donghua(){
		var oldurl = $(object).src;
		$(object).src = url;
		url = oldurl;
		if(temp < 5){
			setTimeout("donghua()",250);
			temp ++;
		}
		else{
			temp =0;
			$(object).src = url;
		}
	}
	
</script>