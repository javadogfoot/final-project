/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-12-14 02:12:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.suggest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class suggestList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substring", org.apache.taglibs.standard.functions.Functions.class, "substring", new Class[] {java.lang.String.class, int.class, int.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1639447319904L));
    _jspx_dependants.put("jar:file:/C:/Users/고주환/Desktop/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/more/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1637128896000L));
    _jspx_dependants.put("jar:file:/C:/Users/고주환/Desktop/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/more/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1636085277404L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/css/suggest/suggestList.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("   function gory(f) {\r\n");
      out.write("      let language = ['영어','중국어','일본어','스페인어','프랑스어','독일어','TOEIC','OPIC','기타언어'];\r\n");
      out.write("      let sports = ['피트니스','테니스','골프','볼링','수영','요가','배구','발레','방송댄스','댄스스포츠','재즈댄스','스트릿댄스'];\r\n");
      out.write("      let music = ['보컬','피아노','성악','랩','기타','단소','플롯','리코더','우쿨렐레'];\r\n");
      out.write("      let art = ['미술','입시미술','드로잉','캘리그래피','사진','웹툰','메이크업','마술','연기','꽃꽂이','제빵','한식','양식','일식','중식'];\r\n");
      out.write("      let practice = ['코딩','엑셀','PPT','취업컨설팅','스피치','재테크','통계','포토샵','일러스트','영상편집'];\r\n");
      out.write("      let subject = ['국어','영어','수학','사회','과학','논술'];\r\n");
      out.write("      let target = document.getElementById(\"cate2\");\r\n");
      out.write("      let result = '';\r\n");
      out.write("      if (f.value == \"외국어\") result = language;\r\n");
      out.write("      else if (f.value == \"스포츠-댄스\") result = sports;\r\n");
      out.write("      else if (f.value == \"음악\") result = music;\r\n");
      out.write("      else if (f.value == \"예술-요리\") result = art;\r\n");
      out.write("      else if (f.value == \"실무교육\") result = practice;\r\n");
      out.write("      else if (f.value == \"교과목\") result = subject;\r\n");
      out.write("      target.options.lenght = 0;\r\n");
      out.write("      for (x in result) {\r\n");
      out.write("         let opt = document.createElement(\"option\");\r\n");
      out.write("         opt.value = result[x];\r\n");
      out.write("         opt.innerHTML = result[x];\r\n");
      out.write("         target.appendChild(opt);\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("<title>모레-강사 요청</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://use.fontawesome.com/releases/v5.2.0/js/all.js\"></script>\r\n");
      out.write("<link href=\"resources/css/header.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Global site tag (gtag.js) - Google Analytics -->\r\n");
      out.write("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-214947172-1\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  window.dataLayer = window.dataLayer || [];\r\n");
      out.write("  function gtag(){dataLayer.push(arguments);}\r\n");
      out.write("  gtag('js', new Date());\r\n");
      out.write("\r\n");
      out.write("  gtag('config', 'UA-214947172-1');\r\n");
      out.write("</script>\r\n");
      out.write("<!-- ---------------------비회원  -->\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!----------------------기본(의뢰인) 로그인중-->\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- -----------------------전문가 로그인중 -->\r\n");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   <script>   \r\n");
      out.write("       function show(){\r\n");
      out.write("         document.getElementById('hiddenHeaderContainer').style.display='block';\r\n");
      out.write("       }\r\n");
      out.write("       function hide(){\r\n");
      out.write("         document.getElementById('hiddenHeaderContainer').style.display='none';\r\n");
      out.write("       } \r\n");
      out.write("  </script> ");
      out.write("\r\n");
      out.write("<div class=\"revMainContainer\">\r\n");
      out.write("      <div class=\"revMainTextBox\">\r\n");
      out.write("         <div class=\"revMainText\">\r\n");
      out.write("            <h1>\r\n");
      out.write("               레슨 목록<br>\r\n");
      out.write("               <span style=\"font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;\">마음에 드는 레슨을 선택해보세요</span>\r\n");
      out.write("            </h1>   \r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("  <section id=\"section\" class=\"bg-f4f4f4\" style=\"min-height: 680px;\">\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("    <div class=\"container list-main-container\">\r\n");
      out.write("      <div class=\"list-align-nav\" style=\"margin-left: 220px;\">\r\n");
      out.write("      <form name=\"category\" action=\"suggestList.do\">\r\n");
      out.write("       <select class=\"form-control\" id=\"cate1\" name=\"cate1\" style=\"width: 120px; margin-right: 20px; float: left;\"onchange=\"gory(this)\">\r\n");
      out.write("        <option value=\"외국어\">외국어</option>\r\n");
      out.write("        <option value=\"스포츠-댄스\">스포츠-댄스</option>\r\n");
      out.write("        <option value=\"음악\">음악</option>\r\n");
      out.write("        <option value=\"예술-요리\">예술-요리</option>\r\n");
      out.write("        <option value=\"실무교육\">실무교육</option>\r\n");
      out.write("        <option value=\"교과목\">교과목</option>\r\n");
      out.write("      </select>\r\n");
      out.write("      <script>\r\n");
      out.write("         let cate1 = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cate1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("      $('#cate1').val(cate1);\r\n");
      out.write("      </script>\r\n");
      out.write("      <select class=\"form-control\" onchange=\"cateform()\" id=\"cate2\" name=\"cate2\" style=\"width: 120px; margin-left: 120px;\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </select>\r\n");
      out.write("      </form>\r\n");
      out.write("   <script>\r\n");
      out.write("         function cateform() {\r\n");
      out.write("         let f = document.category;\r\n");
      out.write("         if (f.cate2.value != \"세부분야\") {\r\n");
      out.write("            f.submit();\r\n");
      out.write("         } else {\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("   </script>\r\n");
      out.write("        <ul>\r\n");
      out.write("         \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("  ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("<div class=\"page_nav\">\r\n");
      out.write("  <nav aria-label=\"Page navigation example\" class=\"mb-5\">\r\n");
      out.write("    <ul class=\"pagination justify-content-center mt-5\">\r\n");
      out.write("      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagestr }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<link href=\"resources/css/footer.css\" rel=\"stylesheet\">\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("  <footer class=\"py-3 my-4\">\r\n");
      out.write("    <ul class=\"nav justify-content-center border-bottom pb-3 mb-3\">\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">Home</a></li>\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">Features</a></li>\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">Pricing</a></li>\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">FAQs</a></li>\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">About</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <p class=\"text-center text-muted\">&copy; 2021 Company, Inc</p>\r\n");
      out.write("  </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"b-example-divider\"></div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
      // /WEB-INF/views/header.jsp(16,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<header>\r\n");
          out.write("    <div id=\"headerContainer\">\r\n");
          out.write("        <a href=\"index.do\"><img src=\"resources/img/more_logo.jpg\" alt=\"logo\" style=\"padding: 10px\"></a>\r\n");
          out.write("        <div id=\"menubar\">\r\n");
          out.write("          <div id=\"leftMenu\">\r\n");
          out.write("            <div><a href=\"regist1.do\">전문가 등록하기</a></div>\r\n");
          out.write("            <div><a href=\"lessonList.do\">수업 요청하기</a></div>\r\n");
          out.write("            <div><a href=\"bbsList.do\">자유 게시판</a></div>\r\n");
          out.write("            <div><a href=\"reviewList.do\">후기 게시판</a></div>\r\n");
          out.write("          </div>\r\n");
          out.write("          <div id=\"rightMenu\">\r\n");
          out.write("               <div><a href=\"login.do\">로그인</a></div>\r\n");
          out.write("               <div><a href=\"noticeList.do\"><i class=\"far fa-question-circle\"></i></a></div>\r\n");
          out.write("          </div>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("	</header>\r\n");
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
      // /WEB-INF/views/header.jsp(36,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<header>\r\n");
          out.write("     <div id=\"headerContainer\">\r\n");
          out.write("        <a href=\"index.do\"><img src=\"resources/img/more_logo.jpg\" alt=\"logo\" style=\"padding: 10px\"></a>\r\n");
          out.write("        <div id=\"menubar\">\r\n");
          out.write("          <div id=\"leftMenu\">\r\n");
          out.write("            <div id=\"client\" onmouseover=\"show()\" onmouseout=\"hide()\">\r\n");
          out.write("               <a href=\"#\">레슨</a>\r\n");
          out.write("              </div>\r\n");
          out.write("            <div id=\"joinExpert\">\r\n");
          out.write("               <a href=\"regist1.do\">전문가 등록하기</a>\r\n");
          out.write("             </div>\r\n");
          out.write("            <div><a href=\"bbsList.do\">자유 게시판</a></div>\r\n");
          out.write("            <div><a href=\"reviewList.do\">후기 게시판</a></div>\r\n");
          out.write("          </div>\r\n");
          out.write("          <div id=\"rightMenu\">\r\n");
          out.write("            <div>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님</div>\r\n");
          out.write("            <div><a href=\"setting.do\"><i class=\"far fa-user fa-1x\"></i></a></div>\r\n");
          out.write("            <div><a href=\"noticeList.do\"><i class=\"far fa-question-circle\"></i></a></div>\r\n");
          out.write("          </div>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("      <div id=\"hiddenHeaderContainer\" onmouseover=\"show()\" onmouseout=\"hide()\">\r\n");
          out.write("        <div class=\"hiddenItem\">\r\n");
          out.write("          <div class=\"Item\"><a href=\"suggestList.do\">레슨 목록</a></div>\r\n");
          out.write("          <div class=\"Item\"><a href=\"lessonList.do\">레슨 요청하기</a></div>\r\n");
          out.write("          <div class=\"Item\"><a href=\"sentRequest.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">보낸 요청</a></div>\r\n");
          out.write("          <div class=\"Item\"><a href=\"receiveSuggest.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">받은 제안</a></div>\r\n");
          out.write("          <div class=\"Item\"><a href=\"m_documentList.do\">나의 레슨 내역</a></div>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("	</header>\r\n");
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
      // /WEB-INF/views/header.jsp(70,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 2 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<header>\r\n");
          out.write("     <div id=\"headerContainer\">\r\n");
          out.write("       <a href=\"index.do\"><img src=\"resources/img/more_logo.jpg\" alt=\"logo\" style=\"padding: 10px\"></a>\r\n");
          out.write("       <div id=\"menubar\">\r\n");
          out.write("         <div id=\"leftMenu\">\r\n");
          out.write("           <div id=\"client\" onmouseover=\"show()\" onmouseout=\"hide()\">\r\n");
          out.write("              <a href=\"#\">레슨</a>\r\n");
          out.write("             </div>\r\n");
          out.write("           <div><a href=\"bbsList.do\">자유 게시판</a></div>\r\n");
          out.write("         </div>\r\n");
          out.write("         <div id=\"rightMenu\">\r\n");
          out.write("           <div>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님</div>\r\n");
          out.write("           <div><a href=\"setting.do\"><i class=\"far fa-user fa-1x\"></i></a></div>\r\n");
          out.write("		   <div><a href=\"noticeList.do\"><i class=\"far fa-question-circle\"></i></a></div>\r\n");
          out.write("         </div>\r\n");
          out.write("       </div>\r\n");
          out.write("     </div>\r\n");
          out.write("     <div id=\"hiddenHeaderContainer\" onmouseover=\"show()\" onmouseout=\"hide()\">\r\n");
          out.write("       <div class=\"hiddenItem\">\r\n");
          out.write("       	 <div class=\"Item\"><a href=\"requestList.do\">요청서 목록</a></div>\r\n");
          out.write("       	 <div class=\"Item\"><a href=\"suggest.do\">레슨 제안하기</a></div>\r\n");
          out.write("         <div class=\"Item\"><a href=\"sentsuggest.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">보낸 제안</a></div>\r\n");
          out.write("		 <div class=\"Item\"><a href=\"m_documentList.do\">나의 레슨 내역</a></div>\r\n");
          out.write("       </div>\r\n");
          out.write("     </div>\r\n");
          out.write("	</header>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /WEB-INF/views/suggest/suggestList.jsp(70,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cate2 != '세부분야'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cate2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cate2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</option>");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/suggest/suggestList.jsp(86,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("dto");
      // /WEB-INF/views/suggest/suggestList.jsp(86,2) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("  <div class=\"summary-box bg-white\" style=\"width: 900px;margin-left: 220px\">\r\n");
            out.write("    <a href=\"sugContent.do?s_idx=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.s_idx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("      <div class=\"summary-main\">\r\n");
            out.write("      <div class=\"row\">\r\n");
            out.write("        <div class=\"col-xs-2 text-center nth-first is_offered_list\">\r\n");
            out.write("          <p>\r\n");
            out.write("            <img src=\"resources/img/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.pic_path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\">\r\n");
            out.write("          </p>\r\n");
            out.write("          <span style=\"margin: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\r\n");
            out.write("        </div>\r\n");
            out.write("        <div class=\"col-xs-8 is_offered_list\">\r\n");
            out.write("          <h6 class=\"fw-400 hire-request\">\r\n");
            out.write("            <div style=\"margin-top: 1rem;\">\r\n");
            out.write("              <button type=\"button\" class=\"btn btn-outline-primary\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.cate1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</button>\r\n");
            out.write("              <button type=\"button\" class=\"btn btn-outline-danger\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.cate2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</button>\r\n");
            out.write("            </div>\r\n");
            out.write("          </h6>\r\n");
            out.write("          <p class=\"first-info\">\r\n");
            out.write("             <button type=\"button\" class=\"btn btn-outline-success\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.ls_location }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</button>\r\n");
            out.write("             <button type=\"button\" class=\"btn btn-outline-info\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:substring(dto.start_date,0,10)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write(' ');
            out.write('~');
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:substring(dto.end_date,0,10) }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("</button>\r\n");
            out.write("            <br class=\"only-mobile-visible\">\r\n");
            out.write("          </p>\r\n");
            out.write("          <p class=\"summary-information\" style=\"background-color: #eeeeee; padding: 20px; height: 100px; white-space: pre;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.s_intro }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("        </div>\r\n");
            out.write("        <div class=\"col-xs-2 text-center sub-info-col only-desktop-visible\" style=\"margin-top: 50px;\">\r\n");
            out.write("          <p>\r\n");
            out.write("               <span class=\"client-partner-distance\">\r\n");
            out.write("             <button type=\"button\" class=\"btn btn-outline-primary\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.day }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</button>\r\n");
            out.write("              </span> \r\n");
            out.write("              <br>\r\n");
            out.write("              <span class=\"submitted-time\"></span>\r\n");
            out.write("              <br>\r\n");
            out.write("              <span>\r\n");
            out.write("                 <button type=\"button\" class=\"btn btn-outline-danger\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.cost }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("만원</button>\r\n");
            out.write("              </span>\r\n");
            out.write("          </p>\r\n");
            out.write("        </div>\r\n");
            out.write("       </div>\r\n");
            out.write("      </div>\r\n");
            out.write("    </a>\r\n");
            out.write("  </div>\r\n");
            out.write("  ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
