/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-12-14 05:42:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.expert;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist4_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1639447319904L));
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
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/css/expert/regist4.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=1d32a2dcb8e69e2a4c412a41db160852&libraries=services\"></script>\r\n");
      out.write("<title>모레-전문가등록</title>\r\n");
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
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!----------------------기본(의뢰인) 로그인중-->\r\n");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- -----------------------전문가 로그인중 -->\r\n");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
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
      out.write("<div id=\"section\" class=\"bg-white\">\r\n");
      out.write("      <form action=\"regist5.do?cate1=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.cate1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&cate2=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.cate2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&ls_location=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.ls_location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" method=\"POST\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("           	 <div class=\"content\">\r\n");
      out.write("             <h4 class=\"text-center\">어떻게 일을 진행하고 싶으신가요?</h4>\r\n");
      out.write("             <div class=\"service-choice-box\">\r\n");
      out.write("               <ul id=\"id_travel_option\">\r\n");
      out.write("                   <li><label for=\"id_travel_option_0\"><input type=\"checkbox\" name=\"process\" value=\"의뢰인이 있는 곳으로 이동 가능합니다\" id=\"id_travel_option_0\">의뢰인이 있는 곳으로 이동 가능합니다</label></li>\r\n");
      out.write("                   <li><label for=\"id_travel_option_1\"><input type=\"checkbox\" name=\"process\" value=\"제가 있는 곳으로 의뢰인이 오는게 좋겠습니다\" id=\"id_travel_option_1\">제가 있는 곳으로 의뢰인이 오는게 좋겠습니다</label></li>                           \r\n");
      out.write("                   <li><label for=\"id_travel_option_2\"><input type=\"checkbox\" name=\"process\" value=\"온라인 및 화상수업으로 진행하고 싶습니다\" id=\"id_travel_option_2\">온라인 및 화상수업으로 진행하고 싶습니다</label></li>\r\n");
      out.write("               </ul>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div style=\"padding-left: 218px; padding-top: 20px;\">\r\n");
      out.write("			<div id=\"map\" style=\"width:500px;height:350px;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container-fluid bg-eee\">\r\n");
      out.write("      <div class=\"container step-nav\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-xs-6\">\r\n");
      out.write("            <a href=\"\" class=\"prev-btn\" id=\"prev-btn\">\r\n");
      out.write("              뒤로 가기\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-xs-6\">\r\n");
      out.write("            <button type=\"submit\" class=\"blue-btn form-control\" id=\"next-btn\" style=\"background-color: #ff9797; border-color: #ff9797;\">다음</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("	var mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("	    mapOption = {\r\n");
      out.write("	        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지ㄴ의 중심좌표\r\n");
      out.write("	        level: 5 // 지도의 확대 레벨\r\n");
      out.write("	    };  \r\n");
      out.write("	    \r\n");
      out.write("	    // 주소-좌표 변환 객체를 생성합니다\r\n");
      out.write("	    var geocoder = new kakao.maps.services.Geocoder();\r\n");
      out.write("	    // 지도를 생성합니다    \r\n");
      out.write("	    var map = new kakao.maps.Map(mapContainer, mapOption); \r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	    // 주소로 좌표를 검색합니다\r\n");
      out.write("	    geocoder.addressSearch('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.ls_location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("', function(result, status) {\r\n");
      out.write("	\r\n");
      out.write("	    // 정상적으로 검색이 완료됐으면 \r\n");
      out.write("	     if (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("	\r\n");
      out.write("	        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);\r\n");
      out.write("	\r\n");
      out.write("	        // 결과값으로 받은 위치를 마커로 표시합니다\r\n");
      out.write("	        var marker = new kakao.maps.Marker({\r\n");
      out.write("	            map: map,\r\n");
      out.write("	            position: coords\r\n");
      out.write("	        });\r\n");
      out.write("	\r\n");
      out.write("	        // 인포윈도우로 장소에 대한 설명을 표시합니다\r\n");
      out.write("	        var infowindow = new kakao.maps.InfoWindow({\r\n");
      out.write("	            content: '<div style=\"width:150px;text-align:center;padding:6px 0;\">레슨장소</div>'\r\n");
      out.write("	        });\r\n");
      out.write("	        infowindow.open(map, marker);\r\n");
      out.write("	\r\n");
      out.write("	        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다\r\n");
      out.write("	        map.setCenter(coords);\r\n");
      out.write("	    } \r\n");
      out.write("	});    \r\n");
      out.write("</script>\r\n");
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
      out.write("</html>  ");
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
      // /WEB-INF/views/expert/regist4.jsp(4,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.sessionId }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<script>\r\n");
          out.write("		location.href = 'wrong.do';\r\n");
          out.write("	</script>\r\n");
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
      // /WEB-INF/views/header.jsp(16,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
      // /WEB-INF/views/header.jsp(36,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
      // /WEB-INF/views/header.jsp(70,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 2 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
}
