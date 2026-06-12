package javax.servlet.jsp.jstl.core;

public class Config {
    public static final String FMT_LOCALE = "javax.servlet.jsp.jstl.fmt.locale";
    public static final String FMT_FALLBACK_LOCALE = "javax.servlet.jsp.jstl.fmt.fallbackLocale";
    public static final String FMT_LOCALIZATION_CONTEXT = "javax.servlet.jsp.jstl.fmt.localizationContext";
    public static final String FMT_TIME_ZONE = "javax.servlet.jsp.jstl.fmt.timeZone";
    public static final String SQL_DATA_SOURCE = "javax.servlet.jsp.jstl.sql.dataSource";
    public static final String SQL_MAX_ROWS = "javax.servlet.jsp.jstl.sql.maxRows";

    public static Object get(javax.servlet.jsp.PageContext pc, String name, int scope) { return getFromPageContext(pc, name, scope); }
    public static Object get(javax.servlet.ServletRequest request, String name) { return request.getAttribute(name); }
    public static Object get(javax.servlet.http.HttpSession session, String name) { return session.getAttribute(name); }
    public static Object get(javax.servlet.ServletContext context, String name) { return context.getAttribute(name); }
    public static void set(javax.servlet.jsp.PageContext pc, String name, Object value, int scope) { setToPageContext(pc, name, value, scope); }
    public static void set(javax.servlet.ServletRequest request, String name, Object value) { request.setAttribute(name, value); }
    public static void set(javax.servlet.http.HttpSession session, String name, Object value) { session.setAttribute(name, value); }
    public static void set(javax.servlet.ServletContext context, String name, Object value) { context.setAttribute(name, value); }
    public static void remove(javax.servlet.jsp.PageContext pc, String name, int scope) { removeFromPageContext(pc, name, scope); }
    public static void remove(javax.servlet.ServletRequest request, String name) { request.removeAttribute(name); }
    public static void remove(javax.servlet.http.HttpSession session, String name) { session.removeAttribute(name); }
    public static void remove(javax.servlet.ServletContext context, String name) { context.removeAttribute(name); }
    public static Object find(javax.servlet.jsp.PageContext pc, String name) { return pc.findAttribute(name); }

    public static Object get(jakarta.servlet.jsp.PageContext pc, String name, int scope) { return getFromPageContext(pc, name, scope); }
    public static Object get(jakarta.servlet.ServletRequest request, String name) { return request.getAttribute(name); }
    public static Object get(jakarta.servlet.http.HttpSession session, String name) { return session.getAttribute(name); }
    public static Object get(jakarta.servlet.ServletContext context, String name) { return context.getAttribute(name); }
    public static void set(jakarta.servlet.jsp.PageContext pc, String name, Object value, int scope) { setToPageContext(pc, name, value, scope); }
    public static void set(jakarta.servlet.ServletRequest request, String name, Object value) { request.setAttribute(name, value); }
    public static void set(jakarta.servlet.http.HttpSession session, String name, Object value) { session.setAttribute(name, value); }
    public static void set(jakarta.servlet.ServletContext context, String name, Object value) { context.setAttribute(name, value); }
    public static void remove(jakarta.servlet.jsp.PageContext pc, String name, int scope) { removeFromPageContext(pc, name, scope); }
    public static void remove(jakarta.servlet.ServletRequest request, String name) { request.removeAttribute(name); }
    public static void remove(jakarta.servlet.http.HttpSession session, String name) { session.removeAttribute(name); }
    public static void remove(jakarta.servlet.ServletContext context, String name) { context.removeAttribute(name); }
    public static Object find(jakarta.servlet.jsp.PageContext pc, String name) { return pc.findAttribute(name); }

    private static Object getFromPageContext(jakarta.servlet.jsp.PageContext pc, String name, int scope) {
        return switch (scope) {
            case jakarta.servlet.jsp.PageContext.PAGE_SCOPE -> pc.getAttribute(name, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
            case jakarta.servlet.jsp.PageContext.REQUEST_SCOPE -> pc.getAttribute(name, jakarta.servlet.jsp.PageContext.REQUEST_SCOPE);
            case jakarta.servlet.jsp.PageContext.SESSION_SCOPE -> pc.getAttribute(name, jakarta.servlet.jsp.PageContext.SESSION_SCOPE);
            case jakarta.servlet.jsp.PageContext.APPLICATION_SCOPE -> pc.getAttribute(name, jakarta.servlet.jsp.PageContext.APPLICATION_SCOPE);
            default -> null;
        };
    }

    private static void setToPageContext(jakarta.servlet.jsp.PageContext pc, String name, Object value, int scope) { pc.setAttribute(name, value, scope); }
    private static void removeFromPageContext(jakarta.servlet.jsp.PageContext pc, String name, int scope) { pc.removeAttribute(name, scope); }
}
