package javax.servlet.jsp.tagext;

public class VariableInfo extends jakarta.servlet.jsp.tagext.VariableInfo {
    public static final int NESTED = jakarta.servlet.jsp.tagext.VariableInfo.NESTED;
    public static final int AT_BEGIN = jakarta.servlet.jsp.tagext.VariableInfo.AT_BEGIN;
    public static final int AT_END = jakarta.servlet.jsp.tagext.VariableInfo.AT_END;
    public VariableInfo(String varName, String className, boolean declare, int scope) {
        super(varName, className, declare, scope);
    }
}
