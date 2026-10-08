package cn.pokemmo.ui.window.pokemon;

import f.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 箱子槽位与规则合规性悬浮预览窗口
 *
 * 原混淆类: f.tl_2
 */
public class BoxSlotPreviewWindow extends cx_0 implements tr_1  {
    public final tl_2 asBridge() {
        return (tl_2) (Object) this;
    }

    public final xe_1 bk0;

    public BoxSlotPreviewWindow(U v1) {
        super(tw0_0.kz0());
        Hy(sm0_0.c0(6713));
        uf("clause-failure");
        ff0(1);
        Pb0(this::close);
        bD(tw0_0.H30());
        yi_1 v2 = tw0_0.rl.Qu();
        tk0_0 v3 = new tk0_0();
        ArrayList list = new ArrayList();
        list.add(tw0_0.e60.za0());
        if (v2 != null) {
            Arrays.stream(v2.yJ())
                    .sorted(Comparator.comparing(si_0::GS))
                    .map(si_0::L7)
                    .filter(tl_2::Fy)
                    .forEach(list::add);
        }
        cn_0 v5 = new cn_0();
        v5.uf("label-blurb");
        if (list.size() > 1) {
            v5.Sk(sm0_0.c0(6712));
        } else {
            v5.Sk(sm0_0.c0(6711));
        }
        v3.gg0.vx0(v5).ae0(2).o(20.0f).Wa(8.0f);
        v3.Nu();
        int size = list.size();
        tk0_0[] v6 = new tk0_0[size];
        tk0_0[] v7 = new tk0_0[size];
        for (int i8 = 0; i8 < list.size(); i8++) {
            CH0 v9 = (CH0) list.get(i8);
            HashMap map = new HashMap();
            Kw0[] v12 = new Kw0[6];
            for (int i13 = 0; i13 < 6; i13++) {
                Kw0 kw = new Kw0();
                v12[i13] = kw;
                kw.uf("label-monster-slot");
            }
            cn_0 v13 = new cn_0();
            int scale = tw0_0.kz0() ? 2 : 1;
            int iconSize = scale * 48;
            OT ot;
            if (tw0_0.e60.za0().equals(v9)) {
                E90 e90 = tw0_0.e60.at();
                v13.Sk(e90.na0());
                ot = new OT(iconSize, iconSize, e90);
                Mj mj = tw0_0.rl.r1(_volatile.BV);
                if (mj != null) {
                    for (short s = 0; s < mj.vH0(); s = (short) (s + 1)) {
                        VU vu = mj.Ry0(s);
                        v12[s].Db(vu);
                        map.put(vu.ZK(), v12[s]);
                    }
                }
            } else if (v2 != null) {
                si_0 si = v2.EC0(v9);
                v13.Sk(si.GS());
                ot = new OT(iconSize, iconSize, si.vf0());
                ls_0[] ad = si.Ad();
                for (short s = 0; s < ad.length; s = (short) (s + 1)) {
                    ls_0 ls = ad[s];
                    v12[s].x8(ls.g8());
                    v12[s].Xr0(null);
                    map.put(ls.D9(), v12[s]);
                }
            } else {
                continue;
            }
            v1.W1().forEach((k, v) -> QH0(v12, map, (CH0) k, (List<lq0>) v));
            ot.VL0(scale * 2);
            ot.Te0(scale * -34, scale * -31);
            tk0_0 t1 = new tk0_0();
            v6[i8] = t1;
            t1.SL(ot);
            t1.Nu();
            t1.SL(v13);
            tk0_0 t2 = new tk0_0();
            v7[i8] = t2;
            for (int i = 0; i < 6; i++) {
                t2.gg0.vx0(v12[i]).Xs(4.0f);
            }
        }
        for (int i = 0; i < size; i++) {
            v3.gg0.vx0(v6[i]).Pt(120.0f).o(15.0f).Xs(14.0f);
            v3.gg0.vx0(v7[i]).o(15.0f);
            v3.Nu();
        }
        v3.gg0.Dr0(15.0f).qE0(15.0f);
        v3.gg0.qf(20.0f);
        xe_1 btn = new xe_1(sm0_0.c0(65));
        this.bk0 = btn;
        btn.RR(this::close);
        v3.gg0.vx0(new le0_2());
        v3.gg0.vx0(btn).GD();
        SL(v3);
        lpt6__0.v90(this);
    }

    public static void QH0(Kw0[] v0, HashMap v1, CH0 v2, List<lq0> v3) {
        String str = (String) v3.stream().map(lq0::B3).collect(Collectors.joining("\n"));
        ArrayList list = new ArrayList();
        if (v2.Sa == -1L) {
            Arrays.stream(v0).filter(kw -> goto$(v1, kw)).forEach(list::add);
        } else if (v1.containsKey(v2)) {
            list.add(v1.get(v2));
        }
        list.forEach(kw -> vw(str, (Kw0) kw));
    }

    public static void vw(String v0, Kw0 v1) {
        v1.uf("label-monster-violation");
        v1.Nj = () -> Yj0(v0);
        v1.yj0 = v0;
        v1.yB0();
        v1.GH0 = 0;
    }

    public static void Yj0(String v0) {
        Qy0.yI0.e80(v0, null);
    }

    public static boolean goto$(HashMap v0, Kw0 v1) {
        return !v0.containsValue(v1);
    }

    public static boolean Fy(CH0 v0) {
        return !tw0_0.e60.dj0.equals(v0);
    }

    @Override
    public final void x00() {
        lpt6__0.v90(this.bk0);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
        }
        super.K8();
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            rp_0 nK0 = rp_0.nK0;
            if (nK0 != null && nK0.Ov(key)) {
                BU bu = BU.T50;
                tl_2 it = bu.It;
                if (it != null) {
                    it.xe0();
                    bu.It = null;
                }
                return true;
            }
        }
        return super.nd0(v1);
    }

    public final void close() {
        BU bu = BU.T50;
        tl_2 it = bu.It;
        if (it != null) {
            it.xe0();
            bu.It = null;
        }
    }
}
