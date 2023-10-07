<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*, java.lang.*, java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uid=request.getParameter("uid");
String pwd=request.getParameter("pwd");
//out.println("<script>alert('"+uid+"')</script>");
HttpSession ss=request.getSession(true);
try
{
    if((uid.trim().equals("admin")) && (pwd.trim().equals("admin")))
    {
        ss.setAttribute("name","admin");
				RequestDispatcher rd = request.getRequestDispatcher("Admin_home.jsp");
				rd.forward(request,response);
    }
    else
    {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 String url="jdbc:odbc:smart";
	 Connection con=DriverManager.getConnection(url);
	 Statement stmt=con.createStatement();
	//out.println("connected");
	ResultSet rs=stmt.executeQuery("Select * from login12 where USERID='"+uid+"' and PWD='"+pwd+"'");
	if(rs.next())
	{
		String user=rs.getString("USERID");
		//String pwds=rs.getString("password");
		String type=rs.getString("TYPE");
		//System.out.println(user+"\n"+pwds+"\n"+type);
		//System.out.println(type);
               //out.println("<script>alert('"+type+"')</script>");
		System.out.println("Hai");
		//out.println("\nU r in Open_home.jsp Page");
		
		//String name="Phanikishore";	
		//System.out.println(user);
		//System.out.println("----"+type+"----");
                        if(type.trim().equals("tourist"))
			{	
                            //out.println("<script>alert('"+type+"')</script>");
                            ss.setAttribute("name",user);
				RequestDispatcher rd = request.getRequestDispatcher("hydphotogallery.jsp");
				rd.forward(request,response);
			}
                        else if(type.trim().equals("student"))
			{	//out.println("HAI STUDENT");
				 ss.setAttribute("name",user);
				RequestDispatcher rd = request.getRequestDispatcher("student1.jsp");
				rd.forward(request,response);
			}
                        else if(type.trim().equals("business"))
			{	ss.setAttribute("name",user);
				RequestDispatcher rd = request.getRequestDispatcher("business1.jsp");
				rd.forward(request,response);
			}
                        else if(type.trim().equals("job"))
			{	ss.setAttribute("name",user);
				RequestDispatcher rd = request.getRequestDispatcher("JS_home.jsp");
				rd.forward(request,response);
			}
			

                        else if(type.trim().equals("moderator"))
			{	ss.setAttribute("name",user);
				RequestDispatcher rd = request.getRequestDispatcher("Moderator_home.jsp");
				rd.forward(request,response);
			}
	}
	else
	{	%>
		<jsp:forward page="home1.jsp?m1=Invalid Userid and Password"></jsp:forward>
	<% 
	}
    }
}
catch(Exception e)
{
	e.printStackTrace();
}
%>
</body>
</html>