package cn.pokemmo.ui.window.admin;

import f.*;

import java.util.ArrayList;

/**
 * Shu GUI全局界面调试器窗口
 *
 * 原混淆类: f.Ft0
 */
public class GuiDebuggerWindow extends R90 {
    public boolean OK;
    public boolean CK0;

    public GuiDebuggerWindow() {
        super();
        this.OK = false;
        this.CK0 = false;

        fy_2 main = new fy_2();
        fy_2 hud = new fy_2();
        fy_2 animations = new fy_2();

        this.ff0(4);
        this.RY(720, 520);
        this.uf("adminframe");
        this.Hy("Shu GUI 全局调试器");
        this.Pb0(() -> this.xe0());

        animations.WQ(animations.lo0());
        animations.x40(animations.H10());

        P8 tabs = new P8();
        tabs.Wq(main, "常用主界面");
        tabs.Wq(hud, "交互与弹窗");
        tabs.Wq(animations, "全局动画测试");

        hud.WQ(hud.lo0());
        hud.x40(hud.H10());
        main.WQ(main.lo0());
        main.x40(main.H10());

        ArrayList<qj_2> interaction = new ArrayList<>();
        interaction.add(xc("生蛋/培育屋", Ft0::He0));
        interaction.add(xc("邮件系统", Ft0::Fj0));
        interaction.add(xc("玩家面对面交易", Ft0::w3));
        interaction.add(xc("秘密基地装修", Ft0::ac0));
        interaction.add(xc("角色改名卡", Ft0::AT));
        interaction.add(xc("游戏城金币机", Ft0::Us0));
        interaction.add(xc("霹雳电球翻牌机", Ft0::kY));
        interaction.add(xc("对战邀请测试", Ft0::e5));
        interaction.add(xc("好友申请测试", Ft0::cOM3));
        interaction.add(xc("公会邀请测试", Ft0::throw$));
        interaction.add(xc("交易申请测试", Ft0::lN));
        interaction.add(xc("连线申请测试", Ft0::R50));
        interaction.add(xc("交易申请(备用)", Ft0::O9));

        ArrayList<qj_2> utilities = new ArrayList<>();
        utilities.add(xc("宝可梦电脑箱子", Ft0::O2));
        utilities.add(xc("通用确认弹窗", this::jH0));
        utilities.add(xc("ROM管理界面", Ft0::eY));
        utilities.add(xc("全屏加载进度条", this::g5));
        utilities.add(xc("秘密基地退出交互", this::Ss0));
        utilities.add(xc("角色创建与捏脸", Ft0::Gl0));
        utilities.add(xc("角色造型时装店", Ft0::Gk));
        utilities.add(xc("招式回忆专家", Ft0::gD0));
        utilities.add(xc("阿露福遗迹拼图", Ft0::Ls0));
        utilities.add(xc("阿露福未知图腾字谜", Ft0::vn0));
        utilities.add(xc("游戏城老虎机", Ft0::J70));
        utilities.add(xc("注销登出", Ft0::o00));

        ArrayList<qj_2> starters = new ArrayList<>();
        starters.add(xc("破壳孵蛋动画", Ft0::Zh0));
        starters.add(xc("宝可梦进化动画", Ft0::oN));
        starters.add(xc("御三家 - 10周年自选", Ft0::MG0));
        starters.add(xc("初始御三家 - " + N50.k10((byte) 3), Ft0::F10));
        starters.add(xc("初始御三家 - " + N50.k10((byte) 4), Ft0::J90));
        starters.add(xc("初始御三家 - " + N50.k10((byte) 2), Ft0::R2));
        starters.add(xc("合众名人堂登入殿堂", Ft0::Zs0));
        starters.add(xc("名人堂展示(禁用Mod)", Ft0::WZ));
        starters.add(xc("秘传技能动画(HM)", Ft0::zc0));

        int[] screens = {6, 20, 45, 50, 51};
        for (int screen : screens) {
            starters.add(xc("全屏转场动画 - " + screen, () -> Om0(screen)));
        }

        ju0(main, utilities);
        ju0(hud, interaction);
        ju0(animations, starters);
        this.SL(tabs);
        this.lt0();
    }

    public static void Om0(int i0) {
        tw0_0.LD0.Uk0(new CX(i0, (short) 15, (short) 0));
    }

    public static void o00() {
        Qy0.yI0.kN();
    }

    public static void J70() {
        BU.T50.U0(true);
    }

    public static void gD0() {
        nl0_0 screen = nl0_0.Sg;
        VU selection = tw0_0.rl.r1(_volatile.BV).Ry0((short) 0);
        BU.T50.MJ(new short[]{1, 2, 3, 4}, screen, (byte) -1, selection);
    }

    public static void O2() {
        BU.T50.Yf("Test" + rg0_2.r4(100));
    }

    public static void zc0() {
        tw0_0.LD0.Uk0(new CX(3, (short) 15, (short) 0));
    }

    public static void WZ() {
        ys_2 panel = new ys_2((byte) 2);
        panel.FD = true;
        tw0_0.LD0.i20.Uk0(panel);
    }

    public static void Zs0() {
        tw0_0.LD0.i20.Uk0(new ys_2((byte) 2));
    }

    public static void R2() {
        tw0_0.LD0.S00((byte) -1, (byte) 2, false);
    }

