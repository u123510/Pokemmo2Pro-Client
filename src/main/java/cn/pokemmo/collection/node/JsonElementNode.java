package cn.pokemmo.collection.node;

import f.*;

import java.util.Iterator;

public class JsonElementNode implements Iterable<oe_0> {
    public lpt3__3 wH0;
    public String lpt4;
    public double dJ;
    public long yY;
    public String Z3;
    public oe_0 dz0;
    public oe_0 y8;
    public oe_0 Uu;
    public oe_0 cA;
    public int lpt3;

    public JsonElementNode(lpt3__3 type) {
        this.wH0 = type;
    }

    public JsonElementNode(String value) {
        WU(value);
    }

    public JsonElementNode(double value) {
        wV(value, null);
    }

    public JsonElementNode(long value) {
        UC(value, null);
    }

    public JsonElementNode(double value, String stringValue) {
        wV(value, stringValue);
    }

    public JsonElementNode(long value, String stringValue) {
        UC(value, stringValue);
    }

    public JsonElementNode(boolean value) {
        JG(value);
    }

    public static void H9(JsonElementNode v0, b3_0 v1, int i2, hq_0 v3) {
        sg_1 v4 = v3.Sn0;
        if (v0.wH0 == lpt3__3.NR) {
            oe_0 v5 = v0.dz0;
            if (v5 == null) {
                v1.sV("{}");
                return;
            }
            boolean singleLine = true;
            for (oe_0 cur = v5; cur != null; cur = cur.Uu) {
                if (cur.wH0 == lpt3__3.NR || cur.jY()) {
                    singleLine = false;
                    break;
                }
            }
            boolean i5 = !singleLine;
            int i6 = v1.hp0;
            while (true) {
                if (i5) {
                    v1.sV("{\n");
                } else {
                    v1.sV("{ ");
                }
                oe_0 child = v0.dz0;
                boolean restart = false;
                while (child != null) {
                    if (i5) {
                        for (int i8 = 0; i8 < i2; i8++) {
                            v1.GC0('\t');
                        }
                    }
                    v1.sV(v4.zn(child.Z3));
                    v1.sV(": ");
                    H9(child, v1, i2 + 1, v3);
                    if ((!i5 || v4 != sg_1.u80) && child.Uu != null) {
                        v1.GC0(',');
                    }
                    char sep = i5 ? '\n' : ' ';
                    v1.GC0(sep);
                    if (!i5 && (v1.hp0 - i6 > v3.Nz0)) {
                        v1.A2(i6);
                        i5 = true;
                        restart = true;
                        break;
                    }
                    child = child.Uu;
                }
                if (restart) {
                    continue;
                }
                if (i5) {
                    for (int i8 = 0; i8 < i2 - 1; i8++) {
                        v1.GC0('\t');
                    }
                }
                v1.GC0('}');
                return;
            }
        } else if (v0.jY()) {
            oe_0 v5 = v0.dz0;
            if (v5 == null) {
                v1.sV("[]");
                return;
            }
            boolean singleLine = true;
            for (oe_0 cur = v5; cur != null; cur = cur.Uu) {
                if (cur.wH0 == lpt3__3.NR || cur.jY()) {
                    singleLine = false;
                    break;
                }
            }
            boolean i5 = !singleLine;
            boolean i6 = false;
            for (oe_0 cur = v0.dz0; cur != null; cur = cur.Uu) {
                lpt3__3 t = cur.wH0;
                if (t != lpt3__3.I50 && t != lpt3__3.X20) {
                    i6 = true;
                    break;
                }
            }
            int i7 = v1.hp0;
            while (true) {
                if (i5) {
                    v1.sV("[\n");
                } else {
                    v1.sV("[ ");
                }
                oe_0 child = v0.dz0;
                boolean restart = false;
                while (child != null) {
                    if (i5) {
                        for (int i9 = 0; i9 < i2; i9++) {
                            v1.GC0('\t');
                        }
                    }
                    H9(child, v1, i2 + 1, v3);
                    if ((!i5 || v4 != sg_1.u80) && child.Uu != null) {
                        v1.GC0(',');
                    }
                    char sep = i5 ? '\n' : ' ';
                    if (i6) {
                        v1.GC0(sep);
                    }
                    if (!i5 && (v1.hp0 - i7 > v3.Nz0)) {
                        v1.A2(i7);
                        i5 = true;
                        restart = true;
                        break;
                    }
                    child = child.Uu;
                }
                if (restart) {
                    continue;
                }
                if (i5) {
                    for (int i9 = 0; i9 < i2 - 1; i9++) {
                        v1.GC0('\t');
                    }
                }
                v1.GC0(']');
                return;
            }
        } else if (v0.wH0 == lpt3__3.ND0) {
            v1.sV(v4.Gx(v0.cd0()));
        } else if (v0.wH0 == lpt3__3.I50) {
            double d2 = v0.j60();
            double d4 = (double) v0.qh();
            if (d2 == d4) {
                d2 = d4;
            }
            v1.sV(Double.toString(d2));
        } else if (v0.wH0 == lpt3__3.X20) {
            long j2 = v0.qh();
            if (j2 == Long.MIN_VALUE) {
                v1.sV("-9223372036854775808");
                return;
            }
            if (j2 < 0) {
                v1.GC0('-');
                j2 = -j2;
            }
            if (j2 >= 10000L) {
                if (j2 >= 1000000000000000000L) {
                    v1.GC0(b3_0.mK0[(int) (((double) j2 % 10000000000000000000.0) / 1000000000000000000.0)]);
                }
                if (j2 >= 100000000000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 1000000000000000000L) / 100000000000000000L)]);
                }
                if (j2 >= 10000000000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 100000000000000000L) / 10000000000000000L)]);
                }
                if (j2 >= 1000000000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 10000000000000000L) / 1000000000000000L)]);
                }
                if (j2 >= 100000000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 1000000000000000L) / 100000000000000L)]);
                }
                if (j2 >= 10000000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 100000000000000L) / 10000000000000L)]);
                }
                if (j2 >= 1000000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 10000000000000L) / 1000000000000L)]);
                }
                if (j2 >= 100000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 1000000000000L) / 100000000000L)]);
                }
                if (j2 >= 10000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 100000000000L) / 10000000000L)]);
                }
                if (j2 >= 1000000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 10000000000L) / 1000000000L)]);
                }
                if (j2 >= 100000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 1000000000L) / 100000000L)]);
                }
                if (j2 >= 10000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 100000000L) / 10000000L)]);
                }
                if (j2 >= 1000000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 10000000L) / 1000000L)]);
                }
                if (j2 >= 100000L) {
                    v1.GC0(b3_0.mK0[(int) ((j2 % 1000000L) / 100000L)]);
                }
                v1.GC0(b3_0.mK0[(int) ((j2 % 100000L) / 10000L)]);
            }
            if (j2 >= 1000L) {
                v1.GC0(b3_0.mK0[(int) ((j2 % 10000L) / 1000L)]);
            }
            if (j2 >= 100L) {
                v1.GC0(b3_0.mK0[(int) ((j2 % 1000L) / 100L)]);
            }
            if (j2 >= 10L) {
                v1.GC0(b3_0.mK0[(int) ((j2 % 100L) / 10L)]);
            }
            v1.GC0(b3_0.mK0[(int) (j2 % 10L)]);
        } else if (v0.wH0 == lpt3__3.hG) {
            v1.sV(v0.Xv0() ? "true" : "false");
        } else if (v0.wH0 == lpt3__3.E80) {
            v1.sV("null");
        } else {
            throw new WC0("Unknown object type: " + v0);
        }
    }

    public final oe_0 Is(String name) {
        for (oe_0 current = this.dz0; current != null; current = current.Uu) {
            if (current.Z3 != null && current.Z3.equalsIgnoreCase(name)) {
                return current;
            }
        }
        return null;
    }

    public final boolean UJ0(String name) {
        return Is(name) != null;
    }

    public final oe_0 package$(String name) {
        oe_0 found = Is(name);
        if (found != null) {
            return found;
        }
        throw new IllegalArgumentException("Child not found with name: ".concat(name));
    }

    public final String cd0() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
                return this.lpt4;
            case 2:
                return this.lpt4 != null ? this.lpt4 : Double.toString(this.dJ);
            case 3:
                return this.lpt4 != null ? this.lpt4 : Long.toString(this.yY);
            case 4:
                return this.yY != 0L ? "true" : "false";
            case 5:
                return null;
            default:
                throw new IllegalStateException("Value cannot be converted to string: " + this.wH0);
        }
    }

    public final float vZ() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
                return Float.parseFloat(this.lpt4);
            case 2:
                return (float) this.dJ;
            case 3:
                return (float) this.yY;
            case 4:
                return this.yY != 0L ? 1.0f : 0.0f;
            default:
                throw new IllegalStateException("Value cannot be converted to float: " + this.wH0);
        }
    }

    public final double j60() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
                return Double.parseDouble(this.lpt4);
            case 2:
                return this.dJ;
            case 3:
                return (double) this.yY;
            case 4:
                return this.yY != 0L ? 1.0 : 0.0;
            default:
                throw new IllegalStateException("Value cannot be converted to double: " + this.wH0);
        }
    }

    public final long qh() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
                return Long.parseLong(this.lpt4);
            case 2:
                return (long) this.dJ;
            case 3:
                return this.yY;
            case 4:
                return this.yY != 0L ? 1L : 0L;
            default:
                throw new IllegalStateException("Value cannot be converted to long: " + this.wH0);
        }
    }

    public final int coM4() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
                return Integer.parseInt(this.lpt4);
            case 2:
                return (int) this.dJ;
            case 3:
                return (int) this.yY;
            case 4:
                return this.yY != 0L ? 1 : 0;
            default:
                throw new IllegalStateException("Value cannot be converted to int: " + this.wH0);
        }
    }

    public final boolean Xv0() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
                return "true".equalsIgnoreCase(this.lpt4);
            case 2:
                return this.dJ != 0.0;
            case 3:
                return this.yY != 0L;
            case 4:
                return this.yY != 0L;
            default:
                throw new IllegalStateException("Value cannot be converted to boolean: " + this.wH0);
        }
    }

    public final byte Oz() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
                return Byte.parseByte(this.lpt4);
            case 2:
                return (byte) this.dJ;
            case 3:
                return (byte) this.yY;
            case 4:
                return this.yY != 0L ? (byte) 1 : (byte) 0;
            default:
                throw new IllegalStateException("Value cannot be converted to byte: " + this.wH0);
        }
    }

    public final short lm0() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
                return Short.parseShort(this.lpt4);
            case 2:
                return (short) this.dJ;
            case 3:
                return (short) this.yY;
            case 4:
                return this.yY != 0L ? (short) 1 : (short) 0;
            default:
                throw new IllegalStateException("Value cannot be converted to short: " + this.wH0);
        }
    }

    public final String L1(String name, String defaultValue) {
        oe_0 child = Is(name);
        if (child != null) {
            int val = Z9.zl0[child.wH0.ordinal()];
            if (val >= 1 && val <= 6) {
                if (child.wH0 != lpt3__3.E80) {
                    return child.cd0();
                }
            }
        }
        return defaultValue;
    }

    public final float sr(String name, float defaultValue) {
        oe_0 child = Is(name);
        if (child != null) {
            int val = Z9.zl0[child.wH0.ordinal()];
            if (val >= 1 && val <= 6) {
                if (child.wH0 != lpt3__3.E80) {
                    return child.vZ();
                }
            }
        }
        return defaultValue;
    }

    public final String Nz0(String name) {
        oe_0 child = Is(name);
        if (child != null) {
            return child.cd0();
        }
        throw new IllegalArgumentException("Named value not found: ".concat(name));
    }

    public final float pI0(int index) {
        oe_0 child = this.dz0;
        while (child != null && index > 0) {
            child = child.Uu;
            index--;
        }
        if (child != null) {
            return child.vZ();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.Z3);
    }

    public final boolean jY() {
        return this.wH0 == lpt3__3.cL;
    }

    public final void WU(String value) {
        this.lpt4 = value;
        this.wH0 = (value == null) ? lpt3__3.E80 : lpt3__3.ND0;
    }

    public final void wV(double value, String stringValue) {
        this.lpt4 = stringValue;
        this.dJ = value;
        this.yY = (long) value;
        this.wH0 = lpt3__3.I50;
    }

    public final void UC(long value, String stringValue) {
        this.lpt4 = stringValue;
        this.yY = value;
        this.dJ = (double) value;
        this.wH0 = lpt3__3.X20;
    }

    public final void JG(boolean value) {
        this.yY = value ? 1L : 0L;
        this.wH0 = lpt3__3.hG;
    }

    @Override
    public final String toString() {
        switch (Z9.zl0[this.wH0.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (this.Z3 == null) {
                    return cd0();
                }
                return this.Z3 + ": " + cd0();
            default:
                StringBuilder sb = new StringBuilder();
                String prefix;
                if (this.Z3 == null) {
                    prefix = "";
                } else {
                    prefix = VG.Mq(new StringBuilder(), this.Z3, ": ");
                }
                sb.append(prefix);
                hq_0 settings = new hq_0();
                settings.Sn0 = sg_1.u80;
                settings.Nz0 = 0;
                b3_0 buffer = new b3_0(512);
                H9(this, buffer, 0, settings);
                sb.append(buffer.toString());
                return sb.toString();
        }
    }

    public final String Dq() {
        oe_0 parent = this.y8;
        if (parent == null) {
            if (this.wH0 == lpt3__3.cL) {
                return "[]";
            }
            if (this.wH0 == lpt3__3.NR) {
                return "{}";
            }
            return "";
        }
        String segment;
        if (parent.wH0 == lpt3__3.cL) {
            segment = "[]";
            int idx = 0;
            for (oe_0 child = parent.dz0; child != null; child = child.Uu) {
                if (child == this) {
                    segment = GQ.ti("[", idx, "]");
                    break;
                }
                idx++;
            }
        } else if (this.Z3.indexOf('.') != -1) {
            segment = ".\"" + this.Z3.replace("\"", "\\\"") + "\"";
        } else {
            segment = "." + this.Z3;
        }
        return this.y8.Dq() + segment;
    }

    @Override
    public final Iterator<oe_0> iterator() {
        return new ok_2(this);
    }
}
