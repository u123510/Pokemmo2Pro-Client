package ch.qos.logback.core.joran.util;

public class ParentTag_Tag_Class_Tuple {
    public final String parentTag;
    public final String tag;
    public final String className;

    public ParentTag_Tag_Class_Tuple(String parentTag, String tag, String className) {
        this.parentTag = parentTag;
        this.tag = tag;
        this.className = className;
    }

    public String toString() {
        return "ParentTag_Tag_Class_Tuple [parentTag=" + parentTag + ", tag=" + tag + ", className=" + className + "]";
    }
}
