package cn.pokemmo.commons.logging;

import f.*;


import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Obfuscated SLF4J LoggerFactory.
 *
 * <p>The original class is SLF4J 2.x style bootstrap code.  CFR leaves several
 * damaged try/catch regions here, so this source keeps the same public ABI and
 * implements the bootstrap directly.  Runtime behaviour that matters to the
 * client is: choose the Logback provider, expose {@link #E1(Class)} /
 * {@link #t00(String)}, and replay substitute-log events once the provider has
 * been initialized.</p>
 */
public abstract class GdxLoggerFactory {
    public static volatile int xs = 0;
    public static final COM3_ Ft0 = new COM3_();
    public static final VO Gq0 = new VO();
    public static final boolean qy;
    public static volatile lf_0 Ah;
    public static final String[] jn0;

    public static ArrayList Wm0() {
        ArrayList providers = new ArrayList();
        ClassLoader classLoader = GdxLoggerFactory.class.getClassLoader();

        String explicitProvider = null;
        try {
            explicitProvider = System.getProperty("slf4j.provider");
        } catch (SecurityException ignored) {
        }

        if (explicitProvider != null && !explicitProvider.isEmpty()) {
            if (qi0_2.ih0(1) >= qi0_2.ih0(gc_1.op0)) {
                gc_1.n50().println("SLF4J(I): " + String.format(
                        "Attempting to load provider \"%s\" specified via \"%s\" system property",
                        explicitProvider, "slf4j.provider"));
            }
            try {
                Object provider = classLoader.loadClass(explicitProvider)
                        .getConstructor()
                        .newInstance();
                providers.add((lf_0) provider);
                return providers;
            } catch (ClassCastException ex) {
                gc_1.y80(String.format(
                        "Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface",
                        explicitProvider), ex);
                return providers;
            } catch (ClassNotFoundException | NoSuchMethodException |
                     InstantiationException | IllegalAccessException |
                     InvocationTargetException ex) {
                gc_1.y80(String.format(
                        "Failed to instantiate the specified SLF4JServiceProvider (%s)",
                        explicitProvider), ex);
                return providers;
            }
        }

        Iterator iterator = Cq0.iS(classLoader).iterator();
        while (iterator.hasNext()) {
            Cq0.Gv(providers, iterator);
        }

        // The remapped resources in this project may contain the old service
        // descriptor name.  Keep a deterministic fallback to the bundled
        // LogbackServiceProvider so source runs the same way as the jar.
        if (providers.isEmpty()) {
            try {
                Object provider = Class.forName(
                        "ch.qos.logback.classic.spi.LogbackServiceProvider",
                        true,
                        classLoader).getConstructor().newInstance();
                providers.add((lf_0) provider);
            } catch (Throwable ex) {
                gc_1.y80("Failed to instantiate bundled LogbackServiceProvider", ex);
            }
        }
        return providers;
    }

    public static ServiceLoader iS(ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            return ServiceLoader.load(lf_0.class, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(
                (PrivilegedAction<ServiceLoader>) () -> ServiceLoader.load(lf_0.class, classLoader));
    }

    public static void Gv(ArrayList arrayList, Iterator iterator) {
        try {
            arrayList.add((lf_0) iterator.next());
        } catch (ServiceConfigurationError serviceConfigurationError) {
            String string = "A service provider failed to instantiate:\n" + serviceConfigurationError.getMessage();
            gc_1.n50().println("SLF4J(E): " + string);
        }
    }

    public static final void pi0() {
        try {
            ArrayList providers = Cq0.Wm0();
            Cq0.mH(providers);
            if (providers.isEmpty()) {
                xs = 4;
                gc_1.rf("No SLF4J providers were found.");
                gc_1.rf("Defaulting to no-operation (NOP) logger implementation");
                return;
            }

            Ah = (lf_0) providers.get(0);
            Ah.initialize();
            xs = 3;
            Cq0.oe();
        } catch (Throwable throwable) {
            xs = 2;
            gc_1.y80("Failed to initialize SLF4J LoggerFactory", throwable);
            throw new IllegalStateException("Unexpected initialization failure", throwable);
        }
    }

    public static void K60(LinkedHashSet object) {
        if (object.isEmpty()) {
            return;
        }
        gc_1.rf("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            URL uRL = (URL) iterator.next();
            gc_1.rf("Ignoring binding found at [" + uRL + "]");
        }
        gc_1.rf("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void oe() {
        COM3_ substituteProvider = Ft0;
        synchronized (substituteProvider) {
            nh_1 substituteFactory = substituteProvider.Y3;
            substituteFactory.wm0 = true;
            for (Object value : new ArrayList(substituteFactory.tc.values())) {
                eb_0 logger = (eb_0) value;
                logger.Kd = Cq0.t00(logger.Ei0);
            }
        }

        LinkedBlockingQueue queue = Cq0.Ft0.Y3.aK0;
        int eventCount = queue.size();
        int replayed = 0;
        ArrayList drained = new ArrayList(128);
        while (queue.drainTo(drained, 128) != 0) {
            for (Object drainedEvent : drained) {
                if (drainedEvent == null) {
                    continue;
                }
                t4_0 event = (t4_0) drainedEvent;
                eb_0 logger = event.IC0;
                if (logger.Kd == null) {
                    throw new IllegalStateException("Delegate logger cannot be null at this state.");
                }
                if (!(logger.Kd instanceof lpt5__2)) {
                    if (logger.Ia()) {
                        if (logger.Rq0().isEnabledForLevel(event.fw0) && logger.Ia()) {
                            try {
                                logger.aY.invoke(logger.Kd, event);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ignored) {
                            }
                        }
                    } else {
                        gc_1.rf(logger.Ei0);
                    }
                }

                if (replayed++ == 0) {
                    if (logger.Ia()) {
                        gc_1.rf("A number (" + eventCount + ") of logging calls during the initialization phase have been intercepted and are");
                        gc_1.rf("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        gc_1.rf("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(logger.Kd instanceof lpt5__2)) {
                        gc_1.rf("The following set of substitute loggers may have been accessed");
                        gc_1.rf("during the initialization phase. Logging calls during this");
                        gc_1.rf("phase were not honored. However, subsequent logging calls to these");
                        gc_1.rf("loggers will work as normally expected.");
                        gc_1.rf("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
            }
            drained.clear();
        }
        Cq0.Ft0.Y3.tc.clear();
        Cq0.Ft0.Y3.aK0.clear();
    }

    public static void mH(ArrayList object) {
        if (((ArrayList) object).size() > 1) {
            gc_1.rf("Class path contains multiple SLF4J providers.");
            Iterator iterator = ((ArrayList) object).iterator();
            while (iterator.hasNext()) {
                lf_0 lf_02 = (lf_0) iterator.next();
                gc_1.rf("Found provider [" + lf_02 + "]");
            }
            gc_1.rf("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static dl_1 t00(String string) {
        return Cq0.vr().getLoggerFactory().getLogger(string);
    }

    public static dl_1 E1(Class objectArray) {
        dl_1 logger = Cq0.t00(objectArray.getName());
        if (qy) {
            Class caller = null;
            Object securityManager = y2_0.A00;
            if (securityManager == null) {
                if (!y2_0.sA) {
                    try {
                        securityManager = new UX();
                    } catch (SecurityException securityException) {
                        securityManager = null;
                    }
                    y2_0.A00 = (UX) securityManager;
                    y2_0.sA = true;
                }
            }
            if (securityManager != null) {
                Class[] context = ((UX) securityManager).getClassContext();
                String utilClassName = y2_0.class.getName();
                int i = 0;
                while (i < context.length && !utilClassName.equals(context[i].getName())) {
                    ++i;
                }
                if (i >= context.length || i + 2 >= context.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                caller = context[i + 2];
            }
            if (caller != null && !caller.isAssignableFrom(objectArray)) {
                gc_1.rf(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".",
                        logger.getName(), caller.getName()));
                gc_1.rf("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return logger;
    }

    public static KV VL0() {
        return Cq0.vr().getLoggerFactory();
    }

    public static lf_0 vr() {
        if (xs == 0) {
            synchronized (GdxLoggerFactory.class) {
                if (xs == 0) {
                    xs = 1;
                    Cq0.pi0();
                }
            }
        }
        switch (xs) {
            case 1:
                return Ft0;
            case 2:
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            case 3:
                return Ah;
            case 4:
                return Gq0;
            default:
                throw new IllegalStateException("Unreachable code");
        }
    }

    static {
        String string = null;
        try {
            string = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException securityException) {
        }
        qy = string != null && string.equalsIgnoreCase("true");
        jn0 = new String[]{"2.0"};
    }
}
