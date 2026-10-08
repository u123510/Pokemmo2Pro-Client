package cn.pokemmo.ui.window.admin;

import f.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * GM在线管理与频道控制主菜单
 *
 * 原混淆类: f.H50
 */
public class GmMenuWindow extends R90 {
    public static final String[] ak;
    public static final String[][] wW;
    public static final C70[] KR;
    public static final String[] JA0;
    public static final C70[] No0;
    public static final String[] Uf;
    public static final String[] qE0;
    public static final String[] uw0;
    public final xn0_0 vv;
    public final fy_2 VU;
    public final FB0 BC0;
    public final ia0_1 ht0;
    public final xe_1 Yz0;
    public final xe_1 D;
    public final HashMap<le0_2, xj_1> GH;

    public final xe_1 aL(String title, String command) {
        xe_1 item = new xe_1(title);
        item.RR(() -> this.J(item, command));
        return item;
    }

    public final xe_1 HA(String title, String command) {
        return this.Br(title, command, JA0, No0, wW);
    }

    public final xe_1 bx0(String title, String command, String[] labels, C70[] types) {
        return this.Br(title, command, labels, types, wW);
    }

    public final xe_1 Br(String title, String command, String[] labels, C70[] types, String[][] values) {
        xe_1 item = new xe_1(title);
        item.RR(() -> this.fB(item, command, labels, types, values));
        return item;
    }

    public final xj_1 ed0(String command, String[] labels, C70[] types, String[][] values,
                                    le0_2 key, le0_2 ignored, xj_1 old) {
        xj_1 item = new xj_1(command, labels, types, values);
        item.Pb0(() -> this.mo0(key, item));
        return item;
    }

    public final void mo0(le0_2 key, xj_1 item) {
        this.GH.remove(key);
        this.vv.u3(item);
    }

    public final void jC0(xe_1 item, String command, String[] labels, C70[] types, String[][] values) {
        this.fB(item, command, labels, types, values);
    }

    public final void J(xe_1 item, String command) {
        this.fB(item, command, ak, KR, wW);
    }

    public final void LPT5(xn0_0 owner) {
        this.GH.forEach((key, value) -> Rm0(owner, key, value));
        this.GH.clear();
    }

    public final void UD(xn0_0 owner) {
        owner.u3(this);
    }

    public final void fB(le0_2 key, String command, String[] labels, C70[] types, String[][] values) {
        if (types.length < 1) {
            BR bridge = tw0_0.rl;
            bridge.getClass();
            bridge.Cp(zo_0.Pk, command, "", true);
            return;
        }
        if (this.GH.get(key) != null) {
            return;
        }
        xj_1 result = this.GH.compute(key, (ignored, old) -> this.ed0(command, labels, types, values, key, ignored, old));
        xn0_0.Lt.SL(result);
    }

    @Override
    public final void K8() {
        this.RY(Math.max(this.R1(), 800), Math.max(this.Se(), 450));
        this.lt0();
        I2 iterator = this.ht0.t30.ZD();
        while (iterator.hasNext()) {
            ((le0_2)iterator.next()).lt0();
        }
        this.ht0.lt0();
        this.VU.lt0();
        super.K8();
    }

    @Override
    public final void HP(zk0_1 state) {
        BR bridge = tw0_0.rl;
        if (bridge != null && this.D != null && this.Yz0 != null && bridge.cJ0 != null && bridge.cJ0.jB0 != null) {
            E90 mode = bridge.cJ0.jB0;
            this.D.SU(mode.Lpt3 ? "取消隐身" : "隐身");
            this.Yz0.SU(mode.FI0 ? "退出 GM 模式" : "GM 模式");
        }
        super.HP(state);
    }

