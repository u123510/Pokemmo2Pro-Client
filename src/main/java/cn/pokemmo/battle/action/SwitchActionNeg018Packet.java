package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchActionNeg018Packet extends Nt implements eb0_0 {
    public final byte sI;
    public final byte l60;
    public final byte i8;

    public SwitchActionNeg018Packet(byte i1, byte i2, byte i3) {
        super();
        this.l60 = i2;
        this.sI = i1;
        this.i8 = i3;
    }

    @Override
    public final byte BL0() {
        return -18;
    }

    @Override
    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        Oz0 v3 = tw0_0.LD0.he0;
        ek_0 v4 = tw0_0.PK0.mn(this.l60).zI;
        switch (this.sI) {
            case 0:
            case 1: {
                int code = (this.sI != 0) ? 170 : 168;
                int i0 = v7.yd0.Vs0(this.l60, code);
                String text = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, i0, sm0_0.zb0);
                v7.wJ(text, "", () -> Od0(v4, v3));
                break;
            }
            case 2: {
                int msgId = 1156;
                a10_0 yd0 = v7.yd0;
                if (this.l60 != yd0.Ez0()) {
                    if (yd0.mn(this.l60) instanceof ux_0) {
                        msgId = 1157;
                    } else {
                        msgId = 1158;
                    }
                }
                String text = sm0_0.Bw((byte) 2, lpt6__2.Q80, 14, msgId, new String[]{v2.Yp()});
                v7.I1(text, "", null);
                v7.lZ.add(new kw_0((byte) 0, new EE0(v1).vv(v2)));
                break;
            }
            case 3:
            case 4: {
                int code = (this.sI == 3) ? 172 : 174;
                int i0 = v7.yd0.Vs0(this.l60, code);
                String text = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, i0, sm0_0.zb0);
                v7.wJ(text, "", () -> Kv0(v4, v3));
                break;
            }
            case 5:
            case 6: {
                int code = (this.sI == 5) ? 164 : 166;
                int i0 = v7.yd0.Vs0(this.l60, code);
                String text = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, i0, sm0_0.zb0);
                v7.wJ(text, "", () -> mH0(v4, v3));
                break;
            }
            default:
                break;
        }
    }

    public final void mH0(ek_0 v1, Oz0 v2) {
        v1.cU = this.i8;
        v2.Z8(this.l60, (short) 518);
    }

    public final void Kv0(ek_0 v1, Oz0 v2) {
        v1.COm5 = this.i8;
        v2.Z8(this.l60, (short) 520);
    }

    public final void Od0(ek_0 v1, Oz0 v2) {
        v1.Wn0 = this.i8;
        v2.Z8(this.l60, (short) 519);
    }
}
