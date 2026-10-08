package cn.pokemmo.net.session;

import f.*;

public abstract class AbstractNetworkSessionContext {
    public Ry cp0;
    public MC0 RO;
    public zq_2 Wa0;
    public int hF0;
    public vo0_0 FF0;
    public int CO;
    public byte[] Vl0;
    public int JC;
    public np_0[] w80;
    public np_0 ze0;
    public CH0 Qp;
    public byte[] n60;
    public np_0 t9;
    public String Ik0;
    public String T2;
    public final boolean QO;
    public final RR E3;
    public byte iD;
    public String Q8;
    public byte gp0;
    public String DV;

    static {
        Cq0.E1(AbstractNetworkSessionContext.class);
    }

    public AbstractNetworkSessionContext(String str, String str2, boolean z, RR rr) {
        super();
        this.RO = MC0.DL0;
        this.Wa0 = null;
        this.hF0 = 0;
        this.FF0 = null;
        this.Vl0 = new byte[0];
        this.JC = -1;
        this.w80 = new np_0[0];
        this.ze0 = null;
        this.Qp = CH0.j1;
        this.gp0 = 0;
        this.DV = "";
        this.Ik0 = str;
        this.T2 = A8.w4(str2);
        this.QO = z;
        this.E3 = rr;
    }

    public final void GG0(zq_2 zq_2Var, int i) {
        this.Wa0 = zq_2Var;
        this.hF0 = i;
        this.Ik0 = "";
        this.T2 = "";
        if (zq_2Var == zq_2.qz) {
            this.RO = MC0.nh;
            if (x0_0.k40 != yo_1.IB0 && yo_1.ww0) {
                String str = "Update available, will update to r" + yo_1.IB0;
                Qy0 qy0 = Qy0.yI0;
                if (qy0 != null) {
                    qy0.dk(-1, str);
                }
                lpt5__5.hL.ZD(new zp_1(), 1000L);
            } else {
                this.cp0.E8(new bx_1());
            }
        } else if (zq_2Var == zq_2.n80) {
            this.RO = MC0.VC0;
        } else {
            this.RO = MC0.D;
        }
    }

    public final void DK() {
        Ry ry = this.cp0;
        if (ry != null) {
            ry.yK0();
            this.cp0 = null;
        }
    }

    public final void Jt(zq_2 zq_2Var, int i, byte[] bArr) {
        this.Wa0 = zq_2Var;
        this.CO = i;
        this.Vl0 = bArr;
        if (this.RO == MC0.vB0) {
            if (zq_2Var == zq_2.qz) {
                this.RO = MC0.hi;
                DK();
            } else {
                this.RO = MC0.S00;
            }
        }
        MC0 mc0 = this.RO;
        if ((mc0 == MC0.hi || mc0 == MC0.wx0) && zq_2Var != zq_2.qz) {
            this.RO = MC0.S00;
        }
    }
}
