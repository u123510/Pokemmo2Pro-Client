/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.logging;

import f.*;

import f.HA0;
import f.am0_1;
import f.bj_2;
import f.z50_0;

/*
 * Renamed from f.dL
 */
public interface Logger {
    public String getName();

    default public am0_1 makeLoggingEventBuilder(bj_2 bj_22) {
        return new z50_0();
    }

    default public boolean isEnabledForLevel(bj_2 bj_22) {
        int n = bj_22.JB0;
        if (n != 0) {
            if (n != 10) {
                if (n != 20) {
                    if (n != 30) {
                        if (n == 40) {
                            return this.isErrorEnabled();
                        }
                        throw new IllegalArgumentException("Level [" + (Object)((Object)bj_22) + "] not recognized.");
                    }
                    return this.isWarnEnabled();
                }
                return this.isInfoEnabled();
            }
            return this.isDebugEnabled();
        }
        return this.isTraceEnabled();
    }

    public boolean isTraceEnabled();

    public boolean isDebugEnabled();

    public boolean isInfoEnabled();

    public void info(String var1);

    public void info(String var1, Object var2);

    public void info(String var1, Object var2, Object var3);

    public void info(String var1, Object ... var2);

    public void info(String var1, Throwable var2);

    public boolean isWarnEnabled();

    public void warn(String var1);

    public void warn(String var1, Object var2);

    public void warn(String var1, Object ... var2);

    public void warn(String var1, Object var2, Object var3);

    public void warn(String var1, Throwable var2);

    public boolean isErrorEnabled();

    public void error(String var1);

    public void error(String var1, Object var2);

    public void error(String var1, Object var2, Object var3);

    public void error(String var1, Object ... var2);

    public void error(String var1, Throwable var2);

    public void error(HA0 var1, String var2, Object var3, Object var4);

    public void error(HA0 var1, String var2, Throwable var3);
}

