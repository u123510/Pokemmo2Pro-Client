package cn.pokemmo.ui.window.admin;

import f.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

/**
 * NPC编辑器与自定义生成工具窗口
 *
 * 原混淆类: f.uk_0
 */
public class NpcToolWindow extends R90 {
    public static final Wr[] HZ = new Wr[0];
    public static final byte[] rI = {0, 1, 2, 3, 4, 10};
    public final gp_1 Lpt8;
    public final A40 Q;
    public final X6 LK0;
    public final X6 ol0;
    public final X6 Yy;
    public final Aj o5;
    public final Aj pb;
    public final Mm Ii0;
    public final Gh0 Mg;
    public final cg_0 Oy0;
    public final Aj l0;
    public final Gh0 JJ;
    public final Aj aD0;
    public final Gh0 x00;
    public final W9 xB;
    public final W9 ln0;
    public final Ay0 JB0;
    public final W9 qY;
    public final Aj L0;
    public final Aj COm9;
    public final X6 JJ0;
    public final S70 eM;
    public Ou0 fn0;
    public byte jS = -1;
    public byte xH = -1;
    public boolean nu0;
    public Wr[] T8 = HZ;
    public final pg0_2 Fx0 = new pg0_2();
    public final ni0_2 Xt0;
    public cf_2 FT = new cf_2();
    public final pg0_2 wK0 = new pg0_2();
    public final ni0_2 kd0;
    public byte[] Ne0;

    public NpcToolWindow() {
        Lpt8 = new gp_1();
        Lpt8.GI0(sg_1.u80);
        M50();
        Q = new A40();
        tk0_0 form = new tk0_0(Q);
        form.mz0();
        ((A40) Q.uc()).X0();
        ff0(1);
        uf("adminframe");
        Hy("NPC 工具");
        Pb0(this::ib0);
        eM = new S70();
        eM.oY(128, 128);
        eM.JH().dA(3.0F);
        eM.JH().Gy0(0, 32);
        pg0_2 regions = new pg0_2();
        for (int i = 0; i < 6; i++) {
            byte region = rI[i];
            regions.Ii(region == 10 ? "自定义" : N50.k10(region));
        }
        LK0 = new X6(regions);
        LK0.Bd(0);
        LK0.Rm0(this::XL0);
        ol0 = new X6(regions);
        ol0.Bd(yd());
        ol0.pw0(false);
        Yy = new X6(new pg0_2((Object[]) tu_0.values()));
        Yy.Rm0(this::No);
        o5 = new Aj(0, 10000, 0);
        Gh0 sprite = new Gh0(o5);
        o5.Kj(() -> Rm(sprite));
        L0 = new Aj(0, 4, 0);
        Gh0 leashX = new Gh0(L0);
        COm9 = new Aj(0, 4, 0);
        Gh0 leashY = new Gh0(COm9);
        Oy0 = new cg_0();
        Oy0.mm("0");
        l0 = new Aj(-1, 65535, -1);
        JJ = new Gh0(l0);
        aD0 = new Aj(-1, 65535, -1);
        x00 = new Gh0(aD0);
        pb = new Aj(0, 50, 0);
        Mg = new Gh0(pb);
        o5.Kj(this::XL0);
        pb.Kj(this::ix);
        JJ0 = new X6();
        xB = new W9();
        xB.k50(false);
        ln0 = new W9();
        ln0.k50(false);
        JB0 = new Ay0(new df0_2());
        JB0.Zb0(1.0F);
        qY = new W9();
        qY.k50(false);
        Q.yu0(0).Wa0();
        Q.yu0(1).Yt();
        row("当前地区 ID: ", ol0).Wa0().im0();
        row("事件 ID: ", Yy).Wa0().im0();
        row("精灵图地区 ID: ", LK0).Wa0().im0();
        row("精灵图 ID: ", sprite).Wa0().im0();
        row("帧 ID (仅预览): ", Mg).Wa0().im0();
        row("移动类型", JJ0).Pt(300.0F).Wa0().im0();
        row("移动范围 X (拴绳)", leashX).Wa0().im0();
        row("移动范围 Y (拴绳)", leashY).Wa0().im0();
        row("脚本偏移量", Oy0).Wa0().im0();
        row("标志位 ID", JJ).Wa0().im0();
        row("标志值", x00).Wa0().im0();
        row("闪烁特效", ln0).Wa0().im0();
        row("精灵图缩放覆盖", JB0).Wa0().im0();
        row("更新已有 NPC", xB).Wa0().im0();
        row("忽略重复检查", qY).Wa0().im0();

        Xt0 = new ni0_2(Fx0);
        tk0_0 conditions = new tk0_0();
        conditions.mz0();
        xe_1 addCondition = new xe_1("+");
        xe_1 removeCondition = uz0_0.nJ(addCondition, this::nL0, "-");
        removeCondition.RR(this::aw);
        conditions.gg0.vx0(Xt0).ae0(2).pJ0().im0()
                .yi0(removeCondition).goto$().yi0(addCondition).goto$();
        row("触发条件", conditions).dw0().Wa0().im0();
        kd0 = new ni0_2(wK0);
        kd0.mJ0(value -> b50((jr_0) value));
        tk0_0 presets = new tk0_0();
        presets.mz0();
        xe_1 addPreset = new xe_1("+");
        xe_1 removePreset = uz0_0.nJ(addPreset, this::r0, "-");
        removePreset.RR(this::Fz);
        presets.gg0.vx0(kd0).Pt(200.0F).ae0(2).pJ0().im0()
                .yi0(removePreset).goto$().yi0(addPreset).goto$();
        tk0_0 actions = new tk0_0();
        actions.mz0();
        xe_1 copy = new xe_1("复制");
        xe_1 spawn = uz0_0.nJ(copy, uk_0::aS, "生成");
        xe_1 delete = uz0_0.nJ(spawn, this::vl0, "删除");
        delete.RR(uk_0::t7);
        actions.gg0.vx0(copy).yi0(delete).yi0(spawn).goto$();
        Q.vx0(actions).Yt().ae0(2);
        tk0_0 layout = new tk0_0();
        layout.mz0();
        layout.gg0.vx0(form).dw0().ae0(2).im0();
        layout.gg0.vx0(presets).p20().NA().yi0(eM).Yt().ru().Yx();
        SL(layout);
        Ii0 = new Mm(eM, tw0_0.e60.at());
        XL0();
    }

