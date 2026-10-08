package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.text.NumberFormat;

public class SwitchAction043Packet extends Nt implements eb0_0 {
    public final short UA0;
    public final byte C6;
    public final short lpT2;
    public final short E00;
    public final short X80;

    public SwitchAction043Packet(byte b, short s, short s2, short s3, short s4) {
        this.lpT2 = s2;
        this.E00 = s3;
        this.X80 = s4;
        this.UA0 = s;
        this.C6 = b;
    }

    @Override
    public final byte BL0() {
        return 43;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1) {
        a10_0 a10_0 = ml0.yd0;
        String str1 = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, a10_0.QX(1080, pf2), new String[]{pf2.A60(), sm0_0.c0(this.UA0 + 110000)});
        String str2 = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, a10_0.QX(1080, pf2), new String[]{pf2.A60(), sm0_0.c0(this.UA0 + 110000)});
        if (this.lpT2 != this.E00) {
            if ((a10_0.m40 && dw_2.zC0 >= 1) || dw_2.zC0 >= 2) {
                double d = (tx_1.uF(this.E00, this.X80) - tx_1.uF(this.lpT2, this.X80)) * -1.0;
                StringBuilder sb = new StringBuilder("( ");
                sb.append(pf2.Yp());
                sb.append(" ");
                if (d > 0.0) {
                    sb.append("+");
                } else {
                    sb.append("");
                }
                sb.append(NumberFormat.getInstance().format(d));
                sb.append("% )");
                str2 = str2 + " " + sb.toString();
            }
        }
        ml0.wJ(str1, str2, null);

        switch (this.C6) {
            case 0:
                if (this.UA0 == 353 || this.UA0 == 3353) {
                    ml0.lZ.add(new kw_0((byte) 0, new el0_1(pf2).vv(pf)));
                } else {
                    ml0.lZ.add(new kw_0((byte) 0, new df_1(pf2).vv(pf)));
                }
                break;
            case 1:
                String msg1 = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, a10_0.QX(213, pf2), new String[]{pf2.A60()});
                ml0.wJ(msg1, "", null);
                break;
            case 2:
                String msg2 = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 71, sm0_0.zb0);
                ml0.wJ(msg2, "", null);
                break;
            case 3:
                String msg3 = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, a10_0.QX(210, pf2), new String[]{pf2.A60()});
                ml0.wJ(msg3, "", null);
                break;
            default:
                break;
        }
    }
}
