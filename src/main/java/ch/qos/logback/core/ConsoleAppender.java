/*
 * Reconstructed from bytecode (javap) of the obfuscated jar.
 */
package ch.qos.logback.core;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import ch.qos.logback.core.status.WarnStatus;
import ch.qos.logback.core.util.Loader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ConsoleAppender extends OutputStreamAppender {
    private static final String AnsiConsole_CLASS_NAME = "org.fusesource.jansi.AnsiConsole";
    private static final String JANSI2_OUT_METHOD_NAME = "out";
    private static final String JANSI2_ERR_METHOD_NAME = "err";
    private static final String wrapSystemOut_METHOD_NAME = "wrapSystemOut";
    private static final String wrapSystemErr_METHOD_NAME = "wrapSystemErr";
    private static final Class[] ARGUMENT_TYPES = new Class[] { PrintStream.class };

    protected ConsoleTarget target;
    protected boolean withJansi;

    public ConsoleAppender() {
        target = ConsoleTarget.SystemOut;
        withJansi = false;
    }

    private void targetWarn(String val) {
        WarnStatus ws = new WarnStatus("[" + val + "] should be one of " + Arrays.toString(ConsoleTarget.values()), this);
        ws.add(new WarnStatus("Using previously set target, System.out by default.", this));
        addStatus(ws);
    }

    private OutputStream wrapWithJansi(OutputStream outputStream) {
        try {
            addInfo("Enabling JANSI AnsiPrintStream for the console.");
            ClassLoader classLoader = Loader.getClassLoaderOfObject(context);
            Class<?> ansiConsoleClass = classLoader.loadClass(AnsiConsole_CLASS_NAME);
            String methodName;
            if (target == ConsoleTarget.SystemOut) {
                methodName = JANSI2_OUT_METHOD_NAME;
            } else {
                methodName = JANSI2_ERR_METHOD_NAME;
            }
            Optional<Method> outMethod = Arrays.stream(ansiConsoleClass.getMethods())
                    .filter(m -> m.getName().equals(methodName))
                    .filter(m -> m.getParameters().length == 0)
                    .filter(m -> Modifier.isStatic(m.getModifiers()))
                    .filter(m -> PrintStream.class.isAssignableFrom(m.getReturnType()))
                    .findAny();
            if (outMethod.isPresent()) {
                return (PrintStream) outMethod.orElseThrow(() -> new NoSuchElementException("No value present")).invoke(null);
            } else {
                String wrapMethodName;
                if (target == ConsoleTarget.SystemOut) {
                    wrapMethodName = wrapSystemOut_METHOD_NAME;
                } else {
                    wrapMethodName = wrapSystemErr_METHOD_NAME;
                }
                Method wrapMethod = ansiConsoleClass.getMethod(wrapMethodName, ARGUMENT_TYPES);
                return (OutputStream) wrapMethod.invoke(null, new Object[] { new PrintStream(outputStream) });
            }
        } catch (Exception e) {
            addWarn("Failed to create AnsiPrintStream. Falling back on the default stream.", e);
            return outputStream;
        }
    }

    public void setTarget(String value) {
        ConsoleTarget t = ConsoleTarget.findByName(value.trim());
        if (t == null) {
            targetWarn(value);
        } else {
            target = t;
        }
    }

    public String getTarget() {
        return target.getName();
    }

    @Override
    public void start() {
        OutputStream outputStream = target.getStream();
        if (withJansi) {
            outputStream = wrapWithJansi(outputStream);
        }
        setOutputStream(outputStream);
        super.start();
    }

    public boolean isWithJansi() {
        return withJansi;
    }

    public void setWithJansi(boolean withJansi) {
        this.withJansi = withJansi;
    }
}
