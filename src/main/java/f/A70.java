package f;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

/**
 * 兼容垫片 (Shim) - JSONTokener 解析器
 * 原始类: f.A70 -> 现位于 f.org.json.A70
 */
public class A70 extends f.org.json.A70 {
    public A70(Reader reader) { super(reader); }
    public A70(InputStream inputStream) { super(inputStream); }
    public A70(String s) { super(s); }
    public A70(StringReader stringReader) { super(stringReader); }
}
