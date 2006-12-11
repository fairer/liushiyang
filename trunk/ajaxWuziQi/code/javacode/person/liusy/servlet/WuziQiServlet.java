package person.liusy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import person.liusy.DaTing;
import person.liusy.QiPu;
import person.liusy.User;
import person.liusy.exception.WuziQiException;

public class WuziQiServlet extends HttpServlet {

	
	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String reqCode = request.getParameter("reqCode");
		response.setContentType("text/xml;charset=GB2312");
	  response.setHeader("Cache-Control", "no-cache");
    if(reqCode == null){
			
		}else if(reqCode.equals("login")){
			String userName= request.getParameter("userName");
			User user = new User(userName);
			session.setAttribute("UserInfo",user);
			response.sendRedirect("../login.jsp");
		}
		else if(reqCode.equals("createRoom")){
			User user = (User)session.getAttribute("UserInfo");
			if(DaTing.createRoom(user) != null){
				session.setAttribute("wait","wait");
				response.sendRedirect("../qipan.jsp");
			}
		}else if(reqCode.equals("joinRoom")){
			String roomId = request.getParameter("roomId");
			User user = (User)session.getAttribute("UserInfo");
			if(DaTing.joinRoom(user,roomId) != null){
				response.sendRedirect("../qipan.jsp");
			}
		}else if(reqCode.equals("waitStart")){
			User user = (User)session.getAttribute("UserInfo");
			if(user.getRoom().getUserB() == null){
				PrintWriter out = response.getWriter();
				out.write("wait");
				out.flush();
				out.close();
			}
			else{
				PrintWriter out = response.getWriter();
				out.write("user"+user.getRoom().getUserB().getUserName());
				out.flush();
				out.close();
			}
		}else if(reqCode.equals("luoZi")){
			User user = (User)session.getAttribute("UserInfo");
			int x = Integer.parseInt(request.getParameter("x"));
			int y = Integer.parseInt(request.getParameter("y"));
			int result =-1;
			try {
				result = user.luoZi(x,y);
			} catch (WuziQiException e) {
				result = -1;
			}
			PrintWriter out = response.getWriter();
			out.write(String.valueOf(result));
			out.flush();
			out.close();
		}else if(reqCode.equals("queryLuozi")){
			User user = (User)session.getAttribute("UserInfo");
			QiPu qipu = user.getQiPuByNum(user.queryNum);
			String result ="";
			if(qipu == null){
				result = "0";
			}else{
				if(qipu.isBlack)
					result = "1&&"+String.valueOf(qipu.x)+"&&"+String.valueOf(qipu.y);
				else
					result = "0&&"+String.valueOf(qipu.x)+"&&"+String.valueOf(qipu.y);
				if(user.getRoom().roomStatus == 3)
					result = result + "@@1";
				else
					result = result + "@@0";
				user.queryNum = user.queryNum + 2 ;
			}
			PrintWriter out = response.getWriter();
			out.write(String.valueOf(result));
			out.flush();
			out.close();
		}
		
	}
	
	
}
