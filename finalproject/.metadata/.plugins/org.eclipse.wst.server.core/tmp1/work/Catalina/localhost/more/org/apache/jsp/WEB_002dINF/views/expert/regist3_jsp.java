/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-12-14 05:41:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.expert;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"resources/css/expert/regist3.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<title>모레-전문가등록</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"execDaumPostcode()\">\r\n");
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
      out.write("    <div id=\"section\" class=\"bg-white\">\r\n");
      out.write("        <form action=\"regist4.do?cate1=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.cate1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&cate2=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.cate2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"regist3\" method=\"POST\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("              <h4 class=\"text-center\">주소</h4>\r\n");
      out.write("              <div class=\"service-choice-box\">\r\n");
      out.write("                <input type=\"hidden\" class=\"col-sm-3 form-label\" name=\"\" id=\"postcode\" placeholder=\"우편번호\" style=\"border-radius: 0.25rem; border: 1px solid #ced4da;\">\r\n");
      out.write("                <input type=\"hidden\" class=\"form-control\" name=\"ls_location\" id=\"address\" placeholder=\"주소\" style=\"margin-bottom: 5px\">\r\n");
      out.write("                <input type=\"hidden\" class=\"form-control\" name=\"\" id=\"detailAddress\" placeholder=\"상세주소\">\r\n");
      out.write("                <input type=\"hidden\" class=\"\" id=\"extraAddress\" placeholder=\"참고항목\">\r\n");
      out.write("                <div id=\"wrap\" style=\"display:none;width:500px;height:300px;margin:5px 0;position:relative\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"container-fluid bg-eee\">\r\n");
      out.write("            <div class=\"container step-nav\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xs-6\">\r\n");
      out.write("                  <a href=\"\" class=\"prev-btn\" id=\"prev-btn\">\r\n");
      out.write("                    뒤로 가기\r\n");
      out.write("                  </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-6\">\r\n");
      out.write("                  <button type=\"submit\" class=\"blue-btn form-control\" id=\"next-btn\" style=\"background-color: #ff9797; border-color: #ff9797;\">다음</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script>\r\n");
      out.write("        // 우편번호 찾기 찾기 화면을 넣을 element\r\n");
      out.write("        let element_wrap = document.getElementById('wrap');\r\n");
      out.write("        \r\n");
      out.write("        function foldDaumPostcode() {\r\n");
      out.write("            // iframe을 넣은 element를 안보이게 한다.\r\n");
      out.write("            element_wrap.style.display = 'none';\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function execDaumPostcode() {\r\n");
      out.write("          console.log('들어옴');\r\n");
      out.write("            // 현재 scroll 위치를 저장해놓는다.\r\n");
      out.write("            let currentScroll = Math.max(document.body.scrollTop, document.documentElement.scrollTop);\r\n");
      out.write("            new daum.Postcode({\r\n");
      out.write("                oncomplete: function(data) {\r\n");
      out.write("                    // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("        \r\n");
      out.write("                    // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                    // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                    let addr = ''; // 주소 변수\r\n");
      out.write("                    let extraAddr = ''; // 참고항목 변수\r\n");
      out.write("                    console.log('들어옴1');\r\n");
      out.write("                    //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("                    if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                        addr = data.roadAddress;\r\n");
      out.write("                    } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                        addr = data.jibunAddress;\r\n");
      out.write("                    }\r\n");
      out.write("        \r\n");
      out.write("                    // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("                    if(data.userSelectedType === 'R'){\r\n");
      out.write("                        // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                        // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                        if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                            extraAddr += data.bname;\r\n");
      out.write("                        }\r\n");
      out.write("                        // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                        if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                            extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                        }\r\n");
      out.write("                        // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                        if(extraAddr !== ''){\r\n");
      out.write("                            extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                        }\r\n");
      out.write("                        // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("                        document.getElementById(\"extraAddress\").value = extraAddr;\r\n");
      out.write("                    \r\n");
      out.write("                    } else {\r\n");
      out.write("                        document.getElementById(\"extraAddress\").value = '';\r\n");
      out.write("                    }\r\n");
      out.write("        \r\n");
      out.write("                    // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                    document.getElementById('postcode').value = data.zonecode;\r\n");
      out.write("                    document.getElementById(\"address\").value = addr;\r\n");
      out.write("                    // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("                    document.getElementById(\"detailAddress\").focus();\r\n");
      out.write("        \r\n");
      out.write("                    // iframe을 넣은 element를 안보이게 한다.\r\n");
      out.write("                    // (autoClose:false 기능을 이용한다면, 아래 코드를 제거해야 화면에서 사라지지 않는다.)\r\n");
      out.write("                    element_wrap.style.display = 'none';\r\n");
      out.write("        \r\n");
      out.write("                    // 우편번호 찾기 화면이 보이기 이전으로 scroll 위치를 되돌린다.\r\n");
      out.write("                    document.body.scrollTop = currentScroll;\r\n");
      out.write("                    document.getElementById('regist3').submit();\r\n");
      out.write("                },\r\n");
      out.write("                // 우편번호 찾기 화면 크기가 조정되었을때 실행할 코드를 작성하는 부분. iframe을 넣은 element의 높이값을 조정한다.\r\n");
      out.write("                onresize : function(size) {\r\n");
      out.write("                    element_wrap.style.height = size.height+'px';\r\n");
      out.write("                },\r\n");
      out.write("                width : '100%',\r\n");
      out.write("                height : '100%'\r\n");
      out.write("            }).embed(element_wrap);\r\n");
      out.write("        \r\n");
      out.write("            // iframe을 넣은 element를 보이게 한다.\r\n");
      out.write("            element_wrap.style.display = 'block';\r\n");
      out.write("        }\r\n");
      out.write("      </script>\r\n");
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
      // /WEB-INF/views/expert/regist3.jsp(4,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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