package javax.servlet.jsp.tagext;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.servlet.jsp.JavaxJspWriterAdapter;

public class JavaxBodyContentAdapter extends BodyContent {
    private final jakarta.servlet.jsp.tagext.BodyContent delegate;

    public static BodyContent adapt(jakarta.servlet.jsp.tagext.BodyContent bodyContent) {
        if (bodyContent == null) {
            return null;
        }
        if (bodyContent instanceof BodyContent javaxBodyContent) {
            return javaxBodyContent;
        }
        return new JavaxBodyContentAdapter(bodyContent);
    }

    public JavaxBodyContentAdapter(jakarta.servlet.jsp.tagext.BodyContent delegate) {
        super(JavaxJspWriterAdapter.adapt(delegate.getEnclosingWriter()));
        this.delegate = delegate;
    }

    @Override
    public Reader getReader() { return delegate.getReader(); }
    @Override
    public String getString() { return delegate.getString(); }
    @Override
    public void writeOut(Writer out) throws IOException { delegate.writeOut(out); }
    @Override
    public void newLine() throws IOException { delegate.newLine(); }
    @Override
    public void print(boolean b) throws IOException { delegate.print(b); }
    @Override
    public void print(char c) throws IOException { delegate.print(c); }
    @Override
    public void print(int i) throws IOException { delegate.print(i); }
    @Override
    public void print(long l) throws IOException { delegate.print(l); }
    @Override
    public void print(float f) throws IOException { delegate.print(f); }
    @Override
    public void print(double d) throws IOException { delegate.print(d); }
    @Override
    public void print(char[] s) throws IOException { delegate.print(s); }
    @Override
    public void print(String s) throws IOException { delegate.print(s); }
    @Override
    public void print(Object obj) throws IOException { delegate.print(obj); }
    @Override
    public void println() throws IOException { delegate.println(); }
    @Override
    public void println(boolean x) throws IOException { delegate.println(x); }
    @Override
    public void println(char x) throws IOException { delegate.println(x); }
    @Override
    public void println(int x) throws IOException { delegate.println(x); }
    @Override
    public void println(long x) throws IOException { delegate.println(x); }
    @Override
    public void println(float x) throws IOException { delegate.println(x); }
    @Override
    public void println(double x) throws IOException { delegate.println(x); }
    @Override
    public void println(char[] x) throws IOException { delegate.println(x); }
    @Override
    public void println(String x) throws IOException { delegate.println(x); }
    @Override
    public void println(Object x) throws IOException { delegate.println(x); }
    @Override
    public void clear() throws IOException { delegate.clear(); }
    @Override
    public void clearBuffer() throws IOException { delegate.clearBuffer(); }
    @Override
    public void flush() throws IOException { delegate.flush(); }
    @Override
    public void close() throws IOException { delegate.close(); }
    @Override
    public int getRemaining() { return delegate.getRemaining(); }
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException { delegate.write(cbuf, off, len); }
}
