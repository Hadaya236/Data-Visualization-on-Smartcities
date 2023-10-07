package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Tourist_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>ATM Locations</title>\r\n");
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
      out.write("            <td width=\"25%\"><h1 class=\"style1\" align=\"center\">Visakhapatnam <br>City Guider</h1></td>\r\n");
      out.write("            <td class=\"smtxtwhite\" valign=\"bottom\" width=\"69%\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody></table></td>\r\n");
      out.write("        <td width=\"0\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\"><img src=\"Images\\link_bg.jpg\" width=\"0\" height=\"100\"></td>\r\n");
      out.write("        <td>\r\n");
      out.write("       <img src=\"Images\\header1.jpg\" alt=\"Vishakapatnam Hotels\" width=\"375\" height=\"200\"><img src=\"Images\\header2.jpg\" alt=\"Hotels in Vishakapatnam\" width=\"300\" height=\"200\"><img src=\"Images\\header3.jpg\" alt=\"Vizag Hotels\" width=\"300\" height=\"200\"><img src=\"Images\\header4.jpg\" alt=\"Hotels in Vizag, Andra Pradesh\" width=\"375\" height=\"200\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\"><img src=\"Images\\link_bg.jpg\" width=\"0\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\">&nbsp;</td>\r\n");
      out.write("        <td style=\"background-repeat: repeat-x;\" class=\"headermenu\" background=\"Images\\link_bg.jpg\" bgcolor=\"#ffffff\">\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("        <a href=\"Tourist_home.jsp\">HOME</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"\"> PROFILE</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"hydphotogallery1.jsp\">PHOTOGALLERY</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"indu1.jsp\">INDUSTRIES</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"Downloads.jsp\">DOWNLOADS</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"flighttimings.jsp\" target=\"_self\">TRAVELS</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"Cityview.jsp\">VIZAG MAP</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"home1.jsp\">LOGOUT</a> </div></td>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("     </tbody></table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</tbody></table>\r\n");
      out.write("\r\n");
HttpSession ss=request.getSession(true);
String s=(String)ss.getAttribute("name");
      out.write("\r\n");
      out.write("<marquee direction=\"left\" behavior=\"slide\" bgcolor=\"green\" scrollamount=\"5\" style=\"color: black;font-size: large\">Hello");
      out.print(" "+s);
      out.write(" </marquee>\r\n");
      out.write("\t<img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\">\r\n");
      out.write("\t<table align=\"center\" width=\"100%\">\r\n");
      out.write("\t\t<tr cellpadding=\"1\"><td valign=\"top\">\r\n");
      out.write("\t\t\t<div class=\"sidenav A\">\r\n");
      out.write("\t\t\t\t<fieldset><legend>View</legend>\r\n");
      out.write("\t\t\t\t\t<a href=\"ATM locations.jsp\">ATM Locations</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"Bank locations.jsp\">Banks</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Beauty Parlors</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"Blood banks.jsp\">Blood Banks</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"Cardealers.jsp\">Car Dealers</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Consultants</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Emergency</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"Functionhalls.jsp\">Function Halls</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"Gasdealers.jsp\">Gas Dealers</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"Healthline.jsp\">Health Line</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"Theaters.jsp\">Movie Theaters</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Shopping Malls</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Temples</a></fieldset>\r\n");
      out.write("\t\t\t</div></td><td>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t<tr><td><a href=\"Downloads.jsp\"></a></td></tr>\r\n");
      out.write("\t<tr><td><a href=\"show1.jsp\">Library</a></td></tr>\r\n");
      out.write("\t<tr><td><a href=\"Education.jsp\">Educations</a></td></tr>\r\n");
      out.write("\t<tr><td><a href=\"events.jsp\">City Events</a></td></tr>\r\n");
      out.write("\t</table></td></tr></table>\t\t\r\n");
      out.write("\t\t<img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\">     \r\n");
      out.write("\t\t<div class=\"more\" align=\"right\">:: <a href=\"http://www.vizaghotels.net/vizag_hotels.htm\">more &gt;&gt;</a></div>\r\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("  \t<tr>\r\n");
      out.write("    <td  colspan=\"2\" bgcolor=\"#ded7d6\"><img src=\"Images\\spacer.gif\" width=\"980\" height=\"3\"></td><td></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t<tr>\r\n");
      out.write("\t   \t <td class=\"footer\"> Copyrights © , Vishakapatnam. All Rights Reserved. \r\n");
      out.write("\t</td><td align=\"right\"><img src=\"Images\\cards.jpg\" align=\"absmiddle\" width=\"178\" height=\"32\"></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>                          \r\n");
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
