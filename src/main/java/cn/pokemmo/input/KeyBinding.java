package cn.pokemmo.input;

import f.*;
import java.util.function.IntSupplier;

/**
 * 游戏按键动作与手柄映射绑定 (Key Binding)
 * 管理键盘、手柄按键与业务动作（A确定、B取消、移动四向、快捷栏1-9、背包、图鉴等）的双向映射。
 *
 * 原混淆类: f.rp_0
 */
public class KeyBinding {
    public static final rp_0 sJ0;
    public static final rp_0 nK0;
    public static final rp_0 N9;
    public static final rp_0 pd0;
    public static final rp_0 kC0;
    public static final rp_0 synchronized$;
    public static final rp_0 I90;
    public static final rp_0 Ni;
    public static final rp_0 com1;
    public static final rp_0 ew;
    public static final rp_0 eL;
    public static final rp_0 aE0;
    public static final rp_0 LPT3;
    public static final rp_0 VE0;
    public static final rp_0 lpT9;
    public static final rp_0 gr0;
    public static final rp_0 lPT5;
    public static final rp_0 Mt;
    public static final rp_0 Mi0;
    public static final rp_0 Kz0;
    public static final rp_0 Ul;
    public static final rp_0 ip0;
    public static final rp_0 Jq;
    public static final rp_0 oq;
    public static final rp_0 Un0;
    public static final rp_0 i9;
    public static final rp_0 Oe;
    public static final rp_0 Aq0;
    public static final rp_0 cB;
    public static final rp_0[] DV;

    public final int Hh;
    public final int MM;
    public final IntSupplier lr;
    public final BO aA0;
    public final String yJ0;
    public final boolean Zt;
    public final int Bg0;
    public final String e10;
    public final int cd0;

    static {
        sJ0 = new rp_0(0, "KEY_A", true, 1300, 54, () -> dw_2.JU, i0 -> dw_2.JU = i0);
        nK0 = new rp_0(1, "KEY_B", true, 1301, 52, () -> dw_2.RM, i0 -> dw_2.RM = i0);
        N9 = new rp_0(2, "KEY_X", false, 1368, 47, () -> dw_2.ZI, i0 -> dw_2.ZI = i0);
        pd0 = new rp_0(3, "KEY_Y", false, 1369, 29, () -> dw_2.cw0, i0 -> dw_2.cw0 = i0);
        kC0 = new rp_0(4, "KEY_UP", true, 1302, 19, () -> dw_2.Fk, i0 -> dw_2.Fk = i0);
        synchronized$ = new rp_0(5, "KEY_DOWN", true, 1303, 20, () -> dw_2.Se, i0 -> dw_2.Se = i0);
        I90 = new rp_0(6, "KEY_LEFT", true, 1304, 21, () -> dw_2.Ze, i0 -> dw_2.Ze = i0);
        Ni = new rp_0(7, "KEY_RIGHT", true, 1305, 22, () -> dw_2.KC, i0 -> dw_2.KC = i0);
        com1 = new rp_0(8, "KEY_HOTBAR_1", " 1: ", 8, () -> dw_2.X60, i0 -> dw_2.X60 = i0);
        ew = new rp_0(9, "KEY_HOTBAR_2", " 2: ", 9, () -> dw_2.Go, i0 -> dw_2.Go = i0);
        eL = new rp_0(10, "KEY_HOTBAR_3", " 3: ", 10, () -> dw_2.hS, i0 -> dw_2.hS = i0);
        aE0 = new rp_0(11, "KEY_HOTBAR_4", " 4: ", 11, () -> dw_2.hc, i0 -> dw_2.hc = i0);
        LPT3 = new rp_0(12, "KEY_HOTBAR_5", " 5: ", 12, () -> dw_2.zn, i0 -> dw_2.zn = i0);
        VE0 = new rp_0(13, "KEY_HOTBAR_6", " 6: ", 13, () -> dw_2.DJ0, i0 -> dw_2.DJ0 = i0);
        lpT9 = new rp_0(14, "KEY_HOTBAR_7", " 7: ", 14, () -> dw_2.c3, i0 -> dw_2.c3 = i0);
        gr0 = new rp_0(15, "KEY_HOTBAR_8", " 8: ", 15, () -> dw_2.xo, i0 -> dw_2.xo = i0);
        lPT5 = new rp_0(16, "KEY_HOTBAR_9", " 9: ", 16, () -> dw_2.H, i0 -> dw_2.H = i0);
        Mt = new rp_0(17, "KEY_FRIENDS_LIST", false, 1309, 50, () -> dw_2.fK, i0 -> dw_2.fK = i0);
        Mi0 = new rp_0(18, "KEY_INVENTORY", false, 1308, 30, () -> dw_2.Vr0, i0 -> dw_2.Vr0 = i0);
        Kz0 = new rp_0(19, "KEY_TRAINER", false, 1307, 31, () -> dw_2.Al0, i0 -> dw_2.Al0 = i0);
        Ul = new rp_0(20, "KEY_MONSTERDEX", false, 1, 42, () -> dw_2.GL, i0 -> dw_2.GL = i0);
        ip0 = new rp_0(21, "KEY_GAMEMENU", false, 1310, 32, () -> dw_2.fs0, i0 -> dw_2.fs0 = i0);
        Jq = new rp_0(22, "KEY_FAQ", false, 1312, 36, () -> dw_2.r4, i0 -> dw_2.r4 = i0);
        oq = new rp_0(23, "KEY_TEAM", false, 1313, 35, () -> dw_2.ol, i0 -> dw_2.ol = i0);
        Un0 = new rp_0(24, "KEY_TRADE_LINK", false, 8000, 44, () -> dw_2.DY, i0 -> dw_2.DY = i0);
        i9 = new rp_0(25, "KEY_SCREENSHOT", false, 1314, 141, () -> dw_2.sn, i0 -> dw_2.sn = i0);
        Oe = new rp_0(26, "KEY_HIDE_GUI", false, 1311, 142, () -> dw_2.iC0, i0 -> dw_2.iC0 = i0);
        Aq0 = new rp_0(27, "KEY_NEXT", false, 1363, -1, () -> -1, null);
        cB = new rp_0(28, "KEY_PREVIOUS", false, 1364, -1, () -> -1, null);

        DV = (new rp_0[] {
            sJ0, nK0, N9, pd0, kC0, synchronized$, I90, Ni,
            com1, ew, eL, aE0, LPT3, VE0, lpT9, gr0, lPT5,
            Mt, Mi0, Kz0, Ul, ip0, Jq, oq, Un0, i9, Oe,
            Aq0, cB
        }).clone();
    }