    private j1_0 row(String label, le0_2 control) {
        return Q.vx0(new cn_0(label)).yi0(control);
    }

    public static void t7() {
        BR commands = tw0_0.rl;
        commands.getClass();
        commands.Cp(zo_0.Pk, "//eventdeletenpc", "", true);
    }

    public static void aS() {
        BR commands = tw0_0.rl;
        commands.getClass();
        commands.Cp(zo_0.Pk, "//eventnpccopy", "", true);
    }

    public static void yh(Gh0 value, cn_0 label) {
        try {
            byte id = (byte) value.eB0;
            ys_1 parsed;
            if (id == -1) {
                ys_1 ignored = ys_1.uR;
                parsed = null;
            } else {
                parsed = (ys_1) t_0.BI0(ys_1.Com3.BM(id), ys_1.class, id);
            }
            label.Sk(new StringBuilder("参数值: ").append(parsed).toString());
        } catch (Exception error) {
            label.Sk("参数值解析错误");
        }
    }

    public static byte yd() {
        byte region = tw0_0.e60.Com4;
        for (byte i = 0; i < 6; i++) {
            if (rI[i] == region) return i;
        }
        return -1;
    }

    public final void Dw0(zk0_1 context) {
        super.Dw0(context);
        if (o5.cx0 == 0 && Yy.Vh0() == tu_0.M4) {
            Ii0.eQ((byte) pb.cx0, 0, 0);
        }
    }

