/*
 * JSP generated by Resin-4.0.35 (built Tue, 12 Feb 2013 10:05:50 PST)
 */

package _jsp._page;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _notecontent__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=UTF-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string1, 0, _jsp_string1.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string2, 0, _jsp_string2.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string3, 0, _jsp_string3.length);
    _caucho_expr_1.print(out, _jsp_env, false);
    out.write(_jsp_string4, 0, _jsp_string4.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string5, 0, _jsp_string5.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -8128084403448394333L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("page/notecontent.jsp"), 7049474181925410865L, false);
    _caucho_depends.add(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
      _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${pageContext.request.contextPath}");
      _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${noteContent}");
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;

  private final static char []_jsp_string0;
  private final static char []_jsp_string5;
  private final static char []_jsp_string4;
  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  static {
    _jsp_string0 = "\r\n<html lang=\"zh-CN\">\r\n<head>\r\n<meta charset=\"utf-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n<title>evernote</title>\r\n<script src=\"".toCharArray();
    _jsp_string5 = "/image/logo.png\" /></a>\r\n					</div>\r\n				</nav>\r\n\r\n				<div class=\"container-fluid\">\r\n					<div class=\"row-fluid\">\r\n						<div class=\"span12\" id=\"noteContent\" style=\"word-break: break-all;word-wrap: break-word;\"></div>\r\n					</div>\r\n				</div>\r\n\r\n			</div>\r\n		</div>\r\n	</div>\r\n</body>\r\n</html>\r\n".toCharArray();
    _jsp_string4 = ";\r\n	$(\"#noteContent\").empty();\r\n    $(\"#noteContent\").append(\"<h2>\" + note.title + \"</h2>\" + note.content);\r\n});\r\n</script>\r\n\r\n<body>\r\n	<div class=\"container\">\r\n		<div class=\"row clearfix\">\r\n			<div class=\"col-md-12 column\">\r\n\r\n				<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\">\r\n					<div class=\"navbar-header\">\r\n						<a class=\"navbar-brand\" href=\"#\"><img alt=\"140x140\"\r\n							src=\"".toCharArray();
    _jsp_string1 = "/js/jquery.min.js\"></script>\r\n<link href=\"".toCharArray();
    _jsp_string3 = "/js/bootstrap.min.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n$(document).ready(function () {  \r\n	var note = ".toCharArray();
    _jsp_string2 = "/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n<script src=\"".toCharArray();
  }
}
