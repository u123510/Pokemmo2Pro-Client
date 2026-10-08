package cn.pokemmo.ui.window.social;

import f.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 聊天透明度与频道标签配置窗口
 *
 * 原混淆类: f.vx_1
 */
public class ChatSettingsWindow extends cx_0 {
    public final vx_1 asBridge() {
        return (vx_1) (Object) this;
    }

    public final P8 E2;
    public final ArrayList g60;

    public ChatSettingsWindow(BU v1) {
        super(tw0_0.kz0());
        this.g60 = dw_2.pq0();
        v1.getClass();
        Pb0(v1::gI);
        uf("chat-tab-settings");
        Hy(sm0_0.c0(1532));
        ff0(1);
        bD(true);
        P8 p8 = new P8();
        this.E2 = p8;
        p8.I6(true);
        ia0_1 v2 = new ia0_1();
        Aj v3 = new Aj(0, 100, dw_2.kt0);
        WZ v4 = new WZ(v3);
        if (!tw0_0.kz0()) {
            cn_0 label = new cn_0(sm0_0.c0(1550));
            label.uf("label-chat-settings-transparency");
            v2.SL(label);
            v2.SL(v4);
        }
        fy_2 layout = new fy_2();
        layout.x40(XZ.BC0(layout.lo0(), new ya_1[]{layout.lo0().qd(10).LPt3(new le0_2[]{p8, v2})}, layout)
                .Xq(new ya_1[]{layout.H10().LPt3(new le0_2[]{p8, v2})}));
        SL(layout);
        COm1(false);
    }

