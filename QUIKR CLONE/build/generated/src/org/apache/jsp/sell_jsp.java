package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sell_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sell</title>\n");
      out.write("        <style>  \n");
      out.write("      body {\n");
      out.write("            background-color: #f1f1f1;\n");
      out.write("            padding: 20px;\n");
      out.write("            font-family: Arial;\n");
      out.write("            }\n");
      out.write("     .header {\n");
      out.write("             overflow: hidden;\n");
      out.write("             background-color: #f1f1f1;\n");
      out.write("             padding: 20px 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("     .header a {\n");
      out.write("               float: left;\n");
      out.write("               color: black;\n");
      out.write("               text-align: center;\n");
      out.write("               padding: 12px;\n");
      out.write("               text-decoration: none;\n");
      out.write("               font-size: 18px; \n");
      out.write("               line-height: 25px;\n");
      out.write("               border-radius: 4px;\n");
      out.write("               }   \n");
      out.write("\n");
      out.write("     .header a.logo {\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("      .header a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                 color: black;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("      .header a.active {\n");
      out.write("                   background-color: dodgerblue;\n");
      out.write("                   color: white;\n");
      out.write("                   }\n");
      out.write("\n");
      out.write("      .header-right {\n");
      out.write("                float: right;\n");
      out.write("                }\n");
      out.write("                input[type=text], select, textarea {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    padding: 12px 12px 12px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color:#C7C7C7;\n");
      out.write("    padding: 20px;\n");
      out.write("    animation: normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("    float: left;\n");
      out.write("    width: 25%;\n");
      out.write("    margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("    float: left;\n");
      out.write("    width: 75%;\n");
      out.write("    margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("    content: \"\";\n");
      out.write("    display: table;\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("    .col-25, .col-75, input[type=submit] {\n");
      out.write("        width: 100%;\n");
      out.write("        margin-top: 0;\n");
      out.write("    }\n");
      out.write(" .header-left\n");
      out.write("{\n");
      out.write("    float:left;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"header-left\">\n");
      out.write("        <img src=\"images/user.png\" height=\"100 px\" width=\"80 px\"><br>\n");
      out.write("        ");
 out.println(session.getAttribute("name")); 
      out.write("\n");
      out.write("    </div>    \n");
      out.write("  <div class=\"header-right\">\n");
      out.write("    <a href=\"buy.jsp\">Buy</a>\n");
      out.write("    <a class=\"active\" href=\"sell.jsp\">Sell</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("   <div class=\"container\">\n");
      out.write("  <form action=\"inventory\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"fname\">Title</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"title\" name=\"title\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"category\">Category</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select id=\"category\" name=\"category\">\n");
      out.write("          <option value=\"cars\">Cars</option>\n");
      out.write("          <option value=\"bikes\">Bikes</option>\n");
      out.write("          <option value=\"mobile\">Mobile</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"description\">Description</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <textarea id=\"description\" name=\"description\" style=\"height:200px\"></textarea>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"category\">Category</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("          <input type=\"file\" name=\"image\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
