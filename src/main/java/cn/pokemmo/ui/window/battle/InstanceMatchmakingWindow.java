package cn.pokemmo.ui.window.battle;

import f.*;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 副本/活动匹配窗口
 *
 * 原混淆类: f.m1_0
 */
public class InstanceMatchmakingWindow extends cx_0 implements tr_1  {
    public final m1_0 asBridge() {
        return (m1_0) (Object) this;
    }

    public final tk0_0 pv;
    public final es_1 Kx0;

    public InstanceMatchmakingWindow(boolean z) {
        super(tw0_0.kz0());
        uf("instance-matchmaking-frame");
        if (z) {
            Hy(sm0_0.c0(6733));
        } else {
            Hy(sm0_0.c0(1358));
        }
        Pb0(m1_0::coM3);

        this.pv = new tk0_0();
        A40 a40 = this.pv.gg0;
        a40.yI().ys0(10.0f);
        a40.vx0(new cn_0(sm0_0.c0(1357)));
        a40.Rg();

        tk0_0 tk0_0 = new tk0_0();
        A40 a402 = tk0_0.gg0;
        G50 con = G50.Rw(dw_2.con);
        G50 fP = G50.Rw(dw_2.fP);
        Set al = dw_2.AL();
        this.Kx0 = new es_1();

        int i = 0;
        for (G50 g50 : G50.aG) {
            if (g50 != G50.OJ) {
                W9 w9 = new W9();
                w9.s70(g50);
                if (g50 == con || g50 == fP) {
                    w9.k50(true);
                    w9.pw0(false);
                } else if (al.contains(g50)) {
                    w9.k50(true);
                }
                this.Kx0.Ue0(w9);

                S70 s70 = new S70(64, 64);
                s70.JH().df();
                s70.JH().dA(2.0f);
                s70.JH().r8(new LPT6_[]{fn_0.qz0().ln0(g50.sv0())});

                a402.vx0(s70).yi0(w9).GD();
                a402.vx0(new cn_0(g50.aD())).yi0(w9).Wa0();

                i++;
                if (i > 2) {
                    i = 0;
                    a402.Rg();
                }
            }
        }

        a40.vx0(tk0_0).im0();
        xe_1 xe_1;
        if (z) {
            xe_1 = new xe_1(sm0_0.c0(5525));
            xe_1.RR(this::qN);
        } else {
            xe_1 = new xe_1(sm0_0.c0(54));
            xe_1.RR(this::kD0);
        }
        a40.vx0(xe_1);
        SL(this.pv);
    }

    public static void coM3() {
        Qy0 qy0 = Qy0.yI0;
        m1_0 m1_0 = qy0.Uu;
        if (m1_0 != null) {
            m1_0.xe0();
            qy0.Uu = null;
        }
    }

    public static void kl(ArrayList<G50> arrayList) {
        String collect = (String) arrayList.stream().map(G50::ir0).collect(Collectors.joining(","));
        if (!collect.equals(dw_2.wW)) {
            dw_2.wW = collect;
            dw_2.CY();
        }
    }

    @Override
    public final void C(zk0_1 zk0_1) {
        super.C(zk0_1);
        lpt6__0.v90(this);
    }

    @Override
    public final void HP(zk0_1 zk0_1) {
        super.HP(zk0_1);
        if (!Of()) {
            lpt6__0.v90(this);
        }
    }

    @Override
    public final void K8() {
        super.K8();
        if (tw0_0.kz0()) {
            kh0();
        }
    }

    public final void kD0() {
        ArrayList arrayList = new ArrayList();
        I2 it = this.Kx0.ZD();
        while (it.hasNext()) {
            W9 w9 = (W9) it.next();
            G50 g50 = (G50) w9.kg;
            if (w9.ER.U20()) {
                arrayList.add(g50);
            }
        }
        kl(arrayList);
        Qy0 qy0 = Qy0.yI0;
        m1_0 m1_0 = qy0.Uu;
        if (m1_0 != null) {
            m1_0.xe0();
            qy0.Uu = null;
        }
    }

    public final void qN() {
        ArrayList arrayList = new ArrayList();
        I2 it = this.Kx0.ZD();
        while (it.hasNext()) {
            W9 w9 = (W9) it.next();
            G50 g50 = (G50) w9.kg;
            if (w9.ER.U20()) {
                arrayList.add(g50);
            }
        }
        kl(arrayList);
        G50[] g50Arr = (G50[]) arrayList.toArray(new G50[0]);
        tw0_0.rl.fk0.uQ(new XQ(g50Arr));
        Qy0 qy0 = Qy0.yI0;
        m1_0 m1_0 = qy0.Uu;
        if (m1_0 != null) {
            m1_0.xe0();
            qy0.Uu = null;
        }
    }
}
