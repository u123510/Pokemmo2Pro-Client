package cn.pokemmo.ui.twl.core;

import f.E00;
import f.i70_0;
import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * TWL 统一输入事件 (Event)
 */
public class TwlEvent {
    public static final int MODIFIER_LSHIFT = 1;
    public static final int MODIFIER_LMETA = 2;
    public static final int MODIFIER_LCTRL = 4;
    public static final int MODIFIER_RSHIFT = 8;
    public static final int MODIFIER_RMETA = 16;
    public static final int MODIFIER_RCTRL = 32;
    public static final int MODIFIER_LBUTTON = 64;
    public static final int MODIFIER_RBUTTON = 128;
    public static final int MODIFIER_MBUTTON = 256;
    public static final int MODIFIER_LALT = 512;
    public static final int MODIFIER_RALT = 1024;
    public static final int MODIFIER_SHIFT = 9;
    public static final int MODIFIER_META = 18;
    public static final int MODIFIER_CTRL = 36;
    public static final int MODIFIER_BUTTON = 448;
    public static final int MODIFIER_ALT = 1536;

    public static final int MOUSE_LBUTTON = 0;
    public static final int MOUSE_RBUTTON = 1;
    public static final int MOUSE_MBUTTON = 2;

    public static final char CHAR_NONE = 0;
    public static final int KEY_NONE = 0;
    public static final int KEY_ESCAPE = 111;
    public static final int KEY_1 = 8;
    public static final int KEY_2 = 9;
    public static final int KEY_3 = 10;
    public static final int KEY_4 = 11;
    public static final int KEY_5 = 12;
    public static final int KEY_6 = 13;
    public static final int KEY_7 = 14;
    public static final int KEY_8 = 15;
    public static final int KEY_9 = 16;
    public static final int KEY_0 = 7;
    public static final int KEY_MINUS = 69;
    public static final int KEY_EQUALS = 70;
    public static final int KEY_BACK = 67;
    public static final int KEY_TAB = 61;
    public static final int KEY_Q = 45;
    public static final int KEY_W = 51;
    public static final int KEY_E = 33;
    public static final int KEY_R = 46;
    public static final int KEY_T = 48;
    public static final int KEY_Y = 53;
    public static final int KEY_U = 49;
    public static final int KEY_I = 37;
    public static final int KEY_O = 43;
    public static final int KEY_P = 44;
    public static final int KEY_LBRACKET = 71;
    public static final int KEY_RBRACKET = 72;
    public static final int KEY_RETURN = 66;
    public static final int KEY_LCONTROL = 129;
    public static final int KEY_A = 29;
    public static final int KEY_S = 47;
    public static final int KEY_D = 32;
    public static final int KEY_F = 34;
    public static final int KEY_G = 35;
    public static final int KEY_H = 36;
    public static final int KEY_J = 38;
    public static final int KEY_K = 39;
    public static final int KEY_L = 40;
    public static final int KEY_SEMICOLON = 74;
    public static final int KEY_APOSTROPHE = 75;
    public static final int KEY_GRAVE = 68;
    public static final int KEY_LSHIFT = 59;
    public static final int KEY_BACKSLASH = 73;
    public static final int KEY_Z = 54;
    public static final int KEY_X = 52;
    public static final int KEY_C = 31;
    public static final int KEY_V = 50;
    public static final int KEY_B = 30;
    public static final int KEY_N = 42;
    public static final int KEY_M = 41;
    public static final int KEY_COMMA = 55;
    public static final int KEY_PERIOD = 56;
    public static final int KEY_SLASH = 76;
    public static final int KEY_RSHIFT = 60;
    public static final int KEY_MULTIPLY = 17;
    public static final int KEY_LMENU = 57;
    public static final int KEY_SPACE = 62;
    public static final int KEY_F1 = 131;
    public static final int KEY_F2 = 132;
    public static final int KEY_F3 = 133;
    public static final int KEY_F4 = 134;
    public static final int KEY_F5 = 135;
    public static final int KEY_F6 = 136;
    public static final int KEY_F7 = 137;
    public static final int KEY_F8 = 138;
    public static final int KEY_F9 = 139;
    public static final int KEY_F10 = 140;
    public static final int KEY_NUMPAD7 = 151;
    public static final int KEY_NUMPAD8 = 152;
    public static final int KEY_NUMPAD9 = 153;
    public static final int KEY_NUMPAD4 = 148;
    public static final int KEY_NUMPAD5 = 149;
    public static final int KEY_NUMPAD6 = 150;
    public static final int KEY_ADD = 81;
    public static final int KEY_NUMPAD1 = 145;
    public static final int KEY_NUMPAD2 = 146;
    public static final int KEY_NUMPAD3 = 147;
    public static final int KEY_NUMPAD0 = 144;
    public static final int KEY_DECIMAL = 56;
    public static final int KEY_F11 = 141;
    public static final int KEY_F12 = 142;
    public static final int KEY_NUMPADEQUALS = 70;
    public static final int KEY_AT = 77;
    public static final int KEY_COLON = 243;
    public static final int KEY_RCONTROL = 130;
    public static final int KEY_NUMPADCOMMA = 55;
    public static final int KEY_DIVIDE = 76;
    public static final int KEY_RMENU = 58;
    public static final int KEY_HOME = 3;
    public static final int KEY_UP = 19;
    public static final int KEY_PRIOR = 92;
    public static final int KEY_LEFT = 21;
    public static final int KEY_RIGHT = 22;
    public static final int KEY_END = 123;
    public static final int KEY_DOWN = 20;
    public static final int KEY_NEXT = 93;
    public static final int KEY_INSERT = 124;
    public static final int KEY_DELETE = 112;
    public static final int KEY_LMETA = 63;
    public static final int KEY_RMETA = 63;
    public static final int KEY_POWER = 26;

