package cn.pokemmo.rom.map;

import f.*;
import java.util.Arrays;

public class TownMapLocationDescriptor {
    public static final int[] RD0 = new int[0];
    public final yi_0 Ad0;
    public final ro_0 w6;
    public final byte bQ;
    public final byte mq0;
    public final byte jg0;
    public byte ui;
    public final int B8;
    public final int[] fJ;

    public TownMapLocationDescriptor(int... nArray) {
        if (nArray.length < 2) {
            throw new IllegalArgumentException();
        }
        this.Ad0 = yi_0.eO;
        this.B8 = nArray[0];
        this.fJ = Arrays.copyOfRange(nArray, 1, nArray.length);
        this.w6 = null;
        this.bQ = 0;
        this.mq0 = 0;
        this.jg0 = 0;
        this.ui = 0;
    }

    public TownMapLocationDescriptor(yi_0 yi_02, byte b, byte b2, byte b3, int i) {
        this(yi_02, b, b2, b3, i, null, (byte) 0);
    }

    public TownMapLocationDescriptor(yi_0 yi_02, byte b, byte b2, byte b3, int i, ro_0 ro_02, byte b4) {
        this(yi_02, b, b2, b3, i, ro_02, b4, (byte) 0, (byte) 0);
    }

    public TownMapLocationDescriptor(yi_0 yi_02, byte b, byte b2, byte b3, int i, ro_0 ro_02, byte b4, byte b5, byte b6) {
        this.fJ = RD0;
        if (ro_02 != null && b4 < 1) {
            throw new IllegalArgumentException(String.valueOf(b4));
        }
        if (ro_02 == ro_0.E4 && (b5 < 1 || b6 < 1)) {
            throw new IllegalArgumentException(b5 + " " + b6);
        }
        this.Ad0 = yi_02;
        this.bQ = b;
        this.mq0 = b2;
        this.jg0 = b3;
        this.B8 = i;
        this.w6 = ro_02;
        this.ui = b4;
    }

    public final void dK0() {
        if (this.Ad0 != yi_0.L5 && this.Ad0 != yi_0.f1) {
            throw new IllegalStateException();
        }
        this.ui = 25;
    }

    public final byte o4(int i, int i2, int i3) {
        switch (h00_0.QP[this.Ad0.zS]) {
            case 1: {
                return this.mq0;
            }
            case 2: {
                if ((this.w6 == ro_0.LPt9 || this.w6 == ro_0.E4) && i >= this.ui) {
                    return (byte) (Math.floor((float) i / (float) this.ui) + (double) this.mq0);
                }
                return this.mq0;
            }
            case 3: {
                if (this.B8 == 1913345 && i2 < this.ui && i >= this.ui) {
                    return (byte) (Math.floor((float) i / (float) this.ui) + (double) this.mq0);
                }
                return this.mq0;
            }
            case 5: {
                for (int j = 0; j < this.fJ.length; j++) {
                    if (this.fJ[j] == i3) {
                        int n = this.fJ[0];
                        vf_0 vf_02 = nl_0.XM.l90(i3) ? (vf_0) nl_0.XM.get(i3) : (vf_0) nl_0.XM.get(n);
                        return vf_02.o4(0, 0, -1);
                    }
                }
                return nl_0.p80(this.fJ[0]).o4(0, 0, -1);
            }
            default: {
                return -1;
            }
        }
    }

    public final byte JM(int i, int i2) {
        switch (h00_0.QP[this.Ad0.zS]) {
            case 1: {
                return this.jg0;
            }
            case 2: {
                if ((this.w6 == ro_0.qc0 || this.w6 == ro_0.E4) && i >= this.ui) {
                    return (byte) (Math.floor((float) i / (float) this.ui) + (double) this.jg0);
                }
                return this.jg0;
            }
            case 3: {
                if (this.B8 == 1913345 && i >= this.ui) {
                    return (byte) (Math.floor((float) i / (float) this.ui) + (double) this.jg0);
                }
                return this.jg0;
            }
            case 5: {
                for (int j = 0; j < this.fJ.length; j++) {
                    if (this.fJ[j] == i2) {
                        int n = this.fJ[0];
                        vf_0 vf_02 = nl_0.XM.l90(i2) ? (vf_0) nl_0.XM.get(i2) : (vf_0) nl_0.XM.get(n);
                        return vf_02.JM(0, -1);
                    }
                }
                return nl_0.p80(this.fJ[0]).JM(0, -1);
            }
            default: {
                return -1;
            }
        }
    }
}
