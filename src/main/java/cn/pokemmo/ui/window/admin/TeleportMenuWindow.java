package cn.pokemmo.ui.window.admin;

import f.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * GM传送与热点传送菜单窗口
 *
 * 原混淆类: f.do_0
 */
public class TeleportMenuWindow extends cx_0 implements tr_1  {
    public static int fe;
    public final xn0_0 ye;
    public final P8 nt;

    public TeleportMenuWindow(xn0_0 owner) {
        super(tw0_0.kz0());
        nt = new P8();
        ff0(1);
        ye = owner;
        uf("tp-menu");
        Hy("Teleport Menu");
        owner.getClass();
        Pb0(owner::Sn0);
        if (tw0_0.rl.yn() <= 0) {
            throw null;
        }
        byte[] regions = N50.DD;
        for (int i = 0; i < 6; i++) {
            byte region = regions[i];
            tk0_0 grid = new tk0_0();
            lo0_0 scroll = new lo0_0(grid);
            String title = region == 10 ? "Hotspots" : N50.k10(region);
            com2__3 tab = nt.Wq(scroll, title);
            tab.Kj(() -> Kk0(tab));
            List<le0_2> entries = sL(region);
            int column = 0;
            for (le0_2 entry : entries) {
                if (entry == null) {
                    continue;
                }
                if (entry instanceof cn_0) {
                    column = 0;
                    grid.Nu();
                    grid.SL(entry);
                    grid.Nu();
                } else if (entry instanceof xe_1) {
                    grid.SL(entry);
                    column++;
                    if (column % 4 == 0) {
                        grid.Nu();
                    }
                }
            }
        }
        com2__3 direction = nt.Wq(new le0_2(), "Direction TP");
        direction.Kj(this::t30);
        direction.Kj(owner::gl0);
        SL(nt);
        nt.V00(fe);
    }

    public static void Gv0(byte region, short map, short x, short y, byte height, boolean noGrid) {
        BR client = tw0_0.rl;
        String command = new StringBuilder("//moveto2 ").append(region).append(" ").append(map)
                .append(" ").append(x).append(" ").append(y).append(" ").append(height)
                .append(" ").append(noGrid).toString();
        client.getClass();
        client.Cp(zo_0.Pk, command, "", true);
    }

    public static void cp0(short map, short x, short y, byte height) {
        BR client = tw0_0.rl;
        String command = new StringBuilder("//moveto2 10 ").append(map).append(" ").append(x)
                .append(" ").append(y).append(" ").append(height).toString();
        client.getClass();
        client.Cp(zo_0.Pk, command, "", true);
    }

    public static void D20(byte region, byte group, byte map, short x, short y) {
        BR client = tw0_0.rl;
        String command = new StringBuilder("//moveto ").append(region).append(" ").append(group)
                .append(" ").append(map).append(" ").append(x).append(" ").append(y).toString();
        client.getClass();
        client.Cp(zo_0.Pk, command, "", true);
    }

    public static void j5(byte region, byte group, byte map, short x, short y) {
        BR client = tw0_0.rl;
        String command = new StringBuilder("//moveto ").append(region).append(" ").append(group)
                .append(" ").append(map).append(" ").append(x).append(" ").append(y).toString();
        client.getClass();
        client.Cp(zo_0.Pk, command, "", true);
    }

