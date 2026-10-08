/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ContextUtil
extends ContextAwareBase {
    static final String GROOVY_RUNTIME_PACKAGE = "org.codehaus.groovy.runtime";

    public ContextUtil(Context context) {
        ContextUtil contextUtil = this;
        contextUtil.setContext(context);
    }

    public static Map getFilenameCollisionMap(Context context) {
        if (context == null) {
            return null;
        }
        return (Map)context.getObject("FA_FILENAMES_MAP");
    }

    public static Map getFilenamePatternCollisionMap(Context context) {
        if (context == null) {
            return null;
        }
        return (Map)context.getObject("RFA_FILENAME_PATTERN_COLLISION_MAP");
    }

    public void addProperties(Properties object) {
        if (object == null) {
            return;
        }
        for (Map.Entry<Object, Object> entry : ((Properties)((Object)object)).entrySet()) {
            String string = (String)entry.getKey();
            this.context.putProperty(string, (String)entry.getValue());
        }
    }

    public void addGroovyPackages(List list) {
        this.addFrameworkPackage(list, GROOVY_RUNTIME_PACKAGE);
    }

    public void addFrameworkPackage(List list, String string) {
        if (!list.contains(string)) {
            list.add(string);
        }
    }
}

