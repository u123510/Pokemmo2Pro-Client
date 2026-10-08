package cn.pokemmo.ui.window.admin;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.BufferUtils;
import f.*;
import java.util.HashMap;

/**
 * GM 管理面板与快捷浮动工具条 (GM Toolbox / Admin Floating Panel)
 * 
 * 职责:
 * 1. 悬浮在游戏界面左侧，为 GM / 开发者提供一键呼出各类管理窗口的便捷工具栏；
 * 2. 挂载各类 GM 功能入口（GM 菜单、玩家搜索、传送微件、综合搜索、静音切换、高延迟模拟、GC 内存回收等）；
 * 3. 实时显示底层调试信息（大世界坐标、地图编号、频道、碰撞权限、内存及网格句柄等）。
 * 
 * 原混淆类: f.xn0_0
 */

public class GmPanelWindow extends C0 implements tr_1 {
    public final xn0_0 asBridge() {
        return (xn0_0) (Object) this;
    }

    
    public final W9 NX;
    public final W9 cu;
    public final W9 Fk0;
    public final W9 Ze0;
    public final W9 continue$;
    public final W9 bI0;
    public H50 kT;
    public f90_0 Hf0;
    public n6_0 U8;
    public do_0 of0;
    public Lt0 xl;
    public Ax0 gU;
    public xb0_1 PP;
    public o40_0 dt0;
    public my0 Pg;
    public lpt9__0 ug0;
    public final cn_0 Ld0;
    public Ju0 nV;
    public sk0_2 ne0;
    public uk_0 Lt0;
    public final es_1 Zp0;
    public long BK;
    public LT cb0;

    public GmPanelWindow() {
        es_1 buttons = new es_1();
        Zp0 = buttons;
        cb0 = null;
        uf("gmpanel");
        cn_0 label = new cn_0("");
        Ld0 = label;
        label.uf("label-bg");
        SL(label);

        W9 tools = new W9("");
        NX = tools;
        tools.Xr0("GM 菜单");
        tools.Bb(50);
        tools.RR(new BD0(asBridge()));
        buttons.Ue0(tools);

        W9 player = new W9("");
        cu = player;
        player.Xr0("玩家搜索");
        player.Bb(50);
        player.RR(new vq_1(asBridge()));
        buttons.Ue0(player);

        W9 teleport = new W9("");
        Fk0 = teleport;
        teleport.Xr0("传送微件");
        teleport.Bb(50);
        teleport.RR(new nb0_2(asBridge()));
        buttons.Ue0(teleport);

        W9 search = new W9("");
        Ze0 = search;
        search.Xr0("综合搜索");
        search.Bb(50);
        search.RR(new du0_0(asBridge()));
        buttons.Ue0(search);

        W9 sound = new W9("");
        continue$ = sound;
        sound.Xr0("静音切换");
        sound.Bb(50);
        sound.RR(new rm_0(asBridge()));
        buttons.Ue0(sound);

        W9 ping = new W9("");
        bI0 = ping;
        ping.Xr0("高延迟模拟 (Australia)");
        ping.Bb(50);
        ping.RR(new eh0_0(asBridge()));
        buttons.Ue0(ping);

        xe_1 collect = new xe_1("");
        collect.Xr0("客户端内存回收 (GC)");
        collect.Bb(50);
        collect.RR(System::gc);
        buttons.Ue0(collect);
        tools.uf("button-tools");
        player.uf("button-player");
        teleport.uf("button-move");
        search.uf("button-search");
        sound.uf("button-sound");
        ping.uf("button-ping");
        collect.uf("button-gc");
        I2 iterator = buttons.ZD();
        while (iterator.hasNext()) {
            SL((xe_1) iterator.next());
        }
        Ll(false);
        Ld0.Ll(false);
        // singleton managed by subclass xn0_0
    }

