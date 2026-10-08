package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

import java.text.DecimalFormat;

public class TrainerBadgeTagLabel extends BaseTaggedLabelWidget {

    public TrainerBadgeTagLabel(fd0_0 v1, cq_0 v2, byte i3, byte i4) {
        super("999", tw0_0.kz0() ? 96 : 46, tw0_0.kz0() ? 96 : 46);
        ap_0 os = v1.Os();
        boolean seen = os.ID0((byte) 0, v2.Nm());
        boolean caught = os.ID0((byte) 1, v2.Nm());
        boolean caughtOT = os.ID0((byte) 2, v2.Nm());
        boolean isAlphaCaught = os.ID0((byte) 3, v2.Nm()) && i4 == -2;

        boolean flag;
        if (v2.BU() > 1) {
            if (v1.Os().hs0(v2.Nm()) == 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                flag = seen && i3 == 0;
                caught = caught && i3 == 0;
            } else {
                if (i3 < 0) {
                    i3 = A3(v1.Os(), v2);
                }
                flag = v1.Os().H6((byte) 0, i3, v2.Nm());
                caught = v1.Os().H6((byte) 1, i3, v2.Nm());
                caughtOT = v1.Os().H6((byte) 2, i3, v2.Nm());
            }
        } else {
            flag = seen;
        }

        this.sl().o60(new AG0[]{
            yh_0.Dl0().qC0(yh_0.Ed(i3, v2.Nm()), (byte) 0, isAlphaCaught)[0]
        });
        if (!flag) {
            this.sl().wx0(new gn_0((byte) 0, (byte) 0, (byte) 0, (byte) -76));
        }

        if (tw0_0.kz0()) {
            this.sl().dA(2.0f);
            this.sl().Gy0(11, -6);
        } else {
            this.sl().Gy0(5, -6);
        }

        this.uf("monsterdex-button");
        if (!seen) {
            boolean dummy = h50_0.Bj0;
            this.Xr0("???");
        } else {
            this.Xr0(v2.zj());
        }

        if (isAlphaCaught) {
            this.uf("monsterdex-button-caught-alpha");
        } else if (i4 != -2) {
            if (caughtOT) {
                this.uf("monsterdex-button-caught-ot");
            } else {
                boolean dummy = h50_0.Bj0;
                if (caught) {
                    this.uf("monsterdex-button-caught");
                }
            }
        }

        this.SU(new DecimalFormat("000").format((long) v2.MN(i4)));
        final byte finalI3 = i3;
        this.RR(() -> Do0(v1, v2, finalI3));
        this.Bb(200);
    }

    public static /* synthetic */ void Do0(fd0_0 v0, cq_0 v1, byte i2) {
        v0.y0(i2, v1);
    }

    public static byte A3(ap_0 v0, cq_0 v1) {
        byte b2 = -1;
        boolean b3 = false;
        byte b4 = 0;
        while (b4 < v1.ar) {
            short dR = v1.dR;
            if (v0.H6((byte) 0, b4, dR) && b2 < 0) {
                b2 = b4;
            }
            if (v0.H6((byte) 1, b4, dR) && (b2 < 0 || !b3)) {
                b3 = true;
                b2 = b4;
            }
            if (v0.H6((byte) 2, b4, dR)) {
                b2 = b4;
                break;
            }
            b4 = (byte) (b4 + 1);
        }
        if (b2 < 0) {
            return 0;
        }
        return b2;
    }
}
