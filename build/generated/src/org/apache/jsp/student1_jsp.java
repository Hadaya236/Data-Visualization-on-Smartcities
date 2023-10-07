package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class student1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>Ramnad Education Photo Gallery page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link href=\"Images\\style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script> \r\n");
      out.write("function OpenFrame(num)\r\n");
      out.write(" {\r\n");
      out.write("\turl=\"PhotoFrame.jsp?imgIndex=\"+num;\t\t\t\t\t\t\r\n");
      out.write("    var b=window.open(url,\"new2\",\"width=233,height=280 left=275 top=150\",addressbar=1);\r\n");
      out.write(" }\r\n");
      out.write("</script> \r\n");
      out.write("<style type=\"text/css\"> \r\n");
      out.write("\t#dropmenudiv\r\n");
      out.write("\t{\r\n");
      out.write("\t\tposition:absolute;\r\n");
      out.write("\t\tborder:1px solid #474747;\r\n");
      out.write("\t\tborder-bottom-width: 0;\r\n");
      out.write("\t\tfont:normal 10px Verdana; font color:#000000;\r\n");
      out.write("\t\tline-height:18px;\r\n");
      out.write("\t\tz-index:1;\r\n");
      out.write("\t}\r\n");
      out.write(" \t\r\n");
      out.write(" \t#dropmenudiv a{\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t\ttext-indent: 3px;\r\n");
      out.write("\t\tborder-bottom: 1px solid #474747;\r\n");
      out.write("\t\tfont color:#000000;\r\n");
      out.write("\t\tpadding: 1px 0;\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write(" \r\n");
      out.write("\t#dropmenudiv a:hover\r\n");
      out.write("\t{ /*hover background color*/\r\n");
      out.write("\t\tbackground-color: 4FA13D;\r\n");
      out.write("\t}\r\n");
      out.write(" \r\n");
      out.write("\t#content \r\n");
      out.write("\t{\r\n");
      out.write("\t\tfont:normal 10px Verdana;\r\n");
      out.write("\t\tfont-family: verdana;\r\n");
      out.write("\t\tfont-color: #000000;\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write(" \r\n");
      out.write("\tbody\r\n");
      out.write("\t{\r\n");
      out.write("        font-family: verdana;\r\n");
      out.write("\t\tcolor: #000000 \r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("    a:link { color: #000000 } \r\n");
      out.write("    \r\n");
      out.write("    a:visited { color: #000000 } \r\n");
      out.write("   \r\n");
      out.write("    a:active { color: #000000 }\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- .style1 {color: Yellow} -->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"Images\\2.jpg\">\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("  <tbody><tr>\r\n");
      out.write("    <td style=\"background-repeat: repeat-z;\" background=\"Images\\header_bg.jpg\" valign=\"top\"><table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"980\">\r\n");
      out.write("      <tbody><tr>\r\n");
      out.write("        <td height=\"54\">&nbsp;</td>\r\n");
      out.write("        <td><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("          <tbody><tr>\r\n");
      out.write("            <td width=\"25%\"><h1 class=\"style1\" align=\"center\">Ramanathapuram <br>City Guider</h1></td>\r\n");
      out.write("            <td class=\"smtxtwhite\" valign=\"bottom\" width=\"69%\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody></table></td>\r\n");
      out.write("        <td width=\"0\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\"><img src=\"Images\\link_bg.jpg\" width=\"0\" height=\"100\"></td>\r\n");
      out.write("        <td>\r\n");
      out.write("        <img src=\"Images\\header.jpg\" alt=\"PAMPAN BRIDGE\" width=\"1220\" height=\"200\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\"><img src=\"Images\\link_bg.jpg\" width=\"0\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\">&nbsp;</td>\r\n");
      out.write("        <td style=\"background-repeat: repeat-x;\" class=\"headermenu\" background=\"Images\\link_bg.jpg\" bgcolor=\"#ffffff\">\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("        <a href=\"home1.jsp\">HOME</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\\Images\\cityprofile.pdf\" type=\"application/pdf\"   target=\"_blank\">CITY PROFILE</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <a href=\"Cityview.jsp\">RAMNAD MAP</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"contactus.jsp\">CONTACT US</a> \r\n");
      out.write("         <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"home1.jsp\">Logout</a> \r\n");
      out.write("        </div></td>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("     </tbody></table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</tbody></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<marquee height=\"50\" vspace=\"5\" hspace=\"10\" style=\"color:#22AAA1;font-size:20px;border: double;\">Welcome to Ramnad City</marquee>\r\n");
      out.write("<img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table >\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td valign=\"top\">\r\n");
      out.write("\t\t<div class=\"sidenav A\">\r\n");
      out.write("\t\t<fieldset><legend><img src=\"Images\\btn-view.gif\"></legend>\r\n");
      out.write("\t\t\t<a href=\"ATM locations.jsp\">ATM Locations</a><br>\r\n");
      out.write("\t\t\t<a href=\"Bank locations.jsp\">Banks</a><br>\r\n");
      out.write("\t\t\t<a href=\"https://www.justdial.com/Ramanathapuram/Beauty-Parlours/nct-10042247\">Beauty Parlors</a><br>\r\n");
      out.write("\t\t\t<a href=\"Blood banks.jsp\">Blood Banks</a><br>\r\n");
      out.write("\t\t\t<a href=\"Cardealers.jsp\">Car Dealers</a><br>\r\n");
      out.write("\t\t\t<a href=\"hospitals.jsp\">Hospitals</a><br>\r\n");
      out.write("\t\t\t<a href=\"Gasdealers.jsp\">Gas Dealers</a><br>\r\n");
      out.write("\t\t\t<a href=\"Theaters.jsp\">Movie Theaters</a><br>\r\n");
      out.write("\t\t\t<a href=\"mall.jsp\">Shopping Malls</a><br>\r\n");
      out.write("\t\t\t<a href=\"hotels.jsp\">Hotels</a><br>\r\n");
      out.write("                        <a href=\"home1.jsp\" style=\"color:red;\">Logout</a><br>\r\n");
      out.write("                \r\n");
      out.write("                </fieldset>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("                \r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("<table style=\"position:absolute;left:200pt;top:350pt;\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("            <img src=\"simages\\sathak.jpg\" height=\"250\" width=\"250\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <img src=\"simages\\syedammal.jpg\" height=\"250\" width=\"250\">\r\n");
      out.write("        </td>\r\n");
      out.write("       \r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr align=\"center\">\r\n");
      out.write("        <td><a href=\"student2.jsp#sathak\">Mohamed Sathak Engineering College</a></td>\r\n");
      out.write("         <td><a href=\"student2.jsp#syedammal\">Syed Ammal Engineering College</a></td>\r\n");
      out.write("         \r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("</table>\r\n");
      out.write(" \r\n");
      out.write("\t\r\n");
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
