package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.webgoat.session.*;
import org.owasp.webgoat.lessons.Category;
import org.owasp.webgoat.lessons.AbstractLesson;
import org.owasp.webgoat.util.*;
import java.util.*;
import org.owasp.webgoat.lessons.RandomLessonAdapter;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

Course course = ((Course)session.getAttribute("course"));
WebSession webSession = ((WebSession)session.getAttribute("websession"));
AbstractLesson currentLesson = webSession.getCurrentLesson();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("<title>");
      out.print(currentLesson.getTitle());
      out.write("</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/webgoat.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/lesson.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/menu.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layers.css\" type=\"text/css\" />\n");
      out.write("<script language=\"JavaScript1.2\" src=\"javascript/javascript.js\" type=\"text/javascript\"></script>\n");
      out.write("<script language=\"JavaScript1.2\" src=\"javascript/menu_system.js\" type=\"text/javascript\"></script>\n");
      out.write("<script language=\"JavaScript1.2\" src=\"javascript/lessonNav.js\" type=\"text/javascript\"></script>\n");
      out.write("<script language=\"JavaScript1.2\" src=\"javascript/makeWindow.js\" type=\"text/javascript\"></script>\n");
      out.write("<script language=\"JavaScript1.2\" src=\"javascript/toggle.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");

final String menuPrefix = WebSession.MENU;
final String submenuPrefix = "submenu";
final String mbutPrefix = "mbut";
String printHint = "";
String printParameters = "";
String printCookies = "";
String lessonComplete = "<img src=\"images/buttons/lessonComplete.jpg\">";

List categories = course.getCategories();

