package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.webgoat.session.WebSession;

public final class webgoat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

WebSession webSession = ((WebSession) session.getAttribute("websession"));

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("<title>WebGoat V5.2</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/webgoat.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"wrap\">\n");
      out.write("<div id=\"top\"></div>\n");
      out.write("<div id=\"start\">\n");
      out.write("<p>Thank you for using WebGoat! This program is a demonstration of common web application flaws.\n");
      out.write("The exercises are intended to provide hands on experience with\n");
      out.write("application penetration testing techniques. </p>\n");
      out.write("<p>The WebGoat project is lead\n");
      out.write("by Bruce Mayhew. Please send all comments to Bruce at ");
      out.print(webSession.getWebgoatContext().getFeedbackAddress());
      out.write(".</p>\n");
      out.write("\n");
      out.write("<div id=\"team\">\n");
      out.write("<table border=\"0\" align=\"center\" class=\"lessonText\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"50%\">\n");
      out.write("\t\t<div align=\"center\"><a href=\"http://www.owasp.org\"><img\n");
      out.write("\t\t\tborder=\"0\" src=\"images/logos/owasp.jpg\" alt=\"OWASP Foundation\"\n");
      out.write("\t\t\tlongdesc=\"http://www.owasp.org\" /></a></div>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td width=\"50%\">\n");
      out.write("\t\t<div align=\"center\"><a href=\"http://www.aspectsecurity.com\"><img\n");
      out.write("\t\t\tborder=\"0\" src=\"images/logos/aspect.jpg\" alt=\"Aspect Security\"\n");
      out.write("\t\t\tlongdesc=\"http://www.aspectsecurity.com\" /></a></div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"50%\">\n");
      out.write("\t\t<div align=\"center\"><span class=\"style1\"><br />\n");
      out.write("\t\tWebGoat Design Team </span></div>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td width=\"50%\">\n");
      out.write("\t\t<div align=\"center\"><span class=\"style1\"><br />\n");
      out.write("\t\tV5.3 Lesson Contributers </span></div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td valign=\"top\">\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Bruce Mayhew</div>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">David Anderson</div>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Rogan Dawes</div>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Laurence Casey (Graphics)</div>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td valign=\"top\">\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Chuck Willis</div>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Cam Morris</div>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\"></div>\n");
      out.write("\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td height=\"25\" valign=\"bottom\">\n");
      out.write("\t\t<div align=\"center\"><span class=\"style1\">Special Thanks\n");
      out.write("\t\tfor V5.3</span></div>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td height=\"25\" valign=\"bottom\">\n");
      out.write("\t\t<div align=\"center\"><span class=\"style1\">Documentation\n");
      out.write("\t\tContributers</span></div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Christine (Maven)</div>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Marek Jawurek (Internationalization)</div>\n");
      out.write("\t\t<br/><div align=\"center\" class=\"style2\">To all who have sent comments</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Sherif Koussa<br />\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Aung Khant<br />\n");
      out.write("\t\t(http://yehg.org/)</div>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">Erwin Geirnaert<br />\n");
      out.write("\t\t(http://www.zionsecurity.com/)</div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"2\">\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">\n");
      out.write("\t\t<form id=\"form\" name=\"form\" method=\"post\" action=\"attack\"><input\n");
      out.write("\t\t\ttype=\"submit\" name=\"start\" value=\"Start WebGoat\" /></form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t<div align=\"center\" class=\"style2\">&nbsp;</div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div align=\"center\" class=\"style2\">&nbsp;</div>\n");
      out.write("<div align=\"center\" class=\"style2\">&nbsp;</div>\n");
      out.write("<div align=\"center\" class=\"style2\">&nbsp;</div>\n");
      out.write("<div id=\"warning\">WARNING<br />\n");
      out.write("While running this program, your machine is extremely vulnerable to\n");
      out.write("attack if you are not running on localhost. If tou are NOT running on localhost (default configuration), You should disconnect from the network while using this program.\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("This program is for educational purposes only. Use of these techniques\n");
      out.write("without permission could lead to job termination, financial liability,\n");
      out.write("and/or criminal penalties.</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
