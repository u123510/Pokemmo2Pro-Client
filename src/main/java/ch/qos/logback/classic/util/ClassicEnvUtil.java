package ch.qos.logback.classic.util;

import ch.qos.logback.core.util.EnvUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class ClassicEnvUtil {
    public static boolean isGroovyAvailable() {
        return EnvUtil.isClassAvailable(ClassicEnvUtil.class, "groovy.lang.Binding");
    }

    public static <T> List<T> loadFromServiceLoader(Class<T> service, ClassLoader loader) {
        ServiceLoader<T> services = ServiceLoader.load(service, loader);
        ArrayList<T> result = new ArrayList<>();
        for (T item : services) {
            result.add(item);
        }
        return result;
    }
}