    @Override
    public final void HP(zk0_1 context) {
        super.HP(context);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
        } else {
            E40(tw0_0.LD0.ew0() / 2 - Mx / 2, tw0_0.LD0.Hv0() / 2 - OB / 2);
        }
        super.K8();
    }

    @Override
    public final void lt0() {
        if (tw0_0.kz0()) {
            E40(0, 0);
            oY(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
        } else {
            super.lt0();
        }
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            int key = event.finally$;
            rp_0 binding = rp_0.nK0;
            int initialization = dw_2.ff;
            if (binding != null && binding.Ov(key)) {
                ye.Sn0();
                return true;
            }
        }
        return super.nd0(event);
    }

    public final void x00() {
        lpt6__0.v90(this);
    }

    public final List<le0_2> sL(byte region) {
        if (!tw0_0.Ll0.cOM4(region)) {
            return Collections.emptyList();
        }
        if (region == 0) {
            List<le0_2> entries = new ArrayList<>();
            String title = new StringBuilder().append(N50.k10((byte) 0)).append(" Pt1").toString();
            cn_0 label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 0, (short) 11, (short) 9, 140000));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 1, (short) 26, (short) 27, 140001));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 2, (short) 17, (short) 26, 140002));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 3, (short) 22, (short) 20, 140003));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 28, (short) 7, (short) 42, 140022));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 4, (short) 6, (short) 6, 140004));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 5, (short) 15, (short) 7, 140005));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 6, (short) 48, (short) 12, 140006));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 7, (short) 25, (short) 32, 140007));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 10, (short) 33, (short) 31, 140010));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 8, (short) 14, (short) 12, 140008));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 9, (short) 11, (short) 7, 140009));
            title = new StringBuilder().append(N50.k10((byte) 0)).append(" Pt2").toString();
            label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 12, (short) 14, (short) 6, 140055));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 13, (short) 21, (short) 8, 140056));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 14, (short) 14, (short) 28, 140057));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 15, (short) 18, (short) 21, 140058));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 16, (short) 18, (short) 7, 140059));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 18, (short) 11, (short) 12, 140061));
            entries.add(Ch0((byte) 0, (byte) 3, (byte) 17, (short) 12, (short) 4, 140060));
            entries.add(Ch0((byte) 0, (byte) 2, (byte) 0, (short) 9, (short) 9, 140086));
            entries.add(Ch0((byte) 0, (byte) 2, (byte) 56, (short) 15, (short) 13, 140099));
            entries.add(Ch0((byte) 0, (byte) 2, (byte) 10, (short) 9, (short) 11, 140091));
            return entries;
        }
        if (region == 1) {
            List<le0_2> entries = new ArrayList<>();
            String title = N50.k10((byte) 1);
            cn_0 label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 9, (short) 9, (short) 10, 141000));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 0, (short) 20, (short) 17, 141007));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 1, (short) 19, (short) 20, 141008));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 2, (short) 22, (short) 6, 141009));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 3, (short) 16, (short) 39, 141010));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 4, (short) 5, (short) 7, 141011));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 5, (short) 24, (short) 15, 141012));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 6, (short) 28, (short) 17, 141013));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 7, (short) 43, (short) 32, 141014));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 8, (short) 18, (short) 6, 141015));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 10, (short) 6, (short) 17, 141001));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 11, (short) 2, (short) 11, 141002));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 12, (short) 9, (short) 7, 141003));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 13, (short) 14, (short) 8, 141004));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 14, (short) 16, (short) 4, 141005));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 15, (short) 8, (short) 16, 141006));
            entries.add(Ch0((byte) 1, (byte) 74, (byte) 78, (short) 14, (short) 6, 141085));
            label = new cn_0(null, 0);
            label.Sk("Instances");
            entries.add(label);
            entries.add(Ch0((byte) 1, (byte) 76, (byte) 4, (short) 26, (short) 43, 141058));
            entries.add(Ch0((byte) 1, (byte) 76, (byte) 60, (short) 9, (short) 13, 141212));
            entries.add(fG());
            label = new cn_0(null, 0);
            label.Sk("Islands");
            entries.add(label);
            entries.add(Ch0((byte) 1, (byte) 76, (byte) 56, (short) 13, (short) 38, 141201));
            entries.add(Ch0((byte) 1, (byte) 76, (byte) 9, (short) 13, (short) 22, 141073));
            entries.add(Ch0((byte) 1, (byte) 76, (byte) 58, (short) 15, (short) 12, 141200));
            entries.add(Ch0((byte) 1, (byte) 76, (byte) 66, (short) 10, (short) 11, 141211));
            label = new cn_0(null, 0);
            label.Sk("Berries");
            entries.add(label);
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 19, (short) 8, (short) 22, 141019));
            entries.add(Ch0((byte) 1, (byte) 50, (byte) 38, (short) 14, (short) 7, 141038));
            return entries;
        }
        if (region == 2) {
            List<le0_2> entries = new ArrayList<>();
            String title = N50.k10((byte) 2);
            cn_0 label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            ug_0[] maps = (ug_0[]) tw0_0.Ll0.Qz0.Pq.Sx0;
            for (ug_0 map : maps) {
                int x = map.zc0;
                if (x == 0 || map.Va0 != 0) {
                    continue;
                }
                int y = map.Ph0;
                short id = map.O60;
                switch (id) {
                    case 205: x = 180; y = 147; break;
                    case 235: x = 298; y = 757; break;
                    case 238: x = 725; y = 715; break;
                    case 319: x = 756; y = 648; break;
                    case 345: x = 203; y = 183; break;
                    case 348: x = 358; y = 175; break;
                    case 355: x = 434; y = 120; break;
                    case 365: x = 463; y = 175; break;
                    case 368: x = 592; y = 175; break;
                    case 370: x = 675; y = 204; break;
                    case 374: x = 710; y = 362; break;
                    case 383: x = 478; y = 442; break;
                    default: break;
                }
                entries.add(Uk0((byte) 2, id, (short) x, (short) y, (byte) 0, false));
            }
            entries.add(Uk0((byte) 2, (short) 0, (short) 43, (short) 39, (byte) 0, false));
            entries.add(Uk0((byte) 2, (short) 295, (short) 43, (short) 39, (byte) 0, false));
            title = new StringBuilder().append(N50.k10((byte) 2)).append(" Nogrid Maps").toString();
            label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            maps = (ug_0[]) tw0_0.Ll0.Qz0.Pq.Sx0;
            for (ug_0 map : maps) {
                tw0_0.Ll0.Qz0.getClass();
                if (wg_0.Hm0((byte) 2, map.O60) < 0) {
                    continue;
                }
                short id = map.O60;
                byte height = (byte) (id == 28 ? 2 : 0);
                entries.add(Uk0((byte) 2, id, (short) 0, (short) 0, height, true));
            }
            return entries;
        }
        if (region == 3) {
            List<le0_2> entries = new ArrayList<>();
            String title = N50.k10((byte) 3);
            cn_0 label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            entries.add(Uk0((byte) 3, (short) 411, (short) 116, (short) 886, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 418, (short) 177, (short) 843, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 426, (short) 176, (short) 667, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 433, (short) 566, (short) 657, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 442, (short) 472, (short) 539, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 3, (short) 180, (short) 777, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 33, (short) 58, (short) 723, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 45, (short) 303, (short) 757, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 65, (short) 305, (short) 531, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 86, (short) 465, (short) 698, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 120, (short) 600, (short) 816, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 132, (short) 717, (short) 612, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 150, (short) 860, (short) 785, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 165, (short) 379, (short) 234, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 244, (short) 15, (short) 78, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 172, (short) 847, (short) 560, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 573, (short) 55, (short) 40, (byte) 0, false));
            title = sm0_0.c0(143112);
            label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            entries.add(Uk0((byte) 3, (short) 188, (short) 647, (short) 430, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 450, (short) 659, (short) 339, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 457, (short) 802, (short) 473, (byte) 0, false));
            entries.add(Uk0((byte) 3, (short) 392, (short) 306, (short) 910, (byte) 0, false));
            return entries;
        }
        if (region == 4) {
            List<le0_2> entries = new ArrayList<>();
            String title = N50.k10((byte) 4);
            cn_0 label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            entries.add(Uk0((byte) 4, (short) 60, (short) 695, (short) 397, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 67, (short) 564, (short) 392, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 73, (short) 497, (short) 272, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 74, (short) 410, (short) 461, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 75, (short) 187, (short) 370, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 76, (short) 352, (short) 369, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 77, (short) 272, (short) 258, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 78, (short) 397, (short) 184, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 87, (short) 534, (short) 184, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 88, (short) 536, (short) 90, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 89, (short) 674, (short) 177, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 90, (short) 820, (short) 266, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 174, (short) 82, (short) 303, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 411, (short) 8, (short) 15, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 280, (short) 42, (short) 23, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 30, (short) 909, (short) 297, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 36, (short) 468, (short) 419, (byte) 0, false));
            title = new StringBuilder().append(N50.k10((byte) 4)).append("2").toString();
            label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            entries.add(Uk0((byte) 4, (short) 49, (short) 1033, (short) 364, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 50, (short) 1032, (short) 263, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 51, (short) 1048, (short) 107, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 52, (short) 1309, (short) 132, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 53, (short) 1418, (short) 235, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 54, (short) 1297, (short) 295, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 55, (short) 1231, (short) 238, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 56, (short) 1209, (short) 440, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 57, (short) 1039, (short) 503, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 58, (short) 912, (short) 201, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 59, (short) 1294, (short) 243, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 11, (short) 1167, (short) 107, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 18, (short) 1426, (short) 164, (byte) 0, false));
            label = new cn_0(null, 0);
            label.Sk("Instances");
            entries.add(label);
            entries.add(Uk0((byte) 4, (short) 340, (short) 15, (short) 19, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 465, (short) 30, (short) 16, (byte) 0, false));
            entries.add(Uk0((byte) 4, (short) 102, (short) 25, (short) 3, (byte) 0, false));
            return entries;
        }
        if (region == 10) {
            List<le0_2> entries = new ArrayList<>();
            if (tw0_0.Ll0.cOM4((byte) 0)) {
                String title = N50.k10((byte) 0);
                cn_0 label = new cn_0(null, 0);
                label.Sk(title);
                entries.add(label);
                entries.add(Ch0((byte) 0, (byte) 3, (byte) 23, (short) 24, (short) 2, 140017));
                entries.add(Ch0((byte) 0, (byte) 1, (byte) 63, (short) 36, (short) 17, 140048));
                entries.add(Ch0((byte) 0, (byte) 3, (byte) 45, (short) 14, (short) 112, 140062));
            }
            if (tw0_0.Ll0.cOM4((byte) 4)) {
                String title = N50.k10((byte) 4);
                cn_0 label = new cn_0(null, 0);
                label.Sk(title);
                entries.add(label);
                entries.add(Uk0((byte) 4, (short) 151, (short) 131, (short) 369, (byte) 0, false));
            }
            if (tw0_0.Ll0.cOM4((byte) 1)) {
                String title = N50.k10((byte) 1);
                cn_0 label = new cn_0(null, 0);
                label.Sk(title);
                entries.add(label);
                entries.add(Ch0((byte) 1, (byte) 74, (byte) 11, (short) 11, (short) 35, 141059));
                entries.add(Ch0((byte) 1, (byte) 74, (byte) 98, (short) 16, (short) 9, 141209));
                entries.add(Ch0((byte) 1, (byte) 76, (byte) 14, (short) 38, (short) 57, 141058));
            }
            if (tw0_0.Ll0.cOM4((byte) 3)) {
                String title = N50.k10((byte) 3);
                cn_0 label = new cn_0(null, 0);
                label.Sk(title);
                entries.add(label);
                entries.add(Uk0((byte) 3, (short) 356, (short) 563, (short) 688, (byte) 0, false));
            }
            String title = N50.k10((byte) 2);
            cn_0 label = new cn_0(null, 0);
            label.Sk(title);
            entries.add(label);
            entries.add(Uk0((byte) 2, (short) 240, (short) 773, (short) 302, (byte) 0, false));
            entries.add(Uk0((byte) 2, (short) 368, (short) 624, (short) 185, (byte) 0, false));
            entries.add(Uk0((byte) 2, (short) 206, (short) 22, (short) 44, (byte) 0, false));
            entries.add(Uk0((byte) 2, (short) 232, (short) 33, (short) 25, (byte) 0, false));
            entries.add(Uk0((byte) 2, (short) 96, (short) 202, (short) 412, (byte) 0, false));
            entries.add(Uk0((byte) 2, (short) 215, (short) 10, (short) 38, (byte) 0, false));
            entries.add(Uk0((byte) 2, (short) 182, (short) 16, (short) 12, (byte) 0, false));
            entries.add(Uk0((byte) 2, (short) 354, (short) 10, (short) 23, (byte) 0, false));
            label = new cn_0(null, 0);
            label.Sk("Custom Maps");
            entries.add(label);
            entries.add(Qu());
            return entries;
        }
        return Collections.emptyList();
    }

    public final xe_1 Ch0(byte region, byte group, byte map, short x, short y, int name) {
        xe_1 button = new xe_1(sm0_0.c0(name));
        button.RR(() -> j5(region, group, map, x, y));
        if (tw0_0.kz0()) {
            button.RR(ye::Sn0);
        }
        return button;
    }

    public final xe_1 fG() {
        xe_1 button = new xe_1("CONTEST HALL");
        button.RR(() -> D20((byte) 1, (byte) 63, (byte) 4, (short) 14, (short) 6));
        if (tw0_0.kz0()) {
            button.RR(ye::Sn0);
        }
        return button;
    }

    public final xe_1 Qu() {
        xe_1 button = new xe_1("Tournament Arena");
        button.RR(() -> cp0((short) 1, (short) 28, (short) 64, (byte) 0));
        if (tw0_0.kz0()) {
            button.RR(ye::Sn0);
        }
        return button;
    }

    public final xe_1 Uk0(byte region, short id, short x, short y, byte height, boolean noGrid) {
        Z50 map = null;
        if (region == 4) {
            UY data = tw0_0.Ll0.t1;
            if (data == null) {
                return null;
            }
            map = (Ao0) data.Za0.Sx0[id];
        } else if (region == 3) {
            Ts data = tw0_0.Ll0.nC0;
            if (data == null) {
                return null;
            }
            map = data.na(id);
        } else if (region == 2) {
            map = (ug_0) tw0_0.Ll0.Qz0.Pq.Sx0[id];
        }
        if (map == null) {
            return null;
        }
        xe_1 button = new xe_1(map.getName());
        button.RR(() -> Gv0(region, id, x, y, height, noGrid));
        if (tw0_0.kz0()) {
            button.RR(ye::Sn0);
        }
        return button;
    }

    public final void t30() {
        nt.V00(fe);
    }

    public final void Kk0(com2__3 tab) {
        P8 tabs = nt;
        fe = tabs.g6.isEmpty() ? -1 : tabs.g6.indexOf(tab);
    }
}
