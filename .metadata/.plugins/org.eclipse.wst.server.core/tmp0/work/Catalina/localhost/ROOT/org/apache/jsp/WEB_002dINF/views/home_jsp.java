/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-01-28 23:14:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Spring%20Tool%20Suite%203.9.3/Workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/include/footer.jsp", Long.valueOf(1548057891464L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1547540838384L));
    _jspx_dependants.put("/WEB-INF/views/include/header.jsp", Long.valueOf(1548717259606L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>BoardProject | Jiyun</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/bower_components/bootstrap/dist/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/bower_components/font-awesome/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/bower_components/Ionicons/css/ionicons.min.css\" type=\"text/css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/dist/css/AdminLTE.min.css\" type=\"text/css\">\r\n");
      out.write("  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter\r\n");
      out.write("        page. However, you can choose any other skin. Make sure you\r\n");
      out.write("        apply the skin class to the body tag so the changes take effect. -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/dist/css/skins/skin-blue.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font -->\r\n");
      out.write("  <link rel=\"stylesheet\"\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 2.1.4 -->\r\n");
      out.write("<script src=\"/resources/plugins/jQuery/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("<body class=\"skin-blue sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Main Header -->\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a href=\"/spost/list\" class=\"logo\">\r\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("      <span class=\"logo-mini\"><b>B</b>PJ</span>\r\n");
      out.write("      <!-- logo for regular state and mobile devices -->\r\n");
      out.write("      <span class=\"logo-lg\"><b>BOARD PROJECT </b></span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("      <!-- Sidebar toggle button-->\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("      <!-- Navbar Right Menu -->\r\n");
      out.write("      <div class=\"navbar-custom-menu\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("         \r\n");
      out.write("          <!-- User Account Menu -->\r\n");
      out.write("          <li class=\"dropdown user user-menu\">\r\n");
      out.write("            <!-- Menu Toggle Button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <!-- The user image in the navbar-->\r\n");
      out.write("              <img src=\"/resources/dist/img/user-avatar.jpg\" class=\"user-image\" alt=\"User Image\">\r\n");
      out.write("              <!-- hidden-xs hides the username on small devices so only the image appears. -->\r\n");
      out.write("              <span class=\"hidden-xs\">Logged in?</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <!-- The user image in the menu -->\r\n");
      out.write("              <li class=\"user-header\">\r\n");
      out.write("                <img src=\"/resources/dist/img/user-avatar.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              </li>\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Footer-->\r\n");
      out.write("              <li class=\"user-footer\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"submit_button\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          <!-- Control Sidebar Toggle Button -->  \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <section class=\"content-header\">\r\n");
      out.write("      <h1>\r\n");
      out.write("        Bulletin Board\r\n");
      out.write("        <small>Post something!</small>\r\n");
      out.write("      </h1>\r\n");
      out.write("    </section>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("      <!-- left column -->\r\n");
      out.write("      <div class=\"col-md-12\">\r\n");
      out.write("        <!-- general form elements -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"box\">\r\n");
      out.write("            <div class=\"box-header with-border\">\r\n");
      out.write("              <h3 class=\"box-title\">HOME PAGE</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box-footer\">\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"button\" value=\"GO TO LIST\" class = \"btn btn-warning\" name=\"listBtn\" onclick = \"location.href='/spost/list'\"></input>\r\n");
      out.write("            <input type=\"button\" value=\"+NEW POST\" class = \"btn btn-success\" name=\"registerBtn\" onclick = \"location.href='/spost/register'\"></input>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div><!--/.col (left) -->\r\n");
      out.write("      </div>   <!-- /.row -->\r\n");
      out.write("    </section><!-- /.content -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Main Footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Create the tabs -->\r\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\r\n");
      out.write("      <li><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\r\n");
      out.write("      \r\n");
      out.write("      <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- Tab panes -->\r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("      <!-- Home tab content -->\r\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-home-tab\">\r\n");
      out.write("        <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\r\n");
      out.write("        <ul class=\"control-sidebar-menu\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"javascript:;\">\r\n");
      out.write("              <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"menu-info\">\r\n");
      out.write("                <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\r\n");
      out.write("\r\n");
      out.write("                <p>Will be 23 on April 24th</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("        <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\r\n");
      out.write("        <ul class=\"control-sidebar-menu\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"javascript:;\">\r\n");
      out.write("              <h4 class=\"control-sidebar-subheading\">\r\n");
      out.write("                Custom Template Design\r\n");
      out.write("                <span class=\"pull-right-container\">\r\n");
      out.write("                    <span class=\"label label-danger pull-right\">70%</span>\r\n");
      out.write("                  </span>\r\n");
      out.write("              </h4>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"progress progress-xxs\">\r\n");
      out.write("                <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("      <!-- Stats tab content -->\r\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("      <!-- Settings tab content -->\r\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\r\n");
      out.write("        <form method=\"post\">\r\n");
      out.write("          <h3 class=\"control-sidebar-heading\">General Settings</h3>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"control-sidebar-subheading\">\r\n");
      out.write("              Report panel usage\r\n");
      out.write("              <input type=\"checkbox\" class=\"pull-right\" checked>\r\n");
      out.write("            </label>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("              Some information about this general settings option\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.form-group -->\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("    </div>\r\n");
      out.write("  </aside>\r\n");
      out.write("  \r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("  <!-- Add the sidebar's background. This div must be placed\r\n");
      out.write("  immediately after the control sidebar -->\r\n");
      out.write("  <div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- REQUIRED JS SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 3 -->\r\n");
      out.write("<script src=\"/resources/bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.7 -->\r\n");
      out.write("<script src=\"/resources/bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"/resources/dist/js/adminlte.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Optionally, you can add Slimscroll and FastClick plugins.\r\n");
      out.write("     Both of these plugins are recommended to enhance the\r\n");
      out.write("     user experience. -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/include/header.jsp(79,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty login}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <p style=\"font-size:200%;\">\r\n");
          out.write("                      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                    </p>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/include/header.jsp(90,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty login}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <button type=\"submit\" onclick = \"location.href='/user/login'\" class=\"btn btn-primary btn btn-block btn-flat\">Sign In / Sign Up</button>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/include/header.jsp(93,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty login}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <button onclick = \"location.href='/user/logout'\" class=\"btn btn-primary btn btn-block btn-flat\">Sign Out</button>\r\n");
          out.write("                </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
