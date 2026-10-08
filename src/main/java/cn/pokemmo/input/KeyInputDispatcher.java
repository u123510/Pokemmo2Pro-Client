package cn.pokemmo.input;

import f.*;

/**
 * 客户端核心按键与输入事件调度器 (KeyInputDispatcher)
 *
 * <p>核心职责：
 * <ul>
 *   <li>处理物理键盘按键事件（按下、释放、长按重复），实现 LibGDX 与 TWL GUI 的输入事件分发；</li>
 *   <li>按键映射匹配与检测：将物理键码（0~255）与游戏功能绑定（移动、交互、快捷栏、菜单等）双向对应；</li>
 *   <li>按键时长统计与按键宏行为分析：通过采样环形缓冲（{@link YI}）记录击键时长；</li>
 *   <li>移动端虚拟控制台/屏幕摇杆（{@link hy0_0}）与实体手柄设备的联合状态探测；</li>
 *   <li>键码易读字符串转换（支持全键盘、小键盘、媒体键、手柄按钮命名）。</li>
 * </ul>
 *
 * <p>原始混淆类：{@link f.Yo0}
 */
public class KeyInputDispatcher implements tg_2, nk0_0 {
    public static final dl_1 Ss0 = Cq0.E1(Yo0.class);
    public zk0_1 BG;
    public final long[] Eq0;
    public final boolean[] Ke0;
    public final YI Ce;
    public int dq0;
    public int NuL;
    public int Wi;
    public int RB0;
    public int pJ0;
    public double YH;
    public int u;
    public byte vl0;
    public byte h40;
    public byte dH0;
    public byte z00;
    public boolean GD;
    public hy0_0 b00;

    public KeyInputDispatcher() {
        BG = null;
        Eq0 = new long[8];
        Ke0 = new boolean[8];
        Ce = new YI();
        dq0 = 0;
        NuL = 0;
        Wi = 0;
        RB0 = 0;
        pJ0 = 0;
        YH = 0.0;
        u = 0;
        vl0 = -1;
        h40 = -1;
        dH0 = -1;
        z00 = -1;
        GD = false;
        b00 = null;
    }

    public KeyInputDispatcher(int unused) {
        this();
    }

    /**
     * 将按键码映射到游戏动作索引（0~26）。
     *
     * @param key 键码
     * @param extended 是否包含扩展动作（数字键/扩展功能键）
     * @return 动作索引，若无匹配返回 -1
     */
    public static int tl(int key, boolean extended) {
        rp_0 binding = rp_0.kC0;
        int initialization = dw_2.ff;
        if (binding != null && binding.Ov(key)) {
            return 0;
        }
        binding = rp_0.synchronized$;
        if (binding != null && binding.Ov(key)) {
            return 1;
        }
        binding = rp_0.I90;
        if (binding != null && binding.Ov(key)) {
            return 2;
        }
        binding = rp_0.Ni;
        if (binding != null && binding.Ov(key)) {
            return 3;
        }
        binding = rp_0.sJ0;
        if (binding != null && binding.Ov(key)) {
            return 4;
        }
        binding = rp_0.nK0;
        if (binding != null && binding.Ov(key)) {
            return 5;
        }
        binding = rp_0.N9;
        if (binding != null && binding.Ov(key)) {
            return 6;
        }
        binding = rp_0.pd0;
        if (binding != null && binding.Ov(key)) {
            return 7;
        }
        if (extended) {
            binding = rp_0.com1;
            if (binding != null && binding.Ov(key)) {
                return 8;
            }
            binding = rp_0.ew;
            if (binding != null && binding.Ov(key)) {
                return 9;
            }
            binding = rp_0.eL;
            if (binding != null && binding.Ov(key)) {
                return 10;
            }
            binding = rp_0.aE0;
            if (binding != null && binding.Ov(key)) {
                return 11;
            }
            binding = rp_0.LPT3;
            if (binding != null && binding.Ov(key)) {
                return 12;
            }
            binding = rp_0.VE0;
            if (binding != null && binding.Ov(key)) {
                return 13;
            }
            binding = rp_0.lpT9;
            if (binding != null && binding.Ov(key)) {
                return 14;
            }
            binding = rp_0.gr0;
            if (binding != null && binding.Ov(key)) {
                return 15;
            }
            binding = rp_0.lPT5;
            if (binding != null && binding.Ov(key)) {
                return 16;
            }
            binding = rp_0.Mt;
            if (binding != null && binding.Ov(key)) {
                return 17;
            }
            binding = rp_0.Mi0;
            if (binding != null && binding.Ov(key)) {
                return 18;
            }
            binding = rp_0.Kz0;
            if (binding != null && binding.Ov(key)) {
                return 19;
            }
            binding = rp_0.Ul;
            if (binding != null && binding.Ov(key)) {
                return 20;
            }
            binding = rp_0.ip0;
            if (binding != null && binding.Ov(key)) {
                return 21;
            }
            binding = rp_0.Oe;
            if (binding != null && binding.Ov(key)) {
                return 22;
            }
            binding = rp_0.Jq;
            if (binding != null && binding.Ov(key)) {
                return 23;
            }
            binding = rp_0.oq;
            if (binding != null && binding.Ov(key)) {
                return 24;
            }
            binding = rp_0.i9;
            if (binding != null && binding.Ov(key)) {
                return 25;
            }
            binding = rp_0.Un0;
            if (binding != null && binding.Ov(key)) {
                return 26;
            }
        }
        return -1;
    }

