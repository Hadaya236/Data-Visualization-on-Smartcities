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
                    <a href="hydphotogallery.jsp" style="color:blue;">GoBack </a>
                    <br>
                    <br>
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
<table style="position:absolute;left:200pt;top:350pt;" width="80%">
    <a name="apj">
    <tr >
        <td align="center">
            <img src="timages\apj-memorial.jpg" height="500" width="500">
        </td>
        <td>
            <h1 style="color:white;">How to Reach</h1>
            <h3> By Air</h3>
            <p align="justify">
Madurai is the nearest Airport which is around 175 km distance from Rameswaram. Thoothukudi is another airport which is around 195 km distance from Rameswaram.
</p>
<h3>By Train</h3>
<p align="justify">
Rameswaram has a railway station which is around 1.3 km from the Ramanathaswamy temple. By Road
</p>

<h3>By Road</h3>
<p align="justify">
Rameswaram has a Bus stand which is around 2 km from the Ramanathaswamy temple.
            </p>
        </td>
    </tr>
    <tr >
        <td align="justify" colspan="2">
            <p  style="text-indent:40pt;">
            <h1 style="color:red;">Dr. APJ Abdul Kalam's Memorial</h1>
Avul Pakir Jainulabdeen Abdul Kalam, better known as A. P. J. Abdul Kalam who was the 11th president of India. Kalam was born and brought up in Rameswaram and became a scientist and worked for DRDO and ISRO. After his sudden demise at Shillong on 27th July 2015, he was laid to rest at Pei Karumbu, Rameswaram on 30th July 2015. A memorial has been built at the burial site. Inside, the memorial, one can see the selected photos, paintings and miniature models of misssiles etc.,. The memorial is less than 1 km from Rameswaram.
            </p>
        </td>
    </tr>
    
    </a>
    
    <tr>
        <td colspan="2">
            <hr>
        </td>
    </tr>
    
    <a name="danush">
    <tr >
        <td align="center">
            <img src="timages\danushkodi.jpg" height="500" width="500">
        </td>
        <td>
            <h1 style="color:white;">How to Reach</h1>
            <h3> By Air</h3>
            <p align="justify">
Madurai is the nearest Airport which is around 175 km distance from Rameswaram. Thoothukudi is another airport which is around 195 km distance from Rameswaram.
</p>
<h3>By Train</h3>
<p align="justify">
Rameswaram has a railway station which is around 1.3 km from the Ramanathaswamy temple.
</p>

<h3>By Road</h3>
<p align="justify">
    Rameswaram has a Bus stand which is around 2 km from the Ramanathaswamy temple. You can find public / private transport from Rameswaram.
            </p>
        </td>
    </tr>
    <tr >
        <td align="justify" colspan="2">
            <p  style="text-indent:40pt;">
            <h1 style="color:red;">
                Dhanushkodi
            </h1>
The southernmost tip of the rameswaram island is called Dhanushkodi. It was completely washed away by a cyclone in 1964. But the Kothandaramasamy Temple here remains intact. It is 18 KMs way from Rameswaram can be reached by road. A popular belief is that, it is where Vibishana a brother of Ravana surrendered before Rama. Dhanushkodi has a fine beach, where Sea surfing is possible.
            </p>
        </td>
    </tr>
    
    </a>
    
    <tr>
        <td colspan="2">
            <hr>
        </td>
    </tr>
    
    <a name="pamban">
    <tr >
        <td align="center">
            <img src="timages\pamban.jpg" height="500" width="500">
        </td>
        <td>
            <h1 style="color:white;">How to Reach</h1>
            <h3> By Air</h3>
            <p align="justify">
Madurai is the nearest Airport which is around 120 km distance from Ramanathapuram. Thoothukudi is another airport which is around 145 km distance from Ramanathapuram.
</p>
<h3>By Train</h3>
<p align="justify">
Rameswaram has a railway station which is around 1.3 km from the Ramanathaswamy temple.
</p>

<h3>By Road</h3>
<p align="justify">
    You can find public / private transport from Ramanathapuram and Rameswaram.
            </p>
        </td>
    </tr>
    <tr >
        <td align="justify" colspan="2">
            <p  style="text-indent:40pt;">
            <h1 style="color:red;">
                Pamban Bridge
            </h1>
The 2.2 km. length bridge connecting the Rameswaram Island and the mainland is the longest bridge in India constructed over a bay. It is also called as Pamban Bridge. Similarly the railway SCISSORS bridge connecting the island is noted for its unique opening to pass the ships through the sea.
            </p>
        </td>
    </tr>
    
    </a>

    
    
    
    
    
    
    
    
    
    
    
    <tr>
        <td colspan="2">
            <hr>
        </td>
    </tr>
     <a name="">
    <tr >
        <td align="center">
            <img src="timages\" height="500" width="500">
        </td>
        <td>
            <h1 style="color:white;">How to Reach</h1>
            <h3> By Air</h3>
            <p align="justify">

</p>
<h3>By Train</h3>
<p align="justify">

</p>

<h3>By Road</h3>
<p align="justify">
    
            </p>
        </td>
    </tr>
    <tr >
        <td align="justify" colspan="2">
            <p  style="text-indent:40pt;">
            <h1 style="color:red;"></h1>

            </p>
        </td>
    </tr>
    
    </a>
    
    
    
    
    
    
    
</table>
 
	
</body>
</html>