    public GmMenuWindow(xn0_0 owner) {
        super();
        this.GH = new HashMap<>();
        this.vv = owner;
        byte rank = tw0_0.rl.yn();
        if (rank <= 0) {
            throw new RuntimeException();
        }
        boolean debug = lpt3__1.Qm;
        this.VU = new fy_2();
        this.ff0(1);
        this.uf("adminframe");
        this.Hy("GM 菜单");
        this.Pb0(() -> this.UD(owner));
        TreeMap<Byte, List<le0_2>> menus = new TreeMap<>();
        List<le0_2> cm = menus.compute((byte)1, H50::VF);
        cm.add(new cn_0("频道管理 (CM+)"));
        cm.add(this.aL("在线管理人员", "//onlinestaff"));
        cm.add(this.Br("设置聊天频道", "//setchat", new String[]{"玩家名称", "频道类型"},
                new C70[]{C70.wx0, C70.Nc0}, new String[][]{ak, qE0}));
        cm.add(this.Br("设置语言", "//setlanguage", new String[]{"玩家名称", "语言"},
                new C70[]{C70.wx0, C70.Nc0}, new String[][]{ak, Uf}));
        cm.add(this.HA("旁观/观战", "//spectate"));
        if (rank >= 4) {
            List<le0_2> global = menus.compute((byte)4, H50::ix);
            global.add(new cn_0("全局管理 (Global+)"));
            global.add(this.HA("玩家简要信息", "//playerinfotext"));
            global.add(this.HA("玩家详细信息", "//playerinfo"));
            global.add(this.Br("警告", "//warn", new String[]{"玩家名称", "警告原因", "自定义原因 (若选OTHER)"},
                    new C70[]{C70.wx0, C70.Nc0, C70.Kk}, new String[][]{ak, uw0}));
            C70[] muteTypes = {C70.wx0, C70.Ey0, C70.Kk};
            String[] muteLabels = {"玩家名称", "禁言时长 (秒)", "原因"};
            global.add(this.bx0("个人禁言", "//mute", muteLabels, muteTypes));
            global.add(this.bx0("频道禁言", "//mute_ch", muteLabels, muteTypes));
            global.add(this.aL("禁言名单", "//mutelist"));
        }
        if (rank >= 5) {
            List<le0_2> gm = menus.compute((byte)5, H50::Ee);
            gm.add(new cn_0("高级管理 (GM+)"));
            this.Yz0 = this.aL("GM 模式", "//gmmode");
            this.D = this.aL("隐身", "//hide");
            gm.add(this.Yz0);
            gm.add(this.D);
            if (debug || rank >= 8) gm.add(this.aL("全队治疗", "//heal"));
            gm.add(this.aL("切换天气", "//weather"));
            gm.add(this.aL("切换闪光照明", "//flash"));
            gm.add(this.aL("随身电脑 (PC)", "//pc"));
            gm.add(this.aL("结束战斗", "//endbattle"));
            gm.add(this.bx0("发起人机验证", "//captcha", new String[]{"玩家名称", "允许尝试次数"}, new C70[]{C70.wx0, C70.Ey0}));
            gm.add(this.HA("关闭人机验证", "//captchaclose"));
            gm.add(this.HA("结束目标战斗", "//endbattle_target"));
            gm.add(this.HA("传送到目标", "//teleportto"));
            gm.add(this.HA("拉回目标", "//recall"));
            gm.add(this.HA("脱卡复位", "//unstuck"));
            gm.add(this.bx0("封禁账号", "//ban_account", new String[]{"账号 ID", "封禁时长 (秒, -1为永久)", "原因"}, new C70[]{C70.Ey0, C70.Ey0, C70.Kk}));
            gm.add(this.HA("踢下线", "//kick"));
            gm.add(this.HA("封禁角色名", "//name_ban"));
            gm.add(this.bx0("重置角色昵称", "//resetnick", new String[]{"对象 ID (Object ID)"}, new C70[]{C70.Ey0}));
            gm.add(jb0("取消高亮玩家", H50::Zt0));
            gm.add(jb0("排查脚本/猎挂", owner::sf0));
        } else {
            this.Yz0 = null;
            this.D = null;
        }
        List<le0_2> debugMenu = menus.compute((byte)127, H50::qv);
        debugMenu.add(new cn_0("调试工具 (Debug)"));
        if (rank >= 5 || debug) debugMenu.add(jb0("地图传送列表", owner::qo));
        debugMenu.add(jb0("ID 综合搜索", owner::vc));
        debugMenu.add(jb0("音频调试器", owner::uZ));
        debugMenu.add(jb0("叫声调试器", owner::G20));
        debugMenu.add(jb0("NPC 精灵图调试器", owner::uf));
        debugMenu.add(jb0("NPC 放置工具", () -> ch0(owner)));
        if (rank >= 6 || debug) {
            debugMenu.add(jb0("角色外观精灵图", H50::O6));
            debugMenu.add(jb0("批量命令执行", owner::qp0));
            debugMenu.add(this.aL("解锁功能", "//unlock"));
            debugMenu.add(jb0("跟随精灵测试", owner::u4));
            debugMenu.add(jb0("触发崩溃测试", H50::fD));
            debugMenu.add(jb0("后台线程崩溃", H50::Tq0));
        }
        debugMenu.add(jb0("加载对战录像", H50::o8));
        debugMenu.add(jb0("战斗模拟器", () -> j50(owner)));
        this.ht0 = new ia0_1(2);
        this.ht0.LPT2(pa0_0.dC0);
        for (List<le0_2> list : menus.values()) {
            if (list == null || list.isEmpty()) continue;
            ia0_1 section = new ia0_1(2);
            section.LPT2(pa0_0.xE);
            le0_2[] entries = list.toArray(new le0_2[0]);
            ia0_1 row = new ia0_1(1);
            row.LPT2(pa0_0.dC0);
            row.SL(entries[0]);
            section.SL(row);
            for (int i = 1; i < entries.length; i++) {
                if (i % 7 == 0 || i == 1) {
                    row = new ia0_1(1);
                    row.LPT2(pa0_0.dC0);
                    section.SL(row);
                }
                row.SL(entries[i]);
            }
            this.ht0.SL(section);
        }
        I7 rootA = this.VU.H10();
        I7 rootB = this.VU.H10();
        rootA.Kn0(this.ht0);
        rootB.Kn0(this.ht0);
        this.VU.Yg(pa0_0.dC0, this.ht0);
        P8 panel = new P8();
        panel.Wq(this.VU, "指令列表");
        this.BC0 = rank >= 5 ? new FB0() : null;
        if (this.BC0 != null) panel.Wq(this.BC0, "人机验证记录");
        this.SL(panel);
        this.Pb0(() -> this.LPT5(owner));
    }

