package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Indu1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html><head>\r\n");
      out.write("<title>HomePage</title>\r\n");
      out.write("<link href=\"Images\\style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: Yellow}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head><body background=\"Images\\2.jpg\">\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("  <tbody><tr>\r\n");
      out.write("    <td style=\"background-repeat: repeat-z;\" background=\"Images\\header_bg.jpg\" valign=\"top\"><table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"980\">\r\n");
      out.write("      <tbody><tr>\r\n");
      out.write("        <td height=\"54\">&nbsp;</td>\r\n");
      out.write("        <td><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("          <tbody><tr>\r\n");
      out.write("            <td width=\"25%\"><h1 class=\"style1\" align=\"center\">SmartCity Vizag Guider</h1></td>\r\n");
      out.write("            <td class=\"smtxtwhite\" valign=\"bottom\" width=\"69%\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody></table></td>\r\n");
      out.write("        <td width=\"0\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\"><img src=\"Images\\link_bg.jpg\" width=\"0\" height=\"100\"></td>\r\n");
      out.write("        <td>\r\n");
      out.write("        <img src=\"Images\\header1.jpg\" alt=\"Vishakapatnam Hotels\" width=\"375\" height=\"200\"><img src=\"Images\\header2.jpg\" alt=\"Hotels in Vishakapatnam\" width=\"300\" height=\"200\"><img src=\"Images\\header3.jpg\" alt=\"Vizag Hotels\" width=\"300\" height=\"200\"><img src=\"Images\\header4.jpg\" alt=\"Hotels in Vizag, Andra Pradesh\" width=\"375\" height=\"200\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\"><img src=\"Images\\link_bg.jpg\" width=\"0\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\">&nbsp;</td>\r\n");
      out.write("        <td style=\"background-repeat: repeat-x;\" class=\"headermenu\" background=\"Images\\link_bg.jpg\" bgcolor=\"#ffffff\">\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("        <a href=\"home1.jsp\">HOME</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"\">CITY PROFILE</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"hydphotogallery.jsp\">ATTRACTIONS</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"\">HISTORY</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"\">DOWNLOADS</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"flightstimings.jsp\" target=\"_self\">TRAVELS</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"Cityview.jsp\">VIZAG MAP</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"\">CONTACT US</a> </div></td>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("     </tbody></table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</tbody></table>\r\n");
      out.write("\r\n");
      out.write("<marquee height=\"10\" vspace=\"5\" hspace=\"10\" style=\"color:#22AAA1;font-size:20px;border: double;\">Welcome to Vizag City</marquee>\r\n");
      out.write("<img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\">\r\n");
      out.write("<table align=\"center\" width=\"100%\">\r\n");
      out.write("<tr><td align=\"left\">\r\n");
      out.write("<div class=\"sidenav A\">\r\n");
      out.write("<fieldset><legend><img src=\"Images\\btn-view.gif\"></legend>\r\n");
      out.write("<a href=\"ATM locations.jsp\" target=\"_self\">ATM Locations</a><br>\r\n");
      out.write("<a href=\"Bank locations.jsp\">Banks</a><br>\r\n");
      out.write("<a href=\"#\">Beauty Parlors</a><br>\r\n");
      out.write("<a href=\"Blood banks.jsp\">Blood Banks</a><br>\r\n");
      out.write("<a href=\"Cardealers.jsp\">Car Dealers</a><br>\r\n");
      out.write("<a href=\"Consultancy.jsp\">Consultants</a><br>\r\n");
      out.write("<a href=\"#\">Emergency</a><br>\r\n");
      out.write("<a href=\"Functionhalls.jsp\">Function Halls</a><br>\r\n");
      out.write("<a href=\"Gasdealers.jsp\">Gas Dealers</a><br>\r\n");
      out.write("<a href=\"Healthline.jsp\">Health Line</a><br>\r\n");
      out.write("<a href=\"Theaters.jsp\">Movie Theaters</a><br>\r\n");
      out.write("<a href=\"#\">Shopping Malls</a><br>\r\n");
      out.write("<a href=\"#\">Temples</a><br>\r\n");
      out.write("<a href=\"Indu1.jsp\">Indutries</a>\r\n");
      out.write("</fieldset>\r\n");
      out.write("</div></td>\r\n");
      out.write("<td align=\"left\">\r\n");
      out.write("<h3>Some Industries In Vizag</h3>\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"nag.jsp?id=1\" onclick=\"check()\">GrandBay Industries</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=2\">Sri viska imports&exports</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=3\">AravindGraniteIndutry</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=4\">ArunWoods</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=5\">APForestDevelopmentLimited</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=6\">APRefactoriesLimited</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=7\">BEPumps</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=8\">BOCIndia.Ltd</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=9\">BinduResins</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=10\">BMR Enterprises</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=11\">ChamundiIndustries</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=12\">CosmicPlastics</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=13\">CoastalCardBoard</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=14\">ChowhanExportsLtd</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=15\">DeccanVeneersLtd</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=16\">EastIndiaPetrolemLtd</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=17\">FerroScrapNigamLtd</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=18\">GAILIndiaLtd</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=19\">GayatriPlastics</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=20\">GlobalOpticals</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=21\">HindustanShipyard</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=22\">HygradePelletsLtd</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=23\">INS Eksila</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=24\">ITC Limited</a></li>\r\n");
      out.write("<li><a href=\"nag.jsp?id=25\">LGPolymersLtd</a></li>\r\n");
      out.write("</ul></td>\r\n");
      out.write("<td align=\"right\">\r\n");
      out.write("<div class=\"sidenav\">\r\n");
      out.write("<fieldset>\r\n");
      out.write("<legend>Login</legend>\r\n");
      out.write("<form method=\"post\"  action=\"open_Home.jsp\" name=\"form1\" onSubmit=\"return check1()\">\r\n");
      out.write("<table align=\"center\" >\r\n");
      out.write("<tr>\r\n");
      out.write("<th align=\"right\">Userid:</th>\r\n");
      out.write("<td align=\"left\"><input type=\"text\" name=\"uid\"></td>\r\n");
      out.write("<td align=\"center\"><p id=\"f1\"></p></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th align=\"right\">Password:</th>\r\n");
      out.write("<td align=\"left\"><input type=\"password\" name=\"pwd\" onblur=\"check1()\"></td>\r\n");
      out.write("<td align=\"center\"><p id=\"f2\"></p></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Submit\" ></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" align=\"center\"><p id=\"f3\" style=\"color: red;font-style: italic;\">\r\n");
String s1=request.getParameter("m1"); 
if(s1!=null)
{
      out.print(s1);
}else{s1="";}
      out.write("</p></td></tr>\r\n");
      out.write("<tr><td align=\"center\"><a href=\"fg.jsp\">Forget Password?</a></td><td colspan=\"2\" align=\"center\"><a href=\"Registrationform.jsp\">Sign Up</a></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<table width=\"300\"><tr><td><marquee direction=\"up\" scrolldelay=\"250\" onmouseover=\"wait()\"><div style=\"color:purple;font-size:large;font-style:italic;\">Events@VIZAG On 05-03-2010 <br>Food Festival @ <img src=\"Images\\dolphin_hotel_logo.jpg\"/ alt=\"Dolphin Hotel\"></div></marquee></td></tr></table>\r\n");
      out.write("</td></table>\r\n");
      out.write("\r\n");
      out.write("<img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\">     \r\n");
      out.write("<div class=\"more\" align=\"right\">:: <a href=\"http://www.vizaghotels.net/vizag_hotels.htm\">more &gt;&gt;</a></div>\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  colspan=\"2\" bgcolor=\"#ded7d6\"><img src=\"Images\\spacer.gif\" width=\"980\" height=\"3\"></td><td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"footer\"> Copyrights © , Vishakapatnam. All Rights Reserved. \r\n");
      out.write("\t</td><td align=\"right\"><img src=\"Images\\cards.jpg\" align=\"absmiddle\" width=\"178\" height=\"32\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