    public final void lPt6() {
        if (!eE) {
            if (tw0_0.Eu(1)) {
                Ll(true);
            }
            return;
        }
        if (BK + 250000000L > System.nanoTime()) {
            return;
        }
        BK = System.nanoTime();
        yt_1 world = tw0_0.e60;
        E90 player = world.jB0;
        if (player == null) {
            return;
        }
        _else map = world.N60();
        if (map == null) {
            return;
        }
        LT position = player.ba0.LPt1();
        if (!Ld0.eE || cb0 == position) {
            return;
        }
        cb0 = position;
        StringBuilder text = new StringBuilder();
        Kr0 profiler = tw0_0.t30;
        if (profiler != null && profiler.t40) {
            text.append("\n\nProfiler\nCalls: ");
            text.append(tw0_0.t30.ax0.lf);
            text.append("\nDraw Calls: ").append(tw0_0.t30.ax0.B1);
            text.append("\nShader Switches: ").append(tw0_0.t30.ax0.BJ0);
            text.append("\nTexture Binds: ").append(tw0_0.t30.ax0.tA);
            text.append("\nVertex Count: ").append(tw0_0.t30.ax0.bH.LG).append("\n\n");
        }
        if (position != null) {
            text.append("Position: ").append(position.Tz()).append(" / ").append(position.HR())
                    .append(" Z: ").append(position.Es()).append("\n");
        } else {
            text.append("Position: ").append(position).append("\n");
        }
        if (N50.Fc(map.dw)) {
            text.append("Map: ").append(map.lm0).append(" / ").append(J4.p5(map.Bm0, map.case$))
                    .append(" Ch. ");
        } else {
            text.append("Map: ").append(map.lm0).append(" / ").append(map.Bm0).append(".")
                    .append(map.case$).append(" Ch. ");
        }
        text.append(map.A30 + 1).append("\nName: ").append(map.OE()).append(" \n\n");
        if (position instanceof lpt6__5) {
            lpt6__5 tile = (lpt6__5) position;
            text.append("Coordinate Height: ").append(tile.S80()).append("\nTerrain: ");
            text.append(kc_1.fu(tile.coM9(), false)).append("\nHeightRaw: ");
            text.append(kc_1.fu(tile.HM(), false)).append("\nBehavior ID: ");
            text.append(kc_1.fu(tile.eq0(), false)).append("\nMovement Perms: ");
            String permissions = Integer.toHexString((byte) tile.dH).toUpperCase();
            if (permissions.length() == 8 && permissions.startsWith("FFFFFF")) {
                permissions = permissions.substring(6);
            }
            while (permissions.length() < 2) {
                permissions = "0".concat(permissions);
            }
            text.append("0x".concat(permissions)).append("\n\nFooter ID: ");
            zb_0 footer = tile.SL0;
            Object footerId = footer == null ? "null" : Short.valueOf(footer.M2);
            text.append(footerId).append("\nFooter X: ");
            text.append(tile.op0).append(" Y: ").append(tile.ev0).append("\n");
        } else if (position instanceof go_0) {
            db0_2 tile = position.B3();
            if (tile != null) {
                for (int layer = 0; layer < 2; layer++) {
                    int index = 0;
                    for (vg_2 block : tile.Lw0[layer]) {
                        if (block == null) {
                            continue;
                        }
                        text.append(new StringBuilder("tileBlock[").append(layer).append("][")
                                .append(index).append("] ").append(block.E70 & 1023).append(" ")
                                .append(block.gs()).append("\n").toString());
                        index++;
                    }
                }
            }
            if (tile != null) {
                text.append("MapTile\n________________\nBG1 = ").append(tile.W7)
                        .append("\nBG2 = ").append(tile.Gn0)
                        .append("\nBeh1 = ").append(tile.oB)
                        .append("\nBeh2 = ").append(tile.wN)
                        .append("\nApp= ").append(position.xl0())
                        .append("\nHeight= ").append(position.Es())
                        .append("\n\nHeight= ").append(position.Es())
                        .append("\nHas Doors= ").append(tile.zC != null).append("\n");
            } else {
                text.append("MapTile\n________________\nBG1 = NULL\nBG2 = NULL\nBeh1 = NULL\nBeh2 = NULL\n");
            }
        }
        text.append(tw0_0.LD0.Sc.g80());
        text.append(new StringBuilder("\nManaged Resources: ").append(li_2.kp0.size()).toString());
        StringBuilder line = new StringBuilder("\n");
        HashMap initialization = ap0_0.d4;
        StringBuilder meshes = new StringBuilder("Managed meshes/app: { ");
        for (Object object : ap0_0.d4.keySet()) {
            du_2 app = (du_2) object;
            meshes.append(((es_1) ap0_0.d4.get(app)).KB);
            meshes.append(" ");
        }
        meshes.append("}");
        text.append(line.append(meshes.toString()).toString());
        text.append(new StringBuilder("\n").append(Texture.getManagedStatus()).toString());
        text.append(new StringBuilder("\n\nAllocated Unsafe Bytes: ").append(tx_1.QR((long) BufferUtils.Fd)).toString());
        int distinct = 0;
        int copies = 0;
        for (Object object : tw0_0.LD0.UA.D4.values()) {
            if (((zb0_2) (Y30) object).isCopy()) {
                copies++;
            } else {
                distinct++;
            }
        }
        text.append(new StringBuilder("\n\nFont Count Distinct: ").append(distinct)
                .append("\nFont Count Copies: ").append(copies).toString());
        Ld0.Sk(text.toString());
    }

