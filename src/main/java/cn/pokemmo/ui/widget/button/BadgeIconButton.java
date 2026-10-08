package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class BadgeIconButton extends BaseButton {
    public final Br0 RL;
    public RL0 W70;
    public final bi0_1 Mq;
    public final CH0 OB0;
    public int r10;
    public int Gi0;
    public short wJ0;
    public le0_2 Ng0;
    public le0_2 Ur;
    public cd0_2 YB;
    public OT S00;
    public short lw0;
    public S70 FL0;

    public BadgeIconButton(bi0_1 v1) {
        super("");
        this.RL = new Br0(this);
        this.Gi0 = -2;
        this.wJ0 = 0;
        this.Ng0 = null;
        this.YB = null;
        this.S00 = null;
        this.lw0 = -1;
        this.FL0 = null;
        uf("nameplate");
        D70(RL0.S60);
        this.RL.nq0(24, 24);
        this.RL.Gy0(5, -26);
        this.Mq = v1;
        this.OB0 = v1.ZK();
    }

    public final void D70(RL0 v1) {
        if (this.W70 == v1 || v1 == null) {
            return;
        }
        this.RL.Ve = false;
        switch (tj_0.Fw0[v1.Yk]) {
            case 2:
                if (zr_2.MA0.Ah == null) {
                    zr_2.MA0.Ah = zr_2.am0((short) 5004);
                }
                this.RL.Nk(new Wr[]{zr_2.MA0.Ah});
                this.RL.OA0 = true;
                this.RL.IF = 24;
                this.RL.gx0 = 24;
                this.RL.Ve = true;
                break;
            case 3:
                this.RL.Nk(new Wr[]{zr_2.MA0.uh()});
                this.RL.OA0 = true;
                this.RL.IF = 24;
                this.RL.gx0 = 24;
                this.RL.Ve = true;
                break;
            case 4:
                if (zr_2.MA0.Il == null) {
                    zr_2.MA0.Il = zr_2.am0((short) 5012);
                }
                this.RL.Nk(new Wr[]{zr_2.MA0.Il});
                this.RL.OA0 = true;
                this.RL.IF = 24;
                this.RL.gx0 = 24;
                this.RL.Ve = true;
                break;
            case 5:
                byte com4 = tw0_0.e60.Com4;
                if (com4 == 0 || com4 == 1) {
                    this.RL.o60(new AG0[]{ob0_0.Ui0().lI[5]});
                    this.RL.OA0 = true;
                    this.RL.IF = 32;
                    this.RL.gx0 = 32;
                }
                break;
            case 6:
                this.RL.o60(new AG0[]{ob0_0.Ui0().lI[8]});
                this.RL.OA0 = true;
                this.RL.IF = 32;
                this.RL.gx0 = 32;
                break;
            case 7:
                this.RL.o60(new AG0[]{ob0_0.Ui0().lI[2]});
                this.RL.OA0 = true;
                this.RL.IF = 32;
                this.RL.gx0 = 32;
                break;
            case 8:
                this.RL.r8(new LPT6_[]{fn_0.qz0().GE});
                this.RL.OA0 = true;
                this.RL.IF = 24;
                this.RL.gx0 = 24;
                break;
            default:
                this.RL.lo0();
                break;
        }
        this.W70 = v1;
    }

    public final int zs0() {
        return ((zb0_2) this.x70).getLineHeight();
    }

    public final void K8() {
        lt0();
        if (this.Ur != null) {
            this.Ur.lt0();
        }
    }

    @Override
    public final void Dw0(zk0_1 v1) {
        if (this.Ur != null) {
            this.Ur.E40(this.A20 - 32, this.SB0 + 2);
        }
        if (this.Ng0 != null) {
            this.Ng0.E40(this.A20 - 22, this.SB0 + 83);
        }
        if (this.S00 != null) {
            this.S00.E40(this.A20 - 25, this.SB0 + 45);
        }
        if (this.FL0 != null && tw0_0.rl != null && tw0_0.rl.cJ0 != null) {
            E90 jB0 = tw0_0.rl.cJ0.jB0;
            zv_2 ba0 = this.Mq.ba0;
            short lq0 = ba0.Lq0;
            short b5 = ba0.B5;
            zv_2 myBa0 = jB0.ba0;
            short myLq0 = myBa0.Lq0;
            short myB5 = myBa0.B5;
            dl_1 unused = tx_1.Sy0;
            int dx = myLq0 - lq0;
            int dy = myB5 - b5;
            boolean near = Math.sqrt((double) ((long) dx * dx + (long) dy * dy)) < 9.0;
            this.FL0.Ll(near);
            this.FL0.E40(this.A20 - 38, this.SB0 + 15);
        }
        if (this.W70 == RL0.S60 && this.wJ0 < 1) {
            return;
        }
        int i1;
        if (this.OB0.Uz0()) {
            i1 = -10;
        } else {
            i1 = hr0() / 2 - 16;
        }
        if (this.wJ0 > 0) {
            this.RL.gY = i1 - 38;
            this.RL.a4 = 76;
        } else if (this.RL.De0() == 24) {
            this.RL.gY = i1 + 4;
            this.RL.a4 = -26;
        } else {
            this.RL.gY = i1 - 5;
            this.RL.a4 = 32;
        }
        this.RL.t00();
    }
}
