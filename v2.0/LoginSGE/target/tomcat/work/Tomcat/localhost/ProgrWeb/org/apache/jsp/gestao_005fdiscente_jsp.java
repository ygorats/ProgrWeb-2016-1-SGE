/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-19 21:10:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classes.Aluno;
import java.util.List;

public final class gestao_005fdiscente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"pt\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"Creative - Bootstrap 3 Responsive Admin Template\">\r\n");
      out.write("    <meta name=\"author\" content=\"GeeksLabs\">\r\n");
      out.write("    <meta name=\"keyword\" content=\"Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("    <title>SGE</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- bootstrap theme -->\r\n");
      out.write("    <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <!-- font icon -->\r\n");
      out.write("    <link href=\"css/elegant-icons-style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- full calendar css-->\r\n");
      out.write("    <link href=\"assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"assets/fullcalendar/fullcalendar/fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- easy pie chart-->\r\n");
      out.write("    <link href=\"assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("    <!-- owl carousel -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\" type=\"text/css\">\r\n");
      out.write("    <link href=\"css/jquery-jvectormap-1.2.2.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fullcalendar.css\">\r\n");
      out.write("    <link href=\"css/widgets.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style-responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"css/xcharts.min.css\" rel=\" stylesheet\">\r\n");
      out.write("    <link href=\"css/jquery-ui-1.10.4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <script src=\"js/lte-ie7.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- container section start -->\r\n");
      out.write("<section id=\"container\" class=\"\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <header class=\"header dark-bg\">\r\n");
      out.write("        <div class=\"toggle-nav\">\r\n");
      out.write("            <div class=\"icon-reorder tooltips\" data-original-title=\"Toggle Navigation\" data-placement=\"bottom\"><i class=\"icon_menu\"></i></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--CriaÃ§Ã£o do Logo-->\r\n");
      out.write("        <a href=\"index.html\" class=\"logo\">Sistema<span class=\"lite\">Escolar</span></a>\r\n");
      out.write("        <!--Fim Logo-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"nav search-row\" id=\"top_menu\">\r\n");
      out.write("            <!--  search form start -->\r\n");
      out.write("            <ul class=\"nav top-menu\">\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!--  search form end -->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"top-nav notification-row\">\r\n");
      out.write("            <!-- notificatoin dropdown start-->\r\n");
      out.write("            <ul class=\"nav pull-right top-menu\">\r\n");
      out.write("\r\n");
      out.write("                <!-- user login dropdown start-->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\r\n");
      out.write("                            <span class=\"profile-ava\">\r\n");
      out.write("                                <img alt=\"\" src=\"img/avatar1_small.jpg\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                        <span class=\"username\">Jenifer Smith</span>\r\n");
      out.write("                        <b class=\"caret\"></b>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu extended logout\">\r\n");
      out.write("                        <div class=\"log-arrow-up\"></div>\r\n");
      out.write("                        <li class=\"eborder-top\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"icon_profile\"></i> Meu Perfil</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-sitemap\"></i> Minhas Turmas</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"icon_mail_alt\"></i> Caixa de Entrada</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"icon_chat_alt\"></i> News</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"login.html\"><i class=\"icon_key_alt\"></i> Sair</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- user login dropdown end -->\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- notificatoin dropdown end-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!--header end-->\r\n");
      out.write("\r\n");
      out.write("    <!--InÃ­cio da Barra Lateral-->\r\n");
      out.write("    <aside>\r\n");
      out.write("        <div id=\"sidebar\"  class=\"nav-collapse \">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- InÃ­cio da Barra de Menu Lateral-->\r\n");
      out.write("            <ul class=\"sidebar-menu\">\r\n");
      out.write("                <li class=\"active\">\r\n");
      out.write("                    <a class=\"\" href=\"index.html\">\r\n");
      out.write("                        <i class=\"icon_house_alt\"></i>\r\n");
      out.write("                        <span>Painel</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"fa fa-user\"></i>\r\n");
      out.write("                        <span>Discente</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("                        <li><a class=\"\" href=\"/ProgrWeb/CadastrarDiscente\">Cadastro Discente</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"/ProgrWeb/GestaoDiscentes\">GestÃ£o Discente</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"fa fa-graduation-cap\"></i>\r\n");
      out.write("                        <span>Docente</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("\r\n");
      out.write("                        <li><a class=\"\" href=\"cadastro_docente.html\">Cadastro Docente</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"/ProgrWeb/GestaoDocente\">GestÃ£o Docente</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"fa fa-sitemap\"></i>\r\n");
      out.write("                        <span>Turmas</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("                        <li><a class=\"\" href=\"/ProgrWeb/CadastrarTurma\">Cadastro Turma</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"/ProgrWeb/GestaoTurma\">GestÃ£o Turma</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"fa fa-folder-open\"></i>\r\n");
      out.write("                        <span>Disciplinas</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("                        <li><a class=\"\" href=\"cadastro_disciplina.html\">Cadastro Disciplina</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"gestao_disciplina.html\">GestÃ£o Disciplina</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"icon_table\"></i>\r\n");
      out.write("                        <span>AvaliaÃ§Ã£o</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("                        <li><a class=\"\" href=\"notas_frequencia.html\">Notas e Frequencia</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"historico.html\">HistÃ³rico</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a class=\"\" href=\"graficos.html\">\r\n");
      out.write("                        <i class=\"icon_piechart\"></i>\r\n");
      out.write("                        <span>GrÃ¡ficos</span>\r\n");
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a class=\"\" href=\"gestao_usuarios.html\">\r\n");
      out.write("                        <i class=\"fa fa-users\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <span>UsuÃ¡rios</span>\r\n");
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- Fim da Barra de Menu-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </aside>\r\n");
      out.write("    <!--Fim da Barra Lateral-->\r\n");
      out.write("    \r\n");
      out.write("    <!-- Listagem dos alunos matriculados -->\r\n");
      out.write("    <section id=\"main-content\">\r\n");
      out.write("    \t<section class=\"wrapper\"> \r\n");
      out.write("\t\t    <div class=\"panel-body\">\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t\t\t<table class=\"table bootstrap-datatable countries\" id=\"alunos\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th accesskey=\"matricula\">Matricula</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Nome</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Nome da Mãe</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>CEP</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Data de Nascimento</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>   \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
						    
						  	List<Aluno> alunos =
						      (List<Aluno>) request.getAttribute("Alunos");
							
						    if (alunos != null && !alunos.isEmpty()) {
						      for (Aluno a : alunos) {
						    
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t      <td><a href=\"CadastrarDiscente?operacao=iniciarAlteracao&matricula=");
      out.print(a.matricula);
      out.write('"');
      out.write('>');
      out.print(a.matricula);
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t      <td>");
      out.print(a.nome);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t      <td>");
      out.print(a.nome_mae);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t      <td>");
      out.print(a.cep);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t      <td>");
      out.print(a.data_nascimento);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t      <td><a href=\"CadastrarDiscente?operacao=excluir&matricula=");
      out.print(a.matricula);
      out.write("\">Excluir</a></td> <!--  -->\r\n");
      out.write("\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\t\t    ");

						      }
						    }
						 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("<!-- container section end -->\r\n");
      out.write("\r\n");
      out.write("<!-- javascripts -->\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- nice scroll -->\r\n");
      out.write("<script src=\"js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!-- jquery validate js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- custom form validation script for this page-->\r\n");
      out.write("<script src=\"js/form-validation-script.js\"></script>\r\n");
      out.write("<!--custome script for all page-->\r\n");
      out.write("<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" >\r\n");
      out.write("\t/*var tabela = document.getElementById(\"alunos\");\r\n");
      out.write("\tvar corpoTabela = document.createElement('TBODY');\r\n");
      out.write("\ttabela.setAttribute(\"matricula\", \"999\");*/\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