    public final void SL(le0_2 child) {
        F9(fU(), child);
        if (child instanceof uk_0) {
            Lt0 = (uk_0) child;
        }
        child.lt0();
        int x = Mx / 2 - child.Mx / 2;
        int top = SB0 + y9;
        child.sy(x, kq_0.lpT2(k5(), child.OB, 2, top));
    }

    @Override
    public final boolean u3(le0_2 child) {
        if (child == kT) {
            kT = null;
        } else if (child == xl) {
            xl = null;
        } else if (child == Hf0) {
            Hf0 = null;
        } else if (child == U8) {
            U8 = null;
        } else if (child == gU) {
            gU = null;
        } else if (child != null) {
            if (child == Pg) {
                Pg = null;
            } else if (child == ug0) {
                ug0 = null;
            } else if (child == PP) {
                PP = null;
            } else if (child == Lt0) {
                Lt0 = null;
            } else if (child == ne0) {
                ne0 = null;
            } else if (child == dt0) {
                dt0 = null;
            }
        }
        if (super.u3(child)) {
            f00();
            return true;
        }
        return false;
    }

    @Override
    public final void K8() {
        oY(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
        Ld0.qF0(pa0_0.qQ);
        Ld0.E40(tw0_0.LD0.ew0() - (Math.max(200, Ld0.hr0()) + 60), 60);
        int headerHeight = BU.T50.AG0.OB;
        int x = tw0_0.kz0() ? 65 : 5;
        if (!tw0_0.kz0()) {
            for (int i = 0; i < Zp0.KB; i++) {
                xe_1 button = (xe_1) Zp0.get(i);
                button.lt0();
                button.E40(x, i * button.OB + headerHeight);
            }
        } else {
            for (int i = 0; i < Zp0.KB; i++) {
                xe_1 button = (xe_1) Zp0.get(i);
                button.RY(64, 64);
                button.oY(64, 64);
                button.lt0();
                int offset = 0;
                BU root = BU.T50;
                if (root.sC0 != null) {
                    offset = 100;
                }
                if (root.Iy != null) {
                    offset += 100;
                }
                pa0_0 alignment = pa0_0.dC0;
                int half = Zp0.KB / 2;
                int width = button.Mx;
                button.A20(alignment, width * i - half * width - offset, 0);
            }
        }
    }

    public final void qo() {
        if (of0 != null) {
            return;
        }
        Fk0.ER.lK0(true);
        do_0 dialog = new do_0(asBridge());
        of0 = dialog;
        BU.T50.SL(dialog);
    }

    public final void Sn0() {
        do_0 dialog = of0;
        if (dialog == null) {
            return;
        }
        BU.T50.u3(dialog);
        Fk0.ER.lK0(false);
        of0 = null;
    }

    public final void gl0() {
        if (dt0 != null) {
            return;
        }
        o40_0 dialog = new o40_0(asBridge());
        dt0 = dialog;
        SL(dialog);
    }

    public final void lp() {
        o40_0 dialog = dt0;
        if (dialog != null) {
            u3(dialog);
        }
    }

    public final void uZ() {
        if (Hf0 != null) {
            return;
        }
        f90_0 dialog = new f90_0(asBridge());
        Hf0 = dialog;
        SL(dialog);
    }

    public final void G20() {
        if (U8 != null) {
            return;
        }
        n6_0 dialog = new n6_0(asBridge());
        U8 = dialog;
        SL(dialog);
    }

    public final void uf() {
        if (gU != null) {
            return;
        }
        Ax0 dialog = new Ax0(asBridge());
        gU = dialog;
        SL(dialog);
    }

    public final void u4() {
        if (PP != null) {
            return;
        }
        xb0_1 dialog = new xb0_1(asBridge());
        PP = dialog;
        SL(dialog);
    }

    public final void vc() {
        if (xl != null) {
            return;
        }
        Lt0 dialog = new Lt0(asBridge());
        xl = dialog;
        SL(dialog);
    }

    public final void qp0() {
        if (ug0 == null) {
            lpt9__0 dialog = new lpt9__0(asBridge());
            ug0 = dialog;
            SL(dialog);
            lpt6__0.v90(ug0);
        }
    }

    public final void sf0() {
        String value = "";
        sk0_2 dialog = ne0;
        if (dialog != null) {
            dialog.E6.Gv(value);
        } else {
            dialog = new sk0_2(asBridge());
            ne0 = dialog;
            dialog.E6.Gv(value);
            SL(ne0);
        }
    }

    @Override
    public final boolean Of() {
        Ju0 dialog = nV;
        if (dialog != null && dialog.Of()) {
            return true;
        }
        return super.Of();
    }
}
