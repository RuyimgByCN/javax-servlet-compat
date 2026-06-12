package javax.servlet.jsp;

/**
 * Compatibility stub for javax.servlet.jsp.JspTagException.
 * Extends JspException as per the Servlet specification.
 */
public class JspTagException extends JspException {
    public JspTagException() { super(); }
    public JspTagException(String msg) { super(msg); }
    public JspTagException(String message, Throwable rootCause) { super(message, rootCause); }
    public JspTagException(Throwable rootCause) { super(rootCause); }
}