    public final void aUX(zk0_1 context) {
        super.aUX(context);
        if (fn0 == null) return;
        jn_0 graphics = tw0_0.LD0;
        ui_1 batch = graphics.j20;
        jy_1 viewport = graphics.aj;
        batch.end();
        eh_2 renderer = tw0_0.LD0.K10;
        BJ0 camera = tw0_0.LD0.U1;
        ql_0 bounds = new ql_0(eM.A20, eM.SB0, eM.Mx, eM.OB);
        camera.Wu0 = 0.1F;
        camera.Q30 = -20.0F;
        camera.d00 = 0.0F;
        camera.Ui = bounds.IA;
        camera.yG = bounds.Eu0;
        camera.Rg0 = 1.0F;
        camera.nz0(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ql_0 clip = new ql_0();
        viewport.vE0(batch.jP, bounds, clip);
        PH.Sj(clip);
        if (!tw0_0.kz0()) {
            int x = (int) (bounds.j80 / tw0_0.LD0.Ew);
            float y = tw0_0.LD0.Hv0() - bounds.Wm0;
            float height = bounds.Eu0;
            float scale = tw0_0.LD0.Ew;
            int bottom = (int) ((y - height) / scale);
            int width = (int) (bounds.IA / scale);
            int h = (int) (height / scale);
            CI0.r40(x, bottom, width, h);
        }
        camera.ye(true);
        renderer.jK(camera);
        fn0.v3(0.0F, lg_0.S4.uL);
        renderer.eo0(fn0);
        renderer.end();
        batch.W30();
        PH.eF();
        ((qq_0) Em0.AK).va.kF(false);
    }

    public final void ND(byte event, short flagId, short flagValue, short sprite, byte region,
                         int script, boolean sparkles, boolean ignoreDuplicates, byte movement,
                         byte leashX, byte leashY, byte[] conditions, byte[] values) {
        nu0 = true;
        Yy.hK((tu_0) t_0.BI0(tu_0.MR.BM(event), tu_0.class, event));
        l0.X90(flagId);
        aD0.X90(flagValue);
        for (int i = 0; i < 6; i++) {
            if (rI[i] == region) LK0.Bd(i);
        }
        o5.X90(sprite);
        Oy0.Gv(new StringBuilder().append(script).append("").toString());
        ln0.ER.lK0(sparkles);
        qY.ER.lK0(ignoreDuplicates);
        for (int i = 0; i < Ne0.length; i++) {
            if (Ne0[i] == movement) JJ0.Bd(i);
        }
        L0.X90(leashX);
        COm9.X90(leashY);
        Fx0.w7.clear();
        Fx0.aD();
        for (int i = 0; i < conditions.length; i++) {
            ZJ0 condition = (ZJ0) ZJ0.Cz.BM(conditions[i]);
            Fx0.Ii(new YE(condition, values[i]));
        }
        nu0 = false;
    }

    public final void r0() {
        tk0_0 panel = new tk0_0(new A40());
        cg_0 name = new cg_0(null, new wn0_0());
        cn_0 label = new cn_0(null, 0);
        label.Sk("预设名称");
        j1_0 cell = panel.gg0.vx0(label).Rr0.vx0(name);
        cell.sn0 = new vl0_0(200.0F);
        cell.Rr0.Rg();
        Qy0 root = Qy0.yI0;
        lpt3__4 dialog = new lpt3__4(panel, () -> yc0(name), null, xX.Bm);
        root.F9(root.fU(), dialog);
    }

    public final void vl0() {
        if (Yy.Vh0() == null) {
            Qy0.yI0.dk(-1, "未选择事件类型");
            return;
        }
        StringBuilder command = new StringBuilder();
        if (((tu_0) Yy.Vh0()).OE0 < 0) {
            command.append("//spawnnpc ");
            command.append(o5.cx0).append(" ");
            command.append(((wn0_0) Oy0.dI0).YA.toString()).append(" ");
            command.append(rI[LK0.mu0.Mw0]).append(" ");
            command.append(Ne0[JJ0.mu0.Mw0]).append(" ");
            command.append(L0.cx0).append(" ");
            command.append(COm9.cx0).append(" ");
        } else {
            command.append("//eventspawnnpc ");
            command.append(((tu_0) Yy.Vh0()).OE0).append(" ");
            command.append(o5.cx0).append(" ");
            command.append(rI[LK0.mu0.Mw0]).append(" ");
            command.append(Ne0[JJ0.mu0.Mw0]).append(" ");
            command.append(L0.cx0).append(" ");
            command.append(COm9.cx0).append(" ");
            command.append(((wn0_0) Oy0.dI0).YA.toString()).append(" ");
            command.append(l0.cx0).append(" ");
            command.append(aD0.cx0).append(" ");
            command.append(xB.ER.U20()).append(" ");
            command.append(ln0.ER.U20()).append(" ");
            command.append(qY.ER.U20()).append(" ");
            command.append(JB0.X4).append(" ");
            command.append(Fx0.w7.size());
            for (int i = 0; i < Fx0.w7.size(); i++) {
                YE condition = (YE) Fx0.w7.get(i);
                command.append(" ").append(condition.S00.fj0).append(" ").append(condition.kd0);
            }
        }
        BR commands = tw0_0.rl;
        String text = command.toString();
        commands.getClass();
        commands.Cp(zo_0.Pk, text, "", true);
    }

    public final void M50() {
        lg_0.I70.getClass();
        VE file = new VE("./cache/npc.presets", zv_1.kE);
        if (!file.os0()) return;
        Y1 parser = new Y1();
        InputStream stream = file.uf0();
        InputStreamReader reader;
        try {
            reader = new InputStreamReader(stream, "UTF-8");
        } catch (Exception error) {
            throw new WC0("Error reading stream.", error);
        }
        oe_0 document = parser.D30(reader);
        FT = new cf_2();
        for (tu_0 event : tu_0.Rt0) {
            oe_0 entry = document.Is(event.name());
            FT.n3(event.OE0, Lpt8.b20(ArrayList.class, GJ0.class, entry));
        }
    }

    public final void XL0() {
        byte currentRegion = tw0_0.e60.Com4;
        if (jS != currentRegion) {
            jS = currentRegion;
            pg0_2 movements = new pg0_2();
            if (N50.Aa(jS)) {
                Ne0 = new byte[]{0, 1, 2, 3, 6, 8, 13, 14, 15, 16, 17, 18, 19, 20, 21,
                        22, 23, 24, 98, 99, 100};
                movements.Ii("无");
                movements.Ii("环顾四周");
                movements.Ii("四处走动");
                movements.Ii("上下走动");
                movements.Ii("左右走动");
                movements.Ii("朝南看");
                movements.Ii("上下看");
                movements.Ii("左右看");
                movements.Ii("左上看");
                movements.Ii("右上看");
                movements.Ii("左下看");
                movements.Ii("右下看");
                movements.Ii("上、下、左看");
                movements.Ii("上、下、右看");
                movements.Ii("上、左、右看");
                movements.Ii("下、左、右看");
                movements.Ii("逆时针环视");
                movements.Ii("顺时针环视");
                movements.Ii("自定义 南瓜王");
                movements.Ii("自定义 人魂/鬼火");
                movements.Ii("自定义 头目刷新点");
            } else {
                Ne0 = new byte[]{0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                        16, 17, 18, 19, 20, 121, 123, 124, 125, 126, 127};
                movements.Ii("无");
                movements.Ii("随机环顾四周");
                movements.Ii("随机四处走动至上限");
                movements.Ii("随机上下走动");
                movements.Ii("随机左右走动");
                movements.Ii("朝左上看");
                movements.Ii("朝右上看");
                movements.Ii("朝左下看");
                movements.Ii("朝右下看");
                movements.Ii("随机朝上、下、左看");
                movements.Ii("随机朝上、下、右看");
                movements.Ii("随机朝上、左、右看");
                movements.Ii("随机朝下、左、右看");
                movements.Ii("朝上看");
                movements.Ii("朝下看");
                movements.Ii("朝左看");
                movements.Ii("朝右看");
                movements.Ii("逆时针看");
                movements.Ii("顺时针看");
                movements.Ii("朝活动范围边界移动后返回");
                movements.Ii("自定义 0x79 头目刷新点");
                movements.Ii("自定义 0x7B");
                movements.Ii("自定义 0x7C");
                movements.Ii("自定义 0x7D");
                movements.Ii("自定义 0x7E");
                movements.Ii("自定义 南瓜王");
            }
            JJ0.r30(movements);
            JJ0.Bd(N50.Aa(jS) ? 0 : 14);
            ol0.Bd(yd());
        }
        byte region = rI[LK0.mu0.Mw0];
        short sprite = (short) o5.cx0;
        if (sprite == 0 && Yy.Vh0() == tu_0.M4) {
            eM.og.lo0();
            T8 = null;
            return;
        }
        UT.oV().getClass();
        boolean model = UT.Ce0(region, sprite);
        if (sprite >= 2000 && !model) sprite = (short) (sprite / 10);
        if (region == 0 || region == 1 || region == 10) {
            T8 = QI.Py.kN(region, sprite, false).z4();
            eM.og.Nk(T8);
        } else if (region == 2) {
            T8 = tw0_0.Ll0.Qz0.AF(sprite).TK;
            eM.og.Nk(T8);
        } else if (region == 4) {
            UY sprites = tw0_0.Ll0.t1;
            T8 = !sprites.Gt.bL0(sprite) ? null : (Wr[]) sprites.GY.f5(sprites.Gt.f5(sprite));
            eM.og.Nk(T8);
        } else {
            Ts sprites = tw0_0.Ll0.nC0;
            if (sprites != null) {
                T8 = sprites.f80(sprite);
                eM.og.Nk(T8);
            }
        }
        if (region == 10 && sprite >= 2000) {
            UT.oV().getClass();
            if (UT.Ce0(region, sprite)) {
                fn0 = UT.oV().jK(sprite);
            } else if (fn0 != null) {
                fn0.O4();
                fn0 = null;
            }
        } else if (fn0 != null) {
            fn0.O4();
            fn0 = null;
        }
        if (!nu0 && region != xH) {
            xH = region;
            if (region == 0 || region == 1) {
                pb.X90(0);
            } else if (region == 3 || region == 4) {
                pb.X90(11);
            } else if (region == 2) {
                pb.X90(3);
            } else if (region == 10) {
                o5.X90(201);
                pb.X90(0);
            } else {
                pb.X90(3);
            }
        }
        ix();
        Mg.pw0(T8 != null && T8.length > 0);
    }

    public final void ix() {
        Wr[] frames = T8;
        if (frames == null) return;
        Aj index = pb;
        int frame = index.cx0;
        if (frame >= frames.length) {
            index.X90(frames.length > 0 ? frames.length - 1 : 0);
            frame = pb.cx0;
        }
        frames = T8;
        if (frames != null && frames.length > 0) {
            eM.og.Nk(new Wr[]{frames[frame]});
        } else {
            eM.og.lo0();
        }
    }

    public final void yc0(cg_0 name) {
        if (Yy.Vh0() == null) {
            Qy0.yI0.dk(-1, "请先选择事件类型");
        }
        if (((wn0_0) name.dI0).YA.toString().isEmpty()) {
            Qy0.yI0.dk(-1, "名称不能为空。");
            return;
        }
        GJ0 preset = new GJ0();
        preset.c0 = ((wn0_0) name.dI0).YA.toString();
        int flag = l0.cx0;
        preset.xb = (short) flag;
        preset.IC0 = (short) flag;
        preset.CoM1 = (short) o5.cx0;
        preset.Qv = rI[LK0.mu0.Mw0];
        preset.xy0 = (byte) L0.cx0;
        preset.R10 = (byte) COm9.cx0;
        preset.cOn = Ne0[JJ0.mu0.Mw0];
        try {
            preset.O60 = Integer.parseInt(((wn0_0) Oy0.dI0).YA.toString());
        } catch (NumberFormatException error) {
            error.printStackTrace();
            Qy0.yI0.dk(-1, "脚本数字格式错误。");
            return;
        }
        preset.V80 = ln0.ER.U20();
        byte[] conditions = new byte[Fx0.w7.size()];
        byte[] values = new byte[Fx0.w7.size()];
        for (int i = 0; i < Fx0.w7.size(); i++) {
            YE condition = (YE) Fx0.w7.get(i);
            conditions[i] = condition.S00.fj0;
            values[i] = condition.kd0;
        }
        preset.iB0 = conditions;
        preset.nf = values;
        wK0.Ii(preset);
        ((ArrayList) FT.vC(((tu_0) Yy.Vh0()).OE0, null)).add(preset);
        ni0_2 selection = kd0;
        M30 entries = selection.KB;
        for (int i = 0; i < selection.zJ; i++) {
            if (entries.YS(i).equals(preset)) {
                selection.RK0(i, true, jr_0.J60);
                break;
            }
        }
        lg_0.I70.getClass();
        VE file = new VE("./cache/npc.presets", zv_1.kE);
        x9_0 writer = new x9_0(file.Fm(null));
        Lpt8.Zx(writer);
        Lpt8.cQ();
        for (tu_0 event : tu_0.Rt0) {
            Lpt8.A2(event.name(), FT.vC(event.OE0, null), ArrayList.class, GJ0.class);
        }
        Lpt8.d10();
        try {
            writer.close();
        } catch (IOException error) {
            throw new RuntimeException(error);
        }
    }

    public final void Fz() {
        int index = kd0.Mw0;
        if (index >= 0 && index < wK0.w7.size()) {
            wK0.Va(index);
            ArrayList list = (ArrayList) FT.vC(((tu_0) Yy.Vh0()).OE0, null);
            if (list != null && index < list.size()) {
                list.remove(index);
            }
        }
    }

    public final void b50(jr_0 event) {
        if (event != jr_0.r9) return;
        ni0_2 selection = kd0;
        int index = selection.Mw0;
        GJ0 preset = index == -1 || selection.KB == null ? null : (GJ0) selection.KB.YS(index);
        if (preset == null) return;
        byte type = -1;
        if (Yy.Vh0() != null) type = ((tu_0) Yy.Vh0()).OE0;
        ND(type, preset.xb, preset.IC0, preset.CoM1, preset.Qv, preset.O60,
                preset.V80, false, preset.cOn, preset.xy0, preset.R10, preset.iB0, preset.nf);
    }

    public final void aw() {
        int index = Xt0.Mw0;
        if (index >= 0 && index < Fx0.w7.size()) {
            Fx0.Va(index);
        }
    }

    public final void nL0() {
        tk0_0 panel = new tk0_0(new A40());
        Aj value = new Aj(0, 255, 0);
        Gh0 input = new Gh0(value);
        pg0_2 types = new pg0_2((Object[]) ZJ0.values());
        X6 condition = new X6();
        condition.r30(types);
        condition.Bd(0);
        condition.Rm0(this::XL0);
        cn_0 parsed = new cn_0(null, 0);
        parsed.Sk("");
        input.Da0(() -> yh(input, parsed));
        cn_0 conditionLabel = new cn_0(null, 0);
        conditionLabel.Sk("条件类型");
        j1_0 cell = panel.gg0.vx0(conditionLabel).Rr0.vx0(condition);
        cell.sn0 = new vl0_0(200.0F);
        cell.Rr0.Rg();
        cn_0 valueLabel = new cn_0(null, 0);
        valueLabel.Sk("参数值");
        panel.gg0.vx0(valueLabel).Rr0.vx0(input).Rr0.Rg();
        cell = panel.gg0.vx0(parsed);
        cell.jQ = new vl0_0(30.0F);
        cell.d80 = 2;
        Qy0 root = Qy0.yI0;
        lpt3__4 dialog = new lpt3__4(panel, () -> to(condition, input), null, xX.Bm);
        root.F9(root.fU(), dialog);
    }

    public final void to(X6 condition, Gh0 value) {
        Fx0.Ii(new YE((ZJ0) condition.Vh0(), (byte) value.eB0));
    }

    public final void Rm(Gh0 input) {
        int sprite = o5.cx0;
        input.tx = sprite >= 2000 && sprite < 4000 ? 10 : 1;
    }

    public final void No() {
        wK0.w7.clear();
        wK0.aD();
        kd0.RK0(-1, true, jr_0.J60);
        byte event = ((tu_0) Yy.Vh0()).OE0;
        if (FT.vC(event, null) == null) FT.n3(event, new ArrayList());
        pg0_2 entries = wK0;
        Collection presets = (Collection) FT.vC(event, null);
        int start = entries.w7.size();
        entries.w7.addAll(start, presets);
        entries.su(start, start + presets.size() - 1);
        boolean enabled = event > 0;
        JJ.pw0(enabled);
        x00.pw0(enabled);
        ln0.pw0(enabled);
        JB0.pw0(enabled);
        xB.pw0(enabled);
        qY.pw0(enabled);
        Xt0.pw0(enabled);
    }

    public final void ib0() {
        K20.u3(this);
    }
}
