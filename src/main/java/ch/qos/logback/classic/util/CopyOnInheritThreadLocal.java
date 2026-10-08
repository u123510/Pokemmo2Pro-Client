package ch.qos.logback.classic.util;

import java.util.HashMap;

public class CopyOnInheritThreadLocal extends InheritableThreadLocal<HashMap<?, ?>> {
    @Override
    protected HashMap<?, ?> childValue(HashMap<?, ?> value) {
        return value == null ? null : new HashMap<>(value);
    }
}