StringBuffer buildList = new StringBuffer();

	Iterator iter1 = categories.iterator();
    while(iter1.hasNext())
    {
        Category category = (Category)iter1.next();
        
        buildList.append("'");
        buildList.append(menuPrefix);
        buildList.append(category.getRanking());
        buildList.append("','");
        buildList.append(submenuPrefix);
        buildList.append(category.getRanking());
        buildList.append("','");
        buildList.append(mbutPrefix);
        buildList.append(category.getRanking());
        buildList.append("'");
        
        if (iter1.hasNext())
        		buildList.append(",");
    }
      out.write("\n");
      out.write("<body class=\"page\" onload=\"setMenuMagic1(10,40,10,'menubottom',");
      out.print(buildList);
      out.write(");trigMM1url('");
      out.print( menuPrefix );
      out.write("',1);MM_preloadImages('images/buttons/hintLeftOver.jpg','images/buttons/hintOver.jpg','images/buttons/hintRightOver.jpg','images/buttons/paramsOver.jpg','images/buttons/htmlOver.jpg','images/buttons/cookiesOver.jpg','images/buttons/javaOver.jpg','images/buttons/plansOver.jpg','images/buttons/logout.jpg','images/buttons/helpOver.jpg'); initIframe();\">\n");
      out.write("\n");
      out.write("\t<div id=\"wrap\">\n");
      out.write("\t");

	int topCord = 140;
	int zIndex = 105;
	
		Iterator iter2 = categories.iterator();
		while(iter2.hasNext())
		{
		    Category category = (Category)iter2.next();
		
      out.write("\n");
      out.write("\t\t<div id=\"");
      out.print(menuPrefix + category.getRanking());
      out.write("\" style=\"position:absolute; left:30px; top:");
      out.print(topCord);
      out.write("px; width:160px; z-index:");
      out.print(zIndex);
      out.write("\"><a href=\"javascript:;\" onclick=\"trigMenuMagic1('");
      out.print(menuPrefix + category.getRanking());
      out.write("',1);return false\" onfocus=\"if(this.blur)this.blur()\"><img src=\"images/menu_images/1x1.gif\" width=\"1\" height=1\"20\" name=\"mbut");
      out.print(category.getRanking());
      out.write("\" border=\"0\" alt=\"\"/>");
      out.print(category.getName());
      out.write("</a></div>\n");
      out.write("\t\t");

		topCord=topCord + 30;
		zIndex=zIndex + 1;
		}
		
			int topSubMenu = 72;
		
			Iterator iter3 = categories.iterator();
			while(iter3.hasNext())
			{		    
			    	Category category = (Category)iter3.next();
				List lessons = webSession.getLessons(category);
			    Iterator iter4 = lessons.iterator();
			
      out.write("    \n");
      out.write("\t\t<div id=\"submenu");
      out.print(category.getRanking());
      out.write("\" class=\"pviimenudiv\" style=\"position:absolute; left:200px; top:");
      out.print(topSubMenu);
      out.write("px; width:150px; visibility: hidden; z-index:");
      out.print(zIndex);
      out.write("\">\n");
      out.write("\t  \t\t<table width=\"150\" border=\"0\" cellspacing=\"6\" cellpadding=\"0\">");


	  		topSubMenu=topSubMenu+30;
			zIndex=zIndex + 1;
			
		  	while(iter4.hasNext())
			{		  	    
		    		AbstractLesson lesson = (AbstractLesson)iter4.next();
		    
			
      out.write("<tr>\n");
      out.write("\t      \t\t<td>");
      out.print((lesson.isCompleted(webSession) ? lessonComplete : ""));
      out.write("<a href=\"");
      out.print(lesson.getLink());
      out.write('"');
      out.write('>');
      out.print(lesson.getTitle());
      out.write("</a></td>\n");
      out.write("\t    \t\t</tr>\n");
      out.write("\t    \t\t");
 if (lesson instanceof RandomLessonAdapter) {
					RandomLessonAdapter rla = (RandomLessonAdapter) lesson;
					String[] stages = rla.getStages();
					if (stages != null)
					for (int i=0; i<stages.length; i++) {
	    		
      out.write("\n");
      out.write("\t\t\t    \t\t<tr><td class=\"pviimenudivstage\">");
      out.print((rla.isStageComplete(webSession, stages[i]) ? lessonComplete : ""));
      out.write("<a href=\"");
      out.print(lesson.getLink() + "&stage=" + (i+1) );
      out.write("\">Stage ");
      out.print(i+1);
      out.write(':');
      out.write(' ');
      out.print(stages[i] );
      out.write("</a>\n");
      out.write("\t\t\t\t\t\t</td></tr>\n");
      out.write("\t\t\t\t");
 
					}
				}
				
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\t  \t\t</table>\n");
      out.write("\t\t</div>");

			}
      out.write("\n");
      out.write("\t\t<div id=\"top\"></div>\n");
      out.write("\t\t<div id=\"topLeft\">\n");
      out.write("\t\t<div align=\"left\">\n");
      out.write("\t\t");
 if (currentLesson.getAvailableLanguages().size() != 0 ) 
		{
		
      out.write("\n");
      out.write("\t\t<form method=\"get\" action=\"attack\" style=\"display: inline;\">\n");
      out.write("\t\tChoose another language: <select name=\"language\" size=\"1\"\n");
      out.write("\t\t\tonChange=\"changeLanguage();\">\n");
      out.write("\t\t\t");

					  			for(String lang: currentLesson.getAvailableLanguages()){
					  				
      out.write("\n");
      out.write("\t\t\t<option value=\"");
      out.print(lang);
      out.write("\"\n");
      out.write("\t\t\t\t");
 if(webSession.getCurrrentLanguage().equals(lang)) out.println("selected" );
      out.write('>');
      out.print(lang);
      out.write("\n");
      out.write("\t\t\t</option>\n");
      out.write("\t\t\t");

					  					
					  			}
			
      out.write("\n");
      out.write("\t\t</select></form>\n");
      out.write("\t\t");

		} else {
		
      out.write("\n");
      out.write("\t\t\tInternationalization is not available for this lesson\n");
      out.write("\t\t");

		}
		
      out.write("\n");
      out.write("\t\t</div></div>\n");
      out.write("\t\t<div align=\"right\" id=\"topRight\">\n");
      out.write("\t\t<a href=\"attack?action=Logout\" onmouseout=\"MM_swapImgRestore()\"\n");
      out.write("\t\t\tonmouseover=\"MM_swapImage('logout','','images/buttons/logoutOver.jpg',1)\"><img\n");
      out.write("\t\t\tsrc=\"images/buttons/logout.jpg\" alt=\"LogOut\" name=\"logout\" width=\"45\"\n");
      out.write("\t\t\theight=\"22\" border=\"0\" id=\"logout\" /></a> <a href=\"#getFAQ()\"\n");
      out.write("\t\t\tonmouseout=\"MM_swapImgRestore()\"\n");
      out.write("\t\t\tonmouseover=\"MM_swapImage('help','','images/buttons/helpOver.jpg',1)\"><img\n");
      out.write("\t\t\tsrc=\"images/buttons/help.jpg\" alt=\"Help\" name=\"help\" width=\"22\"\n");
      out.write("\t\t\theight=\"22\" border=\"0\" id=\"help\" /></a>\n");
      out.write("\t\t</div>\n");
      out.write("<div id=\"lessonTitle\" align=\"right\">");
      out.print(currentLesson.getTitle());
      out.write("</div>\n");
      out.write("\t\t\t<div id=\"hMenuBar\">\n");
      out.write("\t\t\t\t");
 
				if (webSession.isAuthorizedInLesson(webSession.getRole(), WebSession.SHOWHINTS))
				{
				
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( webSession.getCurrentLesson().getLink() );
      out.write("&show=PreviousHint\" target=\"_top\" onclick=\"MM_nbGroup('down','group1','hintLeft','',1)\" \n");
      out.write("\t\t\t\tonmouseover=\"MM_nbGroup('over','hintLeft','images/buttons/hintLeftOver.jpg','',1)\" \n");
      out.write("\t\t\t\tonmouseout=\"MM_nbGroup('out')\">\n");
      out.write("\t\t\t\t<img src=\"images/buttons/hintLeft.jpg\" alt=\"Previous Hint\" name=\"hintLeft\" width=\"20\" height=\"20\" border=\"0\" id=\"hintLeft\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( webSession.getCurrentLesson().getLink() );
      out.write("&show=NextHint\" target=\"_top\" onclick=\"MM_nbGroup('down','group1','hint','',1)\" \n");
      out.write("\t\t\t\tonmouseover=\"MM_nbGroup('over','hint','images/buttons/hintOver.jpg','',1)\" \n");
      out.write("\t\t\t\tonmouseout=\"MM_nbGroup('out')\">\n");
      out.write("\t\t\t\t<img src=\"images/buttons/hint.jpg\" alt=\"Hints\" name=\"hint\" width=\"35\" height=\"20\" border=\"0\" id=\"hint\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( webSession.getCurrentLesson().getLink() );
      out.write("&show=NextHint\" target=\"_top\" onclick=\"MM_nbGroup('down','group1','hintRight','',1)\" \n");
      out.write("\t\t\t\tonmouseover=\"MM_nbGroup('over','hintRight','images/buttons/hintRightOver.jpg','',1)\" \n");
      out.write("\t\t\t\tonmouseout=\"MM_nbGroup('out')\">\n");
      out.write("\t\t\t\t<img src=\"images/buttons/hintRight.jpg\" alt=\"Next Hint\" name=\"hintRight\" width=\"20\" height=\"20\" border=\"0\" id=\"hintRight\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( webSession.getCurrentLesson().getLink() );
      out.write("&show=Params\" target=\"_top\" onclick=\"MM_nbGroup('down','group1','params','',1)\" \n");
      out.write("\t\t\t\tonmouseover=\"MM_nbGroup('over','params','images/buttons/paramsOver.jpg','',1)\" \n");
      out.write("\t\t\t\tonmouseout=\"MM_nbGroup('out')\">\n");
      out.write("\t\t\t\t<img src=\"images/buttons/params.jpg\" alt=\"Show Params\" name=\"");
      out.print( webSession.getCurrentLesson().getLink() );
      out.write("&show=Params\" width=\"87\" height=\"20\" border=\"0\" id=\"params\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( webSession.getCurrentLesson().getLink() );
      out.write("&show=Cookies\" target=\"_top\" onclick=\"MM_nbGroup('down','group1','cookies','',1)\" \n");
      out.write("\t\t\t\tonmouseover=\"MM_nbGroup('over','cookies','images/buttons/cookiesOver.jpg','',1)\" \n");
      out.write("\t\t\t\tonmouseout=\"MM_nbGroup('out')\">\n");
      out.write("\t\t\t\t<img src=\"images/buttons/cookies.jpg\" alt=\"Show Cookies\" name=\"cookies\" width=\"99\" height=\"20\" border=\"0\" id=\"cookies\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<a href=\"javascript:toggle('lessonPlans')\" target=\"_top\" onclick=\"MM_nbGroup('down','group1','plans','',1)\" \n");
      out.write("\t\t\t\tonmouseover=\"MM_nbGroup('over','plans','images/buttons/plansOver.jpg','',1)\" \n");
      out.write("\t\t\t\tonmouseout=\"MM_nbGroup('out')\">\n");
      out.write("\t\t\t\t<img src=\"images/buttons/plans.jpg\" alt=\"Lesson Plans\" width=\"89\" height=\"20\" border=\"0\" id=\"plans\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t");
 
				if (webSession.isAuthorizedInLesson(webSession.getRole(), WebSession.SHOWSOURCE))
				{
				
      out.write("\n");
      out.write("\t\t\t\t<a href=\"source\" onclick=\"makeWindow(this.href+ '?source=true', 'Java Source');return false;\" target=\"javaWin\"\n");
      out.write("\t\t\t\tonmouseover=\"MM_nbGroup('over','java','images/buttons/javaOver.jpg','',1)\" \n");
      out.write("\t\t\t\tonmouseout=\"MM_nbGroup('out')\">\n");
      out.write("\t\t\t\t<img src=\"images/buttons/java.jpg\" alt=\"Show Java\" name=\"java\" width=\"75\" height=\"20\" border=\"0\" id=\"java\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<a href=\"source\" onclick=\"makeWindow(this.href + '?solution=true', 'Java Solution');return false;\" target=\"javaWin\"\n");
      out.write("\t\t\t\tonmouseover=\"MM_nbGroup('over','solutions','images/buttons/solutionsOver.jpg','',1)\" \n");
      out.write("\t\t\t\tonmouseout=\"MM_nbGroup('out')\">\n");
      out.write("\t\t\t\t<img src=\"images/buttons/solutions.jpg\" alt=\"Show Solution\" name=\"solutions\" width=\"73\" height=\"20\" border=\"0\" id=\"solutions\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"twoCol\">\n");
      out.write("\t \t \t<div id=\"menuSpacer\"></div>\n");
      out.write("\t \t \t<div id=\"lessonAreaTop\">\n");
      out.write("\t \t \t");

			    if (currentLesson != null)
			    {
			    	
      out.write("\n");
      out.write("\t\t\t    \t<div id=\"training_wrap\">\n");
      out.write("\t\t\t    \t<div id=\"training\" class=\"info\"><a href=\"http://yehg.net/lab/pr0js/training/webgoat.php\">");
      out.print(WebGoatI18N.get("SolutionVideos"));
      out.write("</a></div>\n");
      out.write("\t\t\t    \t<div id=\"reset\" class=\"info\"><a href=\"");
      out.print(webSession.getRestartLink());
      out.write('"');
      out.write('>');
      out.print(WebGoatI18N.get("RestartLesson"));
      out.write("</a></div>\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t    \t\t\t");

	    		}
	 	 	
      out.write("\n");
      out.write("\t \t \t</div>\n");
      out.write("\t \t \t<div id=\"lessonArea\">\n");
      out.write("\t \t \t");

				if (webSession.getHint() != null)
				{
					printHint = "<div id=\"hint\" class=\"info\">" + webSession.getHint() + "</div><br>";
					out.println(printHint);
				}
				
				if (webSession.getParams() != null)
				{
					Iterator i = webSession.getParams().iterator();
					while (i.hasNext())
					{
						Parameter p = (Parameter) i.next();
						printParameters = "<div id=\"parameter\" class=\"info\">" + p.getName() + "=" + p.getValue() + "</div><br>";
						out.println(printParameters);
					}
				}
				
				if (webSession.getCookies() != null)
				{
					Iterator i = webSession.getCookies().iterator();
					while (i.hasNext())
					{
						Cookie c = (Cookie) i.next();
						printCookies = "<div id=\"cookie\" class=\"info\">" + c.getName() + " <img src=\"images/icons/rightArrow.jpg\" alt=\"\"> " + c.getValue() + "</div><br>";
						out.println(printCookies);
					}
				}
      out.write("\n");
      out.write("\t\t\t\t<div id=\"lessonPlans\" style=\"visibility:hidden; height:1px; position:absolute; left:260px; top:130px; width:425px; z-index:105;\">");
      out.print(currentLesson.getLessonPlan(webSession) );
      out.write("\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<a href=\"javascript:toggle('lessonPlans')\" target=\"_top\" onclick=\"MM_nbGroup('down','group1','plans','',1)\">Close this Window</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"lessonContent\">\n");
      out.write("\t\t    \t\t");
 
		    		AbstractLesson lesson = webSession.getCurrentLesson();
		    		if (lesson instanceof RandomLessonAdapter) {
					RandomLessonAdapter rla = (RandomLessonAdapter) lesson;
	    		
      out.write("\n");
      out.write("\t\t\t    \t\t<div class=\"info\">Stage ");
      out.print( rla.getLessonTracker(webSession).getStageNumber(rla.getStage(webSession)) + 1 );
      out.write("</div>\n");
      out.write("\t\t\t\t");
 
					}
				
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(webSession.getInstructions());
      out.write("</div>\n");
      out.write("\t\t\t\t<div id=\"message\" class=\"info\">");
      out.print(webSession.getMessage());
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\t\t\t");

			if (currentLesson.getTemplatePage(webSession) != null)
			{
				//System.out.println("Main.jsp - current lesson: " + currentLesson.getName() );
				//System.out.println("         - template Page: " + currentLesson.getTemplatePage(webSession));
			
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, currentLesson.getTemplatePage(webSession), out, false);
      out.write("\n");
      out.write("\t\t\t");

			}
			else
			{
			
      out.write("\n");
      out.write("\t\t\t<div id=\"lessonContent\">");
      out.print(currentLesson.getContent());
      out.write("</div>\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\t\t\t\t<div id=\"credits\">\n");
      out.write("\t\t  \t\t");
 out.println(currentLesson.getCredits());
      out.write("\n");
      out.write("\t\t  \t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t  \t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"bottom\">\n");
      out.write("\t\t\t<div align=\"center\"><a href=\"http://www.owasp.org\">OWASP Foundation</a> | \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://www.owasp.org/index.php/OWASP_WebGoat_Project\">Project WebGoat</a> | \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"mailto: ");
      out.print(webSession.getWebgoatContext().getFeedbackAddress());
      out.write("?subject=WebGoat Bug Report - Lesson: \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t ");
      out.print(webSession.getCurrentLesson().getName());
      out.write("\">Report Bug</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t  \t</div>\n");
      out.write("\t</div>\n");
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
