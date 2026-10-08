// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.world.entity.item;

import f.*;

public abstract class OverworldGroundItemEntity extends S70
{
    public sc_1 or0;
    public int Rv;
    public String Gq0;
    public String R60;
    public String fE0;
    public String nL;
    private static final int[] F2 = new int[]{1, 5, 2, 3, 4, 6, 7, 8, 9, 10, 11};
    
    public OverworldGroundItemEntity(final sc_1 sc_1) {
        this.Gq0 = "";
        this.R60 = "";
        this.fE0 = "";
        this.nL = "";
        this.uf("effects-slot");
        this.Yh(sc_1);
    }
    
    public final void Yh(final sc_1 or0) {
        this.or0 = or0;
        if (or0 == null) {
            super.og.lo0();
            super.yj0 = null;
            this.yB0();
            this.Sk("");
            this.Ll(false);
        }
        else {
            this.Ll(true);
            short v4 = 0;
            Label_0674: {
                final ba_2 a;
                StringBuilder sb = null;
                ba_2 ba_4 = null;
                switch (F2[(a = this.or0.a).i00.Y1]) {
                    default: {
                        this.Gq0 = "";
                        this.R60 = "";
                        break Label_0674;
                    }
                    case 11: {
                        v4 = 1232;
                        this.Gq0 = sm0_0.c0(16805127);
                        break Label_0674;
                    }
                    case 10: {
                        final short hq;
                        if ((hq = a.HQ) == 1003) {
                            v4 = 1497;
                            this.Gq0 = sm0_0.c0(16777278);
                            break Label_0674;
                        }
                        if (hq == 1004) {
                            v4 = gu0.l2.lPT6((short)1446).V4();
                            this.Gq0 = mp_1.vf0().W50((short)655).FZ();
                            break Label_0674;
                        }
                        throw new IllegalArgumentException(String.valueOf(this.or0.a.HQ));
                    }
                    case 9: {
                        v4 = 1308;
                        this.Gq0 = sm0_0.c0(16804151);
                        break Label_0674;
                    }
                    case 8: {
                        v4 = 1040;
                        this.Gq0 = sm0_0.c0(16777248);
                        break Label_0674;
                    }
                    case 7: {
                        v4 = 5079;
                        this.Gq0 = sm0_0.c0(16777237);
                        break Label_0674;
                    }
                    case 6: {
                        final ba_2 ba_2 = a;
                        v4 = 5281;
                        final short hq2;
                        if ((hq2 = ba_2.HQ) >= 200 && hq2 <= 217) {
                            v4 = 1500;
                        }
                        this.Gq0 = sm0_0.c0(101116);
                        break Label_0674;
                    }
                    case 5: {
                        final ba_2 ba_3 = a;
                        v4 = 5223;
                        final short hq3;
                        if ((hq3 = ba_3.HQ) >= 100 && hq3 <= 199) {
                            v4 = 1412;
                        }
                        this.Gq0 = sm0_0.c0(101128);
                        sb = new StringBuilder("+");
                        ba_4 = this.or0.a;
                        break;
                    }
                    case 4: {
                        final ba_2 ba_5 = a;
                        v4 = 5550;
                        final short hq4;
                        if ((hq4 = ba_5.HQ) >= 100 && hq4 <= 199) {
                            v4 = 1409;
                        }
                        this.Gq0 = sm0_0.c0(101126);
                        this.R60 = "+" + (100.0f - this.or0.a.lt * 100.0f) + "%";
                        break Label_0674;
                    }
                    case 3: {
                        final ba_2 ba_6 = a;
                        v4 = 5241;
                        final short hq5;
                        if ((hq5 = ba_6.HQ) >= 100 && hq5 <= 199) {
                            v4 = 1406;
                        }
                        this.Gq0 = sm0_0.c0(101124);
                        sb = new StringBuilder("+");
                        ba_4 = this.or0.a;
                        break;
                    }
                    case 2: {
                        final ba_2 ba_7 = a;
                        v4 = 5242;
                        final short hq6;
                        if ((hq6 = ba_7.HQ) >= 100 && hq6 <= 199) {
                            v4 = 1403;
                        }
                        this.Gq0 = sm0_0.c0(101122);
                        sb = new StringBuilder("+");
                        ba_4 = this.or0.a;
                        break;
                    }
                    case 1: {
                        final ba_2 ba_8 = a;
                        v4 = 5231;
                        final short hq7;
                        if ((hq7 = ba_8.HQ) == 2) {
                            v4 = 1193;
                        }
                        else if (hq7 >= 100 && hq7 <= 199) {
                            v4 = 1400;
                        }
                        this.Gq0 = sm0_0.c0(101120);
                        sb = new StringBuilder("+");
                        ba_4 = this.or0.a;
                        break;
                    }
                }
                this.R60 = sb.append(ba_4.lt * 100.0f - 100.0f).append("%").toString();
            }
            super.og.Nk(gh_1.aH0.PB(v4, false));
            final Br0 og = super.og;
            final int gy = (super.Mx - og.De0()) / 2;
            final int a2 = 5;
            og.gY = gy;
            og.a4 = a2;
            Br0 br3;
            Br0 br2;
            Br0 br0;
            int if1;
            int gx0;
            if (tw0_0.kz0()) {
                br0 = (br2 = (br3 = super.og));
                if1 = 48;
                gx0 = 48;
            }
            else {
                br0 = (br2 = (br3 = super.og));
                if1 = 24;
                gx0 = 24;
            }
            br2.OA0 = true;
            br0.IF = if1;
            br3.gx0 = gx0;
            final E90 jb0;
            if ((jb0 = tw0_0.e60.jB0) != null && !this.or0.TZ.equals(jb0.oc0)) {
                this.fE0 = this.or0.TZ;
            }
            this.Rv = this.or0.YK;
            this.kG();
            this.BI0();
            super.GH0 = 100;
            this.pw0(true);
            super.lv = true;
        }
    }
    
