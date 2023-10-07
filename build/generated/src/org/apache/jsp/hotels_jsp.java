package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hotels_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Hotels..</title>\r\n");
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
      out.write("        <a href=\"D:\\2020-JAVA PROJECTS\\SMARTCITY_PROJ\\web\\Images\\cityprofile.pdf\">CITY PROFILE</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <a href=\"Cityview.jsp\">RAMNAD MAP</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"\">CONTACT US</a> </div></td>\r\n");
      out.write("        <td background=\"Images\\link_bg.jpg\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("     </tbody></table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</tbody></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<marquee height=\"50\" vspace=\"5\" hspace=\"10\" style=\"color:#22AAA1;font-size:20px;border: double;\">Welcome to Ramnad City</marquee>\r\n");
      out.write("<img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\">\r\n");
      out.write("<table align=\"center\" width=\"100%\" border=\"5\">\r\n");
      out.write("\t<tr><td valign=\"top\">\r\n");
      out.write("\t<div class=\"sidenav A\">\r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t</div></td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<table align=\"center\"><tr>\r\n");
      out.write("\t\t<td align=\"left\" valign=\"top\" width=\"5\">&nbsp;</td>\r\n");
      out.write("\t\t<td align=\"left\" valign=\"top\" width=\"189\"><table align=\"right\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"98%\">\r\n");
      out.write("\t\t<tbody><tr>\r\n");
      out.write("\t\t\t<td align=\"right\" valign=\"middle\" width=\"776\"><div class=\"innner_bodybg\" style=\"width: 779px;\">\r\n");
      out.write("\t\t\t\t<div style=\"background-image: url(images/Inner_heading_bg.gif); background-repeat: repeat-x; height: 31px;\">\r\n");
      out.write("\t\t\t\t<div style=\"height: 31px; width: 37px; float: left;\"><img src=\"Inner_heading_img.gif\"></div>\r\n");
      out.write("\t\t\t\t<div style=\"float: left; padding-top: 8px; font-family: arial; font-size: 14px; color: rgb(0, 0, 0); font-weight: bold;\">Hotels in Ramnad</div> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"776\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                                        <tr>\r\n");
      out.write("\t\t\t\t<td  align=\"left\" bgcolor=\"#ddeaf6\" valign=\"middle\" height=\"20\"><span class=\"train_h1\">&nbsp;IBRISS HOTEL  </span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("                    <td class=\"inner_border\" align=\"left\" valign=\"top\">\r\n");
      out.write("                         Head Post Office Near<br>\r\n");
      out.write("                         Sivan Koil Road<br>\r\n");
      out.write("                         Ramanathapuram<br>\r\n");
      out.write("                        Phone : 091503 46790<br>\r\n");
      out.write("                    </td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("             </tbody></table></div></div></tr></tbody></table></td></tr></table>\r\n");
      out.write("</td></tr></table>\r\n");
      out.write("\r\n");
      out.write("\t<img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\">     \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("    \t\t<td  colspan=\"2\" bgcolor=\"#ded7d6\"><img src=\"Images\\spacer.gif\" width=\"980\" height=\"3\"></td><td></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("    \t\t<td class=\"footer\"> \r\n");
      out.write("\t\t\t</td><td align=\"right\"><img src=\"Images\\cards.jpg\" align=\"absmiddle\" width=\"178\" height=\"32\"></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</body></html>                          \r\n");
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
