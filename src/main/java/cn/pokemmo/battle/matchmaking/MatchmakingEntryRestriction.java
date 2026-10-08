package cn.pokemmo.battle.matchmaking;

import f.*;

public class MatchmakingEntryRestriction {
    public byte Ee0;
    public short gl0;
    public short zn;
    public short MS;
    public short Hz0;
    public final GV Hu0;
    public final N2 Cx0;
    public byte s1;

    public MatchmakingEntryRestriction(byte b, short s, short s2, short s3, short s4, GV gv, N2 n2, byte b2) {
        super();
        this.Ee0 = b;
        this.gl0 = s;
        this.zn = s2;
        this.MS = s3;
        this.Hz0 = s4;
        this.Hu0 = gv;
        this.Cx0 = n2;
        this.s1 = b2;
        zd();
    }

    public final void zd() {
        byte b = this.Ee0;
        if (b != 0 && b != 1 && b != 2) {
            this.Ee0 = 0;
        }
        if (this.gl0 < 0) {
            this.gl0 = 0;
        }
        if (this.zn < 0) {
            this.zn = 0;
        }
        if (this.MS < 0) {
            this.MS = 0;
        }
        if (this.Hz0 < 0) {
            this.Hz0 = 0;
        }
        if (this.s1 < 0) {
            this.s1 = -1;
        }
    }

    public final byte zk() {
        return this.Ee0;
    }

    public final short Ds() {
        return this.gl0;
    }

    public final short uj() {
        return this.zn;
    }

    public final short r6() {
        return this.MS;
    }

    public final short fy() {
        return this.Hz0;
    }

    public final byte QL() {
        return this.s1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof qr_1)) {
            return false;
        }
        qr_1 qr_1Var = (qr_1) obj;
        return this.Ee0 == qr_1Var.Ee0
            && this.gl0 == qr_1Var.gl0
            && this.zn == qr_1Var.zn
            && this.MS == qr_1Var.MS
            && this.Hz0 == qr_1Var.Hz0
            && this.Hu0 == qr_1Var.Hu0
            && this.Cx0 == qr_1Var.Cx0
            && this.s1 == qr_1Var.s1;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qr_1.class.getSimpleName());
        sb.append("[");
        sb.append((int) this.Ee0);
        sb.append(" ");
        sb.append((int) this.gl0);
        sb.append(", ");
        sb.append((int) this.zn);
        sb.append(", ");
        sb.append((int) this.MS);
        sb.append(", ");
        sb.append((int) this.Hz0);
        sb.append(", ");
        sb.append((int) this.Hu0.gk);
        sb.append(", ");
        sb.append(this.Cx0);
        sb.append(", ");
        return fp0_0.uD(sb, this.s1, "]");
    }

    public final boolean Tt(CE ce, short s, lq0[] lq0Arr, N2[] n2Arr) {
        if (this.gl0 > 0 && ce.Yb0 != this.gl0) {
            return false;
        }
        if (this.zn > 0 && !ce.Mb(this.zn)) {
            return false;
        }
        if (this.MS > 0 && s != this.MS) {
            return false;
        }
        if (this.Hz0 > 0 && X4.gA0(ce.rh0()) != X4.gA0(this.Hz0)) {
            return false;
        }
        if (this.Hu0 != null && !S.ZT(this.Hu0, lq0Arr)) {
            return false;
        }
        if (this.s1 != -1 && ce.ZF0 != this.s1) {
            return false;
        }
        if (n2Arr.length < 1) {
            n2Arr = N2.CG;
        }
        if (this.Cx0 != null && n2Arr.length > 0) {
            N2 n2 = null;
            for (N2 n2_2 : n2Arr) {
                if (n2 == null || n2.yz > n2_2.yz) {
                    n2 = n2_2;
                }
            }
            if (n2 != this.Cx0) {
                return false;
            }
        }
        return true;
    }
}
