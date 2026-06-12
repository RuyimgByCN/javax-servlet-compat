package javax.servlet.jsp.tagext;

import javax.servlet.jsp.JspException;

/**
 * Compatibility stub for javax.servlet.jsp.tagext.BodyTag.
 */
public interface BodyTag extends IterationTag {
    int EVAL_BODY_BUFFERED = 2;
    void setBodyContent(BodyContent b);
    void doInitBody() throws JspException;
}
