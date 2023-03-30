package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>CONTRACT MANAGEMENT</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/index_style.css\">\r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("      <!-- Spinner Start -->\r\n");
      out.write("    <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("        <div class=\"spinner\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Spinner End -->\r\n");
      out.write("    <body>\r\n");
      out.write("        <section class=\"ftco-section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-md-6 text-center mb-5\">\r\n");
      out.write("                        <h2 class=\"heading-section\">CONTRACT MANAGEMENT</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-md-12 col-lg-10\">\r\n");
      out.write("                        <div class=\"wrap d-md-flex\">\r\n");
      out.write("                            <div class=\"img\" style=\"background-image: url(images/bg-1.jpg);\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"login-wrap p-4 p-md-5\">\r\n");
      out.write("                                <div class=\"d-flex\">\r\n");
      out.write("                                    <div class=\"w-100\">\r\n");
      out.write("                                        <h3 class=\"mb-4\">Sign In</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"w-100\">\r\n");
      out.write("                                        <p class=\"social-media d-flex justify-content-end\">\r\n");
      out.write("                                            <a href=\"https://www.facebook.com/duonggg01/\" class=\"social-icon d-flex align-items-center justify-content-center\"><span class=\"fa fa-facebook\"></span></a>\r\n");
      out.write("                                            <a href=\"https://www.facebook.com/duonggg01/\" class=\"social-icon d-flex align-items-center justify-content-center\"><span class=\"fa fa-twitter\"></span></a>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div style=\"color:red;\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.notification}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </div>\r\n");
      out.write("                                <form action=\"MainController\" method=\"post\" class=\"signin-form\">\r\n");
      out.write("                                    <div class=\"form-group mb-3\">\r\n");
      out.write("                                        <label class=\"label\" for=\"name\">Username</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"emailtxt\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.emailtxt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Username\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group mb-3\">\r\n");
      out.write("                                        <label class=\"label\" for=\"password\">Password</label>\r\n");
      out.write("                                        <input type=\"password\" name=\"passwordtxt\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                   \r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <button type=\"submit\" value=\"Login\" name=\"action\" class=\"form-control btn btn-primary rounded submit px-3\">Sign In</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group d-md-flex\">\r\n");
      out.write("                                        <div class=\"w-50 text-left\">\r\n");
      out.write("                                            <label class=\"checkbox-wrap checkbox-primary mb-0\">Remember Me\r\n");
      out.write("                                                <input type=\"checkbox\" checked>\r\n");
      out.write("                                                <span class=\"checkmark\"></span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                      \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                                <p class=\"text-center\">Not a member? <a  href=\"Registration.jsp\">Sign Up</a></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js_index/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js_index/popper.js\"></script>\r\n");
      out.write("        <script src=\"js_index/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js_index/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
