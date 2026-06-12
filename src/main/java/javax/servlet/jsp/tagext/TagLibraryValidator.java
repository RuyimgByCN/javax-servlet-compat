package javax.servlet.jsp.tagext;

import java.io.InputStream;

/**
 * Minimal compatibility bridge for legacy JSTL validators on Tomcat 10.
 */
public abstract class TagLibraryValidator extends jakarta.servlet.jsp.tagext.TagLibraryValidator {

    public ValidationMessage[] validate(String prefix, String uri, PageData page) {
        return null;
    }

    @Override
    public final jakarta.servlet.jsp.tagext.ValidationMessage[] validate(String prefix, String uri,
            jakarta.servlet.jsp.tagext.PageData page) {
        PageData legacyPage = page instanceof PageData ? (PageData) page : new PageDataAdapter(page);
        return validate(prefix, uri, legacyPage);
    }

    private static final class PageDataAdapter extends PageData {
        private final jakarta.servlet.jsp.tagext.PageData delegate;

        private PageDataAdapter(jakarta.servlet.jsp.tagext.PageData delegate) {
            this.delegate = delegate;
        }

        @Override
        public InputStream getInputStream() {
            return delegate.getInputStream();
        }
    }
}
