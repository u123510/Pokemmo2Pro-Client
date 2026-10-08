package ch.qos.logback.core.testUtil;
import java.util.HashMap;
import java.util.Map;
import javax.naming.InitialContext;
public class MockInitialContext extends InitialContext {
    public Map map = new HashMap();
    public MockInitialContext() throws javax.naming.NamingException { super(); }
    public Object lookup(String name) { return name == null ? null : map.get(name); }
}
