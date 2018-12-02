package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"keywords\" />\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Raleway:400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Josefin+Sans:400,600,700\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h2>Signup Form</h2>\n");
      out.write("<form method=\"POST\">\n");
      out.write("<div class=\"agileinfo\">\n");
      out.write("<input type=\"text\" name=\"uname1\" placeholder=\"User Name\" required=\"\">\n");
      out.write("</div>\n");
      out.write("<div class=\"agileinfo\">\n");
      out.write("<input type=\"email\" name=\"email1\" placeholder=\"Email\" required=\"\">\n");
      out.write("</div>\n");
      out.write("<div class=\"agileinfo\">\n");
      out.write("<input type=\"Password\" name=\"password1\" placeholder=\"Password\" required=\"\">\n");
      out.write("</div>\n");
      out.write("<div class=\"agileinfo\">\n");
      out.write("<input type=\"password\" name=\"password2\" placeholder=\"Confirm Password\" required=\"\">\n");
      out.write("</div>\n");
      out.write("<div class=\"w3l_but\">\n");
      out.write("<button type=\"submit\" formaction=\"signServlet\">REGISTER</button>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("<div class=\"wthree_down\">\n");
      out.write("<h3>Already had an Account please Login</h3>\n");
      out.write("</div>\n");
      out.write("<div class=\"w3agile_side\">\n");
      out.write("<div class=\"main\">\n");
      out.write("    <div class=\"panel\">\n");
      out.write("        <a href=\"#login_form\" id=\"login_pop\">LOGIN</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- popup form #1 -->\n");
      out.write("<a href=\"#x\" class=\"overlay\" id=\"login_form\"></a>\n");
      out.write("   <div class=\"popup\">\n");
      out.write("     <h2>Welcome</h2>\n");
      out.write("     <p>Please enter your Username and Password here</p>\n");
      out.write("\t <form method=\"POST\">\n");
      out.write("   <div>\n");
      out.write("      <input type=\"text\" name=\"uname\" placeholder=\"Username\">\n");
      out.write("   </div>\n");
      out.write("   <div>\n");
      out.write("\n");
      out.write("   <input type=\"password\" name=\"psw\" placeholder=\"Password\">\n");
      out.write("   </div>\n");
      out.write("             <button type=\"submit\" formaction=\"logServlet1\">Login</button>\n");
      out.write("   <a class=\"close\" href=\"#close\"></a>\n");
      out.write("   </form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
