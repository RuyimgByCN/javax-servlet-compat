package javax.servlet.jsp.tagext;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Compatibility stub for javax.servlet.jsp.tagext.TagSupport.
 * Implements the javax Tag/IterationTag interfaces with proper throws clauses.
 * Does NOT extend jakarta.servlet.jsp.tagext.TagSupport to avoid type conflicts.
 */
public class TagSupport implements IterationTag, java.io.Serializable {
    protected PageContext pageContext;
    protected Tag parent;
    private Hashtable<String, Object> values;
    protected String id;

    public TagSupport() {}

    public int doStartTag() throws JspException { return SKIP_BODY; }
    public int doEndTag() throws JspException { return EVAL_PAGE; }
    public int doAfterBody() throws JspException { return SKIP_BODY; }
    public void release() { pageContext = null; parent = null; values = null; id = null; }

    public void setPageContext(PageContext pc) { this.pageContext = pc; }
    public void setParent(Tag t) { this.parent = t; }
    public Tag getParent() { return this.parent; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public void setValue(String k, Object o) {
        if (values == null) values = new Hashtable<>();
        values.put(k, o);
    }
    public Object getValue(String k) {
        if (values == null) return null;
        return values.get(k);
    }
    public void removeValue(String k) {
        if (values != null) values.remove(k);
    }
    public Enumeration<String> getValues() {
        if (values == null) return null;
        return values.keys();
    }

    public static Tag findAncestorWithClass(Tag from, Class<?> klass) {
        while (from != null) {
            if (klass.isInstance(from)) return from;
            from = from.getParent();
        }
        return null;
    }
}