    protected static final String[] KEY_NAMES;
    protected static final HashMap<String, Integer> KEY_MAP;

    public int f8;
    public int AN;
    public int hh0;
    public int nA0;
    public int kA;
    public boolean VP;
    public boolean bp0;
    public char TD;
    public int finally$;
    public int J30;
    public i70_0 HM;
    public boolean l6;
    public int zu;

    static {
        KEY_NAMES = new String[256];
        KEY_MAP = new HashMap<String, Integer>(256);
        try {
            Field[] fields = i70_0.class.getFields();
            for (Field field : fields) {
                String name = field.getName();
                if (field.getType() == Integer.TYPE && name.startsWith("KEY_")) {
                    Integer val = (Integer) field.get(null);
                    String keyName = name.substring(4);
                    KEY_NAMES[val.intValue()] = keyName;
                    KEY_MAP.put(keyName, val);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public TwlEvent() {
    }

    public static String getKeyName(int keyCode) {
        if (keyCode >= 0 && keyCode < 256) {
            return KEY_NAMES[keyCode];
        }
        return null;
    }

    public static String mj(int keyCode) {
        return getKeyName(keyCode);
    }

    public static int getKeyCode(String keyName) {
        Integer val = KEY_MAP.get(keyName);
        return val != null ? val.intValue() : 0;
    }

    public static int w2(String keyName) {
        return getKeyCode(keyName);
    }

    public boolean isMouseEvent() {
        return E00.C10(this.zu) && this.zu != 8;
    }

    public final boolean Li() {
        return isMouseEvent();
    }

    public boolean isKeyEvent() {
        return this.zu == 9;
    }

    public final boolean iT() {
        return isKeyEvent();
    }

    public boolean isMouseNoButton() {
        return (this.J30 & MODIFIER_BUTTON) == 0;
    }

    public final boolean LI0() {
        return isMouseNoButton();
    }

    public boolean hasKeyChar() {
        return this.zu == 9 && this.TD != 0;
    }

    public final boolean L8() {
        return hasKeyChar();
    }

    public boolean hasKeyCharNoModifiers() {
        if (this.l6 && hasKeyChar()) {
            return true;
        }
        if (hasKeyChar()) {
            int i = this.J30;
            return (i & -10) == 0 || (i & -1029) == 0;
        }
        return false;
    }

    public final boolean iN() {
        return hasKeyCharNoModifiers();
    }

    public boolean isKeyRepeated() {
        return this.zu == 9 && this.bp0;
    }

    public final boolean l() {
        return isKeyRepeated();
    }

    public i70_0 createSubEvent(int type) {
        if (this.HM == null) {
            this.HM = new i70_0();
        }
        i70_0 copy = this.HM;
        copy.zu = type;
        copy.f8 = this.f8;
        copy.AN = this.AN;
        copy.nA0 = this.nA0;
        copy.hh0 = this.hh0;
        copy.kA = this.kA;
        copy.VP = this.VP;
        copy.bp0 = this.bp0;
        copy.TD = this.TD;
        copy.finally$ = this.finally$;
        copy.J30 = this.J30;
        return copy;
    }

    public final i70_0 K3(int type) {
        return createSubEvent(type);
    }
}
