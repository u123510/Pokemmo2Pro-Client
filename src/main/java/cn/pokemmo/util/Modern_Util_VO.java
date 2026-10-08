package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.VO
 */
public class Modern_Util_VO
implements lf_0 {

    public final D20 GE0;
    public final zr_1 xa0;
    public final VS Z5;

    public Modern_Util_VO() {
        this.GE0 = new D20();
        this.xa0 = new zr_1();
        this.Z5 = new VS();
    }

    @Override
    public final KV getLoggerFactory() {
        return this.GE0;
    }

    @Override
    public final ZK0 getMarkerFactory() {
        return this.xa0;
    }

    @Override
    public final Sm0 getMDCAdapter() {
        return this.Z5;
    }

    @Override
    public final String getRequestedApiVersion() {
        return "2.0.99";
    }

    @Override
    public final void initialize() {
    }
}

