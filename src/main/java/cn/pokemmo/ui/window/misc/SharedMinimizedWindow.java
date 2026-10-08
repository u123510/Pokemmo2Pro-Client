/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.window.misc;

import f.*;

import f.BU;
import f.I50;
import f.fy_2;
import f.le0_2;
import f.nx_2;
import f.qj_2;
import f.sm0_0;

/*
 * Renamed from f.ba0
 */
/**
 * 通用最小化悬浮窗
 *
 * 原混淆类: f.ba0_2
 */
public class SharedMinimizedWindow
extends nx_2 {
    public final ba0_2 asBridge() {
        return (ba0_2) (Object) this;
    }

    public SharedMinimizedWindow() {
        super("shared-minimized");
        this.ff0(1);
        this.Hy(sm0_0.c0(76));
        this.Ia = new fy_2();
        this.w20 = new qj_2(sm0_0.c0(76), 200, 30);
        this.w20.sl().Gy0(7, 7);
        this.w20.sl().nq0(16, 16);
        this.w20.sl().C80(250);
        this.w20.RR(new I50());
        this.Hn0.SL(this.w20);
        this.SL(this.Hn0);
        this.Hn0.Ll(true);
    }

    @Override
    public final void K8() {
        this.lt0();
        this.Hn0.lt0();
        BU bu = BU.T50;
        this.E40(bu.Mx + 90000, bu.iB0.SB0 + 90000);
        super.K8();
    }
}
