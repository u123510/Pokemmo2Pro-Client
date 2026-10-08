package f;

import java.util.Map;

/**
 * 兼容垫片 (Shim) - JSONObject 对象
 * 原始类: f.N7 -> 现位于 f.org.json.N7
 */
public class N7 extends f.org.json.N7 {
    public N7() { super(); }
    public N7(f.org.json.A70 parser) { super(parser); }
    public N7(String source) { super(source); }
    public N7(Map map) { super(map); }
    public N7(Object bean) { super(bean); }
    public N7(Map values, int depth, Object limit) { super(values, depth, limit); }
}