    public static void J90() {
        tw0_0.LD0.S00((byte) -1, (byte) 4, false);
    }

    public static void F10() {
        tw0_0.LD0.S00((byte) -1, (byte) 3, false);
    }

    public static void MG0() {
        tw0_0.LD0.S00((byte) -1, (byte) 10, true);
    }

    public static void oN() {
        if (tw0_0.rl == null || tw0_0.rl.r1(_volatile.BV) == null) {
            return;
        }
        VU panel = tw0_0.rl.r1(_volatile.BV).Ry0((short) 0);
        if (panel == null) {
            zy0_0.CF0.Xt("背包首位必须有宝可梦才能测试进化动画。", "red");
            return;
        }
        ArrayList<P80> entries = panel.f60.Xn;
        panel.u60 = entries.isEmpty() ? (short) 1 : entries.get(0).YS;
        tw0_0.LD0.IK(panel, true);
    }

    public static void Zh0() {
        if (tw0_0.rl == null || tw0_0.rl.r1(_volatile.BV) == null) {
            return;
        }
        VU pokemon = tw0_0.rl.r1(_volatile.BV).Ry0((short) 0);
        if (pokemon == null) {
            zy0_0.CF0.Xt("背包首位必须有宝可梦才能测试破壳孵蛋动画。", "red");
            return;
        }
        tw0_0.LD0.x(pokemon);
    }

    public static void vn0() {
        BU.T50.SL(new JV((byte) 0, (short) 0));
    }

    public static void Ls0() {
        BU.T50.SL(new sr_0((byte) 0, (short) 0));
    }

    public static void Gk() {
        Qy0.yI0.da0(ry_0.zm, CH0.j1, (byte) 0);
    }

    public static void Gl0() {
        Qy0.yI0.da0(ry_0.J30, CH0.j1, (byte) 0);
    }

    public final void Ss0() {
        this.CK0 = !this.CK0;
        lg_0.k.lPT5(new mf0_1(BU.T50, this.CK0));
    }

    public final void g5() {
        this.OK = !this.OK;
        Qy0.yI0.TW(this.OK);
    }

    public static void eY() {
        Qy0.yI0.qi();
    }

    public final void jH0() {
        Qy0.yI0.sr0(new lpt3__4("测试通用确认对话框内容", Ft0::cOm6, this));
    }

    public static void cOm6() {
        Qy0.yI0.dk(-1, "确认功能测试正常！");
    }

    public static void O9() {
        BU player = BU.T50;
        lg_0.k.lPT5(new so_1(player, (byte) -1, "DebugPlayer"));
    }

    public static void R50() {
        BU player = BU.T50;
        lg_0.k.lPT5(new Vj0(player, (byte) -1, "DebugPlayer"));
    }

    public static void lN() {
        BU player = BU.T50;
        lg_0.k.lPT5(new so_1(player, (byte) -1, "DebugPlayer"));
    }

    public static void throw$() {
        BU player = BU.T50;
        lg_0.k.lPT5(new pf_1(player, (byte) -1, "DebugPlayer", "DebugGuild"));
    }

    public static void cOM3() {
        BU player = BU.T50;
        lg_0.k.lPT5(new bp_0(player, (byte) -1, "DebugPlayer"));
    }

    public static void e5() {
        BU.T50.X10(
                (byte) -1,
                "DebugPlayer",
                6,
                50,
                50,
                (byte) 0,
                Cq.Wn0,
                false,
                true,
                true,
                (byte) 5,
                (byte) 0,
                lq0.CoM4);
    }

    public static void kY() {
        Qy0.yI0.F9(Qy0.yI0.fU(), new Rs0(0));
    }

    public static void Us0() {
        BU.T50.U0(true);
    }

    public static void AT() {
        BU player = BU.T50;
        if (player.iY != null) {
            player.aUX();
        } else {
            md0_0 panel = new md0_0(player, true, (short) 1001);
            player.iY = panel;
            player.SL(panel);
        }
    }

    public static void ac0() {
        BU.T50.G20(true, ur_0.YS);
    }

    public static void w3() {
        BU.T50.GF0(new Dm0((byte) 0, "DEBUG", true, true));
    }

    public static void Fj0() {
        BU.T50.RG0(null, true, false);
    }

    public static void He0() {
        BU player = BU.T50;
        di0_1 current = player.vs0;
        if (current != null) {
            current.xe0();
            player.vs0 = null;
        }
        di0_1 panel = new di0_1((byte) 0);
        player.vs0 = panel;
        player.SL(panel);
    }

    public static qj_2 xc(String label, Runnable runnable) {
        qj_2 button = new qj_2(label, 200, 28);
        button.RR(runnable);
        return button;
    }

    public static void ju0(fy_2 root, ArrayList items) {
        I7 row = new I7(root);
        Hm0 column = new Hm0(root);
        ya_1 rowTarget = root.pJ0;
        ya_1 columnTarget = root.L4;
        int index = 0;
        for (Object value : items) {
            xe_1 item = (xe_1) value;
            if (index != 0) {
                row.qd(5);
            }
            row.Kn0(item);
            column.Kn0(item);
            ++index;
            if (index == 3) {
                rowTarget.X20(row);
                columnTarget.X20(column).qd(5);
                row = new I7(root);
                column = new Hm0(root);
                index = 0;
            }
        }
        rowTarget.X20(row);
        columnTarget.X20(column).qd(10);
    }
}