    /**
     * 采样按键按下与弹起时长，记录防作弊分析样本。
     */
    public final void uj0(int key, boolean pressed, long nanos, boolean synthetic) {
        int index = tl(key, false);
        if (index < 0) {
            return;
        }
        if (pressed) {
            if (!Ke0[index]) {
                Ke0[index] = true;
                Eq0[index] = nanos;
            }
        } else if (Ke0[index]) {
            Ke0[index] = false;
            int duration = (int) ((double) (nanos - Eq0[index]) / 1000000.0);
            if (duration == 0) {
                Wi++;
            }
            dq0++;
            if (synthetic) {
                NuL++;
            }
            synchronized (Ce) {
                YI samples = Ce;
                int slot = samples.TZ(System.currentTimeMillis());
                boolean added = true;
                if (slot < 0) {
                    slot = -slot - 1;
                    int previous = samples.v50[slot];
                    added = false;
                }
                samples.v50[slot] = duration;
                if (added) {
                    samples.OC0(samples.ao);
                }
            }
            Eq0[index] = 0L;
        }
    }

    /**
     * 检测某个按键绑定当前是否处于触发/按下状态（包括手柄与键盘）。
     */
    public final boolean dH0(rp_0 binding) {
        if (KK0(binding.wu())) {
            return true;
        }
        dl_1 initialization = el0_0.zb0;
        if (dw_2.Md) {
            el0_0.ef0();
            for (gc0_0 controller : el0_0.B60) {
                LH0 device = controller.Dq0;
                if (device == null) {
                    continue;
                }
                OW mapping = (OW) controller.QI.get(binding);
                if (mapping != null && mapping.cON(device)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 检测指定键码是否被按下（兼容移动端虚拟按键与 LibGDX 键盘状态）。
     */
    public final boolean KK0(int key) {
        hy0_0 controls = b00;
        if (controls != null && controls.ob0) {
            if (key == dw_2.JU && controls.Nf0.m9()) {
                return true;
            }
            if (key == dw_2.RM && controls.qx.m9()) {
                return true;
            }
            if (controls.We0 != 0.0F
                    && (key == dw_2.Fk || key == dw_2.Se || key == dw_2.KC || key == dw_2.Ze)
                    && controls.bl0(key)) {
                return true;
            }
        }
        return lg_0.lW.eC0(key);
    }

    /**
     * 获取指定键码的本地化/默认名称。
     */
    public final String X80(int key) {
        return oO(key, sm0_0.c0(nf0_0.Po));
    }

    /**
     * 将按键码转为人类可读的标准名称。
     */
    public String oO(int key, String fallback) {
        if (key <= 0) {
            return fallback;
        }
        if (key > 255) {
            throw new IllegalArgumentException(yr_1.pG("keycode cannot be greater than 255, keycode: ", key));
        }
        switch (key) {
            case 0:
                return "Unknown";
            case 1:
                return "Soft Left";
            case 2:
                return "Soft Right";
            case 3:
                return "Home";
            case 4:
                return "Back";
            case 5:
                return "Call";
            case 6:
                return "End Call";
            case 7:
                return "0";
            case 8:
                return "1";
            case 9:
                return "2";
            case 10:
                return "3";
            case 11:
                return "4";
            case 12:
                return "5";
            case 13:
                return "6";
            case 14:
                return "7";
            case 15:
                return "8";
            case 16:
                return "9";
            case 17:
                return "*";
            case 18:
                return "#";
            case 19:
                return "Up";
            case 20:
                return "Down";
            case 21:
                return "Left";
            case 22:
                return "Right";
            case 23:
                return "Center";
            case 24:
                return "Volume Up";
            case 25:
                return "Volume Down";
            case 26:
                return "Power";
            case 27:
                return "Camera";
            case 28:
                return "Clear";
            case 29:
                return "A";
            case 30:
                return "B";
            case 31:
                return "C";
            case 32:
                return "D";
            case 33:
                return "E";
            case 34:
                return "F";
            case 35:
                return "G";
            case 36:
                return "H";
            case 37:
                return "I";
            case 38:
                return "J";
            case 39:
                return "K";
            case 40:
                return "L";
            case 41:
                return "M";
            case 42:
                return "N";
            case 43:
                return "O";
            case 44:
                return "P";
            case 45:
                return "Q";
            case 46:
                return "R";
            case 47:
                return "S";
            case 48:
                return "T";
            case 49:
                return "U";
            case 50:
                return "V";
            case 51:
                return "W";
            case 52:
                return "X";
            case 53:
                return "Y";
            case 54:
                return "Z";
            case 55:
                return ",";
            case 56:
                return ".";
            case 57:
                return "L-Alt";
            case 58:
                return "R-Alt";
            case 59:
                return "L-Shift";
            case 60:
                return "R-Shift";
            case 61:
                return "Tab";
            case 62:
                return "Space";
            case 63:
                return "SYM";
            case 64:
                return "Explorer";
            case 65:
                return "Envelope";
            case 66:
                return "Enter";
            case 67:
                return "Delete";
            case 68:
                return "`";
            case 69:
                return "-";
            case 70:
                return "=";
            case 71:
                return "[";
            case 72:
                return "]";
            case 73:
                return "\\";
            case 74:
                return ";";
            case 75:
                return "\'";
            case 76:
                return "/";
            case 77:
                return "@";
            case 78:
                return "Num";
            case 79:
                return "Headset Hook";
            case 80:
                return "Focus";
            case 81:
                return "Plus";
            case 82:
                return "Menu";
            case 83:
                return "Notification";
            case 84:
                return "Search";
            case 85:
                return "Play/Pause";
            case 86:
                return "Stop Media";
            case 87:
                return "Next Media";
            case 88:
                return "Prev Media";
            case 89:
                return "Rewind";
            case 90:
                return "Fast Forward";
            case 91:
                return "Mute";
            case 92:
                return "Page Up";
            case 93:
                return "Page Down";
            case 94:
                return "PICTSYMBOLS";
            case 95:
                return "SWITCH_CHARSET";
            case 96:
                return "A Button";
            case 97:
                return "B Button";
            case 98:
                return "C Button";
            case 99:
                return "X Button";
            case 100:
                return "Y Button";
            case 101:
                return "Z Button";
            case 102:
                return "L1 Button";
            case 103:
                return "R1 Button";
            case 104:
                return "L2 Button";
            case 105:
                return "R2 Button";
            case 106:
                return "Left Thumb";
            case 107:
                return "Right Thumb";
            case 108:
                return "Start";
            case 109:
                return "Select";
            case 110:
                return "Button Mode";
            case 111:
                return "Escape";
            case 112:
                return "Forward Delete";
            case 115:
                return "Caps Lock";
            case 116:
                return "Scroll Lock";
            case 120:
                return "Print";
            case 121:
                return "Pause";
            case 123:
                return "End";
            case 124:
                return "Insert";
            case 129:
                return "L-Ctrl";
            case 130:
                return "R-Ctrl";
            case 131:
                return "F1";
            case 132:
                return "F2";
            case 133:
                return "F3";
            case 134:
                return "F4";
            case 135:
                return "F5";
            case 136:
                return "F6";
            case 137:
                return "F7";
            case 138:
                return "F8";
            case 139:
                return "F9";
            case 140:
                return "F10";
            case 141:
                return "F11";
            case 142:
                return "F12";
            case 143:
                return "Num Lock";
            case 144:
                return "Numpad 0";
            case 145:
                return "Numpad 1";
            case 146:
                return "Numpad 2";
            case 147:
                return "Numpad 3";
            case 148:
                return "Numpad 4";
            case 149:
                return "Numpad 5";
            case 150:
                return "Numpad 6";
            case 151:
                return "Numpad 7";
            case 152:
                return "Numpad 8";
            case 153:
                return "Numpad 9";
            case 154:
                return "Num /";
            case 155:
                return "Num *";
            case 156:
                return "Num -";
            case 157:
                return "Num +";
            case 158:
                return "Num .";
            case 159:
                return "Num ,";
            case 160:
                return "Num Enter";
            case 161:
                return "Num =";
            case 162:
                return "Num (";
            case 163:
                return "Num )";
            case 183:
                return "F13";
            case 184:
                return "F14";
            case 185:
                return "F15";
            case 186:
                return "F16";
            case 187:
                return "F17";
            case 188:
                return "F18";
            case 189:
                return "F19";
            case 190:
                return "F20";
            case 191:
                return "F21";
            case 192:
                return "F22";
            case 193:
                return "F23";
            case 194:
                return "F24";
            case 243:
                return ":";
            default:
                return null;
        }
    }

    /**
     * 按键按下事件分发（LibGDX 接口）。
     */
    public final boolean GH0(int key) {
        lg_0.lW.getClass();
        if (key == 160) {
            key = 66;
        }
        uj0(key, true, lg_0.lW.ki.yo0, false);
        char character = 0;
        if (key == 66) {
            character = 13;
        } else if (key == 4) {
            key = dw_2.RM;
        } else if (key == 67 || key == 112) {
            return true;
        }
        return BG.DJ0(key, character, true, false);
    }

    /**
     * 按键释放事件分发（LibGDX 接口）。
     */
    public final boolean pH0(int key) {
        lg_0.lW.getClass();
        if (key == 160) {
            key = 66;
        }
        uj0(key, false, lg_0.lW.ki.yo0, false);
        char character = 0;
        if (key == 66) {
            character = 13;
        } else if (key == 4) {
            key = dw_2.RM;
        }
        return BG.DJ0(key, character, false, false);
    }

    /**
     * 字符输入事件分发（LibGDX 接口）。
     */
    public final boolean i00(char character) {
        int key = 0;
        if (character == 65279) {
            return true;
        }
        if (character == 8) {
            key = 67;
        } else if (character == 127) {
            key = 112;
        }
        boolean pressed = BG.DJ0(key, character, true, true);
        boolean released = BG.DJ0(key, character, false, true);
        return released || pressed;
    }

    /**
     * 鼠标/触控按下（LibGDX 接口）。
     */
    public final boolean R8(int x, int y, int pointer, int button) {
        lg_0.lW.getClass();
        return BG.Wq0(x, y, button, true);
    }

    /**
     * 鼠标/触控抬起（LibGDX 接口）。
     */
    public final boolean kh(int x, int y, int pointer, int button) {
        lg_0.lW.getClass();
        EA0(x, y);
        return BG.Wq0(x, y, button, false);
    }

    /**
     * 鼠标/触控拖拽（LibGDX 接口）。
     */
    public final boolean Ao0(int x, int y, int pointer) {
        lg_0.lW.getClass();
        return BG.Wq0(x, y, -1, true);
    }

    /**
     * 鼠标移动（LibGDX 接口）。
     */
    public final boolean EA0(int x, int y) {
        lg_0.lW.getClass();
        return BG.Wq0(x, y, -1, false);
    }

    /**
     * 滚轮滚动（LibGDX 接口）。
     */
    public final boolean gl0(float horizontal, float vertical) {
        lg_0.lW.getClass();
        zk0_1 context = BG;
        context.Lh0.hh0 = -(int) vertical;
        le0_2 target = context.Cr0 ? context.L90 : null;
        boolean result = context.iH0(8, target) != null;
        context.Lh0.hh0 = 0;
        return result;
    }

    /**
     * 合成按键按下（扩展输入接口）。
     */
    public final boolean qT(int key, boolean pressed) {
        if (BG == null || !tw0_0.LD0.Rg0) {
            return false;
        }
        if (pressed && tl(key, false) != -1 && Ke0[tl(key, false)]) {
            return false;
        }
        try {
            BG.DJ0(key, (char) 0, pressed, false);
        } catch (Exception exception) {
            Ss0.error("", exception);
        }
        uj0(key, pressed, System.nanoTime(), true);
        return true;
    }

    /**
     * 合成按键释放（扩展输入接口）。
     */
    public final boolean Xl(int key, boolean pressed) {
        if (BG == null || !tw0_0.LD0.Rg0) {
            return false;
        }
        if (pressed && tl(key, false) != -1 && Ke0[tl(key, false)]) {
            return false;
        }
        try {
            BG.DJ0(key, (char) 0, pressed, false);
        } catch (Exception exception) {
            Ss0.error("", exception);
        }
        uj0(key, pressed, System.nanoTime(), false);
        return true;
    }

    /**
     * 消费并重置游戏按键重置标记。
     */
    public final boolean M20() {
        if (GD) {
            GD = false;
            return true;
        }
        return false;
    }
}