    public final void COm1(boolean z) {
        lg_0.k.lPT5(() -> o6(z));
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
        }
        super.K8();
    }

    public final fy_2 VA0(HK v1) {
        fy_2 v2 = new fy_2();
        v2.uf("chat-settings-area");
        new lo0_0((le0_2) null).Qs0(2);
        cn_0 v3 = new cn_0(null, 0);
        v3.Sk(sm0_0.c0(1534));
        v3.uf("label-chat-settings-title");
        cg_0 v4 = new cg_0(null, new wn0_0());
        if (v3.j50 != null) {
            v3.j50.toString();
        }
        le0_2 v5 = new le0_2(null, false);
        v5.uf("label-chat-settings-button");
        v5.F9(v5.fU(), v4);
        v5.oY(261, 20);

        String title = (v1 != null) ? v1.eC0 : "";
        v4.Gv(title);
        v4.BP = 16;

        cn_0 v6 = new cn_0(null, 0);
        v6.Sk(sm0_0.c0(1535));
        v6.uf("label-chat-settings-special");

        fy_2 v7 = new fy_2();
        I7 v8 = new I7(v7);
        v8.X20(v7.hb(new le0_2[]{v3, v5})).qd(5).Kn0(v6);

        Hm0 v3_group = new Hm0(v7);
        v3_group.X20(v7.C7(new le0_2[]{v3, v5})).Kn0(v6);

        zo_0[] zoArray = zo_0.JG;
        W9[] w9Array = new W9[zoArray.length];
        for (int i = 0; i < zoArray.length; i += 2) {
            w9Array[i] = new W9();
            cn_0 label1 = new cn_0(null, 0);
            label1.Sk(sm0_0.c0(zoArray[i].Yf));
            if (v1 != null) {
                w9Array[i].ER.lK0(!v1.d4.contains(zoArray[i]));
            }
            if (i + 1 < zoArray.length) {
                int next = i + 1;
                w9Array[next] = new W9();
                cn_0 label2 = new cn_0(null, 0);
                label2.Sk(sm0_0.c0(zoArray[next].Yf));
                if (v1 != null) {
                    w9Array[next].ER.lK0(!v1.d4.contains(zoArray[next]));
                }
                label1.uf("label-chat-settings-title");
                label2.uf("label-chat-settings-title");
                le0_2 btn1 = new le0_2(null, false);
                btn1.uf("label-chat-settings-button");
                btn1.F9(btn1.fU(), w9Array[i]);
                w9Array[i].oY(30, 30);
                le0_2 btn2 = new le0_2(null, false);
                btn2.uf("label-chat-settings-button");
                btn2.F9(btn2.fU(), w9Array[next]);
                w9Array[next].oY(30, 30);

                v8.X20(v7.hb(new le0_2[]{label1, btn1, label2, btn2}));
                v3_group.X20(v7.C7(new le0_2[]{label1, btn1}).Ze0().LPt3(new le0_2[]{label2, btn2}));
            } else {
                label1.uf("label-chat-settings-title");
                le0_2 btn1 = new le0_2(null, false);
                btn1.uf("label-chat-settings-button");
                btn1.F9(btn1.fU(), w9Array[i]);
                w9Array[i].oY(30, 30);

                v8.X20(v7.hb(new le0_2[]{label1, btn1}));
                v3_group.X20(v7.C7(new le0_2[]{label1, btn1}));
            }
        }

        xe_1 btnSave = new xe_1((v1 == null) ? sm0_0.c0(1536) : sm0_0.c0(1537));
        btnSave.RR(() -> B6(v4, zoArray, w9Array, v1));
        v8.Kn0(btnSave);
        v3_group.Kn0(btnSave);

        if (v1 != null) {
            xe_1 btnDelete = new xe_1(sm0_0.c0(1538));
            btnDelete.RR(() -> Ha(v1));
            v8.Kn0(btnDelete);
            v3_group.Kn0(btnDelete);
        }

        v7.x40(v8);
        v7.WQ(v3_group);
        v2.WQ(v2.hb(new le0_2[]{v7}));
        v2.x40(v2.C7(new le0_2[]{v7}));
        return v2;
    }

    public final void ij() {
        ArrayList arrayList = this.g60;
        int dummy = dw_2.ff;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb2.append(";");
                sb1.append(";");
            }
            HK hk = (HK) arrayList.get(i);
            sb1.append(hk.eC0);
            boolean first = true;
            for (Object obj : hk.d4) {
                zo_0 zo = (zo_0) obj;
                if (first) {
                    first = false;
                } else {
                    sb2.append(",");
                }
                sb2.append((int) zo.y80);
            }
        }
        dw_2.iL = sb1.toString();
        dw_2.yL = sb2.toString();
        dw_2.CY();
        BU bu = BU.T50;
        if (bu != null && bu.BK != null) {
            XH xh = bu.BK;
            xh.n6.clear();
            xh.n6.addAll(this.g60);
            xh.lL0();
            xh.ul0 = true;
            xh.OF = null;
            xh.Z30 = null;
        }
        BR br = tw0_0.rl;
        if (br != null) {
            br.qj0 = 0;
            br.Wv0 = 0;
            br.SJ(null, true);
            tw0_0.rl.da0();
        }
    }

    public final void Ha(HK v1) {
        this.g60.remove(v1);
        COm1(false);
        ij();
    }

    public final void B6(cg_0 v1, zo_0[] v2, W9[] v3, HK v4) {
        String text = ((wn0_0) v1.dI0).YA.toString();
        if (text.isEmpty() || text.contains(";")) {
            Qy0.yI0.dk(-1, sm0_0.c0(1539));
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < v2.length; i++) {
            if (!v3[i].ER.U20()) {
                hashSet.add(v2[i]);
            }
        }
        if (hashSet.size() == zo_0.JG.length) {
            return;
        }
        if (v4 == null) {
            HK hk = new HK(((wn0_0) v1.dI0).YA.toString(), hashSet);
            this.g60.add(hk);
            COm1(true);
            ij();
        } else {
            v4.eC0 = ((wn0_0) v1.dI0).YA.toString();
            v4.d4.clear();
            v4.d4.addAll(hashSet);
            COm1(false);
            ij();
        }
    }

    public final void o6(boolean selectLast) {
        this.E2.Qf.em();
        this.E2.ms0.em();
        this.E2.g6.clear();
        this.E2.bC = null;
        for (Iterator it = this.g60.iterator(); it.hasNext(); ) {
            HK hk = (HK) it.next();
            this.E2.Wq(VA0(hk), hk.eC0);
        }
        if (selectLast) {
            this.E2.Zd((com2__3) this.E2.g6.get(this.E2.g6.size() - 1));
        }
        this.E2.Wq(VA0(null), sm0_0.c0(1533));
    }
}
