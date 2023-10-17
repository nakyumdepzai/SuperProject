package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addExpense_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Expense Sharing</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Responsive navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#!\">Expense Sharing</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"home.jsp\">Home</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"addExpense.jsp\">Them chi tieu</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"modifyExpense.jsp\">Chinh sua chi tieu</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"profile.jsp\">Ho so</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Header - set the background image for the header in the line below-->\n");
      out.write("        <header class=\"py-5 bg-image-full\" style=\"background-image: url('https://source.unsplash.com/wfh8dDlNFOk/1600x900')\">\n");
      out.write("            <div class=\"text-center my-5\">\n");
      out.write("                <img class=\"img-fluid rounded-circle mb-4\" src=\"img/logo.png\" alt=\"...\" />\n");
      out.write("                <h1 class=\"text-white fs-3 fw-bolder\">Full Width Pics</h1>\n");
      out.write("                <p class=\"text-white-50 mb-0\">Landing Page Template</p>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- Content section-->\n");
      out.write("        <section class=\"content\">\n");
      out.write("            <section class =\"left-content\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <h2>Left Section</h2>\n");
      out.write("                    <p>This is the content for the left section.</p>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"middle-content\">\n");
      out.write("                <section class=\"py-5\">\n");
      out.write("                    <div class=\"container my-5\">\n");
      out.write("                        <div class=\"row justify-content-center\">\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <h2>Full Width Backgrounds</h2>\n");
      out.write("                                <p class=\"lead\">A single, lightweight helper class allows you to add engaging, full width background images to sections of your page.</p>\n");
      out.write("                                <p class=\"mb-0\">The universe is almost 14 billion years old, and, wow! Life had no problem starting here on Earth! I think it would be inexcusably egocentric of us to suggest that we're alone in the universe.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <!-- Image element - set the background image for the header in the line below-->\n");
      out.write("                <div class=\"py-5 bg-image-full\" style=\"background-image: url('https://source.unsplash.com/4ulffa6qoKA/1200x800')\">\n");
      out.write("                    <!-- Put anything you want here! The spacer below with inline CSS is just for demo purposes!-->\n");
      out.write("                    <div style=\"height: 20rem\"></div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Content section-->\n");
      out.write("                <section class=\"py-5\">\n");
      out.write("                    <div class=\"container my-5\">\n");
      out.write("                        <div class=\"row justify-content-center\">\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <h2>Engaging Background Images</h2>\n");
      out.write("                                <p class=\"lead\">The background images used in this template are sourced from Unsplash and are open source and free to use.</p>\n");
      out.write("                                <p class=\"mb-0\">I can't tell you how many people say they were turned off from science because of a science teacher that completely sucked out all the inspiration and enthusiasm they had for the course.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("            <section class =\"left-content\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <h2>Left Section</h2>\n");
      out.write("                    <p>This is the content for the left section.</p>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"py-5 bg-dark\">\n");
      out.write("            <div class=\"container\"><p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2023</p></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
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
