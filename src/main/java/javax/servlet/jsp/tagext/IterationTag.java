package javax.servlet.jsp.tagext;

import javax.servlet.jsp.JspException;

/**
 * Compatibility stub for javax.servlet.jsp.tagext.IterationTag.
 */
public interface IterationTag extends Tag {
    int EVAL_BODY_AGAIN = 2;
    int doAfterBody() throws JspException;
}
