<html><head>
<title>Home..</title>
<link href="Images\style.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style1 {color: Yellow}
-->
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
        <a href="contactus.jsp">CONTACT US</a> </div></td>
        <td background="Images\link_bg.jpg">&nbsp;</td>
      </tr>
     </tbody></table></td>
  </tr>
</tbody></table>


<marquee height="50" vspace="5" hspace="10" style="color:#22AAA1;font-size:20px;border: double;">Welcome to Ramnad City</marquee>
<img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg">
<table align="center" width="100%" border="5">
	<tr><td valign="top">
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
			<a href="hotels.jsp">Hotels</a><br></fieldset>
</div></td>
<td>
<table>
<tr>
<td><img src="Images\A1.jpg" width="200" height="150"/></td><td><img src="Images\A2.jpg" height="150" width="200"/></td><td><img src="Images\A3.jpg" height="150" width="200"/></td></tr>

</table>
</td><td align="right">
<div class="sidenav">
<fieldset style="border: double;color:purple;">
<legend align="center" ><img src="Images\login.jpg"  width="50" height="50" alt="Login"></legend>
<form method="post"  action="open_Home.jsp" name="form1" onSubmit="return check1()">
<table align="center" border="2">
<tr>
<th align="right">Userid:</th>
<td align="left"><input type="text" name="uid"></td>
<td align="center"><p id="f1"></p></td>
</tr>
<tr>
<th align="right">Password:</th>
<td align="left"><input type="password" name="pwd" onblur="check1()"></td>
<td align="center"><p id="f2"></p></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Submit" ></td>
</tr>
<tr>
<td colspan="2" align="center"><p id="f3">
<%String s1=request.getParameter("m1"); 
if(s1!=null)
{%><%=s1%><%}else{s1="";}%></p></td></tr>
<tr><td align="right"><a href="fg.jsp">Forget Password?</a></td><td colspan="2" align="left"><a href="Registrationform.jsp">Sign Up</a></td></tr>
</table>
</form>
</fieldset>
<table border="3" width="350"><tr><td><marquee direction="up" scrolldelay="250" onmouseover="wait()"><div class="small">NATTIYANJALI Events@ T.U.MANGAI On 05-03-2020</div></marquee></td></tr></table>
</div>
</td></tr></table>

<img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg"><img src="Images\rgt_sep.jpg">     

<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td  colspan="2" bgcolor="#ded7d6"><img src="Images\spacer.gif" width="980" height="3"></td><td></td>
  </tr>
  
</table>

</body></html>