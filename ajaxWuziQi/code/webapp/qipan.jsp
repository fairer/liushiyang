<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>棋盘</title>
<script language="javascript" type="text/javascript" src="js/prototype.js"></script>
</head>

<body onload="<%if(session.getAttribute("wait") != null){%>waitForStart()<%}else{%>queryLuozi()<%}%>">
<div id="div_fullscreen" style="position:absolute; background-color:#999999; filter:alpha(opacity=60); top: 0%; left:0%; z-index:5;  width: 100%; height: 100%"></div>
<div id="div_to_be_hidden" style="position:absolute; top: 20%; left:42%; z-index:1; visibility:hidden; width: %10; height: 5%;font:36pt;color:red"></div>
<div id="div_to_be_updated" style="position:absolute; top: 20%; left:42%; z-index:2; visibility:visible; width: %10; height: 5%;font:36pt;color:red"></div>
<%for(int i=0;i<20;i++){
	for(int j=0;j<20;j++){%>
	<div id="chess<%=i%><%=j%>"  style="position:absolute; top: <%=20+i*30%>px; left:<%=20+j*30%>px; z-index:1; visibility:visible; width: 30px; height: 30px">
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

	//var clickFuns = new Array();
	//for(var i=0;i< 20;i++){
	//	clickFuns[i] = new Array();
	//}
	for(var i = 0; i< 20; i++)
			for(var j = 0;j<20;j++){
				//if(!($('img'+i+j).src.indexOf('10.GIF')>=0 || $('img'+i+j).src.indexOf('11.GIF')>=0)){
					with($('chess'+i+j)){
						style.cursor="hand";
						//attachEvent("onclick",clickFuns[i][j] = new Function("luoZi("+i+", "+j+")")); 
						attachEvent("onclick",new Function("luoZi("+i+", "+j+")"));  
					}
				//}
			}
	function waitForStart(){
		try{
			$('div_to_be_updated').innerHTML = '等待对方进入房间...';
			$('div_fullscreen').style.display = 'block';
			new Ajax.Updater('div_to_be_hidden', 'servlet/WuziQiServlet?reqCode=waitStart', {asynchronous:true, onSuccess:sucessWaitStart, onFailure:failQuery }); 
			return false;
		}catch(e){
			alert(e.message);
			waitForStart();
			return false;
		}	
		return false;
	}
	function sucessWaitStart(t){
		if(t.responseText == 'wait'){
			setTimeout('waitForStart()',1000);
		}else{
			$('div_to_be_updated').style.display = 'none';
			canBeClick();
		}
	}
	
	function canBeClick(){
		
		
		$('div_fullscreen').style.display = 'none';
		$('div_to_be_updated').style.display = 'block';
		$('div_to_be_updated').innerHTML = '现在该你下棋，请落子...';	
	}
	function cancelAll(){
		
		for(var i = 0; i< 20; i++)
			for(var j = 0;j<20;j++){
				with($('chess'+i+j)){
					style.cursor="none";
					try{
						detachEvent("onclick",clickFuns[i][j]);
					}catch(e){
						continue;
					}
				}
			}
			
	}
	function luoZi(x,y){
		try{
			//alert('1')
			if($('img'+x+y).src.indexOf('10.GIF') >= 0 || $('img'+x+y).src.indexOf('img/11.GIF')>=0){
				alert("此处不能下棋");
				return false;
			}
			if(black)
				$('img'+x+y).src = 'img/10.GIF';
			else
				$('img'+x+y).src = 'img/11.GIF';	
			$('div_to_be_updated').style.display = 'block';
			$('div_to_be_updated').innerHTML = '正在向服务器传送下棋信息...';
			//alert('2')
			////cancelAll();
			$('div_fullscreen').style.display = 'block';
			//alert('3')
			new Ajax.Updater('div_to_be_hidden', 'servlet/WuziQiServlet?reqCode=luoZi&x='+x+'&y='+y, {asynchronous:true, onSuccess:sucessLuoZi, onFailure:failQuery }); 
			//alert('4')
			return false;
		}catch(e){
			alert(e.message);
			luoZi(x,y);
			return false;
		}	
		return false;
	}
	function sucessLuoZi(t){
		$('div_to_be_updated').style.display = 'none';
		if(t.responseText == '-1'){
			alert('这步不该你走！');
		}else if(t.responseText == '1'){
			if(confirm('恭喜你获得胜利！再来一局吗?')){
					
			}else{
					
			}
		}else if(t.responseText == '0'){
			//该步已走完,询问对方下棋
			queryLuozi();
		}
	}
	function queryLuozi(){
		try{
			$('div_to_be_updated').style.display = 'block';
			$('div_to_be_updated').innerHTML = '等待对手下棋信息...';
			$('div_fullscreen').style.display = 'block';
			new Ajax.Updater('div_to_be_hidden', 'servlet/WuziQiServlet?reqCode=queryLuozi', {asynchronous:true, onSuccess:sucessQueryLuozi, onFailure:failQuery }); 
			return false;
		}catch(e){
			alert(e.message);
			queryLuozi();
			return false;
		}	
		return false;
	}
	function sucessQueryLuozi(t){
		var str = t.responseText;
		if(str == '0'){
			setTimeout('queryLuozi()',1000);
		}else {
			//数据格式:1 (0) &&x&&y@@1(0)
			//说明:黑(白)&&x坐标&&y坐标@@对方赢(继续走)
			$('div_to_be_updated').style.display = 'none';
			
			var result_r = new Array();
			var result_c = new Array();
			result_r = str.split('@@');
			result_c = result_r[0].split('&&');
			showChess(result_c[1],result_c[2]);
			if(result_r[1]=='1')
				if(confirm('对方已获得胜利！再来一局吗?')){
					
				}else{
					
				}
			else
				setTimeout('canBeClick()',2500);	
		}
	}
	function failQuery(t){
		alert('wrong');
	}
	
	var black = <%if(session.getAttribute("wait") != null){%>true<%}else{%>false<%}%>;
	var object,url;
	temp = 0;
	//setTimeout("showChess()",2000);
	function showChess(x,y){
		try{
		//var i = Math.floor(Math.random()*19);
		//var j = Math.floor(Math.random()*19);
		if($('img'+x+y)){
			if(black){
				object = 'img'+x+y;
				url = 'img/11.GIF';
				donghua();
				//black = false;
			}else{
				object = 'img'+x+y;
				url = 'img/10.GIF';
				donghua();
				//black = true;
			}
		}
		//setTimeout("showChess()",2000);
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
	
</script
>