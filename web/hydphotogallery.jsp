<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Ramnad photogallery page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="Images\style.css" rel="stylesheet" type="text/css">
<script> 
function OpenFrame(num)
 {
	url="PhotoFrame.jsp?imgIndex="+num;						
    var b=window.open(url,"new2","width=233,height=280 left=275 top=150",addressbar=1);
 }
</script> 
<style type="text/css"> 
	#dropmenudiv
	{
		position:absolute;
		border:1px solid #474747;
		border-bottom-width: 0;
		font:normal 10px Verdana; font color:#000000;
		line-height:18px;
		z-index:1;
	}
 	
 	#dropmenudiv a{
		width: 100%;
		display: block;
		text-indent: 3px;
		border-bottom: 1px solid #474747;
		font color:#000000;
		padding: 1px 0;
		text-decoration: none;
		font-weight: bold;
	}
 
	#dropmenudiv a:hover
	{ /*hover background color*/
		background-color: 4FA13D;
	}
 
	#content 
	{
		font:normal 10px Verdana;
		font-family: verdana;
		font-color: #000000;
		text-decoration: none;
	}
 
	body
	{
        font-family: verdana;
		color: #000000 
	} 
	
    a:link { color: #000000 } 
    
    a:visited { color: #000000 } 
   
    a:active { color: #000000 }
	
	<!-- .style1 {color: Yellow} -->
</style>

</head>
<body background="Images\2.jpg">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tbody><tr>
    <td style="background-repeat: repeat-z;" background="Images\header_bg.jpg" valign="top"><table align="center" border="0" cellpadding="0" cellspacing="0" width="980">
      <tbody><tr>
        <td height="54">&nbsp;</td>
        <td><table border="0" cellpadding="0" cellspacing="0" width="100%">
          <tbody><tr>
            <td width="25%"><h1 class="style1" align="center">Ramanathapuram <br>City Guider</h1></td>
            <td class="smtxtwhite" valign="bottom" width="69%"></td>
          </tr>
        </tbody></table></td>
        <td width="0">&nbsp;</td>
      </tr>
      <tr>
        <td background="Images\link_bg.jpg"><img src="Images\link_bg.jpg" width="0" height="100"></td>
        <td>
        <img src="Images\header.jpg" alt="PAMPAN BRIDGE" width="1220" height="200">
        </td>
        <td background="Images\link_bg.jpg"><img src="Images\link_bg.jpg" width="0"></td>
      </tr>
      <tr>
        <td background="Images\link_bg.jpg">&nbsp;</td>
        <td style="background-repeat: repeat-x;" class="headermenu" background="Images\link_bg.jpg" bgcolor="#ffffff">
        <div align="center">
        <a href="home1.jsp">HOME</a>
        <img src="Images\link_sep.jpg" align="absmiddle" width="10" height="60" hspace="30">
       
        <a href="${pageContext.request.contextPath}\Images\cityprofile.pdf" type="application/pdf"   target="_blank">CITY PROFILE</a>
        <img src="Images\link_sep.jpg" align="absmiddle" width="10" height="60" hspace="30">
       
        
        <a href="Cityview.jsp">RAMNAD MAP</a>
        <img src="Images\link_sep.jpg" align="absmiddle" width="10" height="60" hspace="30">
        <a href="contactus.jsp">CONTACT US</a> 
         <img src="Images\link_sep.jpg" align="absmiddle" width="10" height="60" hspace="30">
        <a href="home1.jsp">Logout</a> 
        </div></td>
        <td background="Images\link_bg.jpg">&nbsp;</td>
      </tr>
     </tbody></table></td>
  </tr>
</tbody></table>


<marquee height="50" vspace="5" hspace="10" style="color:#22AAA1;font-size:20px;border: double;">Welcome to Ramnad City</marquee>
<img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg">



<table >
	<tr>
		<td valign="top">
		<div class="sidenav A">
		<fieldset><legend><img src="Images\btn-view.gif"></legend>
			<a href="ATM locations.jsp">ATM Locations</a><br>
			<a href="Bank locations.jsp">Banks</a><br>
			<a href="https://www.justdial.com/Ramanathapuram/Beauty-Parlours/nct-10042247">Beauty Parlors</a><br>
			<a href="Blood banks.jsp">Blood Banks</a><br>
			<a href="Cardealers.jsp">Car Dealers</a><br>
			<a href="hospitals.jsp">Hospitals</a><br>
			<a href="Gasdealers.jsp">Gas Dealers</a><br>
			<a href="Theaters.jsp">Movie Theaters</a><br>
			<a href="mall.jsp">Shopping Malls</a><br>
			<a href="hotels.jsp">Hotels</a><br>
                        <a href="home1.jsp" style="color:red;">Logout</a><br>
                
                </fieldset>
		</div>
		</td>
                
        </tr>
        </table>
<table style="position:absolute;left:200pt;top:350pt;">
    <tr>
        <td>
            <img src="timages\apj-memorial.jpg" height="250" width="250">
        </td>
        <td>
            <img src="timages\danushkodi.jpg" height="250" width="250">
        </td>
        <td>
            <img src="timages\pamban.jpg" height="250" width="250">
        </td>
        
    </tr>
    <tr align="center">
        <td><a href="hydphotogallery1.jsp#apj">APJ-Memorial</a></td>
         <td><a href="hydphotogallery1.jsp#danush">Danushkodi</a></td>
          <td><a href="hydphotogallery1.jsp#pamban">Pamban</a></td>
    </tr>
    
</table>
 
	
</body>
</html>