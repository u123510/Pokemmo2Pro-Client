package ch.qos.logback.classic.spi;

import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;

public class PackagingDataCalculator {
    static final StackTraceElementProxy[] STEP_ARRAY_TEMPLATE;
    private static boolean GET_CALLER_CLASS_METHOD_AVAILABLE = false;
    HashMap<String, ClassPackagingData> cache;

    public PackagingDataCalculator() {
        cache = new HashMap<>();
    }

    private ClassPackagingData calculateByExactType(Class<?> type) {
        String className = type.getName();
        ClassPackagingData cached = cache.get(className);
        if (cached != null) return cached;
        String version = getImplementationVersion(type);
        String location = getCodeLocation(type);
        ClassPackagingData result = new ClassPackagingData(location, version);
        cache.put(className, result);
        return result;
    }

    private ClassPackagingData computeBySTEP(StackTraceElementProxy step, ClassLoader classLoader) {
        String className = step.ste.getClassName();
        ClassPackagingData cached = cache.get(className);
        if (cached != null) return cached;
        Class<?> type = bestEffortLoadClass(classLoader, className);
        String version = getImplementationVersion(type);
        String location = getCodeLocation(type);
        ClassPackagingData result = new ClassPackagingData(location, version, false);
        cache.put(className, result);
        return result;
    }

    private String getCodeLocation(String path, char separator) {
        int index = path.lastIndexOf(separator);
        if (isFolder(index, path)) {
            return path.substring(index + 1, path.lastIndexOf(separator, index - 1) + 1);
        }
        if (index > 0) return path.substring(index + 1);
        return null;
    }

    private boolean isFolder(int index, String path) {
        return index != -1 && index + 1 == path.length();
    }

    private Class<?> loadClass(ClassLoader classLoader, String className) {
        if (classLoader == null) return null;
        try {
            return classLoader.loadClass(className);
        } catch (ClassNotFoundException | NoClassDefFoundError ignored) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Class<?> bestEffortLoadClass(ClassLoader classLoader, String className) {
        Class<?> type = loadClass(classLoader, className);
        if (type != null) return type;
        ClassLoader contextLoader = Thread.currentThread().getContextClassLoader();
        if (contextLoader != classLoader) type = loadClass(contextLoader, className);
        if (type != null) return type;
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException | NoClassDefFoundError ignored) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    static {
        STEP_ARRAY_TEMPLATE = new StackTraceElementProxy[0];
    }

    public void calculate(IThrowableProxy proxy) {
        while (proxy != null) {
            populateFrames(proxy.getStackTraceElementProxyArray());
            IThrowableProxy[] suppressed = proxy.getSuppressed();
            if (suppressed != null) {
                for (IThrowableProxy suppressedProxy : suppressed) populateFrames(suppressedProxy.getStackTraceElementProxyArray());
            }
            proxy = proxy.getCause();
        }
    }

    public void populateFrames(StackTraceElementProxy[] steps) {
        StackTraceElement[] localStack = new Throwable("local stack reference").getStackTrace();
        int commonFrames = STEUtil.findNumberOfCommonFrames(localStack, steps);
        int uncommonFrames = localStack.length - commonFrames;
        ClassLoader classLoader = null;
        for (int i = 0; i < uncommonFrames; i++) {
            StackTraceElementProxy step = steps[commonFrames + i];
            Class<?> type = bestEffortLoadClass(classLoader, step.ste.getClassName());
            step.setClassPackagingData(computeBySTEP(step, type == null ? null : type.getClassLoader()));
        }
        populateUncommonFrames(commonFrames, steps, classLoader);
    }

    public void populateUncommonFrames(int commonFrames, StackTraceElementProxy[] steps, ClassLoader classLoader) {
        int count = steps.length - commonFrames;
        for (int i = 0; i < count; i++) steps[i].setClassPackagingData(computeBySTEP(steps[i], classLoader));
    }

    public String getImplementationVersion(Class<?> type) {
        if (type == null) return "na";
        Package pkg = type.getPackage();
        if (pkg == null || pkg.getImplementationVersion() == null) return "na";
        return pkg.getImplementationVersion();
    }

    public String getCodeLocation(Class<?> type) {
        if (type == null) return "na";
        try {
            CodeSource source = type.getProtectionDomain().getCodeSource();
            if (source == null) return "na";
            URL location = source.getLocation();
            if (location == null) return "na";
            String value = location.toString();
            String result = getCodeLocation(value, '/');
            return result != null ? result : getCodeLocation(value, '\\');
        } catch (Exception ignored) {
            return "na";
        }
    }
}