    @Override
    public final void K8() {
        super.K8();
        final Br0 og = super.og;
        final int gy = (super.Mx - og.De0()) / 2;
        final int a4 = 5;
        og.gY = gy;
        og.a4 = a4;
    }
    
    public final void kG() {
        String s = this.Gq0;
        if (!this.R60.isEmpty()) {
            s = AN.nK0(s, "\n").append(this.R60).toString();
        }
        if (this.or0 != null) {
            if (this.Rv > 0) {
                s = AN.nK0(s, "\n").append(tx_1.HU(this.Rv, 2)).toString();
            }
            if (!this.fE0.isEmpty()) {
                s = AN.nK0(s, "\n").append(sm0_0.wa0(6069, this.fE0)).toString();
            }
        }
        if (!s.equals(this.nL)) {
            super.yj0 = s;
            this.yB0();
            this.nL = s;
        }
    }
    
    public final void BI0() {
        if (this.or0.YK < 0) {
            this.Sk("\u221e");
            return;
        }
        final int rv;
        if ((rv = this.Rv) < 1) {
            this.Sk(" ");
            return;
        }
        final int n = rv;
        final dl_1 sy0 = tx_1.Sy0;
        String s;
        if (n > 86400) {
            final int n2 = rv;
            final int n3;
            final int i = (n2 - (n3 = n2 / 86400) * 86400) / 3600;
            if (sm0_0.cU.l90(7511)) {
                final String[] array2;
                final String[] array = array2 = new String[2];
                final int j = i;
                array2[0] = String.valueOf(n3);
                array[1] = String.valueOf(j);
                s = sm0_0.Bx(7511, array2);
            }
            else {
                s = n3 + "d" + i + "h";
            }
        }
        else if (rv > 3600) {
            final int n4 = rv / 3600;
            if (sm0_0.cU.l90(7512)) {
                s = sm0_0.wa0(7512, String.valueOf(n4));
            }
            else {
                s = n4 + "h";
            }
        }
        else if (rv > 60) {
            final int n5 = rv / 60;
            if (sm0_0.cU.l90(7513)) {
                s = sm0_0.wa0(7513, String.valueOf(n5));
            }
            else {
                s = n5 + "m";
            }
        }
        else if (sm0_0.cU.l90(7514)) {
            s = sm0_0.wa0(7514, String.valueOf(rv));
        }
        else {
            s = rv + "s";
        }
        this.Sk(s);
    }
}

