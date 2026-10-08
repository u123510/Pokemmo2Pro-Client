package cn.pokemmo.audio;

import f.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 现代化重构类 - 原始类: f.O8
 */
public abstract class AudioStreamSource implements fy0_0 {

    public a10_0 lpT2;
    public final byte ZG0;
    public final byte qc;
    public boolean Jo;
    public byte sR;
    public final tb0_1[] L00;
    public final ek_0 zI;

    public AudioStreamSource(byte zG0, byte quality) {
        this.sR = -1;
        this.ZG0 = zG0;
        this.qc = quality;
        this.L00 = new tb0_1[quality];
        for (byte index = 0; index < this.L00.length; index = (byte) (index + 1)) {
            this.L00[index] = new tb0_1((O8) this, zG0, index);
        }
        this.zI = new ek_0();
    }

    public void dj(a10_0 value) {
        this.lpT2 = value;
    }

    public tb0_1[] zz() {
        return this.NC((O8) this);
    }

    public tb0_1[] NC(O8 ignored) {
        return this.L00;
    }

    public final tb0_1[] Ta(byte index) {
        return this.L40(index).NC((O8) this);
    }

    public byte Fr(O8 ignored) {
        return 0;
    }

    public final byte th() {
        return this.ZG0;
    }

    public boolean BE0() {
        return this.Jo;
    }

    public final void fC(byte value) {
        this.sR = value;
    }

    public abstract con__6 Td0();

    public String a70(a10_0 ignored) {
        return "";
    }

    public abstract String BO();

    public String T8(a10_0 data) {
        ArrayList values = new ArrayList();
        values.add(this.M2());
        byte count = 0;
        for (byte index = 0; index < data.wI0[this.ZG0].length; index = (byte) (index + 1)) {
            PF value = data.Ce(this.ZG0, index);
            if (value != null && !value.zi0.hf0()) {
                count = (byte) (count + 1);
                values.add(value.A60());
            }
        }
        if (count < 1) {
            return "";
        }
        String[] names = (String[]) values.toArray(new String[0]);
        return sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, count + 16, names);
    }

    public O8 L40(byte ignored) {
        return (O8) this;
    }

    public O8 Sf(byte ignored) { return (O8) this; }

    public void Dt(float first, float second) {
    }

    public void LPT7() {
    }

    public List v10() {
        return null;
    }

    public void Vs0(int first, int second) {
    }

    public void jG() {
    }

    public ii0_2 b90() {
        return null;
    }

    public boolean Sw() {
        return !(this instanceof MC);
    }

    public String Zc() {
        return "";
    }

    public boolean pq(ML0 context, boolean enabled, String ignored, SZ[] requirements, int start) {
        if (this.ZG0 != context.yd0.Ez0()) {
            enabled = false;
        }
        byte index = (byte) (enabled ? 1 : 0);
        while (index < context.yd0.wI0[this.ZG0].length) {
            PF value = context.yd0.Ce(this.ZG0, index);
            if (value != null && !value.zi0.hf0() && value.LpT9.oW.x > 0.0F) {
                bv0_0 link = new bv0_0(value);
                link.Si = false;
                context.lZ.add(new kw_0(link));
            }
            index = (byte) (index + 1);
        }

        eu_2 action = new eu_2((O8) this, (byte) 0);
        context.lZ.add(action);
        boolean result = false;
        if (requirements != null) {
            for (SZ requirement : requirements) {
                result |= context.Yn0(requirement);
            }
        }
        return result;
    }

    public boolean Hb() {
        return this instanceof ux_0;
    }

    public abstract String M2();

    public String jI() {
        return this.M2();
    }

    public String zn() {
        return this.bM((O8) this);
    }

    public String bM(O8 ignored) {
        return "";
    }

    public byte f90() {
        return tw0_0.e60.Com4;
    }

    public short WK0() {
        con__6 data = this.Td0();
        byte index = tw0_0.e60.Com4;
        if (index >= 0 && index < data.VP.length) {
            return data.VP[index];
        }
        return data.VP[0];
    }

    public byte Mo() {
        return tw0_0.e60.Com4;
    }

    public short cd() {
        con__6 data = this.Td0();
        byte index = tw0_0.e60.Com4;
        if (index >= 0 && index < data.Ub.length) {
            return data.Ub[index];
        }
        return data.Ub[0];
    }

    public final byte Ms0() {
        return this.qc;
    }

    @Override
    public void dispose() {
    }

    public void vy() {
    }

    public void Im(byte first, byte second) {
    }

    public final void oj0(tb0_1 item) {
        byte threshold = item.X90;
        se_0 state = new se_0();
        item.B3 = state;
        item.uG0 = 0;
        item.Wb();
        for (byte index = 0; index < this.L00.length; index = (byte) (index + 1)) {
            if (index <= threshold || index == 0) {
                continue;
            }
            tb0_1 current = this.L00[index];
            if (current.uG0 == 0) {
                continue;
            }
            tb0_1 previous = this.L00[index - 1];
            PF value = null;
            if (current.gQ()) {
                value = this.lpT2.nd0(current.tz0());
            }
            previous.uG0 = current.uG0;
            previous.B3 = current.B3;
            current.B3.Bn.ou0 = (short) previous.X90;
            previous.lQ = false;
            previous.Wb();
            current.B3 = new se_0();
            current.uG0 = 0;
            current.Wb();
            if (value != null) {
                value.r10 = previous;
            }
        }
    }

    public void ho0() {
    }

    public void Wa0(hl0_1 value) {
    }

    public void aE0(float value, byte mode) {
    }

    public void Cq0(int value, boolean enabled) {
    }
}
