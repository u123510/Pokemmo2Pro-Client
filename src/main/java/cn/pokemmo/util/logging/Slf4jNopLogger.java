/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.logging;

import f.*;

import f.HA0;
import f.nb_1;

/*
 * Renamed from f.Lpt5
 */
public class Slf4jNopLogger
extends nb_1 {
    private static final long serialVersionUID = -517220405410904473L;
    public static final Slf4jNopLogger X70 = new Slf4jNopLogger();

    @Override
    public final String getName() {
        return "NOP";
    }

    @Override
    public final boolean isTraceEnabled() {
        return false;
    }

    @Override
    public final boolean isDebugEnabled() {
        return false;
    }

    @Override
    public final boolean isInfoEnabled() {
        return false;
    }

    @Override
    public final void info(String string) {
    }

    @Override
    public final void info(String string, Object object) {
    }

    @Override
    public final void info(String string, Object object, Object object2) {
    }

    @Override
    public final void info(String string, Object ... objectArray) {
    }

    @Override
    public final void info(String string, Throwable throwable) {
    }

    @Override
    public final boolean isWarnEnabled() {
        return false;
    }

    @Override
    public final void warn(String string) {
    }

    @Override
    public final void warn(String string, Object object) {
    }

    @Override
    public final void warn(String string, Object object, Object object2) {
    }

    @Override
    public final void warn(String string, Object ... objectArray) {
    }

    @Override
    public final void warn(String string, Throwable throwable) {
    }

    @Override
    public final boolean isErrorEnabled() {
        return false;
    }

    @Override
    public final void error(String string) {
    }

    @Override
    public final void error(String string, Object object) {
    }

    @Override
    public final void error(String string, Object object, Object object2) {
    }

    @Override
    public final void error(String string, Object ... objectArray) {
    }

    @Override
    public final void error(String string, Throwable throwable) {
    }

    @Override
    public final void error(HA0 hA0, String string, Object object, Object object2) {
    }

    @Override
    public final void error(HA0 hA0, String string, Throwable throwable) {
    }
}

