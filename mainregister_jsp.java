package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Register</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".row::after {\n");
      out.write("    content: \"\";\n");
      out.write("    clear: both;\n");
      out.write("    display: table;\n");
      out.write("}\n");
      out.write("[class*=\"col-\"] {\n");
      out.write("    float: left;\n");
      out.write("    padding: 15px;\n");
      out.write("}\n");
      out.write(".col-1 {width: 8.33%;}\n");
      out.write(".col-2 {width: 16.66%;}\n");
      out.write(".col-3 {width: 25%;}\n");
      out.write(".col-4 {width: 33.33%;}\n");
      out.write(".col-5 {width: 41.66%;}\n");
      out.write(".col-6 {width: 50%;}\n");
      out.write(".col-7 {width: 58.33%;}\n");
      out.write(".col-8 {width: 66.66%;}\n");
      out.write(".col-9 {width: 75%;}\n");
      out.write(".col-10 {width: 83.33%;}\n");
      out.write(".col-11 {width: 91.66%;}\n");
      out.write(".col-12 {width: 100%;}\n");
      out.write("html {\n");
      out.write("    font-family: \"Lucida Sans\", sans-serif;\n");
      out.write("}\n");
      out.write(".header {\n");
      out.write("    background-color: #9933cc;\n");
      out.write("    color: #ffffff;\n");
      out.write("    padding: 15px;\n");
      out.write("}\n");
      out.write(".menu ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write(".menu li {\n");
      out.write("    padding: 8px;\n");
      out.write("    margin-bottom: 7px;\n");
      out.write("    background-color: #33b5e5;\n");
      out.write("    color: #ffffff;\n");
      out.write("    box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n");
      out.write("}\n");
      out.write(".menu li:hover {\n");
      out.write("    background-color: #0099cc;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
 
        if(request.getParameter("msg")!=null)
        {
      out.write("\n");
      out.write("        <script>alert('applied for job successfully check mail and status');</script>\n");
      out.write("        ");
}
if(request.getParameter("msgg")!=null)
{
      out.write("\n");
      out.write("<script>alert('Application Failed');</script>\n");
}

      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("  <center>\n");
      out.write("      <h1>Human Resource Management System</h1>\n");
      out.write("      <h2>Registeration page</h2>\n");
      out.write("  </center>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("<div class=\"col-3 menu\">\n");
      out.write("  <ul>\n");
      out.write("      <li><a style=\"text-decoration: none;\" rel=\"Click here\" href=\"uhome.jsp\"> Home</a></li>\n");
      out.write("               <li><a style=\"text-decoration: none;\" rel=\"Click here\" href=\"contact.jsp\">Contact</a></li>                \n");
      out.write("                \n");
      out.write("                <li><a style=\"text-decoration: none;\" rel=\"Click here\" href=\"login.jsp\">LogOut</a></li>\n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("    <form action=\"mainregaction.jsp\" method=\"post\">\n");
      out.write("<div class=\"col-9\">\n");
      out.write("<pre><span class=\"inner-pre\" style=\"font-size: 20px\">\n");
      out.write("Name*           :  <input type=\"text\" name=\"t1\"  size=\"30\" required><br>\n");
      out.write("LastName*       :  <input type=\"text\" name=\"t2\" size=\"30\" required><br>\n");
      out.write("FatherName*     :  <input type=\"text\" name=\"t3\" size=\"30\" required><br>\n");
      out.write("MotherName*     :  <input type=\"text\" name=\"t4\"  size=\"30\" required><br>\n");
      out.write("Gender*         :  <select name=\"t5\" required><br>\n");
      out.write("  <option>Select</option>  \n");
      out.write("  <option>Male</option>\n");
      out.write("  <option>Female</option>\n");
      out.write("  <option>Transgender</option>\n");
      out.write("</select><br>\n");
      out.write("City*           :  <input type=\"text\" name=\"t6\" size=\"30\" required><br>\n");
      out.write("District*       :  <select  name=\"t7\" required><br>\n");
      out.write("<option>--Select--</option>\n");
      out.write("<option>ADILABAD</option>\n");
      out.write("<option>ASIFABAD</option>\n");
      out.write("<option>BHADRADRI KOTHAGUDEM</option>\n");
      out.write("<option>BHUPALAPALLY</option>\n");
      out.write("<option>GADWAL</option>\n");
      out.write("<option>HYDERABAD</option>\n");
      out.write("<option>JAGTIAL</option>\n");
      out.write("<option>JANGOAN</option>\n");
      out.write("<option>KAMAREDDY</option>\n");
      out.write("<option>KARIMNAGAR</option>\n");
      out.write("<option>KHAMMAM</option>\n");
      out.write("<option>MAHABUBABAD</option>\n");
      out.write("<option>MAHABUBNAGAR</option>\n");
      out.write("<option>MANCHERIAL</option>\n");
      out.write("<option>MEDAK</option>\n");
      out.write("<option>MEDCHAL</option>\n");
      out.write("<option>NAGARKURNOOL</option>\n");
      out.write("<option>NALGONDA</option>\n");
      out.write("<option>NIRMAL</option>\n");
      out.write("<option>NIZAMABAD</option>\n");
      out.write("<option>PEDDAPALLI</option>\n");
      out.write("<option>RANGA REDDY</option>\n");
      out.write("<option>SANGAREDDY</option>\n");
      out.write("<option>SIDDIPET</option>\n");
      out.write("<option>SIRCILLA</option>\n");
      out.write("<option>SURYAPET</option>\n");
      out.write("<option>VIKARABAD</option>\n");
      out.write("<option>WANAPARTHY</option>\n");
      out.write("<option>WARANGAL RURAL</option>\n");
      out.write("<option>WARANGAL URBAN</option>\n");
      out.write("<option>YADADRI BHUVANAGIRI</option>\n");
      out.write("</select><br>\n");
      out.write("State*          :  <select  name=\"t8\" required><br>\n");
      out.write("<option>--Select--</option>\n");
      out.write("<option>Andhra Pradesh</option>\n");
      out.write("<option>Arunachal Pradesh</option>\n");
      out.write("<option>Assam  </option>\n");
      out.write("<option>Bihar </option>\n");
      out.write("<option>Chhattisgarh  </option>\n");
      out.write("<option>Goa </option>\n");
      out.write("<option>Gujarat</option>\n");
      out.write("<option>Haryana</option>\n");
      out.write("<option>Himachal Pradesh</option>\n");
      out.write("<option>Jammu & Kashmir</option>\n");
      out.write("<option>Jharkhand</option>\n");
      out.write("<option>Karnataka</option>\n");
      out.write("<option>Kerala</option>\n");
      out.write("<option>Madhya Pradesh</option>\n");
      out.write("<option>Maharashtra</option>\n");
      out.write("<option>Manipur</option>\n");
      out.write("<option>Meghalaya</option>\n");
      out.write("<option>Mizoram</option>\n");
      out.write("<option>Nagaland</option>\n");
      out.write("<option>Odisha</option>\n");
      out.write("<option>Punjab</option>\n");
      out.write("<option>Rajasthan</option>\n");
      out.write("<option>Sikkim</option>\n");
      out.write("<option>Tamil Nadu </option>\n");
      out.write("<option>Telangana </option>\n");
      out.write("<option>Tripura</option>\n");
      out.write("<option>Uttarakhand</option>\n");
      out.write("<option>Uttar Pradesh</option>\n");
      out.write("<option>West Bengal</option>\n");
      out.write("</select><br>\n");
      out.write("DOB*            :  <input type=\"date\" name=\"t9\"  size=\"50\" required><br>\n");
      out.write("MobileNo*       :  <input type=\"number\" name=\"t10\" min=\"7000000000\" max=\"9999999999\"  required> <br>              \n");
      out.write("Category*       :  <select  name=\"t11\" required><br>\n");
      out.write("<option>--Select--</option>\n");
      out.write("<option>Engineer</option>\n");
      out.write("<option>Manager</option>\n");
      out.write("<option>Developer</option>\n");
      out.write("<option>Web Designer</option>\n");
      out.write("<option>Marketing</option>\n");
      out.write("<option>Networking</option>\n");
      out.write("<option>Graphic designer</option>\n");
      out.write("</select><br>\n");
      out.write("          Educational Qualifications<br>\n");
      out.write("College*         :  <input type=\"text\" name=\"t12\"  size=\"30\" required><br>\n");
      out.write("SSCmarks*        :  <input type=\"number\" name=\"t13\" size=\"30\" required  min=\"50\" max=\"99\"><br>\n");
      out.write("Inter marks*     :  <input type=\"number\" name=\"t14\"  size=\"30\" required  min=\"50\" max=\"99\"><br>\n");
      out.write("Graduation marks*:  <input type=\"number\" name=\"t15\" size=\"30\" required  min=\"50\" max=\"99\"><br>\n");
      out.write("Branch*          :  <select  name=\"t16\" required><br>\n");
      out.write("<option>--Select--</option>\n");
      out.write("<option>CSE</option>\n");
      out.write("<option>ECE</option>\n");
      out.write("<option>EEE</option>\n");
      out.write("<option>Mechanical</option>\n");
      out.write("<option>Civil</option>\n");
      out.write("<option>Aeronatical</option>\n");
      out.write("</select><br>\n");
      out.write("Email*           : <input type=\"email\"  name=\"t17\" size=\"30\" required min=\"50\" max=\"99\"><br>\n");
      out.write("</pre><br>\n");
      out.write("       <input type=\"reset\">\n");
      out.write("       <input type=\"submit\" value=\"Submit\" />       \n");
      out.write("</body>\n");
      out.write("    </form>\n");
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
