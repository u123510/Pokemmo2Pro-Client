package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class Loader {
    static final String TSTR = "Caught Exception while in Loader.getResource. This may be innocuous.";
    private static boolean ignoreTCL;
    public static final String IGNORE_TCL_PROPERTY_NAME = "logback.ignoreTCL";
    private static boolean HAS_GET_CLASS_LOADER_PERMISSION;

    public static ClassLoader systemClassloaderIfNull(ClassLoader classLoader) {
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public static Set<URL> getResources(String resourceName, ClassLoader classLoader) throws IOException {
        HashSet<URL> urlSet = new HashSet<URL>();
        Enumeration<URL> urlEnum = classLoader.getResources(resourceName);
        while (urlEnum.hasMoreElements()) {
            urlSet.add(urlEnum.nextElement());
        }
        return urlSet;
    }

    public static URL getResource(String resourceName, ClassLoader classLoader) {
        try {
            return classLoader.getResource(resourceName);
        } catch (Throwable t) {
            return null;
        }
    }

    public static URL getResourceBySelfClassLoader(String resourceName) {
        return getResource(resourceName, getClassLoaderOfClass(Loader.class));
    }

    public static ClassLoader getTCL() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class<?> loadClass(String clazz, Context context) throws ClassNotFoundException {
        return getClassLoaderOfObject(context).loadClass(clazz);
    }

    public static ClassLoader getClassLoaderOfObject(Object object) {
        if (object == null) {
            throw new NullPointerException("Argument cannot be null");
        }
        return getClassLoaderOfClass(object.getClass());
    }

    public static ClassLoader getClassLoaderAsPrivileged(final Class<?> clazz) {
        if (!HAS_GET_CLASS_LOADER_PERMISSION) {
            return null;
        }
        return AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            @Override
            public ClassLoader run() {
                return clazz.getClassLoader();
            }
        });
    }

    public static ClassLoader getClassLoaderOfClass(Class<?> clazz) {
        return systemClassloaderIfNull(clazz.getClassLoader());
    }

    public static Class<?> loadClass(String clazz) throws ClassNotFoundException {
        if (ignoreTCL) {
            return Class.forName(clazz);
        }
        try {
            return getTCL().loadClass(clazz);
        } catch (Throwable t) {
            return Class.forName(clazz);
        }
    }

    static {
        String ignoreTCLProp = OptionHelper.getSystemProperty(IGNORE_TCL_PROPERTY_NAME, null);
        if (ignoreTCLProp != null) {
            ignoreTCL = OptionHelper.toBoolean(ignoreTCLProp, true);
        }
        HAS_GET_CLASS_LOADER_PERMISSION = AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
            @Override
            public Boolean run() {
                try {
                    AccessController.checkPermission(new RuntimePermission("getClassLoader"));
                    return Boolean.TRUE;
                } catch (SecurityException e) {
                    return Boolean.FALSE;
                }
            }
        }).booleanValue();
    }
}
