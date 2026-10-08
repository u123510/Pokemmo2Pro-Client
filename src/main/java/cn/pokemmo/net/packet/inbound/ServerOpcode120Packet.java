package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode120Packet extends GH {
    public CH0 ei0;
    public short pV;
    public short QR;

    public ServerOpcode120Packet(k20_0 k20_0Var, ByteBuffer byteBuffer) {
        super(k20_0Var, byteBuffer);
    }

    public final void Oj0() {
        this.ei0 = pE();
        this.pV = this.Rj.getShort();
        this.QR = this.Rj.getShort();
    }

    public final void os0() {
        BR br = (BR) sr0();
        CH0 ch0 = this.ei0;
        short s = this.pV;
        short s2 = this.QR;
        BU bu = br.lZ.zK0;
        if (bu == null) {
            return;
        }
        Yl yl = bu.Vi0;
        if (yl == null) {
            return;
        }
        mx_1[] mx_1Arr = yl.FR;
        int length = mx_1Arr.length;
        for (int i = 0; i < length; i++) {
            mx_1 mx_1Var = mx_1Arr[i];
            qj_2 qj_2Var = yl.w20;
            if (mx_1Var.RU.LB0.equals(ch0)) {
                mx_1Var.ub0.SU(sm0_0.c0(5504));
                StringBuilder sb = new StringBuilder();
                zp0_0 zp0_0Var = mx_1Var.RU;
                short s3 = zp0_0Var.H10;
                byte b = zp0_0Var.Ib0;
                int i2 = s3;
                if (b == 1 || zp0_0Var.CoM8) {
                    short s4;
                    if (b == 1) {
                        s4 = s3;
                    } else {
                        s4 = (short) (s3 / 4);
                    }
                    i2 = s3 - s4;
                    String str;
                    if (s2 >= 0) {
                        str = s2 + "/" + ((int) s4);
                    } else {
                        str = sm0_0.c0(5539);
                    }
                    sb.append(sm0_0.wa0(5538, str));
                    sb.append("\n");
                }
                sb.append(sm0_0.Bx(5521, new String[] { Integer.toString(s), Integer.toString(i2) }));
                mx_1Var.Rd.Sk(sb.toString());
                mx_1Var.ub0.yj0 = sm0_0.c0(5522);
                mx_1Var.ub0.yB0();
                mx_1Var.ub0.GH0 = 250;
                qj_2Var.SU(mx_1Var.Rd.j50.toString());
            }
        }
    }
}
