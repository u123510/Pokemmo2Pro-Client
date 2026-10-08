package cn.pokemmo.util.logging;

import f.*;

import java.io.Serializable;

public abstract class AbstractLoggerAdapter implements dl_1, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;

    public AbstractLoggerAdapter() {
        super();
    }

    public final void uE(bj_2 v1, HA0 v2, String v3, Object v4, Object v5) {
        if (v5 instanceof Throwable) {
            kA0(v1, v2, v3, new Object[]{v4}, (Throwable) v5);
        } else {
            kA0(v1, v2, v3, new Object[]{v4, v5}, null);
        }
    }

    public Object readResolve() {
        return Cq0.t00(((cv_0) this).lu0);
    }

    @Override
    public final void info(String v1) {
        kA0(bj_2.LPT2, null, v1, null, null);
    }

    @Override
    public final void info(String v1, Object v2) {
        kA0(bj_2.LPT2, null, v1, new Object[]{v2}, null);
    }

    @Override
    public final void info(String v1, Object v2, Object v3) {
        uE(bj_2.LPT2, null, v1, v2, v3);
    }

    @Override
    public final void info(String v1, Object... v2) {
        bj_2 level = bj_2.LPT2;
        HA0 marker = null;
        Throwable t;
        if (v2.length == 0) {
            t = null;
        } else {
            Object last = v2[v2.length - 1];
            if (last instanceof Throwable) {
                t = (Throwable) last;
            } else {
                t = null;
            }
        }
        if (t != null) {
            int len = v2.length;
            if (len == 0) {
                throw new IllegalStateException("non-sensical empty or null argument array");
            }
            int newLen = v2.length - 1;
            Object[] trimmed = new Object[newLen];
            if (newLen > 0) {
                System.arraycopy(v2, 0, trimmed, 0, newLen);
            }
            kA0(level, marker, v1, trimmed, t);
        } else {
            kA0(level, marker, v1, v2, null);
        }
    }

    @Override
    public final void info(String v1, Throwable v2) {
        kA0(bj_2.LPT2, null, v1, null, v2);
    }

    @Override
    public final void warn(String v1) {
        kA0(bj_2.SM, null, v1, null, null);
    }

    @Override
    public final void warn(String v1, Object v2) {
        kA0(bj_2.SM, null, v1, new Object[]{v2}, null);
    }

    @Override
    public final void warn(String v1, Object v2, Object v3) {
        uE(bj_2.SM, null, v1, v2, v3);
    }

    @Override
    public final void warn(String v1, Object... v2) {
        bj_2 level = bj_2.SM;
        HA0 marker = null;
        Throwable t;
        if (v2.length == 0) {
            t = null;
        } else {
            Object last = v2[v2.length - 1];
            if (last instanceof Throwable) {
                t = (Throwable) last;
            } else {
                t = null;
            }
        }
        if (t != null) {
            int len = v2.length;
            if (len == 0) {
                throw new IllegalStateException("non-sensical empty or null argument array");
            }
            int newLen = v2.length - 1;
            Object[] trimmed = new Object[newLen];
            if (newLen > 0) {
                System.arraycopy(v2, 0, trimmed, 0, newLen);
            }
            kA0(level, marker, v1, trimmed, t);
        } else {
            kA0(level, marker, v1, v2, null);
        }
    }

    @Override
    public final void warn(String v1, Throwable v2) {
        kA0(bj_2.SM, null, v1, null, v2);
    }

    @Override
    public final void error(String v1) {
        kA0(bj_2.f90, null, v1, null, null);
    }

    @Override
    public final void error(String v1, Object v2) {
        kA0(bj_2.f90, null, v1, new Object[]{v2}, null);
    }

    @Override
    public final void error(String v1, Object v2, Object v3) {
        uE(bj_2.f90, null, v1, v2, v3);
    }

    @Override
    public final void error(String v1, Object... v2) {
        bj_2 level = bj_2.f90;
        HA0 marker = null;
        Throwable t;
        if (v2.length == 0) {
            t = null;
        } else {
            Object last = v2[v2.length - 1];
            if (last instanceof Throwable) {
                t = (Throwable) last;
            } else {
                t = null;
            }
        }
        if (t != null) {
            int len = v2.length;
            if (len == 0) {
                throw new IllegalStateException("non-sensical empty or null argument array");
            }
            int newLen = v2.length - 1;
            Object[] trimmed = new Object[newLen];
            if (newLen > 0) {
                System.arraycopy(v2, 0, trimmed, 0, newLen);
            }
            kA0(level, marker, v1, trimmed, t);
        } else {
            kA0(level, marker, v1, v2, null);
        }
    }

    @Override
    public final void error(String v1, Throwable v2) {
        kA0(bj_2.f90, null, v1, null, v2);
    }

    @Override
    public final void error(HA0 v1, String v2, Object v3, Object v4) {
        uE(bj_2.f90, v1, v2, v3, v4);
    }

    @Override
    public final void error(HA0 v1, String v2, Throwable v3) {
        kA0(bj_2.f90, v1, "Can't load configuration", null, v3);
    }

    public abstract void kA0(bj_2 v1, HA0 v2, String v3, Object[] v4, Throwable v5);
}
