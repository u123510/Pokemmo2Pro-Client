package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchAction076Packet extends Nt implements eb0_0 {
    public final byte do0;
    public final byte dM;
    public final short Tz0;
    public final short ZW;
    public final int TD;

    public SwitchAction076Packet(byte do0, byte dM, short Tz0, short ZW) {
        this.do0 = do0;
        this.Tz0 = Tz0;
        this.ZW = ZW;
        this.dM = dM;
        this.TD = 0;
    }

    public SwitchAction076Packet(byte do0, byte dM, int TD) {
        this.do0 = do0;
        this.TD = TD;
        this.dM = dM;
        this.Tz0 = 0;
        this.ZW = 0;
    }

    @Override
    public final byte BL0() {
        return 76;
    }

    @Override
    public final boolean Hm() {
        return this.do0 != 0 && super.Hm();
    }

    @Override
    public final void IE0(PF first, PF second, boolean unused1, boolean unused2,
                          short unused3, boolean unused4, ML0 context, qn_1 unused5) {
        String message = "";

        if (this.dM == 0) {
            switch (this.do0) {
                case 1:
                    message = sm0_0.fg0((byte) 2, lpt6__2.Q80, this.Tz0,
                            context.yd0.QX(this.ZW, second),
                            new String[]{second == null ? "" : second.A60()});
                    break;
                case 2:
                    message = sm0_0.fg0((byte) 2, lpt6__2.Q80, this.Tz0,
                            context.yd0.QX(this.ZW, first),
                            new String[]{first == null ? "" : first.A60()});
                    break;
                case 3:
                    message = sm0_0.fg0((byte) 2, lpt6__2.Q80, this.Tz0,
                            context.yd0.eH0(this.ZW, first, second),
                            new String[]{first == null ? "" : first.A60(),
                                    second == null ? "" : second.A60()});
                    break;
                case 4:
                    message = sm0_0.Bw((byte) 2, lpt6__2.Q80, this.Tz0,
                            context.yd0.Vs0(second == null ? 0 : second.cD0, this.ZW), sm0_0.zb0);
                    break;
                case 5:
                    message = sm0_0.Bw((byte) 2, lpt6__2.Q80, this.Tz0,
                            context.yd0.Vs0(first == null ? 0 : first.cD0, this.ZW), sm0_0.zb0);
                    break;
                case 6:
                    message = sm0_0.Bw((byte) 2, lpt6__2.Q80, this.Tz0,
                            context.yd0.Vs0(first == null ? 0 : a10_0.Vp0(first.cD0), this.ZW), sm0_0.zb0);
                    break;
                case 7:
                    message = sm0_0.fg0((byte) 2, lpt6__2.Q80, this.Tz0,
                            context.yd0.eH0(this.ZW, second, first),
                            new String[]{second == null ? "" : second.A60(),
                                    first == null ? "" : first.A60()});
                    break;
                default:
                    message = sm0_0.Bw((byte) 2, lpt6__2.Q80, this.Tz0, this.ZW, sm0_0.zb0);
                    break;
            }
        } else if (this.dM == 1) {
            switch (this.do0) {
                case 1:
                    message = sm0_0.wa0(this.TD, second == null ? "" : second.A60());
                    break;
                case 2:
                    message = sm0_0.wa0(this.TD, first == null ? "" : first.A60());
                    break;
                case 3:
                    message = sm0_0.Bx(this.TD, new String[]{first == null ? "" : first.A60(),
                            second == null ? "" : second.A60()});
                    break;
                case 4:
                    message = sm0_0.c0(this.TD + (second == null ? 0 : second.cD0));
                    break;
                case 5:
                    message = sm0_0.c0(this.TD + (first == null ? 0 : first.cD0));
                    break;
                case 6:
                    message = sm0_0.c0(this.TD + (first == null ? 0 : a10_0.Vp0(first.cD0)));
                    break;
                case 7:
                    message = sm0_0.Bx(this.TD, new String[]{second == null ? "" : second.A60(),
                            first == null ? "" : first.A60()});
                    break;
                default:
                    message = sm0_0.c0(this.TD);
                    break;
            }
        }

        context.wJ(message, "", null);
    }
}
