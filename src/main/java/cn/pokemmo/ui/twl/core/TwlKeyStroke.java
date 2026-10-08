package cn.pokemmo.ui.twl.core;

import f.RF;
import f.TU;
import f.i70_0;
import f.jj0_0;
import java.util.Locale;

/**
 * 键盘快捷键组合与动作绑定 (KeyStroke)
 */
public class TwlKeyStroke {
    public final int DI0;
    public final int PP;
    public final char gl;
    public final String r90;

    public TwlKeyStroke(int modifiers, int keyCode, char keyChar, String action) {
        this.DI0 = modifiers;
        this.PP = keyCode;
        this.gl = keyChar;
        this.r90 = action;
    }

    public int getModifiers() {
        return this.DI0;
    }

    public int getKeyCode() {
        return this.PP;
    }

    public char getKeyChar() {
        return this.gl;
    }

    public String getAction() {
        return this.r90;
    }

    public static TU parse(String stroke, String action) {
        if (stroke == null) {
            throw new NullPointerException("stroke");
        }
        if (action == null) {
            throw new NullPointerException("action");
        }

        int i = 0;
        i = RF.Com2(stroke, i, stroke.length());
        int j = 0;
        char c0 = 0;
        int k = 0;
        boolean flag = false;
        boolean flag1 = false;

        while (i < stroke.length()) {
            int l = stroke.indexOf(' ', i);
            if (l < 0) {
                l = stroke.length();
            }

            String s = stroke.substring(i, l);
            if (flag1) {
                throw new IllegalArgumentException(jj0_0.hw0("Unexpected: ", s));
            }

            if (flag) {
                if (s.length() != 1) {
                    throw new IllegalArgumentException("Expected single character after 'typed'");
                }
                c0 = s.charAt(0);
                if (c0 == 0) {
                    throw new IllegalArgumentException("Unknown character: ".concat(s));
                }
                flag1 = true;
            } else if ("ctrl".equalsIgnoreCase(s) || "control".equalsIgnoreCase(s)) {
                j |= 2;
            } else if ("shift".equalsIgnoreCase(s)) {
                j |= 1;
            } else if ("meta".equalsIgnoreCase(s)) {
                j |= 4;
            } else if ("cmd".equalsIgnoreCase(s)) {
                j |= 20;
            } else if ("alt".equalsIgnoreCase(s)) {
                j |= 8;
            } else if ("typed".equalsIgnoreCase(s)) {
                flag = true;
            } else {
                k = i70_0.w2(s.toUpperCase(Locale.ENGLISH));
                if (k == 0) {
                    throw new IllegalArgumentException("Unknown key: ".concat(s));
                }
                flag1 = true;
            }

            i = l + 1;
            i = RF.Com2(stroke, i, stroke.length());
        }

        if (flag1) {
            return new TU(j, k, c0, action);
        } else {
            throw new IllegalArgumentException("Unexpected end of string");
        }
    }

    public final String getStrokeName() {
        StringBuilder sb = new StringBuilder();
        if ((this.DI0 & 1) == 1) {
            sb.append("shift ");
        }
        if ((this.DI0 & 2) == 2) {
            sb.append("ctrl ");
        }
        if ((this.DI0 & 8) == 8) {
            sb.append("alt ");
        }
        if ((this.DI0 & 20) == 20) {
            sb.append("cmd ");
        } else if ((this.DI0 & 4) == 4) {
            sb.append("meta ");
        }

        if (this.PP != 0) {
            sb.append(i70_0.mj(this.PP));
        } else {
            sb.append("typed ").append(this.gl);
        }
        return sb.toString();
    }

    public final String cH0() {
        return getStrokeName();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TwlKeyStroke)) {
            return false;
        }
        TwlKeyStroke other = (TwlKeyStroke) obj;
        return this.DI0 == other.DI0 && this.PP == other.PP && this.gl == other.gl;
    }

    @Override
    public int hashCode() {
        return ((415 + this.DI0) * 83 + this.PP) * 83 + this.gl;
    }
}
