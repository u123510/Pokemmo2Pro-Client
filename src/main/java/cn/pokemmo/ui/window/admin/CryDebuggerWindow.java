package cn.pokemmo.ui.window.admin;

import f.*;

/**
 * 宝可梦叫声调试器窗口
 *
 * 原混淆类: f.n6_0
 */
public class CryDebuggerWindow extends R90 {
    public final fy_2 DW;
    public final Aj lPT5;
    public final Aj Ik0;
    public final cn_0 coM5;

    public CryDebuggerWindow(xn0_0 xn) {
        this.DW = new fy_2();
        ff0(1);
        uf("adminframe");
        Hy("Cry Debugger");
        Pb0(() -> ux(xn));
        cn_0 trackLabel = new cn_0("Track ID: ");
        this.lPT5 = new Aj(1, 3, 1);
        Gh0 trackSpinner = new Gh0(this.lPT5);

        int maxMonsterId = ((java.util.Collection<cq_0>) (java.util.Collection<?>) mp_1.vf0().xn()).stream().mapToInt(cq_0::Nm).max().getAsInt();
        cn_0 monsterLabel = new cn_0("Monster ID: ");
        this.Ik0 = new Aj(0, maxMonsterId, 1);
        Gh0 monsterSpinner = new Gh0(this.Ik0);

        this.coM5 = new cn_0();
        this.coM5.RY(300, 20);
        this.Ik0.Kj(this::V6);

        xe_1 playBtn = new xe_1("PLAY");
        xe_1 stopBtn = uz0_0.nJ(playBtn, this::V6, "STOP");
        stopBtn.RR(n6_0::m50);

        this.DW.WQ(this.DW.lo0().LPt3(new le0_2[] { trackLabel, trackSpinner, monsterLabel, monsterSpinner, this.coM5, playBtn, stopBtn }));
        this.DW.x40(this.DW.H10().LPt3(new le0_2[] { trackLabel, trackSpinner, monsterLabel, monsterSpinner, this.coM5, playBtn, stopBtn }));
        SL(this.DW);
    }

    public static void m50() {
        tw0_0.RE0.BK0(false);
    }

    public final void V6() {
        tw0_0.RE0.BK0(false);
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        short trackId = (short) this.lPT5.cx0;
        short monsterId = (short) this.Ik0.cx0;
        String monsterName = "--";
        cq_0 cq = (cq_0) mp_1.vf0().k2.get(Short.valueOf(monsterId));
        if (cq != null) {
            monsterName = cq.Ay(true);
            if (monsterId > 667) {
                di0_0.xE0(monsterId);
            } else {
                tw0_0.RE0.IE((byte) 2, trackId, monsterId, true, 1.0f, 1.0f, 1.0f, 0);
            }
        }
        hx_2 hx = tw0_0.Ll0.AB((byte) 2).RP();
        if (hx.YZ == null && hx.Wo != 0) {
            hx.YZ = new Uz0(hx);
        }
        String trackName = "--";
        if (hx.YZ != null && trackId >= 0 && trackId < hx.YZ.Rw[0].KB.length) {
            trackName = hx.YZ.Rw[0].KB[trackId];
        }
        this.coM5.Sk(trackName + " " + monsterName);
    }

    public final void K8() {
        lt0();
        this.DW.lt0();
        super.K8();
    }

    public final void ux(xn0_0 xn) {
        xn.u3(this);
    }
}
