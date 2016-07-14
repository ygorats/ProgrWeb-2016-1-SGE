/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-10 21:58:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;

public final class dbclient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String val(javax.servlet.http.HttpServletRequest request, String param) {
  return val(request, param, "");
}
String val(javax.servlet.http.HttpServletRequest request, String param, String defaultValue) {
  String value = request.getParameter(param);
  return value == null || value.trim().equals("") ? defaultValue : value;
}
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

request.setCharacterEncoding("utf-8");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>DB Client</title>\n");
      out.write("<link rel=\"shortcut icon\" href=\"https://raw.githubusercontent.com/websys-co/jsp-db-client/master/src/main/webapp/favicon.ico\">\n");
      out.write("<link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  padding-top: 15px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("  <script src=\"//oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("  <script src=\"//oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <form name=\"frm\" method=\"post\" accept-charset=\"utf-8\">\n");
      out.write("        <input type=\"hidden\" name=\"op\" value=\"run\">\n");
      out.write("        <div class=\"col-sm-12\">\n");
      out.write("          <div class=\"panel panel-info\">\n");
      out.write("            <div class=\"panel-heading\">DB Client</div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    ");
String url = val(request, "url");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"url\" class=\"form-control input-sm\" placeholder=\"URL JDBC\" title=\"Exemplo: jdbc:derby:db;create=true\" value=\"");
      out.print(url);
      out.write("\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    ");
String user = val(request, "user");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"user\" class=\"form-control input-sm\" placeholder=\"Usuário\" value=\"");
      out.print(user);
      out.write("\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    ");
String password = val(request, "password");
      out.write("\n");
      out.write("                    <input type=\"password\" name=\"password\" class=\"form-control input-sm\" placeholder=\"Senha\" value=\"");
      out.print(password);
      out.write("\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    ");
String max = val(request, "max", "100");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"max\" class=\"form-control input-sm\" placeholder=\"# Máx. registros\" title=\"Quantidade máxima de registros\" value=\"");
      out.print(max);
      out.write("\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    ");
String sql = val(request, "sql");
      out.write("\n");
      out.write("                    <textarea name=\"sql\" class=\"form-control\" rows=\"8\" placeholder=\"SQL\">");
      out.print(sql);
      out.write("</textarea>\n");
      out.write("                  </div>\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-primary pull-right\">Executar</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");

String op = val(request, "op");
if (op.equals("run")) {
  Connection conn = null;
  try {
    conn = DriverManager.getConnection(url, user, password);
    Statement stmt = conn.createStatement();
    boolean isResultSet = stmt.execute(sql);
    if (isResultSet) {
      ResultSet rs = stmt.getResultSet();
      if (rs.next()) {

      out.write("\n");
      out.write("          <div class=\"panel panel-success\" id=\"resultPanel\">\n");
      out.write("            <div class=\"panel-heading\">Sucesso</div>\n");
      out.write("            <table class=\"table table-condensed\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
          String columnName = rsmd.getColumnName(i);

      out.write("\n");
      out.write("                  <th>");
      out.print(columnName);
      out.write("</th>\n");

        }

      out.write("\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");

        int maxRegs = Integer.parseInt(max);
        int numRegs = 1;
        do {

      out.write("\n");
      out.write("                <tr>\n");

          for (int i = 1; i <= columnCount; i++) {
            String value = rs.getString(i);            

      out.write("\n");
      out.write("                  <td>");
      out.print(value);
      out.write("</td>\n");

          }

      out.write("\n");
      out.write("                </tr>\n");

        } while(++numRegs <= maxRegs && rs.next());

      out.write("\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");

      } else {

      out.write("\n");
      out.write("          <div class=\"panel panel-success\" id=\"resultPanel\">\n");
      out.write("            <div class=\"panel-heading\">Sucesso</div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              <p>Nenhum registro foi encontrado.</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");

      }
    } else {
      int updateCount = stmt.getUpdateCount();

      out.write("\n");
      out.write("          <div class=\"panel panel-success\" id=\"resultPanel\">\n");
      out.write("            <div class=\"panel-heading\">Sucesso</div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              <p>O SQL foi executado com sucesso: <mark>");
      out.print(updateCount);
      out.write(" registro(s) alterado(s).</mark></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");

    }
  } catch (Throwable e) {

      out.write("\n");
      out.write("          <div class=\"panel panel-danger\" id=\"resultPanel\">\n");
      out.write("            <div class=\"panel-heading\">Erro</div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              <p>A execução do SQL falhou: <mark>");
      out.print(e.getClass().getName() + " - " + e.getMessage());
      out.write("</mark></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");

  } finally {
    if (conn != null) {
      try {
        conn.close();
      } catch (Throwable e) {
        //Não há o que fazer.        
      }
    }
  }

      out.write("\n");
      out.write("          <script>\n");
      out.write("            function scroll() {\n");
      out.write("              var resultPanel = $(\"#resultPanel\");\n");
      out.write("              if (resultPanel.length) {\n");
      out.write("                $(\"html, body\").animate({\n");
      out.write("                  scrollTop: resultPanel.offset().top\n");
      out.write("                }, 600);\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("          </script>\n");

} else {

      out.write("\n");
      out.write("          <script>\n");
      out.write("            function scroll() {\n");
      out.write("            }\n");
      out.write("          </script>\n");

}

      out.write("\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("      setTimeout(scroll, 300);\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("  <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("      /*!\n");
      out.write("       * IE10 viewport hack for Surface/desktop Windows 8 bug\n");
      out.write("       * Copyright 2014 Twitter, Inc.\n");
      out.write("       * Licensed under the Creative Commons Attribution 3.0 Unported License. For\n");
      out.write("       * details, see http://creativecommons.org/licenses/by/3.0/.\n");
      out.write("       */\n");
      out.write("\n");
      out.write("      // See the Getting Started docs for more information:\n");
      out.write("      // http://getbootstrap.com/getting-started/#support-ie10-width\n");
      out.write("      (function() {\n");
      out.write("        'use strict';\n");
      out.write("        if (navigator.userAgent.match(/IEMobile\\/10\\.0/)) {\n");
      out.write("          var msViewportStyle = document.createElement('style')\n");
      out.write("          msViewportStyle.appendChild(document.createTextNode('@-ms-viewport{width:auto!important}'))\n");
      out.write("          document.querySelector('head').appendChild(msViewportStyle)\n");
      out.write("        }\n");
      out.write("      })();\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
