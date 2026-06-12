package javax.servlet.jsp.tagext;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

/**
 * Compatibility stub for javax.servlet.jsp.tagext.BodyTagSupport.
 */
public abstract class BodyTagSupport extends TagSupport implements BodyTag {
    protected BodyContent bodyContent;

    public BodyTagSupport() {}

    public int doStartTag() throws JspException { return EVAL_BODY_BUFFERED; }
    public int doEndTag() throws JspException { return EVAL_PAGE; }
    public int doAfterBody() throws JspException { return SKIP_BODY; }

    public void setBodyContent(BodyContent b) { this.bodyContent = b; }
    public BodyContent getBodyContent() { return this.bodyContent; }

    public void doInitBody() throws JspException {}

    public void release() {
        bodyContent = null;
        super.release();
    }
}
