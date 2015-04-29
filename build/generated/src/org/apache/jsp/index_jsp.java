package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("        <!--jQuery-->\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css\"> -->\n");
      out.write("        <!-- // <script src=\"http://code.jquery.com/jquery-1.11.2.min.js\"></script> -->\n");
      out.write("        <!-- // <script src=\"http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js\"></script> -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css\">\n");
      out.write("            <script src=\"http://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("            <script src=\"http://code.jquery.com/ui/1.11.3/jquery-ui.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                $(function () {\n");
      out.write("                    $(\"#slider-range\").slider({\n");
      out.write("                        range: true,\n");
      out.write("                        min: 0,\n");
      out.write("                        max: 500,\n");
      out.write("                        values: [20, 300],\n");
      out.write("                        slide: function (event, ui) {\n");
      out.write("                            $(\"#amount\").val(\"$\" + ui.values[ 0 ] + \" - $\" + ui.values[ 1 ]);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                    $(\"#amount\").val(\"$\" + $(\"#slider-range\").slider(\"values\", 0) +\n");
      out.write("                            \" - $\" + $(\"#slider-range\").slider(\"values\", 1));\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <!--jQuery-->\n");
      out.write("\n");
      out.write("            <title>Book Store</title>\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/background.jpg\">\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"logo\"><a href=\"index.jsp\"><img src=\"images/logo.gif\" alt=\"\" title=\"\" border=\"0\" /></a></div>            \n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>                                                                       \n");
      out.write("                        <li class=\"selected\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about.jsp\">About us</a></li>\n");
      out.write("                        <li><a href=\"category.jsp\">Books</a></li>\n");
      out.write("                        <li><a href=\"specials.jsp\">Special Books</a></li>\n");
      out.write("                        <!--                <li><a href=\"myaccount.jsp\">Account</a></li>\n");
      out.write("                                        <li><a href=\"register.jsp\">Register</a></li>-->\n");
      out.write("                        <!-- <li><a href=\"details.jsp\">Prices</a></li> -->\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>     \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"center_content\">\n");
      out.write("                <div class=\"left_content\">\n");
      out.write("\n");
      out.write("                    <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet1.gif\" alt=\"\" title=\"\" /></span>Featured books</div>\n");
      out.write("\n");
      out.write("             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                  \n");
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet2.gif\" alt=\"\" title=\"\" /></span>New books</div> \n");
      out.write("\n");
      out.write("                    <div class=\"new_products\">\n");
      out.write("\n");
      out.write("                        <div class=\"new_prod_box\">\n");
      out.write("                            <a href=\"details.jsp\">product name</a>\n");
      out.write("                            <div class=\"new_prod_bg\">\n");
      out.write("                                <span class=\"new_icon\"><img src=\"images/new_icon.gif\" alt=\"\" title=\"\" /></span>\n");
      out.write("                                <a href=\"details.jsp\"><img src=\"images/thumb1.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\n");
      out.write("                            </div>           \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"new_prod_box\">\n");
      out.write("                            <a href=\"details.jsp\">product name</a>\n");
      out.write("                            <div class=\"new_prod_bg\">\n");
      out.write("                                <span class=\"new_icon\"><img src=\"images/new_icon.gif\" alt=\"\" title=\"\" /></span>\n");
      out.write("                                <a href=\"details.jsp\"><img src=\"images/thumb2.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\n");
      out.write("                            </div>           \n");
      out.write("                        </div>                    \n");
      out.write("\n");
      out.write("                        <div class=\"new_prod_box\">\n");
      out.write("                            <a href=\"details.jsp\">product name</a>\n");
      out.write("                            <div class=\"new_prod_bg\">\n");
      out.write("                                <span class=\"new_icon\"><img src=\"images/new_icon.gif\" alt=\"\" title=\"\" /></span>\n");
      out.write("                                <a href=\"details.jsp\"><img src=\"images/thumb3.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\n");
      out.write("                            </div>           \n");
      out.write("                        </div>          \n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div><!--end of left content-->\n");
      out.write("\n");
      out.write("                <div class=\"right_content\">\n");
      out.write("\n");
      out.write("                    <div class=\"languages_box\">\n");
      out.write("                        <span class=\"red\">Signed in as:</span>\n");
      out.write("                        <a href=\"EditProfile.jsp\">\n");
      out.write("                            <strong> ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</strong>\n");
      out.write("                        </a>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                        </br>\n");
      out.write("                        </br>\n");
      out.write("                        <form action=\"Search\">\n");
      out.write("                            <strong>Search</strong>\n");
      out.write("                            <input type=\"search\" name=\"booksearch\"/>&ensp;&ensp;\n");
      out.write("                            <!--   <label for=\"points\">Points:</label>\n");
      out.write("                              <input type=\"range\" name=\"points\" id=\"points\" value=\"50\" min=\"0\" max=\"100\" data-show-value=\"true\"> -->\n");
      out.write("                            <input type=\"submit\" class=\"register\" data-inline=\"false\" value=\"Search\"/> \n");
      out.write("                        </form>\n");
      out.write("                        <p>\n");
      out.write("                            <label for=\"amount\">Price range:</label>\n");
      out.write("                            </br>\n");
      out.write("                            <input type=\"text\" id=\"amount\" readonly style=\"border:0; color:#f6931f; font-weight:bold;\">\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <div id=\"slider-range\"></div>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    <!-- <div data-role=\"main\" class=\"ui-content\">\n");
      out.write("                        <form method=\"post\" action=\"demoform.asp\">\n");
      out.write("                          <label for=\"points\">Points:</label>\n");
      out.write("                          <input type=\"range\" name=\"points\" id=\"points\" value=\"50\" min=\"0\" max=\"100\" data-show-value=\"true\">\n");
      out.write("                          <input type=\"submit\" data-inline=\"true\" value=\"Submit\">\n");
      out.write("                      </form>\n");
      out.write("                      </div> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"cart\">\n");
      out.write("                        <div class=\"title\"><span class=\"title_icon\"><img src=\"images/cart.gif\" alt=\"\" title=\"\" /></span>My cart</div>\n");
      out.write("                        <div class=\"home_cart_content\">\n");
      out.write("\n");
      out.write("                            <strong> ");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</strong>              \n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("   x items | <span class=\"red\">TOTAL:&ensp; </span>\n");
      out.write("\n");
      out.write("                            <strong> ");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("</strong>\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    <!--      <a href=\"cart.jsp\" class=\"view_cart\">view cart</a>-->\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet3.gif\" alt=\"\" title=\"\" /></span>About Our Store</div> \n");
      out.write("                <div class=\"about\">\n");
      out.write("                    <p>\n");
      out.write("                        <img src=\"images/about.gif\" alt=\"\" title=\"\" class=\"right\" />\n");
      out.write("                        BookStore.com, was established in 2015 by a group of ITI trainees from Mobile Development department intake 35 as a part of their Servlet &amp; JSP course project.\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"right_box\">\n");
      out.write("\n");
      out.write("                    <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet5.gif\" alt=\"\" title=\"\" /></span>Categories</div> \n");
      out.write("\n");
      out.write("                    <ul class=\"list\">\n");
      out.write("                            <li><a href=\"ViewBookByCategory?category=social\"><span class=\"red\"><strong>Social</strong></span></a></li>\n");
      out.write("                            <li><a href=\"ViewBookByCategory?category=history\"><span class=\"red\"><strong>History</strong></span></a></li>\n");
      out.write("                            <li><a href=\"ViewBookByCategory?category=culture\"><span class=\"red\"><strong>Culture</strong></span></a></li>\n");
      out.write("                            <li><a href=\"ViewBookByCategory?category=kids\"><span class=\"red\"><strong>Kids</strong></span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>         \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div><!--end of right content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div><!--end of center content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"left_footer\"><a href=\"index.jsp\" title=\"Home\"><img src=\"images/footer_logo.gif\" alt=\"\" title=\"\" /></a>\n");
      out.write("                <!-- <br /> <a href=\"http://csscreme.com/freecsstemplates/\" title=\"free templates\"><img src=\"images/csscreme.gif\" alt=\"free templates\" title=\"free templates\" border=\"0\" /></a> --></div>\n");
      out.write("            <div class=\"right_footer\">\n");
      out.write("                <a href=\"index.jsp\">Home</a>\n");
      out.write("                <a href=\"about.jsp\">About us</a>\n");
      out.write("                <a href=\"contact.jsp\">Contact us</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applicationScope.randomBook}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("book");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"feat_prod_box\">\n");
          out.write("\n");
          out.write("                        <div class=\"prod_img\"><a href=\"details.jsp\"><img src=\"images/prod1.gif\" alt=\"\" title=\"\" border=\"0\" /></a></div>\n");
          out.write("\n");
          out.write("                        <div class=\"prod_det_box\">\n");
          out.write("                            <div class=\"box_top\"></div>\n");
          out.write("                            <div class=\"box_center\">\n");
          out.write("                                <div class=\"prod_title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                    <p class=\"details\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                <a href=\"DetailsServlet?book=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"more\">- more details -</a>\n");
          out.write("                                <div class=\"clear\"></div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"box_bottom\"></div>\n");
          out.write("                        </div>    \n");
          out.write("                        <div class=\"clear\"></div>\n");
          out.write("                    </div>\t\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                            <a href=\"myaccount.jsp\">\n");
        out.write("                                <strong>Please sign in</strong>\n");
        out.write("                            </a> \n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                                &ensp;\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                                &ensp;\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                        <a href=\"cart.jsp\">\n");
        out.write("                        <strong>View cart</strong>\n");
        out.write("                    </a>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