    public KeyBinding(int cd0, String yJ0, boolean Zt, int Bg0, int MM, IntSupplier lr, BO aA0) {
        this.cd0 = cd0;
        this.e10 = "";
        this.yJ0 = yJ0;
        this.Zt = Zt;
        this.Bg0 = Bg0;
        this.MM = MM;
        this.lr = lr;
        this.aA0 = aA0;
        this.Hh = JG0() | 256;
    }

    public KeyBinding(int cd0, String yJ0, String e10, int MM, IntSupplier lr, BO aA0) {
        this.cd0 = cd0;
        this.yJ0 = yJ0;
        this.Zt = false;
        this.Bg0 = 1306;
        this.e10 = e10;
        this.MM = MM;
        this.lr = lr;
        this.aA0 = aA0;
        this.Hh = JG0() | 256;
    }

    public final String U7() {
        return new StringBuilder().append(sm0_0.c0(this.Bg0)).append(this.e10).toString();
    }

    public final boolean uL0() {
        return this.aA0 != null;
    }

    public final boolean Ov(int i1) {
        if (i1 <= 0) {
            return false;
        }
        if ((i1 & 256) != 0) {
            return this.Hh == i1;
        }
        IntSupplier supplier = this.lr;
        if (supplier == null) {
            return false;
        }
        return supplier.getAsInt() == i1;
    }

    @Override
    public final String toString() {
        return this.yJ0;
    }

    public final int wu() {
        IntSupplier supplier = this.lr;
        if (supplier == null) {
            return -1;
        }
        return supplier.getAsInt();
    }

    public final int JG0() {
        return this.cd0;
    }

    public static boolean JI() {
        return I90.Ov(21) && Ni.Ov(22) && kC0.Ov(19) && synchronized$.Ov(20);
    }
}
