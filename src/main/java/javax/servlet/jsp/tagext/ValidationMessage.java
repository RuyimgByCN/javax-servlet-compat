package javax.servlet.jsp.tagext;

/**
 * Minimal compatibility bridge for legacy JSTL validators on Tomcat 10.
 */
public class ValidationMessage extends jakarta.servlet.jsp.tagext.ValidationMessage {

    public ValidationMessage(String id, String message) {
        super(id, message);
    }
}
