package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cityview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <img src=\"Images\\header1.jpg\" alt=\"Vishakapatnam Hotels\" width=\"320\" height=\"200\"><img src=\"Images\\header2.jpg\" alt=\"Hotels in Vishakapatnam\" width=\"300\" height=\"200\"><img src=\"Images\\header3.jpg\" alt=\"Vizag Hotels\" width=\"300\" height=\"200\"><img src=\"Images\\header4.jpg\" alt=\"Hotels in Vizag, Andra Pradesh\" width=\"320\" height=\"200\">\r\n");
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
      out.write("        <a href=\"hydphotogallery1.jsp\">ATTRACTIONS</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"\">HISTORY</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"\">DOWNLOADS</a>\r\n");
      out.write("        <img src=\"Images\\link_sep.jpg\" align=\"absmiddle\" width=\"10\" height=\"60\" hspace=\"30\">\r\n");
      out.write("        <a href=\"flighttimings.jsp\" target=\"_self\">TRAVELS</a>\r\n");
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
      out.write("<table align=\"center\" width=\"100%\" border=\"5\">\r\n");
      out.write("<tr><td valign=\"top\">\r\n");
      out.write("<div class=\"sidenav A\">\r\n");
      out.write("<fieldset><legend><img src=\"Images\\btn-view.gif\"></legend>\r\n");
      out.write("<a href=\"ATM locations.jsp\">ATM Locations</a><br>\r\n");
      out.write("<a href=\"Bank locations.jsp\">Banks</a><br>\r\n");
      out.write("<a href=\"#\">Beauty Parlors</a><br>\r\n");
      out.write("<a href=\"Blood banks.jsp\">Blood Banks</a><br>\r\n");
      out.write("<a href=\"Cardealers.jsp\">Car Dealers</a><br>\r\n");
      out.write("<a href=\"#\">Consultants</a><br>\r\n");
      out.write("<a href=\"#\">Emergency</a><br>\r\n");
      out.write("<a href=\"Functionhalls.jsp\">Function Halls</a><br>\r\n");
      out.write("<a href=\"#\">Gas Dealers</a><br>\r\n");
      out.write("<a href=\"Healthline.jsp\">Health Line</a><br>\r\n");
      out.write("<a href=\"Theaters.jsp\">Movie Theaters</a><br>\r\n");
      out.write("<a href=\"#\">Shopping Malls</a><br>\r\n");
      out.write("<a href=\"#\">Temples</a></fieldset>\r\n");
      out.write("</div></td>\r\n");
      out.write("<td>\r\n");
      out.write("<td align=\"right\" valign=\"top\" width=\"776\"><div>\r\n");
      out.write("                          <div class=\"innner_bodybg\" style=\"width: 779px;\">\r\n");
      out.write("                            <div style=\"background-image: url(images/Inner_heading_bg.gif); background-repeat: repeat-x; height: 31px;\">\r\n");
      out.write("                              <div style=\"height: 31px; width: 37px; float: left;\"><img src=\"Inner_heading_img.gif\"></div>\r\n");
      out.write("    <div style=\"float: left; padding-top: 8px; font-family: arial; font-size: 14px; color: rgb(0, 0, 0); font-weight: bold;\">Vizag CityGuide</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"font-family: verdana; font-size: 12px; margin-left: 5px; margin-right: 5px;\" align=\"justify\"><br>Vizag\r\n");
      out.write("has an intercontinental mix of people from various parts of the\r\n");
      out.write("country. It is enclosed on three sides by partly covered mountain\r\n");
      out.write("ranges. The south eastern city is protected by the Bay of Bengal. Vizag\r\n");
      out.write("is far away from any international border, both land and sea, making it\r\n");
      out.write("the choice for planned placement of the headquarters of the Eastern\r\n");
      out.write("Naval Command. <br> The city has always been an important place on the map right from ancient times. Vizag is a successful <span class=\"style1\">industrial city</span>\r\n");
      out.write("in the southern state of Andhra Pradesh with a busy port, huge dry dock\r\n");
      out.write("and a successful ship building industry. Just a short drive away is the\r\n");
      out.write("<span class=\"style2\">Rishikonda Beach</span>. The port of Vizag is a\r\n");
      out.write("major landmark. Vizag is considered an important centre for quality\r\n");
      out.write("education in the state of Andhra Pradesh. The city has developed into a\r\n");
      out.write("hub for many heavy industries. It is so secure that it is the only city\r\n");
      out.write("in India with such huge industries like <span class=\"style3\">Vizag steel plant</span>,\r\n");
      out.write("Hindustan Petroleum Corporation Limited, and some major organizations\r\n");
      out.write("like Shipyard, NSTL, Naval Command, and yet the largest tourist\r\n");
      out.write("destination in the state; definitely puts it among the safest places of\r\n");
      out.write("India.</div> \r\n");
      out.write("\t\t\t\t\t\t\t<br><div style=\"margin: 5px 125px 5px 5px; font-family: Georgia; font-weight: bold; font-size: 12px; color: rgb(1, 13, 16);\"><a href=\"http://www.vizaginformation.com/Vizagcitymap.html\"><img src=\"city_guide_img.jpg\" alt=\"Vizag City Map\" align=\"center\" border=\"0\"></a></div>\r\n");
      out.write("\t\t\t\t\t\t<br>\t\t\t\t\t\t\t\t<div style=\"font-family: verdana; font-size: 12px; margin-left: 5px; margin-right: 5px;\" align=\"justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>Vizag has a pleasant environment with golden <strong>beaches</strong>, <span class=\"style4\">grassy green fields</span>, <span class=\"style5\">blooming valleys</span> and marvelous monuments from the erstwhile rich and spiritual heritage.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <p>\r\n");
      out.write("We can guide you find your way for an exciting and scintillating tour\r\n");
      out.write("of the city. It will be enjoyable and at the same time memorable time\r\n");
      out.write("at Vizag. You can begin your tour at the Fishing Harbor followed by <span class=\"style6\">R. K Beach</span>, <strong>Kali Temple</strong>, <span class=\"style7\">Visakha Museum</span>, <span class=\"style8\">Vuda Park</span>, <span class=\"style9\">Kambala Konda</span>, <span class=\"style10\">Kailasagiri</span>, <span class=\"style11\">Indira Gandhi Zoological Park</span>, <span class=\"style12\">Rushi Konda Beach</span>, <span class=\"style1\">Bhimili Beach</span>.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p> You may also start at the Shipyard followed by <span class=\"style13\">yarada Beach</span>, Port, and <span class=\"style14\">Naval Dockyard</span>. Some would prefer to start at <span class=\"style15\">Borra Caves</span>, <span class=\"style16\">Araku</span>, <span class=\"style17\">Sileru Water Falls</span>, <span class=\"style18\">Anantagiri Hills</span> or the <span class=\"style19\">steel plant</span>, <span class=\"style20\">Gangavaram Beach</span>, <span class=\"style21\">Simhachalam</span>, <span class=\"style22\">Mudasarlova</span>, <span class=\"style23\">Sivajipalem Park</span>.\r\n");
      out.write("In this manner, you may plan your tour and visit all the tourist spots\r\n");
      out.write("in Vizag. Visakhapatnam has everything to make it successful tourist\r\n");
      out.write("destination. You will see nature at its best and your dreams of a\r\n");
      out.write("dreamland will come true.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                       <div style=\"padding-bottom: 3px; height: 15px; padding-top: 5px; padding-right: 5px;\"><a href=\"#\" class=\"top_link\">Top&nbsp;<img src=\"Cityguide_files/top_linkimg.gif\" border=\"0\" width=\"12\" height=\"12\"></a></div>\r\n");
      out.write("                        </div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                <img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\"><img src=\"Images\\rgt_sep.jpg\">     \r\n");
      out.write("<div class=\"more\" align=\"right\"></div>\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  colspan=\"2\" bgcolor=\"#ded7d6\"><img src=\"Images\\spacer.gif\" width=\"980\" height=\"3\"></td><td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"footer\"> Copyrights © , Vishakapatnam. All Rights Reserved. \r\n");
      out.write("\t</td><td align=\"right\"><img src=\"Images\\cards.jpg\" align=\"absmiddle\" width=\"178\" height=\"32\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body></html>                          \r\n");
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
