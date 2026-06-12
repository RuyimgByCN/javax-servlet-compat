package javax.servlet.jsp;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.el.ELContext;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpSession;

public class JavaxPageContextAdapter extends PageContext {
    private final jakarta.servlet.jsp.PageContext delegate;

    public static PageContext adapt(jakarta.servlet.jsp.PageContext pageContext) {
        if (pageContext == null) {
            return null;
        }
        if (pageContext instanceof PageContext javaxPageContext) {
            return javaxPageContext;
        }
        return new JavaxPageContextAdapter(pageContext);
    }

    public JavaxPageContextAdapter(jakarta.servlet.jsp.PageContext delegate) {
        this.delegate = delegate;
    }

    @Override
    public void initialize(Servlet servlet, ServletRequest request, ServletResponse response, String errorPageURL, boolean needsSession, int bufferSize, boolean autoFlush) throws IOException, IllegalStateException, IllegalArgumentException {
        delegate.initialize(servlet, request, response, errorPageURL, needsSession, bufferSize, autoFlush);
    }

    @Override
    public void release() { delegate.release(); }
    @Override
    public HttpSession getSession() { return delegate.getSession(); }
    @Override
    public Object getPage() { return delegate.getPage(); }
    @Override
    public ServletRequest getRequest() { return delegate.getRequest(); }
    @Override
    public ServletResponse getResponse() { return delegate.getResponse(); }
    @Override
    public Exception getException() { return delegate.getException(); }
    @Override
    public ServletConfig getServletConfig() { return delegate.getServletConfig(); }
    @Override
    public ServletContext getServletContext() { return delegate.getServletContext(); }
    @Override
    public void forward(String relativeUrlPath) throws ServletException, IOException { delegate.forward(relativeUrlPath); }
    @Override
    public void include(String relativeUrlPath) throws ServletException, IOException { delegate.include(relativeUrlPath); }
    @Override
    public void include(String relativeUrlPath, boolean flush) throws ServletException, IOException { delegate.include(relativeUrlPath, flush); }
    @Override
    public void handlePageException(Exception e) throws ServletException, IOException { delegate.handlePageException(e); }
    @Override
    public void handlePageException(Throwable t) throws ServletException, IOException { delegate.handlePageException(t); }
    @Override
    public void setAttribute(String name, Object value) { delegate.setAttribute(name, value); }
    @Override
    public void setAttribute(String name, Object value, int scope) { delegate.setAttribute(name, value, scope); }
    @Override
    public Object getAttribute(String name) { return delegate.getAttribute(name); }
    @Override
    public Object getAttribute(String name, int scope) { return delegate.getAttribute(name, scope); }
    @Override
    public Object findAttribute(String name) { return delegate.findAttribute(name); }
    @Override
    public void removeAttribute(String name) { delegate.removeAttribute(name); }
    @Override
    public void removeAttribute(String name, int scope) { delegate.removeAttribute(name, scope); }
    @Override
    public int getAttributesScope(String name) { return delegate.getAttributesScope(name); }
    @Override
    public Enumeration<String> getAttributeNamesInScope(int scope) { return delegate.getAttributeNamesInScope(scope); }
    @Override
    public JspWriter getOut() { return JavaxJspWriterAdapter.adapt(delegate.getOut()); }
    @Override
    public javax.servlet.jsp.el.ExpressionEvaluator getExpressionEvaluator() { return null; }
    @Override
    public javax.servlet.jsp.el.VariableResolver getVariableResolver() { return null; }
    @Override
    public ELContext getELContext() { return delegate.getELContext(); }
}