    public static void kY(String value) {
        xr_0 replay = new xr_0(TI0.Kd(value));
        if (!replay.KA) {
            tw0_0.rl.qK(sm0_0.c0(replay.Lc0 >= 26 && replay.Lc0 <= 26 ? 5803 : 5030));
        } else {
            replay.Dc0 = false;
            tw0_0.Jp = replay;
            replay.run();
        }
    }

    public static void j50(xn0_0 owner) {
        kl0_0 window = new kl0_0();
        if (BU.T50 != null) {
            BU.T50.SL(window);
        } else if (owner != null) {
            owner.SL(window);
        }
        window.lt0();
        int screenWidth = tw0_0.LD0 != null ? tw0_0.LD0.ew0() : 800;
        int screenHeight = tw0_0.LD0 != null ? tw0_0.LD0.Hv0() : 600;
        int x = Math.max(0, (screenWidth - window.Mx) / 2);
        int y = Math.max(0, (screenHeight - window.OB) / 2);
        window.E40(x, y);
    }

    public static void Xt() {
        throw new RuntimeException("User Submitted Error Report");
    }

    public static void ch0(xn0_0 owner) {
        owner.SL(new uk_0());
    }

    public static List VF(Byte ignored, List old) { return new ArrayList(); }
    public static List ix(Byte ignored, List old) { return new ArrayList(); }
    public static List Ee(Byte ignored, List old) { return new ArrayList(); }
    public static List qv(Byte ignored, List old) { return new ArrayList(); }
    public static String[] xG(int length) { return new String[length]; }
    public static String[] aK0(int length) { return new String[length]; }

    public static void o8() {
        BU.T50.SL(new ox_1("序列化对战录像数据", Integer.MAX_VALUE, H50::kY));
    }

    public static void Tq0() {
        lpt5__5.hL.Com4.execute(H50::Xt);
    }

    public static void fD() {
        Xt();
    }

    public static void O6() {
        Qy0.yI0.F9(Qy0.yI0.fU(), new COm8_());
    }

    public static void Zt0() {
        yt_1.l00 = CH0.j1;
    }

    public static void Rm0(xn0_0 owner, le0_2 key, xj_1 value) {
        owner.u3(value);
    }

    public static xe_1 jb0(String title, Runnable action) {
        xe_1 item = new xe_1(title);
        item.RR(action);
        return item;
    }

    static {
        ak = new String[0];
        wW = new String[0][];
        KR = new C70[0];
        JA0 = new String[]{"玩家名称"};
        No0 = new C70[]{C70.wx0};
        Uf = Stream.of(G50.aG).map(G50::AO).toArray(H50::aK0);
        qE0 = new String[]{zo_0.Pk.toString(), zo_0.DI0.toString(), zo_0.bg0.toString(), zo_0.Hl0.toString(), zo_0.Cj0.toString()};
        uw0 = Stream.of(IL.x90).map(Enum::name).toArray(H50::xG);
    }
}
