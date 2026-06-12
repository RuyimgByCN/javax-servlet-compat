package javax.servlet.jsp.tagext;

import javax.servlet.jsp.JspException;

/**
 * Compatibility stub for javax.servlet.jsp.tagext.Tag.
 * Independent from jakarta.servlet.jsp.tagext.Tag because
 * the throws clauses differ (javax declares JspException, jakarta does not).
 */
public interface Tag {
    int SKIP_BODY = 0;
    int EVAL_BODY_INCLUDE = 1;
    int SKIP_PAGE = 5;
    int EVAL_PAGE = 6;

    void setPageContext(javax.servlet.jsp.PageContext pc);
    void setParent(Tag t);
    Tag getParent();
    int doStartTag() throws JspException;
    int doEndTag() throws JspException;
    void release();
}
