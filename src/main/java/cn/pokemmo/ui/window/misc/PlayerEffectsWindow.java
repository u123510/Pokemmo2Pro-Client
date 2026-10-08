package cn.pokemmo.ui.window.misc;

import f.*;

import java.beans.PropertyChangeEvent;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

/**
 * 玩家光环特效选择窗口
 *
 * 原混淆类: f.qh_1
 */
public class PlayerEffectsWindow extends R90 {
    public final qh_1 asBridge() {
        return (qh_1) (Object) this;
    }

    public final es_1 fy;
    public final gq_2 Qf0;
    public boolean Tr;
    public Predicate<sc_1> Ld0;

    public PlayerEffectsWindow() {
        this.fy = new es_1();
        this.Tr = false;
        this.Ld0 = qh_1::i00;
        uf("playereffectsframe");
        gq_2 gq = new gq_2();
        this.Qf0 = gq;
        gq.uf("dialoglayout");
        ff0(1);
        u5(this::R40);
        bD(true);
        Ko(true);
        SL(gq);
    }

    public static boolean i00(sc_1 v0) {
        return true;
    }

    @Override
    public final void C(zk0_1 v1) {
        cz_0.iL.IT(this);
        BR br = tw0_0.rl;
        if (br == null) {
            return;
        }
        j_0 j0 = br.Ep;
        if (j0 == null) {
            return;
        }
        zA(j0);
    }

    @Override
    public final void N00(zk0_1 v1) {
        cz_0 cz = cz_0.iL;
        synchronized (cz) {
            ConcurrentHashMap map = cz_0.kD0;
            if (map.containsKey(qh_1.class)) {
                ((List) map.get(qh_1.class)).remove(this);
            }
        }
    }

    @Override
    public final void a80(Jn0 v1) {
    }

    @Override
    public final void K8() {
        super.K8();
        xI();
    }

    public final void xI() {
        if (tw0_0.kz0()) {
            E2(pa0_0.rr0, 100, 0);
            this.Yc0 = false;
            this.dz0 = false;
            ff0(1);
        } else {
            ff0(1);
            this.Yc0 = true;
            this.dz0 = true;
            if (dw_2.J50 >= 0 && dw_2.tz >= 0) {
                int x = Math.min(dw_2.J50, tw0_0.LD0.ew0() - this.Mx);
                int y = Math.min(dw_2.tz, tw0_0.LD0.Hv0() - this.OB);
                E40(x, y);
            } else {
                IA z6 = BU.T50.z6;
                int screenH = this.Em0.OB;
                int z6Y = z6.SB0;
                int z6Bottom = z6Y + z6.OB;
                int thisH = this.OB;
                if (screenH - (z6Bottom + 5) >= thisH) {
                    E40(z6.A20, z6Bottom + 5);
                } else {
                    E40(z6.A20, z6Y - thisH - 5);
                }
            }
            this.Tr = true;
        }
    }

    @Override
    public final void AD(boolean b) {
        if (b && !this.eE) {
            Gv();
        }
        super.AD(b);
    }

    public final void zA(j_0 v1) {
        this.fy.clear();
        this.Qf0.gg0.OO();
        ((java.util.Collection<sc_1>) (java.util.Collection<?>) new M(v1.LpT1)).stream()
            .filter(this.Ld0)
            .sorted(Comparator.comparingInt(sc_1::vJ0))
            .limit(10L)
            .forEach(this::T60);
        lt0();
    }

    public final void Gv() {
        for (I2 it = this.fy.ZD(); it.hasNext(); ) {
            Qq0 q = (Qq0) it.next();
            sc_1 sc = q.or0;
            if (sc != null) {
                if (sc.YK > 0) {
                    sc.YK = Math.max(0, sc.qH - (int) (System.currentTimeMillis() / 1000L));
                }
                int yk = q.or0.YK;
                if (yk != q.Rv) {
                    q.Rv = yk;
                    q.kG();
                    q.BI0();
                }
            }
        }
    }

    @Override
    public final void HP(zk0_1 v1) {
        Gv();
        super.HP(v1);
    }

    public final void oO(Predicate<sc_1> v1) {
        this.Ld0 = v1;
    }

    public final void T60(sc_1 v1) {
        XA xa = new XA(asBridge(), v1);
        this.fy.Ue0(xa);
        this.Qf0.gg0.vx0(xa);
    }

    public final void R40(PropertyChangeEvent v1) {
        if (!this.Tr) {
            return;
        }
        if ("x".equals(v1.getPropertyName())) {
            int x = this.A20;
            if (dw_2.J50 != x) {
                dw_2.J50 = x;
                dw_2.Va = true;
            }
        } else if ("y".equals(v1.getPropertyName())) {
            int y = this.SB0;
            if (dw_2.tz != y) {
                dw_2.tz = y;
                dw_2.Va = true;
            }
        }
    }
}
