package cn.pokemmo.util.logging;

import f.*;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Slf4jEventLoggerAdapter implements dl_1 {
    public final String Ei0;
    public volatile dl_1 Kd;
    public Boolean cOm6;
    public Method aY;
    public cv_0 Yr;
    public final Queue bF;
    public final boolean A00;

    public Slf4jEventLoggerAdapter(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.Ei0 = str;
        this.bF = linkedBlockingQueue;
        this.A00 = z;
    }

    @Override
    public final String getName() {
        return this.Ei0;
    }

    @Override
    public final am0_1 makeLoggingEventBuilder(bj_2 bj_2Var) {
        return Rq0().makeLoggingEventBuilder(bj_2Var);
    }

    @Override
    public final boolean isEnabledForLevel(bj_2 bj_2Var) {
        return Rq0().isEnabledForLevel(bj_2Var);
    }

    @Override
    public final boolean isTraceEnabled() {
        return Rq0().isTraceEnabled();
    }

    @Override
    public final boolean isDebugEnabled() {
        return Rq0().isDebugEnabled();
    }

    @Override
    public final boolean isInfoEnabled() {
        return Rq0().isInfoEnabled();
    }

    @Override
    public final void info(String str) {
        Rq0().info(str);
    }

    @Override
    public final void info(String str, Object obj) {
        Rq0().info(str, obj);
    }

    @Override
    public final void info(String str, Object obj, Object obj2) {
        Rq0().info(str, obj, obj2);
    }

    @Override
    public final void info(String str, Object... objArr) {
        Rq0().info(str, objArr);
    }

    @Override
    public final void info(String str, Throwable th) {
        Rq0().info(str, th);
    }

    @Override
    public final boolean isWarnEnabled() {
        return Rq0().isWarnEnabled();
    }

    @Override
    public final void warn(String str) {
        Rq0().warn(str);
    }

    @Override
    public final void warn(String str, Object obj) {
        Rq0().warn(str, obj);
    }

    @Override
    public final void warn(String str, Object obj, Object obj2) {
        Rq0().warn(str, obj, obj2);
    }

    @Override
    public final void warn(String str, Object... objArr) {
        Rq0().warn(str, objArr);
    }

    @Override
    public final void warn(String str, Throwable th) {
        Rq0().warn(str, th);
    }

    @Override
    public final boolean isErrorEnabled() {
        return Rq0().isErrorEnabled();
    }

    @Override
    public final void error(String str) {
        Rq0().error(str);
    }

    @Override
    public final void error(String str, Object obj) {
        Rq0().error(str, obj);
    }

    @Override
    public final void error(String str, Object obj, Object obj2) {
        Rq0().error(str, obj, obj2);
    }

    @Override
    public final void error(String str, Object... objArr) {
        Rq0().error(str, objArr);
    }

    @Override
    public final void error(String str, Throwable th) {
        Rq0().error(str, th);
    }

    @Override
    public final void error(HA0 ha0, String str, Object obj, Object obj2) {
        Rq0().error(ha0, str, obj, obj2);
    }

    @Override
    public final void error(HA0 ha0, String str, Throwable th) {
        Rq0().error(ha0, "Can't load configuration", th);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.Ei0.equals(((eb_0) obj).Ei0);
    }

    @Override
    public final int hashCode() {
        return this.Ei0.hashCode();
    }

    public final dl_1 Rq0() {
        if (this.Kd != null) {
            return this.Kd;
        }
        if (this.A00) {
            return lpt5__2.X70;
        }
        if (this.Yr == null) {
            this.Yr = new cv_0((eb_0) this, this.bF);
        }
        return this.Yr;
    }

    public final boolean Ia() {
        if (this.cOm6 != null) {
            return this.cOm6.booleanValue();
        }
        try {
            this.aY = this.Kd.getClass().getMethod("log", P4.class);
            this.cOm6 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.cOm6 = Boolean.FALSE;
        }
        return this.cOm6.booleanValue();
    }
}
