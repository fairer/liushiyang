<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>����</title>
<script language="javascript" type="text/javascript" src="js/prototype.js"></script>
</head>

<body onload="<%if(session.getAttribute("wait") != null){%>waitForStart()<%}else{%>goStart()<%}%>">
<div id="div_to_be_updated" style="position:absolute; top: 20%; left:42%; z-index:2; visibility:visible; width: %10; height: 5%;font:36pt;color:red"></div>
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

	function waitForStart(){
		try{
			$('div_to_be_updated').style.display = 'block';
			$('div_to_be_updated').innerHTML = '�ȴ��Է����뷿��...';
			new Ajax.Updater('div_to_be_updated', url, {asynchronous:true, onSuccess:sucessQuery, onFailure:failQuery }); 
			return false;
		}catch(e){
			alert(e.message);
			return false;
		}	
		return false;
	}
	function sucessQuery(t){
		$('div_to_be_updated').style.display = 'none';
		$('zhengCeContent').innerHTML = '<table width=100%  border=0 >'+t.responseText+'</table>';
	}
	function failQuery(t){
		alert('wrong');
	}
	
	function goStart(){
	
	}
	
	
	
	
	
	
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