package cn.pokemmo.input;

import f.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/**
 * 手柄按键与轴向映射配置管理器 (Controller Configuration)
 * 处理手柄按钮、摇杆死区、扳机键与游戏按键绑定的配置读写与事件分发。
 *
 * 原混淆类: f.gc0_0
 */
public class ControllerConfiguration extends ZB0 {
    public final String LPT8;
    public LH0 Dq0;
    public final HashMap<rp_0, OW> QI;
    public boolean[] te;

    public ControllerConfiguration(String str) {
        this.QI = new HashMap<rp_0, OW>();
        this.LPT8 = str;
        this.Dq0 = null;
    }

    public ControllerConfiguration(LH0 lh0, String str) {
        this.QI = new HashMap<rp_0, OW>();
        this.Dq0 = lh0;
        this.LPT8 = str;
        this.te = new boolean[((o3_0) lh0).wE() * 2];
    }

    public final void GV() {
        OW jK0 = new OW(rp_0.sJ0).jK0(((o3_0) this.Dq0).YX().va);
        this.QI.put(jK0.CZ, jK0);
        OW jK02 = new OW(rp_0.nK0).jK0(((o3_0) this.Dq0).YX().pl);
        this.QI.put(jK02.CZ, jK02);
        OW jK03 = new OW(rp_0.N9).jK0(((o3_0) this.Dq0).YX().El);
        this.QI.put(jK03.CZ, jK03);
        OW jK04 = new OW(rp_0.pd0).jK0(((o3_0) this.Dq0).YX().rB);
        this.QI.put(jK04.CZ, jK04);
        if (((o3_0) this.Dq0).wE() > 0) {
            OW ow = new OW(rp_0.kC0);
            int i = ((o3_0) this.Dq0).YX().cK;
            zd0_1 zd0_1Var = zd0_1.vp0;
            ow.Ik0 = zd0_1Var;
            ow.By = i;
            ow.HG0 = false;
            this.QI.put(rp_0.kC0, ow);
            OW ow2 = new OW(rp_0.synchronized$);
            ow2.Ik0 = zd0_1Var;
            ow2.By = ((o3_0) this.Dq0).YX().cK;
            ow2.HG0 = true;
            this.QI.put(rp_0.synchronized$, ow2);
            OW ow3 = new OW(rp_0.I90);
            ow3.Ik0 = zd0_1Var;
            ow3.By = ((o3_0) this.Dq0).YX().bD0;
            ow3.HG0 = false;
            this.QI.put(rp_0.I90, ow3);
            OW ow4 = new OW(rp_0.Ni);
            ow4.Ik0 = zd0_1Var;
            ow4.By = ((o3_0) this.Dq0).YX().bD0;
            ow4.HG0 = true;
            this.QI.put(rp_0.Ni, ow4);
            this.te = new boolean[((o3_0) this.Dq0).wE() * 2];
        }
        OW jK05 = new OW(rp_0.Mi0).jK0(((o3_0) this.Dq0).YX().Gs);
        this.QI.put(jK05.CZ, jK05);
        OW jK06 = new OW(rp_0.com1).jK0(((o3_0) this.Dq0).YX().A3);
        this.QI.put(jK06.CZ, jK06);
        OW jK07 = new OW(rp_0.ew).jK0(((o3_0) this.Dq0).YX().fi);
        this.QI.put(jK07.CZ, jK07);
        OW jK08 = new OW(rp_0.eL).jK0(((o3_0) this.Dq0).YX().XM);
        this.QI.put(jK08.CZ, jK08);
        OW jK09 = new OW(rp_0.aE0).jK0(((o3_0) this.Dq0).YX().xT);
        this.QI.put(jK09.CZ, jK09);
        OW jK010 = new OW(rp_0.ip0).jK0(((o3_0) this.Dq0).YX().rq);
        this.QI.put(jK010.CZ, jK010);
        tw0_0.Dc0();
        if (((o3_0) this.Dq0).wE() > 5) {
            OW ow5 = new OW(rp_0.cB);
            zd0_1 zd0_1Var2 = zd0_1.vp0;
            ow5.Ik0 = zd0_1Var2;
            ow5.By = 4;
            ow5.HG0 = true;
            this.QI.put(rp_0.cB, ow5);
            OW ow6 = new OW(rp_0.Aq0);
            ow6.Ik0 = zd0_1Var2;
            ow6.By = 5;
            ow6.HG0 = true;
            this.QI.put(rp_0.Aq0, ow6);
        } else if (((o3_0) this.Dq0).SB() >= 10) {
            OW jK011 = new OW(rp_0.cB).jK0(((o3_0) this.Dq0).YX().mb);
            this.QI.put(jK011.CZ, jK011);
            OW jK012 = new OW(rp_0.Aq0).jK0(((o3_0) this.Dq0).YX().Ez0);
            this.QI.put(jK012.CZ, jK012);
        }
    }

    public final OW jw0(zd0_1 zd0_1Var, int i, boolean z) {
        for (OW ow : this.QI.values()) {
            if (ow.Ik0 == zd0_1Var) {
                int i2 = c5_0.private$[zd0_1Var.Zc];
                if (i2 != 1) {
                    if (i2 == 2 && ow.By == i && z == ow.HG0) {
                        return ow;
                    }
                } else if (ow.Zt0 == i) {
                    return ow;
                }
            }
        }
        return null;
    }

    public final String up0() {
        return this.LPT8;
    }

    public final String je() {
        String str = "";
        String str2 = this.LPT8;
        if (str2.contains(" ")) {
            str = this.LPT8.substring(this.LPT8.lastIndexOf(32), this.LPT8.length()).trim();
            str2 = this.LPT8.substring(0, this.LPT8.lastIndexOf(32)).trim();
        }
        if (this.LPT8.toLowerCase(Locale.ENGLISH).contains("xbox")) {
            return jj0_0.hw0("Xbox ", str);
        }
        if (str2.length() > 8) {
            return str2.substring(0, 7) + "... " + str;
        }
        return this.LPT8;
    }

    @Override
    public final boolean PL0(o3_0 o3_0Var, int i) {
        OW jw0 = jw0(zd0_1.Dj0, i, true);
        if (jw0 != null) {
            tw0_0.Xl0.qT(jw0.CZ.Hh, true);
        }
        return false;
    }

    @Override
    public final boolean KY(o3_0 o3_0Var, int i) {
        OW jw0 = jw0(zd0_1.Dj0, i, true);
        if (jw0 != null) {
            tw0_0.Xl0.qT(jw0.CZ.Hh, false);
        }
        return false;
    }

    @Override
    public final boolean H2(o3_0 o3_0Var, int i, float f) {
        int i2 = i * 2;
        if (this.te == null) {
            return false;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            OW jw0 = jw0(zd0_1.vp0, i, i3 == 0);
            if (jw0 != null) {
                boolean cON = jw0.cON(o3_0Var);
                boolean[] zArr = this.te;
                int i4 = i2 + i3;
                if (zArr[i4] != cON) {
                    zArr[i4] = cON;
                    tw0_0.Xl0.qT(jw0.CZ.Hh, cON);
                }
            }
        }
        return false;
    }
}
